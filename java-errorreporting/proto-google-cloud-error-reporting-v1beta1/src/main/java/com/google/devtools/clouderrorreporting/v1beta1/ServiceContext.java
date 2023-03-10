/*
 * Copyright 2020 Google LLC
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
// source: google/devtools/clouderrorreporting/v1beta1/common.proto

package com.google.devtools.clouderrorreporting.v1beta1;

/**
 *
 *
 * <pre>
 * Describes a running service that sends errors.
 * Its version changes over time and multiple versions can run in parallel.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouderrorreporting.v1beta1.ServiceContext}
 */
public final class ServiceContext extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouderrorreporting.v1beta1.ServiceContext)
    ServiceContextOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ServiceContext.newBuilder() to construct.
  private ServiceContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ServiceContext() {
    service_ = "";
    version_ = "";
    resourceType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ServiceContext();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.clouderrorreporting.v1beta1.CommonProto
        .internal_static_google_devtools_clouderrorreporting_v1beta1_ServiceContext_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouderrorreporting.v1beta1.CommonProto
        .internal_static_google_devtools_clouderrorreporting_v1beta1_ServiceContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouderrorreporting.v1beta1.ServiceContext.class,
            com.google.devtools.clouderrorreporting.v1beta1.ServiceContext.Builder.class);
  }

  public static final int SERVICE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object service_ = "";
  /**
   *
   *
   * <pre>
   * An identifier of the service, such as the name of the
   * executable, job, or Google App Engine service name. This field is expected
   * to have a low number of values that are relatively stable over time, as
   * opposed to `version`, which can be changed whenever new code is deployed.
   * Contains the service name for error reports extracted from Google
   * App Engine logs or `default` if the App Engine default service is used.
   * </pre>
   *
   * <code>string service = 2;</code>
   *
   * @return The service.
   */
  @java.lang.Override
  public java.lang.String getService() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      service_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * An identifier of the service, such as the name of the
   * executable, job, or Google App Engine service name. This field is expected
   * to have a low number of values that are relatively stable over time, as
   * opposed to `version`, which can be changed whenever new code is deployed.
   * Contains the service name for error reports extracted from Google
   * App Engine logs or `default` if the App Engine default service is used.
   * </pre>
   *
   * <code>string service = 2;</code>
   *
   * @return The bytes for service.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceBytes() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      service_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object version_ = "";
  /**
   *
   *
   * <pre>
   * Represents the source code version that the developer provided,
   * which could represent a version label or a Git SHA-1 hash, for example.
   * For App Engine standard environment, the version is set to the version of
   * the app.
   * </pre>
   *
   * <code>string version = 3;</code>
   *
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Represents the source code version that the developer provided,
   * which could represent a version label or a Git SHA-1 hash, for example.
   * For App Engine standard environment, the version is set to the version of
   * the app.
   * </pre>
   *
   * <code>string version = 3;</code>
   *
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_TYPE_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceType_ = "";
  /**
   *
   *
   * <pre>
   * Type of the MonitoredResource. List of possible values:
   * https://cloud.google.com/monitoring/api/resources
   * Value is set automatically for incoming errors and must not be set when
   * reporting errors.
   * </pre>
   *
   * <code>string resource_type = 4;</code>
   *
   * @return The resourceType.
   */
  @java.lang.Override
  public java.lang.String getResourceType() {
    java.lang.Object ref = resourceType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Type of the MonitoredResource. List of possible values:
   * https://cloud.google.com/monitoring/api/resources
   * Value is set automatically for incoming errors and must not be set when
   * reporting errors.
   * </pre>
   *
   * <code>string resource_type = 4;</code>
   *
   * @return The bytes for resourceType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceTypeBytes() {
    java.lang.Object ref = resourceType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resourceType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(service_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, service_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, version_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, resourceType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(service_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, service_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, version_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, resourceType_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.devtools.clouderrorreporting.v1beta1.ServiceContext)) {
      return super.equals(obj);
    }
    com.google.devtools.clouderrorreporting.v1beta1.ServiceContext other =
        (com.google.devtools.clouderrorreporting.v1beta1.ServiceContext) obj;

    if (!getService().equals(other.getService())) return false;
    if (!getVersion().equals(other.getVersion())) return false;
    if (!getResourceType().equals(other.getResourceType())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SERVICE_FIELD_NUMBER;
    hash = (53 * hash) + getService().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (37 * hash) + RESOURCE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getResourceType().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContext parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContext parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContext parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContext parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContext parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContext parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContext parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContext parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContext parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContext parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.devtools.clouderrorreporting.v1beta1.ServiceContext prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Describes a running service that sends errors.
   * Its version changes over time and multiple versions can run in parallel.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouderrorreporting.v1beta1.ServiceContext}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouderrorreporting.v1beta1.ServiceContext)
      com.google.devtools.clouderrorreporting.v1beta1.ServiceContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.clouderrorreporting.v1beta1.CommonProto
          .internal_static_google_devtools_clouderrorreporting_v1beta1_ServiceContext_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouderrorreporting.v1beta1.CommonProto
          .internal_static_google_devtools_clouderrorreporting_v1beta1_ServiceContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouderrorreporting.v1beta1.ServiceContext.class,
              com.google.devtools.clouderrorreporting.v1beta1.ServiceContext.Builder.class);
    }

    // Construct using com.google.devtools.clouderrorreporting.v1beta1.ServiceContext.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      service_ = "";
      version_ = "";
      resourceType_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.clouderrorreporting.v1beta1.CommonProto
          .internal_static_google_devtools_clouderrorreporting_v1beta1_ServiceContext_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.clouderrorreporting.v1beta1.ServiceContext
        getDefaultInstanceForType() {
      return com.google.devtools.clouderrorreporting.v1beta1.ServiceContext.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.clouderrorreporting.v1beta1.ServiceContext build() {
      com.google.devtools.clouderrorreporting.v1beta1.ServiceContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.clouderrorreporting.v1beta1.ServiceContext buildPartial() {
      com.google.devtools.clouderrorreporting.v1beta1.ServiceContext result =
          new com.google.devtools.clouderrorreporting.v1beta1.ServiceContext(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.devtools.clouderrorreporting.v1beta1.ServiceContext result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.service_ = service_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.version_ = version_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.resourceType_ = resourceType_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.devtools.clouderrorreporting.v1beta1.ServiceContext) {
        return mergeFrom((com.google.devtools.clouderrorreporting.v1beta1.ServiceContext) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.clouderrorreporting.v1beta1.ServiceContext other) {
      if (other
          == com.google.devtools.clouderrorreporting.v1beta1.ServiceContext.getDefaultInstance())
        return this;
      if (!other.getService().isEmpty()) {
        service_ = other.service_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getResourceType().isEmpty()) {
        resourceType_ = other.resourceType_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 18:
              {
                service_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 18
            case 26:
              {
                version_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 26
            case 34:
              {
                resourceType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 34
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object service_ = "";
    /**
     *
     *
     * <pre>
     * An identifier of the service, such as the name of the
     * executable, job, or Google App Engine service name. This field is expected
     * to have a low number of values that are relatively stable over time, as
     * opposed to `version`, which can be changed whenever new code is deployed.
     * Contains the service name for error reports extracted from Google
     * App Engine logs or `default` if the App Engine default service is used.
     * </pre>
     *
     * <code>string service = 2;</code>
     *
     * @return The service.
     */
    public java.lang.String getService() {
      java.lang.Object ref = service_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        service_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * An identifier of the service, such as the name of the
     * executable, job, or Google App Engine service name. This field is expected
     * to have a low number of values that are relatively stable over time, as
     * opposed to `version`, which can be changed whenever new code is deployed.
     * Contains the service name for error reports extracted from Google
     * App Engine logs or `default` if the App Engine default service is used.
     * </pre>
     *
     * <code>string service = 2;</code>
     *
     * @return The bytes for service.
     */
    public com.google.protobuf.ByteString getServiceBytes() {
      java.lang.Object ref = service_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        service_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * An identifier of the service, such as the name of the
     * executable, job, or Google App Engine service name. This field is expected
     * to have a low number of values that are relatively stable over time, as
     * opposed to `version`, which can be changed whenever new code is deployed.
     * Contains the service name for error reports extracted from Google
     * App Engine logs or `default` if the App Engine default service is used.
     * </pre>
     *
     * <code>string service = 2;</code>
     *
     * @param value The service to set.
     * @return This builder for chaining.
     */
    public Builder setService(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      service_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An identifier of the service, such as the name of the
     * executable, job, or Google App Engine service name. This field is expected
     * to have a low number of values that are relatively stable over time, as
     * opposed to `version`, which can be changed whenever new code is deployed.
     * Contains the service name for error reports extracted from Google
     * App Engine logs or `default` if the App Engine default service is used.
     * </pre>
     *
     * <code>string service = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearService() {
      service_ = getDefaultInstance().getService();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * An identifier of the service, such as the name of the
     * executable, job, or Google App Engine service name. This field is expected
     * to have a low number of values that are relatively stable over time, as
     * opposed to `version`, which can be changed whenever new code is deployed.
     * Contains the service name for error reports extracted from Google
     * App Engine logs or `default` if the App Engine default service is used.
     * </pre>
     *
     * <code>string service = 2;</code>
     *
     * @param value The bytes for service to set.
     * @return This builder for chaining.
     */
    public Builder setServiceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      service_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     *
     *
     * <pre>
     * Represents the source code version that the developer provided,
     * which could represent a version label or a Git SHA-1 hash, for example.
     * For App Engine standard environment, the version is set to the version of
     * the app.
     * </pre>
     *
     * <code>string version = 3;</code>
     *
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Represents the source code version that the developer provided,
     * which could represent a version label or a Git SHA-1 hash, for example.
     * For App Engine standard environment, the version is set to the version of
     * the app.
     * </pre>
     *
     * <code>string version = 3;</code>
     *
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Represents the source code version that the developer provided,
     * which could represent a version label or a Git SHA-1 hash, for example.
     * For App Engine standard environment, the version is set to the version of
     * the app.
     * </pre>
     *
     * <code>string version = 3;</code>
     *
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      version_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents the source code version that the developer provided,
     * which could represent a version label or a Git SHA-1 hash, for example.
     * For App Engine standard environment, the version is set to the version of
     * the app.
     * </pre>
     *
     * <code>string version = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      version_ = getDefaultInstance().getVersion();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents the source code version that the developer provided,
     * which could represent a version label or a Git SHA-1 hash, for example.
     * For App Engine standard environment, the version is set to the version of
     * the app.
     * </pre>
     *
     * <code>string version = 3;</code>
     *
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      version_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object resourceType_ = "";
    /**
     *
     *
     * <pre>
     * Type of the MonitoredResource. List of possible values:
     * https://cloud.google.com/monitoring/api/resources
     * Value is set automatically for incoming errors and must not be set when
     * reporting errors.
     * </pre>
     *
     * <code>string resource_type = 4;</code>
     *
     * @return The resourceType.
     */
    public java.lang.String getResourceType() {
      java.lang.Object ref = resourceType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Type of the MonitoredResource. List of possible values:
     * https://cloud.google.com/monitoring/api/resources
     * Value is set automatically for incoming errors and must not be set when
     * reporting errors.
     * </pre>
     *
     * <code>string resource_type = 4;</code>
     *
     * @return The bytes for resourceType.
     */
    public com.google.protobuf.ByteString getResourceTypeBytes() {
      java.lang.Object ref = resourceType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resourceType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Type of the MonitoredResource. List of possible values:
     * https://cloud.google.com/monitoring/api/resources
     * Value is set automatically for incoming errors and must not be set when
     * reporting errors.
     * </pre>
     *
     * <code>string resource_type = 4;</code>
     *
     * @param value The resourceType to set.
     * @return This builder for chaining.
     */
    public Builder setResourceType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      resourceType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the MonitoredResource. List of possible values:
     * https://cloud.google.com/monitoring/api/resources
     * Value is set automatically for incoming errors and must not be set when
     * reporting errors.
     * </pre>
     *
     * <code>string resource_type = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResourceType() {
      resourceType_ = getDefaultInstance().getResourceType();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the MonitoredResource. List of possible values:
     * https://cloud.google.com/monitoring/api/resources
     * Value is set automatically for incoming errors and must not be set when
     * reporting errors.
     * </pre>
     *
     * <code>string resource_type = 4;</code>
     *
     * @param value The bytes for resourceType to set.
     * @return This builder for chaining.
     */
    public Builder setResourceTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      resourceType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.devtools.clouderrorreporting.v1beta1.ServiceContext)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouderrorreporting.v1beta1.ServiceContext)
  private static final com.google.devtools.clouderrorreporting.v1beta1.ServiceContext
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.clouderrorreporting.v1beta1.ServiceContext();
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ServiceContext
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServiceContext> PARSER =
      new com.google.protobuf.AbstractParser<ServiceContext>() {
        @java.lang.Override
        public ServiceContext parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ServiceContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServiceContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.clouderrorreporting.v1beta1.ServiceContext
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
