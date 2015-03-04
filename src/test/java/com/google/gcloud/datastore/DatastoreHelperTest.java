/*
 * Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.gcloud.datastore;

import static junit.framework.TestCase.assertTrue;
import static org.easymock.EasyMock.createStrictMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import com.google.common.collect.Iterators;

import org.junit.Test;

import java.util.List;

public class DatastoreHelperTest {

  @Test
  public void testFetch() throws Exception {
    DatastoreService datastoreService = createStrictMock(DatastoreService.class);
    PartialKey pKey1 = PartialKey.builder("ds", "k").build();
    Key key1 = Key.builder(pKey1, 1).build();
    Key key2 = Key.builder(pKey1, "a").build();
    Entity entity1 = Entity.builder(key1).build();
    Entity entity2 = Entity.builder(key2).build();
    expect(datastoreService.get(key1, key2)).andReturn(Iterators.forArray(entity1, entity2)).once();
    replay(datastoreService);
    List<Entity> values = DatastoreHelper.fetch(datastoreService, key1, key2);
    assertEquals(2, values.size());
    assertEquals(entity1, values.get(0));
    assertEquals(entity2, values.get(1));
    verify(datastoreService);
  }

  @Test
  public void testRunInTransaction() throws Exception {
    final DatastoreService datastoreService = createStrictMock(DatastoreService.class);
    final Transaction transaction = createStrictMock(Transaction.class);
    expect(datastoreService.newTransaction()).andReturn(transaction).once();
    expect(transaction.active()).andReturn(true).once();
    expect(transaction.commit()).andReturn(null).once();
    expect(transaction.active()).andReturn(false).once();
    replay(datastoreService, transaction);
    DatastoreHelper.runInTransaction(datastoreService, new DatastoreService.RunInTransaction() {
      @Override
      public void run(DatastoreReaderWriter readerWriter) {
        assertTrue(transaction.active());
        assertSame(transaction, readerWriter);
      }
    });
    verify(datastoreService, transaction);
  }
}
