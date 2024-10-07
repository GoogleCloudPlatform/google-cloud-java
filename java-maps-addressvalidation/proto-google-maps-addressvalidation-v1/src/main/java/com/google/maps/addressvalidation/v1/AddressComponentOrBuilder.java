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
// source: google/maps/addressvalidation/v1/address.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.addressvalidation.v1;

public interface AddressComponentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.addressvalidation.v1.AddressComponent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name for this component.
   * </pre>
   *
   * <code>.google.maps.addressvalidation.v1.ComponentName component_name = 1;</code>
   *
   * @return Whether the componentName field is set.
   */
  boolean hasComponentName();
  /**
   *
   *
   * <pre>
   * The name for this component.
   * </pre>
   *
   * <code>.google.maps.addressvalidation.v1.ComponentName component_name = 1;</code>
   *
   * @return The componentName.
   */
  com.google.maps.addressvalidation.v1.ComponentName getComponentName();
  /**
   *
   *
   * <pre>
   * The name for this component.
   * </pre>
   *
   * <code>.google.maps.addressvalidation.v1.ComponentName component_name = 1;</code>
   */
  com.google.maps.addressvalidation.v1.ComponentNameOrBuilder getComponentNameOrBuilder();

  /**
   *
   *
   * <pre>
   * The type of the address component. See
   * [Table 2: Additional types returned by the Places
   * service](https://developers.google.com/places/web-service/supported_types#table2)
   * for a list of possible types.
   * </pre>
   *
   * <code>string component_type = 2;</code>
   *
   * @return The componentType.
   */
  java.lang.String getComponentType();
  /**
   *
   *
   * <pre>
   * The type of the address component. See
   * [Table 2: Additional types returned by the Places
   * service](https://developers.google.com/places/web-service/supported_types#table2)
   * for a list of possible types.
   * </pre>
   *
   * <code>string component_type = 2;</code>
   *
   * @return The bytes for componentType.
   */
  com.google.protobuf.ByteString getComponentTypeBytes();

  /**
   *
   *
   * <pre>
   * Indicates the level of certainty that we have that the component
   * is correct.
   * </pre>
   *
   * <code>
   * .google.maps.addressvalidation.v1.AddressComponent.ConfirmationLevel confirmation_level = 3;
   * </code>
   *
   * @return The enum numeric value on the wire for confirmationLevel.
   */
  int getConfirmationLevelValue();
  /**
   *
   *
   * <pre>
   * Indicates the level of certainty that we have that the component
   * is correct.
   * </pre>
   *
   * <code>
   * .google.maps.addressvalidation.v1.AddressComponent.ConfirmationLevel confirmation_level = 3;
   * </code>
   *
   * @return The confirmationLevel.
   */
  com.google.maps.addressvalidation.v1.AddressComponent.ConfirmationLevel getConfirmationLevel();

  /**
   *
   *
   * <pre>
   * Indicates that the component was not part of the input, but we
   * inferred it for the address location and believe it should be provided
   * for a complete address.
   * </pre>
   *
   * <code>bool inferred = 4;</code>
   *
   * @return The inferred.
   */
  boolean getInferred();

  /**
   *
   *
   * <pre>
   * Indicates a correction to a misspelling in the component name.  The API
   * does not always flag changes from one spelling variant to another, such as
   * when changing "centre" to "center". It also does not always flag common
   * misspellings, such as when changing "Amphitheater Pkwy" to "Amphitheatre
   * Pkwy".
   * </pre>
   *
   * <code>bool spell_corrected = 5;</code>
   *
   * @return The spellCorrected.
   */
  boolean getSpellCorrected();

  /**
   *
   *
   * <pre>
   * Indicates the name of the component was replaced with a completely
   * different one, for example a wrong postal code being replaced with one that
   * is correct for the address. This is not a cosmetic change, the input
   * component has been changed to a different one.
   * </pre>
   *
   * <code>bool replaced = 6;</code>
   *
   * @return The replaced.
   */
  boolean getReplaced();

  /**
   *
   *
   * <pre>
   * Indicates an address component that is not expected to be present in a
   * postal address for the given region. We have retained it only because it
   * was part of the input.
   * </pre>
   *
   * <code>bool unexpected = 7;</code>
   *
   * @return The unexpected.
   */
  boolean getUnexpected();
}
