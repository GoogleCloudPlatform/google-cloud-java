/*
 * Copyright 2017 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MetadataConfig {

  private static final String metadataUrl = "http://metadata/computeMetadata/v1/";

  public static String getProjectId() {
    return getProjectAttribute("project-id");
  }

  public static String getZone() {
    String zoneId = getInstanceAttribute("zone");
    if (zoneId.contains("/")) {
      return zoneId.substring(zoneId.lastIndexOf('/') + 1);
    }
    return zoneId;
  }

  public static String getInstanceId() {
    return getInstanceAttribute("id");
  }

  public static String getClusterName() {
    return getInstanceAttribute("cluster-name");
  }

  private static String getProjectAttribute(String attributeName) {
    return getAttribute("project/", attributeName);
  }

  private static String getInstanceAttribute(String attributeName) {
    return getAttribute("instance/", attributeName);
  }

  private static String getAttribute(String prefix, String attributeName) {
    try {
      URL url = new URL(metadataUrl + prefix + attributeName);
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      connection.setRequestProperty("Metadata-Flavor", "Google");
      InputStream input = connection.getInputStream();
      if (connection.getResponseCode() == 200) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(input, UTF_8))) {
          return reader.readLine();
        }
      }
    } catch (IOException ignore) {
      // ignore
    }
    return null;
  }
}
