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
// source: google/maps/routing/v2/routes_service.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.routing.v2;

/**
 *
 *
 * <pre>
 * A single origin for ComputeRouteMatrixRequest
 * </pre>
 *
 * Protobuf type {@code google.maps.routing.v2.RouteMatrixOrigin}
 */
public final class RouteMatrixOrigin extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.maps.routing.v2.RouteMatrixOrigin)
    RouteMatrixOriginOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RouteMatrixOrigin.newBuilder() to construct.
  private RouteMatrixOrigin(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RouteMatrixOrigin() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RouteMatrixOrigin();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.maps.routing.v2.RoutesServiceProto
        .internal_static_google_maps_routing_v2_RouteMatrixOrigin_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.routing.v2.RoutesServiceProto
        .internal_static_google_maps_routing_v2_RouteMatrixOrigin_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.routing.v2.RouteMatrixOrigin.class,
            com.google.maps.routing.v2.RouteMatrixOrigin.Builder.class);
  }

  private int bitField0_;
  public static final int WAYPOINT_FIELD_NUMBER = 1;
  private com.google.maps.routing.v2.Waypoint waypoint_;
  /**
   *
   *
   * <pre>
   * Required. Origin waypoint
   * </pre>
   *
   * <code>.google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the waypoint field is set.
   */
  @java.lang.Override
  public boolean hasWaypoint() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. Origin waypoint
   * </pre>
   *
   * <code>.google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The waypoint.
   */
  @java.lang.Override
  public com.google.maps.routing.v2.Waypoint getWaypoint() {
    return waypoint_ == null ? com.google.maps.routing.v2.Waypoint.getDefaultInstance() : waypoint_;
  }
  /**
   *
   *
   * <pre>
   * Required. Origin waypoint
   * </pre>
   *
   * <code>.google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.maps.routing.v2.WaypointOrBuilder getWaypointOrBuilder() {
    return waypoint_ == null ? com.google.maps.routing.v2.Waypoint.getDefaultInstance() : waypoint_;
  }

  public static final int ROUTE_MODIFIERS_FIELD_NUMBER = 2;
  private com.google.maps.routing.v2.RouteModifiers routeModifiers_;
  /**
   *
   *
   * <pre>
   * Optional. Modifiers for every route that takes this as the origin
   * </pre>
   *
   * <code>
   * .google.maps.routing.v2.RouteModifiers route_modifiers = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the routeModifiers field is set.
   */
  @java.lang.Override
  public boolean hasRouteModifiers() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. Modifiers for every route that takes this as the origin
   * </pre>
   *
   * <code>
   * .google.maps.routing.v2.RouteModifiers route_modifiers = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The routeModifiers.
   */
  @java.lang.Override
  public com.google.maps.routing.v2.RouteModifiers getRouteModifiers() {
    return routeModifiers_ == null
        ? com.google.maps.routing.v2.RouteModifiers.getDefaultInstance()
        : routeModifiers_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Modifiers for every route that takes this as the origin
   * </pre>
   *
   * <code>
   * .google.maps.routing.v2.RouteModifiers route_modifiers = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.maps.routing.v2.RouteModifiersOrBuilder getRouteModifiersOrBuilder() {
    return routeModifiers_ == null
        ? com.google.maps.routing.v2.RouteModifiers.getDefaultInstance()
        : routeModifiers_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getWaypoint());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getRouteModifiers());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getWaypoint());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getRouteModifiers());
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
    if (!(obj instanceof com.google.maps.routing.v2.RouteMatrixOrigin)) {
      return super.equals(obj);
    }
    com.google.maps.routing.v2.RouteMatrixOrigin other =
        (com.google.maps.routing.v2.RouteMatrixOrigin) obj;

    if (hasWaypoint() != other.hasWaypoint()) return false;
    if (hasWaypoint()) {
      if (!getWaypoint().equals(other.getWaypoint())) return false;
    }
    if (hasRouteModifiers() != other.hasRouteModifiers()) return false;
    if (hasRouteModifiers()) {
      if (!getRouteModifiers().equals(other.getRouteModifiers())) return false;
    }
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
    if (hasWaypoint()) {
      hash = (37 * hash) + WAYPOINT_FIELD_NUMBER;
      hash = (53 * hash) + getWaypoint().hashCode();
    }
    if (hasRouteModifiers()) {
      hash = (37 * hash) + ROUTE_MODIFIERS_FIELD_NUMBER;
      hash = (53 * hash) + getRouteModifiers().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.routing.v2.RouteMatrixOrigin parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.routing.v2.RouteMatrixOrigin parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.routing.v2.RouteMatrixOrigin parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.routing.v2.RouteMatrixOrigin parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.routing.v2.RouteMatrixOrigin parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.routing.v2.RouteMatrixOrigin parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.routing.v2.RouteMatrixOrigin parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.routing.v2.RouteMatrixOrigin parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.routing.v2.RouteMatrixOrigin parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.maps.routing.v2.RouteMatrixOrigin parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.routing.v2.RouteMatrixOrigin parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.routing.v2.RouteMatrixOrigin parseFrom(
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

  public static Builder newBuilder(com.google.maps.routing.v2.RouteMatrixOrigin prototype) {
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
   * A single origin for ComputeRouteMatrixRequest
   * </pre>
   *
   * Protobuf type {@code google.maps.routing.v2.RouteMatrixOrigin}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.maps.routing.v2.RouteMatrixOrigin)
      com.google.maps.routing.v2.RouteMatrixOriginOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.maps.routing.v2.RoutesServiceProto
          .internal_static_google_maps_routing_v2_RouteMatrixOrigin_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.routing.v2.RoutesServiceProto
          .internal_static_google_maps_routing_v2_RouteMatrixOrigin_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.routing.v2.RouteMatrixOrigin.class,
              com.google.maps.routing.v2.RouteMatrixOrigin.Builder.class);
    }

    // Construct using com.google.maps.routing.v2.RouteMatrixOrigin.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getWaypointFieldBuilder();
        getRouteModifiersFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      waypoint_ = null;
      if (waypointBuilder_ != null) {
        waypointBuilder_.dispose();
        waypointBuilder_ = null;
      }
      routeModifiers_ = null;
      if (routeModifiersBuilder_ != null) {
        routeModifiersBuilder_.dispose();
        routeModifiersBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.maps.routing.v2.RoutesServiceProto
          .internal_static_google_maps_routing_v2_RouteMatrixOrigin_descriptor;
    }

    @java.lang.Override
    public com.google.maps.routing.v2.RouteMatrixOrigin getDefaultInstanceForType() {
      return com.google.maps.routing.v2.RouteMatrixOrigin.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.routing.v2.RouteMatrixOrigin build() {
      com.google.maps.routing.v2.RouteMatrixOrigin result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.routing.v2.RouteMatrixOrigin buildPartial() {
      com.google.maps.routing.v2.RouteMatrixOrigin result =
          new com.google.maps.routing.v2.RouteMatrixOrigin(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.maps.routing.v2.RouteMatrixOrigin result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.waypoint_ = waypointBuilder_ == null ? waypoint_ : waypointBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.routeModifiers_ =
            routeModifiersBuilder_ == null ? routeModifiers_ : routeModifiersBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.maps.routing.v2.RouteMatrixOrigin) {
        return mergeFrom((com.google.maps.routing.v2.RouteMatrixOrigin) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.routing.v2.RouteMatrixOrigin other) {
      if (other == com.google.maps.routing.v2.RouteMatrixOrigin.getDefaultInstance()) return this;
      if (other.hasWaypoint()) {
        mergeWaypoint(other.getWaypoint());
      }
      if (other.hasRouteModifiers()) {
        mergeRouteModifiers(other.getRouteModifiers());
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
                input.readMessage(getWaypointFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getRouteModifiersFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private com.google.maps.routing.v2.Waypoint waypoint_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.maps.routing.v2.Waypoint,
            com.google.maps.routing.v2.Waypoint.Builder,
            com.google.maps.routing.v2.WaypointOrBuilder>
        waypointBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Origin waypoint
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the waypoint field is set.
     */
    public boolean hasWaypoint() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Origin waypoint
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The waypoint.
     */
    public com.google.maps.routing.v2.Waypoint getWaypoint() {
      if (waypointBuilder_ == null) {
        return waypoint_ == null
            ? com.google.maps.routing.v2.Waypoint.getDefaultInstance()
            : waypoint_;
      } else {
        return waypointBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Origin waypoint
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWaypoint(com.google.maps.routing.v2.Waypoint value) {
      if (waypointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        waypoint_ = value;
      } else {
        waypointBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Origin waypoint
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setWaypoint(com.google.maps.routing.v2.Waypoint.Builder builderForValue) {
      if (waypointBuilder_ == null) {
        waypoint_ = builderForValue.build();
      } else {
        waypointBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Origin waypoint
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeWaypoint(com.google.maps.routing.v2.Waypoint value) {
      if (waypointBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && waypoint_ != null
            && waypoint_ != com.google.maps.routing.v2.Waypoint.getDefaultInstance()) {
          getWaypointBuilder().mergeFrom(value);
        } else {
          waypoint_ = value;
        }
      } else {
        waypointBuilder_.mergeFrom(value);
      }
      if (waypoint_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Origin waypoint
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearWaypoint() {
      bitField0_ = (bitField0_ & ~0x00000001);
      waypoint_ = null;
      if (waypointBuilder_ != null) {
        waypointBuilder_.dispose();
        waypointBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Origin waypoint
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.maps.routing.v2.Waypoint.Builder getWaypointBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWaypointFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Origin waypoint
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.maps.routing.v2.WaypointOrBuilder getWaypointOrBuilder() {
      if (waypointBuilder_ != null) {
        return waypointBuilder_.getMessageOrBuilder();
      } else {
        return waypoint_ == null
            ? com.google.maps.routing.v2.Waypoint.getDefaultInstance()
            : waypoint_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Origin waypoint
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.Waypoint waypoint = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.maps.routing.v2.Waypoint,
            com.google.maps.routing.v2.Waypoint.Builder,
            com.google.maps.routing.v2.WaypointOrBuilder>
        getWaypointFieldBuilder() {
      if (waypointBuilder_ == null) {
        waypointBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.maps.routing.v2.Waypoint,
                com.google.maps.routing.v2.Waypoint.Builder,
                com.google.maps.routing.v2.WaypointOrBuilder>(
                getWaypoint(), getParentForChildren(), isClean());
        waypoint_ = null;
      }
      return waypointBuilder_;
    }

    private com.google.maps.routing.v2.RouteModifiers routeModifiers_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.maps.routing.v2.RouteModifiers,
            com.google.maps.routing.v2.RouteModifiers.Builder,
            com.google.maps.routing.v2.RouteModifiersOrBuilder>
        routeModifiersBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. Modifiers for every route that takes this as the origin
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.RouteModifiers route_modifiers = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the routeModifiers field is set.
     */
    public boolean hasRouteModifiers() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. Modifiers for every route that takes this as the origin
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.RouteModifiers route_modifiers = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The routeModifiers.
     */
    public com.google.maps.routing.v2.RouteModifiers getRouteModifiers() {
      if (routeModifiersBuilder_ == null) {
        return routeModifiers_ == null
            ? com.google.maps.routing.v2.RouteModifiers.getDefaultInstance()
            : routeModifiers_;
      } else {
        return routeModifiersBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Modifiers for every route that takes this as the origin
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.RouteModifiers route_modifiers = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setRouteModifiers(com.google.maps.routing.v2.RouteModifiers value) {
      if (routeModifiersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        routeModifiers_ = value;
      } else {
        routeModifiersBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Modifiers for every route that takes this as the origin
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.RouteModifiers route_modifiers = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setRouteModifiers(
        com.google.maps.routing.v2.RouteModifiers.Builder builderForValue) {
      if (routeModifiersBuilder_ == null) {
        routeModifiers_ = builderForValue.build();
      } else {
        routeModifiersBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Modifiers for every route that takes this as the origin
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.RouteModifiers route_modifiers = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeRouteModifiers(com.google.maps.routing.v2.RouteModifiers value) {
      if (routeModifiersBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && routeModifiers_ != null
            && routeModifiers_ != com.google.maps.routing.v2.RouteModifiers.getDefaultInstance()) {
          getRouteModifiersBuilder().mergeFrom(value);
        } else {
          routeModifiers_ = value;
        }
      } else {
        routeModifiersBuilder_.mergeFrom(value);
      }
      if (routeModifiers_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Modifiers for every route that takes this as the origin
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.RouteModifiers route_modifiers = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearRouteModifiers() {
      bitField0_ = (bitField0_ & ~0x00000002);
      routeModifiers_ = null;
      if (routeModifiersBuilder_ != null) {
        routeModifiersBuilder_.dispose();
        routeModifiersBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Modifiers for every route that takes this as the origin
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.RouteModifiers route_modifiers = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.maps.routing.v2.RouteModifiers.Builder getRouteModifiersBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRouteModifiersFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. Modifiers for every route that takes this as the origin
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.RouteModifiers route_modifiers = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.maps.routing.v2.RouteModifiersOrBuilder getRouteModifiersOrBuilder() {
      if (routeModifiersBuilder_ != null) {
        return routeModifiersBuilder_.getMessageOrBuilder();
      } else {
        return routeModifiers_ == null
            ? com.google.maps.routing.v2.RouteModifiers.getDefaultInstance()
            : routeModifiers_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Modifiers for every route that takes this as the origin
     * </pre>
     *
     * <code>
     * .google.maps.routing.v2.RouteModifiers route_modifiers = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.maps.routing.v2.RouteModifiers,
            com.google.maps.routing.v2.RouteModifiers.Builder,
            com.google.maps.routing.v2.RouteModifiersOrBuilder>
        getRouteModifiersFieldBuilder() {
      if (routeModifiersBuilder_ == null) {
        routeModifiersBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.maps.routing.v2.RouteModifiers,
                com.google.maps.routing.v2.RouteModifiers.Builder,
                com.google.maps.routing.v2.RouteModifiersOrBuilder>(
                getRouteModifiers(), getParentForChildren(), isClean());
        routeModifiers_ = null;
      }
      return routeModifiersBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.maps.routing.v2.RouteMatrixOrigin)
  }

  // @@protoc_insertion_point(class_scope:google.maps.routing.v2.RouteMatrixOrigin)
  private static final com.google.maps.routing.v2.RouteMatrixOrigin DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.maps.routing.v2.RouteMatrixOrigin();
  }

  public static com.google.maps.routing.v2.RouteMatrixOrigin getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RouteMatrixOrigin> PARSER =
      new com.google.protobuf.AbstractParser<RouteMatrixOrigin>() {
        @java.lang.Override
        public RouteMatrixOrigin parsePartialFrom(
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

  public static com.google.protobuf.Parser<RouteMatrixOrigin> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RouteMatrixOrigin> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.routing.v2.RouteMatrixOrigin getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
