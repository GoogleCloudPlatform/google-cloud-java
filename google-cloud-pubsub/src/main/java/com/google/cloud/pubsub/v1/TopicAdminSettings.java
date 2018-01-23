/*
 * Copyright 2018 Google LLC
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
package com.google.cloud.pubsub.v1;

import static com.google.cloud.pubsub.v1.PagedResponseWrappers.ListTopicSubscriptionsPagedResponse;
import static com.google.cloud.pubsub.v1.PagedResponseWrappers.ListTopicsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.rpc.BatchingCallSettings;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.HeaderProvider;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.pubsub.v1.stub.PublisherStub;
import com.google.cloud.pubsub.v1.stub.PublisherStubSettings;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.protobuf.Empty;
import com.google.pubsub.v1.DeleteTopicRequest;
import com.google.pubsub.v1.GetTopicRequest;
import com.google.pubsub.v1.ListTopicSubscriptionsRequest;
import com.google.pubsub.v1.ListTopicSubscriptionsResponse;
import com.google.pubsub.v1.ListTopicsRequest;
import com.google.pubsub.v1.ListTopicsResponse;
import com.google.pubsub.v1.PublishRequest;
import com.google.pubsub.v1.PublishResponse;
import com.google.pubsub.v1.Topic;
import com.google.pubsub.v1.UpdateTopicRequest;
import java.io.IOException;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link TopicAdminClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (pubsub.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object. For
 * example, to set the total timeout of createTopic to 30 seconds:
 *
 * <pre>
 * <code>
 * TopicAdminSettings.Builder topicAdminSettingsBuilder =
 *     TopicAdminSettings.newBuilder();
 * topicAdminSettingsBuilder.createTopicSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * TopicAdminSettings topicAdminSettings = topicAdminSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class TopicAdminSettings extends ClientSettings<TopicAdminSettings> {
  private final PublisherStubSettings stubSettings;

  public static final TopicAdminSettings create(PublisherStubSettings stub) throws IOException {
    return new TopicAdminSettings.Builder(stub).build();
  }

  public PublisherStubSettings getStubSettings() {
    return stubSettings;
  }

  /** Returns the object with the settings used for calls to createTopic. */
  public UnaryCallSettings<Topic, Topic> createTopicSettings() {
    return stubSettings.createTopicSettings();
  }

  /** Returns the object with the settings used for calls to updateTopic. */
  UnaryCallSettings<UpdateTopicRequest, Topic> updateTopicSettings() {
    return stubSettings.updateTopicSettings();
  }

  /** Returns the object with the settings used for calls to publish. */
  BatchingCallSettings<PublishRequest, PublishResponse> publishSettings() {
    return stubSettings.publishSettings();
  }

  /** Returns the object with the settings used for calls to getTopic. */
  public UnaryCallSettings<GetTopicRequest, Topic> getTopicSettings() {
    return stubSettings.getTopicSettings();
  }

  /** Returns the object with the settings used for calls to listTopics. */
  public PagedCallSettings<ListTopicsRequest, ListTopicsResponse, ListTopicsPagedResponse>
      listTopicsSettings() {
    return stubSettings.listTopicsSettings();
  }

  /** Returns the object with the settings used for calls to listTopicSubscriptions. */
  public PagedCallSettings<
          ListTopicSubscriptionsRequest, ListTopicSubscriptionsResponse,
          ListTopicSubscriptionsPagedResponse>
      listTopicSubscriptionsSettings() {
    return stubSettings.listTopicSubscriptionsSettings();
  }

  /** Returns the object with the settings used for calls to deleteTopic. */
  public UnaryCallSettings<DeleteTopicRequest, Empty> deleteTopicSettings() {
    return stubSettings.deleteTopicSettings();
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return stubSettings.setIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return stubSettings.getIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return stubSettings.testIamPermissionsSettings();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public PublisherStub createStub() throws IOException {
    return stubSettings.createStub();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected TopicAdminSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
    stubSettings = settingsBuilder.stubBuilder.build();
  }

  /** Builder for TopicAdminSettings. */
  public static class Builder extends ClientSettings.Builder<TopicAdminSettings, Builder> {
    private PublisherStubSettings.Builder stubBuilder;

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      stubBuilder = PublisherStubSettings.newBuilder(clientContext);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(PublisherStubSettings.defaultTransportChannelProvider());
      builder.setCredentialsProvider(PublisherStubSettings.defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(PublisherStubSettings.defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(PublisherStubSettings.getDefaultEndpoint());
      builder.stubBuilder = PublisherStubSettings.newBuilder();
      return builder;
    }

    protected Builder(TopicAdminSettings settings) {
      super(settings.getStubSettings());
      stubBuilder = settings.getStubSettings().toBuilder();
    }

    protected Builder(PublisherStubSettings stubSettings) {
      super(stubSettings);
      stubBuilder = stubSettings.toBuilder();
    }

    @Override
    public Builder setTransportChannelProvider(TransportChannelProvider channelProvider) {
      super.setTransportChannelProvider(channelProvider);
      stubBuilder.setTransportChannelProvider(channelProvider);
      return this;
    }

    @Override
    public Builder setCredentialsProvider(CredentialsProvider credentialsProvider) {
      super.setCredentialsProvider(credentialsProvider);
      stubBuilder.setCredentialsProvider(credentialsProvider);
      return this;
    }

    protected Builder setInternalHeaderProvider(HeaderProvider headerProvider) {
      super.setInternalHeaderProvider(headerProvider);
      stubBuilder.setInternalHeaderProvider(headerProvider);
      return this;
    }

    @Override
    public Builder setEndpoint(String endpoint) {
      super.setEndpoint(endpoint);
      stubBuilder.setEndpoint(endpoint);
      return this;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(stubBuilder.unaryMethodSettingsBuilders(), settingsUpdater);
      stubBuilder.applyToAllUnaryMethods(settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to createTopic. */
    public UnaryCallSettings.Builder<Topic, Topic> createTopicSettings() {
      return stubBuilder.createTopicSettings();
    }

    /** Returns the builder for the settings used for calls to updateTopic. */
    UnaryCallSettings.Builder<UpdateTopicRequest, Topic> updateTopicSettings() {
      return stubBuilder.updateTopicSettings();
    }

    /** Returns the builder for the settings used for calls to publish. */
    BatchingCallSettings.Builder<PublishRequest, PublishResponse> publishSettings() {
      return stubBuilder.publishSettings();
    }

    /** Returns the builder for the settings used for calls to getTopic. */
    public UnaryCallSettings.Builder<GetTopicRequest, Topic> getTopicSettings() {
      return stubBuilder.getTopicSettings();
    }

    /** Returns the builder for the settings used for calls to listTopics. */
    public PagedCallSettings.Builder<ListTopicsRequest, ListTopicsResponse, ListTopicsPagedResponse>
        listTopicsSettings() {
      return stubBuilder.listTopicsSettings();
    }

    /** Returns the builder for the settings used for calls to listTopicSubscriptions. */
    public PagedCallSettings.Builder<
            ListTopicSubscriptionsRequest, ListTopicSubscriptionsResponse,
            ListTopicSubscriptionsPagedResponse>
        listTopicSubscriptionsSettings() {
      return stubBuilder.listTopicSubscriptionsSettings();
    }

    /** Returns the builder for the settings used for calls to deleteTopic. */
    public UnaryCallSettings.Builder<DeleteTopicRequest, Empty> deleteTopicSettings() {
      return stubBuilder.deleteTopicSettings();
    }

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings() {
      return stubBuilder.setIamPolicySettings();
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings() {
      return stubBuilder.getIamPolicySettings();
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings() {
      return stubBuilder.testIamPermissionsSettings();
    }

    @Override
    public TopicAdminSettings build() throws IOException {
      return new TopicAdminSettings(this);
    }
  }
}
