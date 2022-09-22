#!/bin/bash
#
# Copyright 2022 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

#####################
# Expected Current Directory: Root repo directory (/google-cloud-java)
# Expected Environment Variables:
#   TF_VAR_folder_id : Folder in which new GCP projects will be created
#   TF_VAR_billing_account : Billing account to be used for created GCP projects
#   TF_VAR_project_prefix : Prefix to use for all created GCP projects
#####################

create_project_dir="./.terraform/modules/create-project"

function createProject() {
  # Ensure required environment variables are set.
  if [ -z "${TF_VAR_folder_id+x}" ]; then
    echo -n "Which GCP folder should be used when creating new GCP projects? Set TF_VAR_folder_id environment variable: "
    read -r folder_id
    export TF_VAR_folder_id="${folder_id}"
  fi
  if [ -z "${TF_VAR_billing_account+x}" ]; then
    echo -n "Which GCP billing account should be assigned to created GCP projects? Set TF_VAR_billing_account environment variable: "
    read -r billing_acct
    export TF_VAR_billing_account="${billing_acct}"
  fi
  if [ -z "${TF_VAR_project_prefix+x}" ]; then
    echo -n "What should be the project prefix for any created GCP project? Set TF_VAR_project_prefix environment variable: "
    read -r prefix
    export TF_VAR_project_prefix="${prefix}"
  fi

  # Provision GCP Project
  pushd "$create_project_dir" || exit

  terraform init || exit
  terraform plan || exit
  terraform apply -auto-approve || exit
  GOOGLE_CLOUD_PROJECT=$(terraform output -raw project_id)
  export GOOGLE_CLOUD_PROJECT

  popd || exit
}

function destroyProject() {
  pushd "$create_project_dir" || exit
  terraform destroy -auto-approve || exit
  popd || exit
}
