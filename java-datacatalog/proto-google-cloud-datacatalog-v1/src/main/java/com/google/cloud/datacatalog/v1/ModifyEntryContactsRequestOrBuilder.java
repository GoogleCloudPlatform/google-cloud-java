/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datacatalog.v1;

public interface ModifyEntryContactsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.ModifyEntryContactsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The full resource name of the entry.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The full resource name of the entry.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The new value for the Contacts.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.Contacts contacts = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the contacts field is set.
   */
  boolean hasContacts();
  /**
   *
   *
   * <pre>
   * Required. The new value for the Contacts.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.Contacts contacts = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The contacts.
   */
  com.google.cloud.datacatalog.v1.Contacts getContacts();
  /**
   *
   *
   * <pre>
   * Required. The new value for the Contacts.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.Contacts contacts = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.v1.ContactsOrBuilder getContactsOrBuilder();
}
