/*
 * Copyright 2017 Google Inc. All Rights Reserved.
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

package com.google.cloud.examples.pubsub.snippets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.api.gax.grpc.ApiException;
import com.google.cloud.Identity;
import com.google.cloud.Role;
import com.google.cloud.ServiceOptions;
import com.google.cloud.pubsub.spi.v1.PagedResponseWrappers.ListSubscriptionsPagedResponse;
import com.google.cloud.pubsub.spi.v1.Publisher;
import com.google.cloud.pubsub.spi.v1.PublisherClient;
import com.google.common.collect.Iterables;
import com.google.iam.v1.Policy;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.protobuf.ByteString;
import com.google.pubsub.v1.PubsubMessage;
import com.google.pubsub.v1.PullResponse;
import com.google.pubsub.v1.ReceivedMessage;
import com.google.pubsub.v1.Subscription;
import com.google.pubsub.v1.TopicName;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ITSubscriberClientSnippets {

  private static final String NAME_SUFFIX = UUID.randomUUID().toString();

  private static String projectId;

  private static SubscriberClientSnippets subscriberClientSnippets;

  private static String[] topics = {
      formatForTest("topic-1"),
      formatForTest("topic-2"),
  };
  private static String[] subscriptions = {
      formatForTest("subscription-1"),
      formatForTest("subscription-2")
  };

  @Rule
  public Timeout globalTimeout = Timeout.seconds(300);

  private static String formatForTest(String resourceName) {
    return resourceName + "-" + NAME_SUFFIX;
  }

  @BeforeClass
  public static void beforeClass() {
    projectId = ServiceOptions.getDefaultProjectId();
    subscriberClientSnippets = new SubscriberClientSnippets(projectId);
  }

  @Before
  public void setUp() throws Exception {
    Cleanup.deleteTestTopicsAndSubscriptions(projectId, topics, subscriptions);
  }

  private Subscription createSubscription(String topicName, String subscriptionName)
      throws Exception {
    createTopic(topicName);
    Subscription subscription =
        subscriberClientSnippets.createSubscription(topicName, subscriptionName);
    assertNotNull(subscription);
    Subscription retrievedSubscription = subscriberClientSnippets.getSubscription(subscriptionName);
    assertNotNull(retrievedSubscription);
    assertEquals(subscription.getName(), retrievedSubscription.getName());
    return subscription;
  }

  @Test
  public void publishAndPullMessagesIsSuccessful() throws Exception {
    String topicName = topics[0];
    String subscriptionName = subscriptions[0];
    createSubscription(topicName, subscriptionName);
    Set<String> messages = publishMessages(topicName, 5);
    //pulls max 100 messages
    PullResponse response = subscriberClientSnippets.pull(subscriptionName);
    assertNotNull(response);
    //remove messages that match sent
    for (ReceivedMessage receivedMessage : response.getReceivedMessagesList()) {
      String message = receivedMessage.getMessage().getData().toStringUtf8();
      if (messages.contains(message)) {
        messages.remove(message);
      }
    }
    //all messages published were received
    assertTrue(messages.isEmpty());
  }

  @Test
  public void replacePushConfigIsSuccessful() throws Exception {
    String topicName = topics[0];
    String subscriptionName = subscriptions[0];
    createSubscription(topicName, subscriptionName);
    String endpoint = "https://" + projectId + ".appspot.com/push";
    subscriberClientSnippets.replacePushConfig(subscriptionName, endpoint);
    Subscription subscription = subscriberClientSnippets.getSubscription(subscriptionName);
    assertNotNull(subscription.getPushConfig());
    assertEquals(subscription.getPushConfig().getPushEndpoint(), endpoint);
  }

  @Test
  public void listSubscriptionsRetrievesAllAddedSubscriptions() throws Exception {
    List<Subscription> addedSubscriptions = new ArrayList<>();
    String topicName1 = topics[0];
    String subscriptionName1 = subscriptions[0];
    String topicName2 = topics[1];
    String subscriptionName2 = subscriptions[1];
    addedSubscriptions.add(createSubscription(topicName1, subscriptionName1));
    addedSubscriptions.add(createSubscription(topicName2, subscriptionName2));

    String pageToken;
    boolean[] subFound = {false, false};
    ListSubscriptionsPagedResponse response = subscriberClientSnippets.listSubscriptions();
    do {
      assertNotNull(response);
      pageToken = (String) response.getNextPageToken();
      Iterable<Subscription> subscriptions = response.iterateAllElements();
      for (int i = 0; i < 2; i++) {
        if (!subFound[i]) {
          subFound[i] = Iterables.contains(subscriptions, addedSubscriptions.get(i));
        }
      }
      if (pageToken != null) {
        response = subscriberClientSnippets.listSubscriptionsWithPageToken(pageToken);
      }
    } while (!(subFound[0] && subFound[1]));
  }

  @Test(expected = ApiException.class)
  public void deleteSubscriptionThrowsExceptionWhenRetrieved() throws Exception {
    String topicName = topics[0];
    String subscriptionName = subscriptions[0];
    createSubscription(topicName, subscriptionName);
    subscriberClientSnippets.deleteSubscription(subscriptionName);
    //expected to throw exception on retrieval
    subscriberClientSnippets.getSubscription(subscriptionName);
  }

  @Test
  public void subscriptionHasValidIamPolicy() throws Exception {
    String topicName = topics[0];
    String subscriptionName = subscriptions[0];
    createSubscription(topicName, subscriptionName);
    Policy policy = subscriberClientSnippets.getSubscriptionPolicy(subscriptionName);
    assertNotNull(policy);
  }

  @Test
  public void replaceSubscriptionPolicyAndTestPermissionsIsSuccessful() throws Exception {
    String topicName = topics[0];
    String subscriptionName = subscriptions[0];
    createSubscription(topicName, subscriptionName);
    Policy policy = subscriberClientSnippets.replaceSubscriptionPolicy(subscriptionName);
    assertNotNull(policy.getBindingsCount());
    assertTrue(policy.getBindings(0).getRole().equalsIgnoreCase(Role.viewer().toString()));
    assertTrue(policy.getBindings(0).getMembers(0)
        .equalsIgnoreCase(Identity.allAuthenticatedUsers().toString()));
    TestIamPermissionsResponse response =
        subscriberClientSnippets.testSubscriptionPermissions(subscriptionName);
    assertTrue(response.getPermissionsList().contains("pubsub.subscriptions.get"));
  }



  private void createTopic(String name) throws Exception {
    try (PublisherClient publisherClient = PublisherClient.create()) {
      publisherClient.createTopic(TopicName.create(projectId, name));
    }
  }

  private Set<String> publishMessages(String topicName, int numMessages) throws Exception {
    Set<String> messages = new HashSet<>();
    Publisher publisher = Publisher.newBuilder(TopicName.create(projectId, topicName)).build();
    for (int i = 1; i<= numMessages; i++) {
      String message = formatForTest("message-" + String.valueOf(i));
      PubsubMessage pubsubMessage = PubsubMessage.newBuilder().setData(
          ByteString.copyFromUtf8(message)).build();
      publisher.publish(pubsubMessage);
      messages.add(message);
    }
    return messages;
  }

  @After
  public void tearDown() throws Exception {
    Cleanup.deleteTestTopicsAndSubscriptions(projectId, topics, subscriptions);
  }
}
