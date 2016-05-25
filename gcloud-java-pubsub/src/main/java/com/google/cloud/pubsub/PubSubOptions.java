/*
 * Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.cloud.pubsub;

import static com.google.common.base.MoreObjects.firstNonNull;

import com.google.cloud.GrpcServiceOptions;
import com.google.cloud.pubsub.spi.DefaultPubSubRpc;
import com.google.cloud.pubsub.spi.PubSubRpc;
import com.google.cloud.pubsub.spi.PubSubRpcFactory;
import com.google.common.collect.ImmutableSet;

import java.io.IOException;
import java.util.Set;

public class PubSubOptions extends GrpcServiceOptions<PubSub, PubSubRpc, PubSubOptions> {

  private static final long serialVersionUID = 5640180400046623305L;
  private static final String PUBSUB_SCOPE = "https://www.googleapis.com/auth/pubsub";
  private static final Set<String> SCOPES = ImmutableSet.of(PUBSUB_SCOPE);
  private static final String DEFAULT_HOST = "https://pubsub.googleapis.com";

  private final AckDeadlineRenewParams ackDeadlineRenewParams;

  public static class DefaultPubSubFactory implements PubSubFactory {
    private static final PubSubFactory INSTANCE = new DefaultPubSubFactory();

    @Override
    public PubSub create(PubSubOptions options) {
      return new PubSubImpl(options);
    }
  }

  /**
   * Returns a default {@code PubSubOptions} instance.
   */
  public static PubSubOptions defaultInstance() {
    return builder().build();
  }

  public static class DefaultPubSubRpcFactory implements PubSubRpcFactory {
    private static final PubSubRpcFactory INSTANCE = new DefaultPubSubRpcFactory();

    @Override
    public PubSubRpc create(PubSubOptions options) {
      try {
        return new DefaultPubSubRpc(options);
      } catch (IOException e) {
        throw new PubSubException(e, true);
      }
    }
  }

  @Override
  protected String defaultHost() {
    return DEFAULT_HOST;
  }

  public static class Builder extends
      GrpcServiceOptions.Builder<PubSub, PubSubRpc, PubSubOptions, Builder> {

    private AckDeadlineRenewParams ackDeadlineRenewParams;

    private Builder() {}

    private Builder(PubSubOptions options) {
      super(options);
    }

    /**
     * Sets the configuration parameters for automatic deadline renewal. If not set,
     * {@link AckDeadlineRenewParams#noBackoff()} is used: automatic deadline renewal always sets
     * ack deadline to 10 seconds.
     */
    public Builder ackDeadlineRenewParams(AckDeadlineRenewParams ackDeadlineRenewParams) {
      this.ackDeadlineRenewParams = ackDeadlineRenewParams;
      return self();
    }

    @Override
    public PubSubOptions build() {
      return new PubSubOptions(this);
    }
  }

  protected PubSubOptions(Builder builder) {
    super(PubSubFactory.class, PubSubRpcFactory.class, builder);
    ackDeadlineRenewParams =
        firstNonNull(builder.ackDeadlineRenewParams, AckDeadlineRenewParams.noBackoff());
  }

  @Override
  protected ExecutorFactory executorFactory() {
    return super.executorFactory();
  }

  /**
   * Returns the configuration parameters for automatic deadline renewal.
   */
  public AckDeadlineRenewParams ackDeadlineRenewParams() {
    return ackDeadlineRenewParams;
  }

  @Override
  protected PubSubFactory defaultServiceFactory() {
    return DefaultPubSubFactory.INSTANCE;
  }

  @Override
  protected PubSubRpcFactory defaultRpcFactory() {
    return DefaultPubSubRpcFactory.INSTANCE;
  }

  @Override
  protected Set<String> scopes() {
    return SCOPES;
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof PubSubOptions && baseEquals((PubSubOptions) obj);
  }

  @Override
  public int hashCode() {
    return baseHashCode();
  }

  @Override
  public Builder toBuilder() {
    return new Builder(this);
  }

  public static Builder builder() {
    return new Builder();
  }
}
