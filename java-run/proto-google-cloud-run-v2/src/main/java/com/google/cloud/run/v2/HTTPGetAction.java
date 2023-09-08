/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/run/v2/k8s.min.proto

package com.google.cloud.run.v2;

/**
 *
 *
 * <pre>
 * HTTPGetAction describes an action based on HTTP Get requests.
 * </pre>
 *
 * Protobuf type {@code google.cloud.run.v2.HTTPGetAction}
 */
public final class HTTPGetAction extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.run.v2.HTTPGetAction)
    HTTPGetActionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use HTTPGetAction.newBuilder() to construct.
  private HTTPGetAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private HTTPGetAction() {
    path_ = "";
    httpHeaders_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new HTTPGetAction();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.run.v2.K8sMinProto
        .internal_static_google_cloud_run_v2_HTTPGetAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.run.v2.K8sMinProto
        .internal_static_google_cloud_run_v2_HTTPGetAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.run.v2.HTTPGetAction.class,
            com.google.cloud.run.v2.HTTPGetAction.Builder.class);
  }

  public static final int PATH_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object path_ = "";
  /**
   *
   *
   * <pre>
   * Path to access on the HTTP server. Defaults to '/'.
   * </pre>
   *
   * <code>string path = 1;</code>
   *
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Path to access on the HTTP server. Defaults to '/'.
   * </pre>
   *
   * <code>string path = 1;</code>
   *
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HTTP_HEADERS_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.run.v2.HTTPHeader> httpHeaders_;
  /**
   *
   *
   * <pre>
   * Custom headers to set in the request. HTTP allows repeated headers.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.run.v2.HTTPHeader> getHttpHeadersList() {
    return httpHeaders_;
  }
  /**
   *
   *
   * <pre>
   * Custom headers to set in the request. HTTP allows repeated headers.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.run.v2.HTTPHeaderOrBuilder>
      getHttpHeadersOrBuilderList() {
    return httpHeaders_;
  }
  /**
   *
   *
   * <pre>
   * Custom headers to set in the request. HTTP allows repeated headers.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
   */
  @java.lang.Override
  public int getHttpHeadersCount() {
    return httpHeaders_.size();
  }
  /**
   *
   *
   * <pre>
   * Custom headers to set in the request. HTTP allows repeated headers.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
   */
  @java.lang.Override
  public com.google.cloud.run.v2.HTTPHeader getHttpHeaders(int index) {
    return httpHeaders_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Custom headers to set in the request. HTTP allows repeated headers.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
   */
  @java.lang.Override
  public com.google.cloud.run.v2.HTTPHeaderOrBuilder getHttpHeadersOrBuilder(int index) {
    return httpHeaders_.get(index);
  }

  public static final int PORT_FIELD_NUMBER = 5;
  private int port_ = 0;
  /**
   *
   *
   * <pre>
   * Port number to access on the container. Must be in the range 1 to 65535.
   * If not specified, defaults to the exposed port of the container, which is
   * the value of container.ports[0].containerPort.
   * </pre>
   *
   * <code>int32 port = 5;</code>
   *
   * @return The port.
   */
  @java.lang.Override
  public int getPort() {
    return port_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, path_);
    }
    for (int i = 0; i < httpHeaders_.size(); i++) {
      output.writeMessage(4, httpHeaders_.get(i));
    }
    if (port_ != 0) {
      output.writeInt32(5, port_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, path_);
    }
    for (int i = 0; i < httpHeaders_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, httpHeaders_.get(i));
    }
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(5, port_);
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
    if (!(obj instanceof com.google.cloud.run.v2.HTTPGetAction)) {
      return super.equals(obj);
    }
    com.google.cloud.run.v2.HTTPGetAction other = (com.google.cloud.run.v2.HTTPGetAction) obj;

    if (!getPath().equals(other.getPath())) return false;
    if (!getHttpHeadersList().equals(other.getHttpHeadersList())) return false;
    if (getPort() != other.getPort()) return false;
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
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    if (getHttpHeadersCount() > 0) {
      hash = (37 * hash) + HTTP_HEADERS_FIELD_NUMBER;
      hash = (53 * hash) + getHttpHeadersList().hashCode();
    }
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.run.v2.HTTPGetAction parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.HTTPGetAction parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.HTTPGetAction parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.HTTPGetAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.HTTPGetAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.HTTPGetAction parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.HTTPGetAction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.HTTPGetAction parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.run.v2.HTTPGetAction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.HTTPGetAction parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.run.v2.HTTPGetAction parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.HTTPGetAction parseFrom(
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

  public static Builder newBuilder(com.google.cloud.run.v2.HTTPGetAction prototype) {
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
   * HTTPGetAction describes an action based on HTTP Get requests.
   * </pre>
   *
   * Protobuf type {@code google.cloud.run.v2.HTTPGetAction}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.run.v2.HTTPGetAction)
      com.google.cloud.run.v2.HTTPGetActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.run.v2.K8sMinProto
          .internal_static_google_cloud_run_v2_HTTPGetAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.run.v2.K8sMinProto
          .internal_static_google_cloud_run_v2_HTTPGetAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.run.v2.HTTPGetAction.class,
              com.google.cloud.run.v2.HTTPGetAction.Builder.class);
    }

    // Construct using com.google.cloud.run.v2.HTTPGetAction.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      path_ = "";
      if (httpHeadersBuilder_ == null) {
        httpHeaders_ = java.util.Collections.emptyList();
      } else {
        httpHeaders_ = null;
        httpHeadersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      port_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.run.v2.K8sMinProto
          .internal_static_google_cloud_run_v2_HTTPGetAction_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.run.v2.HTTPGetAction getDefaultInstanceForType() {
      return com.google.cloud.run.v2.HTTPGetAction.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.run.v2.HTTPGetAction build() {
      com.google.cloud.run.v2.HTTPGetAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.run.v2.HTTPGetAction buildPartial() {
      com.google.cloud.run.v2.HTTPGetAction result =
          new com.google.cloud.run.v2.HTTPGetAction(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.run.v2.HTTPGetAction result) {
      if (httpHeadersBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          httpHeaders_ = java.util.Collections.unmodifiableList(httpHeaders_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.httpHeaders_ = httpHeaders_;
      } else {
        result.httpHeaders_ = httpHeadersBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.run.v2.HTTPGetAction result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.path_ = path_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.port_ = port_;
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
      if (other instanceof com.google.cloud.run.v2.HTTPGetAction) {
        return mergeFrom((com.google.cloud.run.v2.HTTPGetAction) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.run.v2.HTTPGetAction other) {
      if (other == com.google.cloud.run.v2.HTTPGetAction.getDefaultInstance()) return this;
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (httpHeadersBuilder_ == null) {
        if (!other.httpHeaders_.isEmpty()) {
          if (httpHeaders_.isEmpty()) {
            httpHeaders_ = other.httpHeaders_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureHttpHeadersIsMutable();
            httpHeaders_.addAll(other.httpHeaders_);
          }
          onChanged();
        }
      } else {
        if (!other.httpHeaders_.isEmpty()) {
          if (httpHeadersBuilder_.isEmpty()) {
            httpHeadersBuilder_.dispose();
            httpHeadersBuilder_ = null;
            httpHeaders_ = other.httpHeaders_;
            bitField0_ = (bitField0_ & ~0x00000002);
            httpHeadersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getHttpHeadersFieldBuilder()
                    : null;
          } else {
            httpHeadersBuilder_.addAllMessages(other.httpHeaders_);
          }
        }
      }
      if (other.getPort() != 0) {
        setPort(other.getPort());
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
            case 10:
              {
                path_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 34:
              {
                com.google.cloud.run.v2.HTTPHeader m =
                    input.readMessage(
                        com.google.cloud.run.v2.HTTPHeader.parser(), extensionRegistry);
                if (httpHeadersBuilder_ == null) {
                  ensureHttpHeadersIsMutable();
                  httpHeaders_.add(m);
                } else {
                  httpHeadersBuilder_.addMessage(m);
                }
                break;
              } // case 34
            case 40:
              {
                port_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 40
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

    private java.lang.Object path_ = "";
    /**
     *
     *
     * <pre>
     * Path to access on the HTTP server. Defaults to '/'.
     * </pre>
     *
     * <code>string path = 1;</code>
     *
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Path to access on the HTTP server. Defaults to '/'.
     * </pre>
     *
     * <code>string path = 1;</code>
     *
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Path to access on the HTTP server. Defaults to '/'.
     * </pre>
     *
     * <code>string path = 1;</code>
     *
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      path_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Path to access on the HTTP server. Defaults to '/'.
     * </pre>
     *
     * <code>string path = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      path_ = getDefaultInstance().getPath();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Path to access on the HTTP server. Defaults to '/'.
     * </pre>
     *
     * <code>string path = 1;</code>
     *
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      path_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.run.v2.HTTPHeader> httpHeaders_ =
        java.util.Collections.emptyList();

    private void ensureHttpHeadersIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        httpHeaders_ = new java.util.ArrayList<com.google.cloud.run.v2.HTTPHeader>(httpHeaders_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.run.v2.HTTPHeader,
            com.google.cloud.run.v2.HTTPHeader.Builder,
            com.google.cloud.run.v2.HTTPHeaderOrBuilder>
        httpHeadersBuilder_;

    /**
     *
     *
     * <pre>
     * Custom headers to set in the request. HTTP allows repeated headers.
     * </pre>
     *
     * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
     */
    public java.util.List<com.google.cloud.run.v2.HTTPHeader> getHttpHeadersList() {
      if (httpHeadersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(httpHeaders_);
      } else {
        return httpHeadersBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Custom headers to set in the request. HTTP allows repeated headers.
     * </pre>
     *
     * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
     */
    public int getHttpHeadersCount() {
      if (httpHeadersBuilder_ == null) {
        return httpHeaders_.size();
      } else {
        return httpHeadersBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Custom headers to set in the request. HTTP allows repeated headers.
     * </pre>
     *
     * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
     */
    public com.google.cloud.run.v2.HTTPHeader getHttpHeaders(int index) {
      if (httpHeadersBuilder_ == null) {
        return httpHeaders_.get(index);
      } else {
        return httpHeadersBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Custom headers to set in the request. HTTP allows repeated headers.
     * </pre>
     *
     * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
     */
    public Builder setHttpHeaders(int index, com.google.cloud.run.v2.HTTPHeader value) {
      if (httpHeadersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHttpHeadersIsMutable();
        httpHeaders_.set(index, value);
        onChanged();
      } else {
        httpHeadersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Custom headers to set in the request. HTTP allows repeated headers.
     * </pre>
     *
     * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
     */
    public Builder setHttpHeaders(
        int index, com.google.cloud.run.v2.HTTPHeader.Builder builderForValue) {
      if (httpHeadersBuilder_ == null) {
        ensureHttpHeadersIsMutable();
        httpHeaders_.set(index, builderForValue.build());
        onChanged();
      } else {
        httpHeadersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Custom headers to set in the request. HTTP allows repeated headers.
     * </pre>
     *
     * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
     */
    public Builder addHttpHeaders(com.google.cloud.run.v2.HTTPHeader value) {
      if (httpHeadersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHttpHeadersIsMutable();
        httpHeaders_.add(value);
        onChanged();
      } else {
        httpHeadersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Custom headers to set in the request. HTTP allows repeated headers.
     * </pre>
     *
     * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
     */
    public Builder addHttpHeaders(int index, com.google.cloud.run.v2.HTTPHeader value) {
      if (httpHeadersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHttpHeadersIsMutable();
        httpHeaders_.add(index, value);
        onChanged();
      } else {
        httpHeadersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Custom headers to set in the request. HTTP allows repeated headers.
     * </pre>
     *
     * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
     */
    public Builder addHttpHeaders(com.google.cloud.run.v2.HTTPHeader.Builder builderForValue) {
      if (httpHeadersBuilder_ == null) {
        ensureHttpHeadersIsMutable();
        httpHeaders_.add(builderForValue.build());
        onChanged();
      } else {
        httpHeadersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Custom headers to set in the request. HTTP allows repeated headers.
     * </pre>
     *
     * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
     */
    public Builder addHttpHeaders(
        int index, com.google.cloud.run.v2.HTTPHeader.Builder builderForValue) {
      if (httpHeadersBuilder_ == null) {
        ensureHttpHeadersIsMutable();
        httpHeaders_.add(index, builderForValue.build());
        onChanged();
      } else {
        httpHeadersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Custom headers to set in the request. HTTP allows repeated headers.
     * </pre>
     *
     * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
     */
    public Builder addAllHttpHeaders(
        java.lang.Iterable<? extends com.google.cloud.run.v2.HTTPHeader> values) {
      if (httpHeadersBuilder_ == null) {
        ensureHttpHeadersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, httpHeaders_);
        onChanged();
      } else {
        httpHeadersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Custom headers to set in the request. HTTP allows repeated headers.
     * </pre>
     *
     * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
     */
    public Builder clearHttpHeaders() {
      if (httpHeadersBuilder_ == null) {
        httpHeaders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        httpHeadersBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Custom headers to set in the request. HTTP allows repeated headers.
     * </pre>
     *
     * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
     */
    public Builder removeHttpHeaders(int index) {
      if (httpHeadersBuilder_ == null) {
        ensureHttpHeadersIsMutable();
        httpHeaders_.remove(index);
        onChanged();
      } else {
        httpHeadersBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Custom headers to set in the request. HTTP allows repeated headers.
     * </pre>
     *
     * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
     */
    public com.google.cloud.run.v2.HTTPHeader.Builder getHttpHeadersBuilder(int index) {
      return getHttpHeadersFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Custom headers to set in the request. HTTP allows repeated headers.
     * </pre>
     *
     * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
     */
    public com.google.cloud.run.v2.HTTPHeaderOrBuilder getHttpHeadersOrBuilder(int index) {
      if (httpHeadersBuilder_ == null) {
        return httpHeaders_.get(index);
      } else {
        return httpHeadersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Custom headers to set in the request. HTTP allows repeated headers.
     * </pre>
     *
     * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
     */
    public java.util.List<? extends com.google.cloud.run.v2.HTTPHeaderOrBuilder>
        getHttpHeadersOrBuilderList() {
      if (httpHeadersBuilder_ != null) {
        return httpHeadersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(httpHeaders_);
      }
    }
    /**
     *
     *
     * <pre>
     * Custom headers to set in the request. HTTP allows repeated headers.
     * </pre>
     *
     * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
     */
    public com.google.cloud.run.v2.HTTPHeader.Builder addHttpHeadersBuilder() {
      return getHttpHeadersFieldBuilder()
          .addBuilder(com.google.cloud.run.v2.HTTPHeader.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Custom headers to set in the request. HTTP allows repeated headers.
     * </pre>
     *
     * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
     */
    public com.google.cloud.run.v2.HTTPHeader.Builder addHttpHeadersBuilder(int index) {
      return getHttpHeadersFieldBuilder()
          .addBuilder(index, com.google.cloud.run.v2.HTTPHeader.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Custom headers to set in the request. HTTP allows repeated headers.
     * </pre>
     *
     * <code>repeated .google.cloud.run.v2.HTTPHeader http_headers = 4;</code>
     */
    public java.util.List<com.google.cloud.run.v2.HTTPHeader.Builder> getHttpHeadersBuilderList() {
      return getHttpHeadersFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.run.v2.HTTPHeader,
            com.google.cloud.run.v2.HTTPHeader.Builder,
            com.google.cloud.run.v2.HTTPHeaderOrBuilder>
        getHttpHeadersFieldBuilder() {
      if (httpHeadersBuilder_ == null) {
        httpHeadersBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.run.v2.HTTPHeader,
                com.google.cloud.run.v2.HTTPHeader.Builder,
                com.google.cloud.run.v2.HTTPHeaderOrBuilder>(
                httpHeaders_, ((bitField0_ & 0x00000002) != 0), getParentForChildren(), isClean());
        httpHeaders_ = null;
      }
      return httpHeadersBuilder_;
    }

    private int port_;
    /**
     *
     *
     * <pre>
     * Port number to access on the container. Must be in the range 1 to 65535.
     * If not specified, defaults to the exposed port of the container, which is
     * the value of container.ports[0].containerPort.
     * </pre>
     *
     * <code>int32 port = 5;</code>
     *
     * @return The port.
     */
    @java.lang.Override
    public int getPort() {
      return port_;
    }
    /**
     *
     *
     * <pre>
     * Port number to access on the container. Must be in the range 1 to 65535.
     * If not specified, defaults to the exposed port of the container, which is
     * the value of container.ports[0].containerPort.
     * </pre>
     *
     * <code>int32 port = 5;</code>
     *
     * @param value The port to set.
     * @return This builder for chaining.
     */
    public Builder setPort(int value) {

      port_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Port number to access on the container. Must be in the range 1 to 65535.
     * If not specified, defaults to the exposed port of the container, which is
     * the value of container.ports[0].containerPort.
     * </pre>
     *
     * <code>int32 port = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPort() {
      bitField0_ = (bitField0_ & ~0x00000004);
      port_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.run.v2.HTTPGetAction)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.run.v2.HTTPGetAction)
  private static final com.google.cloud.run.v2.HTTPGetAction DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.run.v2.HTTPGetAction();
  }

  public static com.google.cloud.run.v2.HTTPGetAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HTTPGetAction> PARSER =
      new com.google.protobuf.AbstractParser<HTTPGetAction>() {
        @java.lang.Override
        public HTTPGetAction parsePartialFrom(
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

  public static com.google.protobuf.Parser<HTTPGetAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HTTPGetAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.run.v2.HTTPGetAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
