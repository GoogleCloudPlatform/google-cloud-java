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
// source: google/cloud/domains/v1beta1/domains.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.domains.v1beta1;

public interface TransferParametersOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.domains.v1beta1.TransferParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The domain name. Unicode domain names are expressed in Punycode format.
   * </pre>
   *
   * <code>string domain_name = 1;</code>
   *
   * @return The domainName.
   */
  java.lang.String getDomainName();
  /**
   *
   *
   * <pre>
   * The domain name. Unicode domain names are expressed in Punycode format.
   * </pre>
   *
   * <code>string domain_name = 1;</code>
   *
   * @return The bytes for domainName.
   */
  com.google.protobuf.ByteString getDomainNameBytes();

  /**
   *
   *
   * <pre>
   * The registrar that currently manages the domain.
   * </pre>
   *
   * <code>string current_registrar = 2;</code>
   *
   * @return The currentRegistrar.
   */
  java.lang.String getCurrentRegistrar();
  /**
   *
   *
   * <pre>
   * The registrar that currently manages the domain.
   * </pre>
   *
   * <code>string current_registrar = 2;</code>
   *
   * @return The bytes for currentRegistrar.
   */
  com.google.protobuf.ByteString getCurrentRegistrarBytes();

  /**
   *
   *
   * <pre>
   * The name servers that currently store the configuration of the domain.
   * </pre>
   *
   * <code>repeated string name_servers = 3;</code>
   *
   * @return A list containing the nameServers.
   */
  java.util.List<java.lang.String> getNameServersList();
  /**
   *
   *
   * <pre>
   * The name servers that currently store the configuration of the domain.
   * </pre>
   *
   * <code>repeated string name_servers = 3;</code>
   *
   * @return The count of nameServers.
   */
  int getNameServersCount();
  /**
   *
   *
   * <pre>
   * The name servers that currently store the configuration of the domain.
   * </pre>
   *
   * <code>repeated string name_servers = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The nameServers at the given index.
   */
  java.lang.String getNameServers(int index);
  /**
   *
   *
   * <pre>
   * The name servers that currently store the configuration of the domain.
   * </pre>
   *
   * <code>repeated string name_servers = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the nameServers at the given index.
   */
  com.google.protobuf.ByteString getNameServersBytes(int index);

  /**
   *
   *
   * <pre>
   * Indicates whether the domain is protected by a transfer lock. For a
   * transfer to succeed, this must show `UNLOCKED`. To unlock a domain,
   * go to its current registrar.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.TransferLockState transfer_lock_state = 4;</code>
   *
   * @return The enum numeric value on the wire for transferLockState.
   */
  int getTransferLockStateValue();
  /**
   *
   *
   * <pre>
   * Indicates whether the domain is protected by a transfer lock. For a
   * transfer to succeed, this must show `UNLOCKED`. To unlock a domain,
   * go to its current registrar.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.TransferLockState transfer_lock_state = 4;</code>
   *
   * @return The transferLockState.
   */
  com.google.cloud.domains.v1beta1.TransferLockState getTransferLockState();

  /**
   *
   *
   * <pre>
   * Contact privacy options that the domain supports.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.ContactPrivacy supported_privacy = 5;</code>
   *
   * @return A list containing the supportedPrivacy.
   */
  java.util.List<com.google.cloud.domains.v1beta1.ContactPrivacy> getSupportedPrivacyList();
  /**
   *
   *
   * <pre>
   * Contact privacy options that the domain supports.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.ContactPrivacy supported_privacy = 5;</code>
   *
   * @return The count of supportedPrivacy.
   */
  int getSupportedPrivacyCount();
  /**
   *
   *
   * <pre>
   * Contact privacy options that the domain supports.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.ContactPrivacy supported_privacy = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The supportedPrivacy at the given index.
   */
  com.google.cloud.domains.v1beta1.ContactPrivacy getSupportedPrivacy(int index);
  /**
   *
   *
   * <pre>
   * Contact privacy options that the domain supports.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.ContactPrivacy supported_privacy = 5;</code>
   *
   * @return A list containing the enum numeric values on the wire for supportedPrivacy.
   */
  java.util.List<java.lang.Integer> getSupportedPrivacyValueList();
  /**
   *
   *
   * <pre>
   * Contact privacy options that the domain supports.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.ContactPrivacy supported_privacy = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of supportedPrivacy at the given index.
   */
  int getSupportedPrivacyValue(int index);

  /**
   *
   *
   * <pre>
   * Price to transfer or renew the domain for one year.
   * </pre>
   *
   * <code>.google.type.Money yearly_price = 6;</code>
   *
   * @return Whether the yearlyPrice field is set.
   */
  boolean hasYearlyPrice();
  /**
   *
   *
   * <pre>
   * Price to transfer or renew the domain for one year.
   * </pre>
   *
   * <code>.google.type.Money yearly_price = 6;</code>
   *
   * @return The yearlyPrice.
   */
  com.google.type.Money getYearlyPrice();
  /**
   *
   *
   * <pre>
   * Price to transfer or renew the domain for one year.
   * </pre>
   *
   * <code>.google.type.Money yearly_price = 6;</code>
   */
  com.google.type.MoneyOrBuilder getYearlyPriceOrBuilder();
}
