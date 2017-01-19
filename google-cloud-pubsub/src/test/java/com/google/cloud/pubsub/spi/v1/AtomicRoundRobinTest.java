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

import org.junit.Assert;
import org.junit.Test;

public class AtomicRoundRobinTest {
  @Test
  public void testNext() {
    AtomicRoundRobin roundRobin = new AtomicRoundRobin(3);
    Assert.assertEquals(0, roundRobin.next());
    Assert.assertEquals(1, roundRobin.next());
    Assert.assertEquals(2, roundRobin.next());
    Assert.assertEquals(0, roundRobin.next());
    Assert.assertEquals(1, roundRobin.next());
    Assert.assertEquals(2, roundRobin.next());
  }

  @Test
  public void testOverflow() {
    AtomicRoundRobin roundRobin = new AtomicRoundRobin(3);
    roundRobin.set(Integer.MAX_VALUE);
    Assert.assertTrue(roundRobin.next() >= 0);
    Assert.assertTrue(roundRobin.next() >= 0);
  }
}
