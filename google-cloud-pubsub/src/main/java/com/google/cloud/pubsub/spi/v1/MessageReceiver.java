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

package com.google.cloud.pubsub.spi.v1;

import com.google.pubsub.v1.PubsubMessage;

/** This interface can be implemented by users of {@link Subscriber} to receive messages. */
public interface MessageReceiver {
  /** A reply to a message, to be sent back to the service. */
  enum AckReply {
    /**
     * Acknowledges that the message has been successfully processed. The service will not send the
     * message again.
     */
    ACK,
    /**
     * Signals that the message has not been successfully processed. The service will resend the
     * message.
     */
    NACK
  }

  /**
   * Accepts a reply, sending it to the service.
   *
   * <p>Both the interface and its method is named after the Java 8's {@code BiConsumer} interface
   * to ease migration when we finally move.
   */
  interface AckReplyConsumer {
    void accept(AckReply ackReply, Throwable t);
  }

  /**
   * Called when a message is received by the subscriber. The implementation must arrange for {@link
   * AckReplyConsumer#accept} to be called after processing the {@code message}.
   */
  void receiveMessage(final PubsubMessage message, final AckReplyConsumer consumer);
}
