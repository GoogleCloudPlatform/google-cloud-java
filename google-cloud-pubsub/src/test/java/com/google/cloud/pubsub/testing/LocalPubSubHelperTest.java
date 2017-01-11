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

package com.google.cloud.pubsub.testing;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.cloud.NoCredentials;

import org.joda.time.Duration;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class LocalPubSubHelperTest {

  private static final String PROJECT_ID_PREFIX = "test-project-";
  private static final String TOPIC = "topic";

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void testCreate() {
    LocalPubSubHelper helper = LocalPubSubHelper.create();
    assertTrue(helper.getProjectId().startsWith(PROJECT_ID_PREFIX));
  }

  @Test
  public void testStartStopReset() throws IOException, InterruptedException, TimeoutException {
    LocalPubSubHelper helper = LocalPubSubHelper.create();
    helper.start();
    helper.reset();
    helper.stop(Duration.standardMinutes(1));
  }
}
