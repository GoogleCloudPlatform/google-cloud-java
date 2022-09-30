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
package com.google.cloud.eventarc.publishing.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 *
 *
 * <pre>
 * Eventarc processes events generated by an event provider and delivers them to
 * a subscriber.
 * An event provider is a software-as-a-service (SaaS) system or
 * product that can generate and deliver events through Eventarc.
 * A third-party event provider is an event provider from outside of Google.
 * A partner is a third-party event provider that is integrated with Eventarc.
 * A subscriber is a GCP customer interested in receiving events.
 * Channel is a first-class Eventarc resource that is created and managed
 * by the subscriber in their GCP project. A Channel represents a subscriber's
 * intent to receive events from an event provider. A Channel is associated with
 * exactly one event provider.
 * ChannelConnection is a first-class Eventarc resource that
 * is created and managed by the partner in their GCP project. A
 * ChannelConnection represents a connection between a partner and a
 * subscriber's Channel. A ChannelConnection has a one-to-one mapping with a
 * Channel.
 * Publisher allows an event provider to publish events to Eventarc.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/eventarc/publishing/v1/publisher.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PublisherGrpc {

  private PublisherGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.eventarc.publishing.v1.Publisher";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest,
          com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsResponse>
      getPublishChannelConnectionEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishChannelConnectionEvents",
      requestType =
          com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest.class,
      responseType =
          com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest,
          com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsResponse>
      getPublishChannelConnectionEventsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest,
            com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsResponse>
        getPublishChannelConnectionEventsMethod;
    if ((getPublishChannelConnectionEventsMethod =
            PublisherGrpc.getPublishChannelConnectionEventsMethod)
        == null) {
      synchronized (PublisherGrpc.class) {
        if ((getPublishChannelConnectionEventsMethod =
                PublisherGrpc.getPublishChannelConnectionEventsMethod)
            == null) {
          PublisherGrpc.getPublishChannelConnectionEventsMethod =
              getPublishChannelConnectionEventsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.eventarc.publishing.v1
                              .PublishChannelConnectionEventsRequest,
                          com.google.cloud.eventarc.publishing.v1
                              .PublishChannelConnectionEventsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "PublishChannelConnectionEvents"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.eventarc.publishing.v1
                                  .PublishChannelConnectionEventsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.eventarc.publishing.v1
                                  .PublishChannelConnectionEventsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new PublisherMethodDescriptorSupplier("PublishChannelConnectionEvents"))
                      .build();
        }
      }
    }
    return getPublishChannelConnectionEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.eventarc.publishing.v1.PublishEventsRequest,
          com.google.cloud.eventarc.publishing.v1.PublishEventsResponse>
      getPublishEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishEvents",
      requestType = com.google.cloud.eventarc.publishing.v1.PublishEventsRequest.class,
      responseType = com.google.cloud.eventarc.publishing.v1.PublishEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.eventarc.publishing.v1.PublishEventsRequest,
          com.google.cloud.eventarc.publishing.v1.PublishEventsResponse>
      getPublishEventsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.eventarc.publishing.v1.PublishEventsRequest,
            com.google.cloud.eventarc.publishing.v1.PublishEventsResponse>
        getPublishEventsMethod;
    if ((getPublishEventsMethod = PublisherGrpc.getPublishEventsMethod) == null) {
      synchronized (PublisherGrpc.class) {
        if ((getPublishEventsMethod = PublisherGrpc.getPublishEventsMethod) == null) {
          PublisherGrpc.getPublishEventsMethod =
              getPublishEventsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.eventarc.publishing.v1.PublishEventsRequest,
                          com.google.cloud.eventarc.publishing.v1.PublishEventsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishEvents"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.eventarc.publishing.v1.PublishEventsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.eventarc.publishing.v1.PublishEventsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new PublisherMethodDescriptorSupplier("PublishEvents"))
                      .build();
        }
      }
    }
    return getPublishEventsMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static PublisherStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PublisherStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<PublisherStub>() {
          @java.lang.Override
          public PublisherStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new PublisherStub(channel, callOptions);
          }
        };
    return PublisherStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PublisherBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PublisherBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<PublisherBlockingStub>() {
          @java.lang.Override
          public PublisherBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new PublisherBlockingStub(channel, callOptions);
          }
        };
    return PublisherBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static PublisherFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PublisherFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<PublisherFutureStub>() {
          @java.lang.Override
          public PublisherFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new PublisherFutureStub(channel, callOptions);
          }
        };
    return PublisherFutureStub.newStub(factory, channel);
  }

  /**
   *
   *
   * <pre>
   * Eventarc processes events generated by an event provider and delivers them to
   * a subscriber.
   * An event provider is a software-as-a-service (SaaS) system or
   * product that can generate and deliver events through Eventarc.
   * A third-party event provider is an event provider from outside of Google.
   * A partner is a third-party event provider that is integrated with Eventarc.
   * A subscriber is a GCP customer interested in receiving events.
   * Channel is a first-class Eventarc resource that is created and managed
   * by the subscriber in their GCP project. A Channel represents a subscriber's
   * intent to receive events from an event provider. A Channel is associated with
   * exactly one event provider.
   * ChannelConnection is a first-class Eventarc resource that
   * is created and managed by the partner in their GCP project. A
   * ChannelConnection represents a connection between a partner and a
   * subscriber's Channel. A ChannelConnection has a one-to-one mapping with a
   * Channel.
   * Publisher allows an event provider to publish events to Eventarc.
   * </pre>
   */
  public abstract static class PublisherImplBase implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Publish events to a ChannelConnection in a partner's project.
     * </pre>
     */
    public void publishChannelConnectionEvents(
        com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getPublishChannelConnectionEventsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Publish events to a subscriber's channel.
     * </pre>
     */
    public void publishEvents(
        com.google.cloud.eventarc.publishing.v1.PublishEventsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.eventarc.publishing.v1.PublishEventsResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getPublishEventsMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getPublishChannelConnectionEventsMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest,
                      com.google.cloud.eventarc.publishing.v1
                          .PublishChannelConnectionEventsResponse>(
                      this, METHODID_PUBLISH_CHANNEL_CONNECTION_EVENTS)))
          .addMethod(
              getPublishEventsMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.eventarc.publishing.v1.PublishEventsRequest,
                      com.google.cloud.eventarc.publishing.v1.PublishEventsResponse>(
                      this, METHODID_PUBLISH_EVENTS)))
          .build();
    }
  }

  /**
   *
   *
   * <pre>
   * Eventarc processes events generated by an event provider and delivers them to
   * a subscriber.
   * An event provider is a software-as-a-service (SaaS) system or
   * product that can generate and deliver events through Eventarc.
   * A third-party event provider is an event provider from outside of Google.
   * A partner is a third-party event provider that is integrated with Eventarc.
   * A subscriber is a GCP customer interested in receiving events.
   * Channel is a first-class Eventarc resource that is created and managed
   * by the subscriber in their GCP project. A Channel represents a subscriber's
   * intent to receive events from an event provider. A Channel is associated with
   * exactly one event provider.
   * ChannelConnection is a first-class Eventarc resource that
   * is created and managed by the partner in their GCP project. A
   * ChannelConnection represents a connection between a partner and a
   * subscriber's Channel. A ChannelConnection has a one-to-one mapping with a
   * Channel.
   * Publisher allows an event provider to publish events to Eventarc.
   * </pre>
   */
  public static final class PublisherStub extends io.grpc.stub.AbstractAsyncStub<PublisherStub> {
    private PublisherStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublisherStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PublisherStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Publish events to a ChannelConnection in a partner's project.
     * </pre>
     */
    public void publishChannelConnectionEvents(
        com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishChannelConnectionEventsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Publish events to a subscriber's channel.
     * </pre>
     */
    public void publishEvents(
        com.google.cloud.eventarc.publishing.v1.PublishEventsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.eventarc.publishing.v1.PublishEventsResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishEventsMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   *
   *
   * <pre>
   * Eventarc processes events generated by an event provider and delivers them to
   * a subscriber.
   * An event provider is a software-as-a-service (SaaS) system or
   * product that can generate and deliver events through Eventarc.
   * A third-party event provider is an event provider from outside of Google.
   * A partner is a third-party event provider that is integrated with Eventarc.
   * A subscriber is a GCP customer interested in receiving events.
   * Channel is a first-class Eventarc resource that is created and managed
   * by the subscriber in their GCP project. A Channel represents a subscriber's
   * intent to receive events from an event provider. A Channel is associated with
   * exactly one event provider.
   * ChannelConnection is a first-class Eventarc resource that
   * is created and managed by the partner in their GCP project. A
   * ChannelConnection represents a connection between a partner and a
   * subscriber's Channel. A ChannelConnection has a one-to-one mapping with a
   * Channel.
   * Publisher allows an event provider to publish events to Eventarc.
   * </pre>
   */
  public static final class PublisherBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PublisherBlockingStub> {
    private PublisherBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublisherBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PublisherBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Publish events to a ChannelConnection in a partner's project.
     * </pre>
     */
    public com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsResponse
        publishChannelConnectionEvents(
            com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishChannelConnectionEventsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Publish events to a subscriber's channel.
     * </pre>
     */
    public com.google.cloud.eventarc.publishing.v1.PublishEventsResponse publishEvents(
        com.google.cloud.eventarc.publishing.v1.PublishEventsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishEventsMethod(), getCallOptions(), request);
    }
  }

  /**
   *
   *
   * <pre>
   * Eventarc processes events generated by an event provider and delivers them to
   * a subscriber.
   * An event provider is a software-as-a-service (SaaS) system or
   * product that can generate and deliver events through Eventarc.
   * A third-party event provider is an event provider from outside of Google.
   * A partner is a third-party event provider that is integrated with Eventarc.
   * A subscriber is a GCP customer interested in receiving events.
   * Channel is a first-class Eventarc resource that is created and managed
   * by the subscriber in their GCP project. A Channel represents a subscriber's
   * intent to receive events from an event provider. A Channel is associated with
   * exactly one event provider.
   * ChannelConnection is a first-class Eventarc resource that
   * is created and managed by the partner in their GCP project. A
   * ChannelConnection represents a connection between a partner and a
   * subscriber's Channel. A ChannelConnection has a one-to-one mapping with a
   * Channel.
   * Publisher allows an event provider to publish events to Eventarc.
   * </pre>
   */
  public static final class PublisherFutureStub
      extends io.grpc.stub.AbstractFutureStub<PublisherFutureStub> {
    private PublisherFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PublisherFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PublisherFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Publish events to a ChannelConnection in a partner's project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsResponse>
        publishChannelConnectionEvents(
            com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishChannelConnectionEventsMethod(), getCallOptions()),
          request);
    }

    /**
     *
     *
     * <pre>
     * Publish events to a subscriber's channel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.eventarc.publishing.v1.PublishEventsResponse>
        publishEvents(com.google.cloud.eventarc.publishing.v1.PublishEventsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishEventsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUBLISH_CHANNEL_CONNECTION_EVENTS = 0;
  private static final int METHODID_PUBLISH_EVENTS = 1;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PublisherImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PublisherImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUBLISH_CHANNEL_CONNECTION_EVENTS:
          serviceImpl.publishChannelConnectionEvents(
              (com.google.cloud.eventarc.publishing.v1.PublishChannelConnectionEventsRequest)
                  request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.eventarc.publishing.v1
                          .PublishChannelConnectionEventsResponse>)
                  responseObserver);
          break;
        case METHODID_PUBLISH_EVENTS:
          serviceImpl.publishEvents(
              (com.google.cloud.eventarc.publishing.v1.PublishEventsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.eventarc.publishing.v1.PublishEventsResponse>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class PublisherBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PublisherBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.eventarc.publishing.v1.PublisherProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Publisher");
    }
  }

  private static final class PublisherFileDescriptorSupplier
      extends PublisherBaseDescriptorSupplier {
    PublisherFileDescriptorSupplier() {}
  }

  private static final class PublisherMethodDescriptorSupplier
      extends PublisherBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PublisherMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PublisherGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new PublisherFileDescriptorSupplier())
                      .addMethod(getPublishChannelConnectionEventsMethod())
                      .addMethod(getPublishEventsMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
