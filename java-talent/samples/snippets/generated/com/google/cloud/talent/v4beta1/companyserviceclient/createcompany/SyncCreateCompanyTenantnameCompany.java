/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.talent.v4beta1.samples;

// [START talent_v4beta1_generated_companyserviceclient_createcompany_tenantnamecompany_sync]
import com.google.cloud.talent.v4beta1.Company;
import com.google.cloud.talent.v4beta1.CompanyServiceClient;
import com.google.cloud.talent.v4beta1.TenantName;

public class SyncCreateCompanyTenantnameCompany {

  public static void main(String[] args) throws Exception {
    syncCreateCompanyTenantnameCompany();
  }

  public static void syncCreateCompanyTenantnameCompany() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CompanyServiceClient companyServiceClient = CompanyServiceClient.create()) {
      TenantName parent = TenantName.of("[PROJECT]", "[TENANT]");
      Company company = Company.newBuilder().build();
      Company response = companyServiceClient.createCompany(parent, company);
    }
  }
}
// [END talent_v4beta1_generated_companyserviceclient_createcompany_tenantnamecompany_sync]
