#!/bin/bash

set -e

GENERATION_DIR=$(dirname -- "$0")

tab="  "
release_please_manifest_file=".release-please-manifest.json"
release_please_config_file="release-please-config.json"

[ -e "${release_please_manifest_file}" ] && rm "${release_please_manifest_file}"
[ -e "${release_please_config_file}" ] && rm "${release_please_config_file}"

echo -e "{\n${tab}\"google-cloud-gapic-bom\": \"0.0.0\"," > "${release_please_manifest_file}"

# We are manually excluding two modules -- TODO: Update this for any other exclusions
num_modules=$(find . -mindepth 2 -maxdepth 2 -name pom.xml | wc -l)
num_modules=$((num_modules - 2))
for path in $(find . -mindepth 2 -maxdepth 2 -name pom.xml | sort | xargs dirname); do
  if [[ "${path}" = *google-cloud-gapic-bom ]] || [[ "${path}" = *CoverageAggregator ]]; then
    continue
  fi

  version_file="${path}/versions.txt"
  module_name="${path:2}"

  if [[ "${module_name}" = "java-grafeas" ]]; then
    module_line=$(grep -E "^grafeas:[0-9]+\.[0-9]+\.[0-9]+.*:[0-9]+\.[0-9]+\.[0-9]+.*$" "${version_file}")
  else
    module_line=$(grep -E "^google-.*:[0-9]+\.[0-9]+\.[0-9]+.*:[0-9]+\.[0-9]+\.[0-9]+.*$" "${version_file}")
  fi
  artifactName_config=$(echo "${module_line}" | cut -d ":" -f1)
  module_released_version=$(echo "${module_line}" | cut -d ":" -f2)
  module_snapshot_version=$(echo "${module_line}" | cut -d ":" -f3)

  #concatenating module name and module version
  rp_manifest_line="${tab}\"${module_name}\": \"${module_released_version}\""
  rp_config_line+="${tab}${tab}\"${module_name}\": {\n${tab}${tab}${tab}\"component\": \"${artifactName_config}\",\n${tab}${tab}${tab}\"skip-github-release\": \"true\"\n${tab}${tab}}"

  #adding " , " where it's necessary
  if [[ ${num_modules} -gt 1 ]]; then
    rp_manifest_line+=","
    rp_config_line+=",\n"
    num_modules=$((num_modules - 1))
  fi

  #adding the line to manifest config file
  echo -e "${rp_manifest_line}" >> "${release_please_manifest_file}"
done

echo "}" >> "${release_please_manifest_file}"

rp_config_line=$(echo -e "${rp_config_line}")

awk -v "packagesList=${rp_config_line}" '{gsub(/ALL_PACKAGES/,packagesList)}1' \
  "${GENERATION_DIR}/release_please_config_raw.json" > "${release_please_config_file}"
