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
package com.google.cloud.bigtable.data.v2;

import static com.google.common.truth.Truth.assertThat;

import com.google.api.core.ApiFuture;
import com.google.api.core.SettableApiFuture;
import com.google.api.gax.grpc.GrpcStatusCode;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ResponseObserver;
import com.google.api.gax.rpc.ServerStreamingCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.bigtable.data.v2.models.BulkMutations;
import com.google.cloud.bigtable.data.v2.models.BulkMutations.BulkMutationFailure;
import com.google.cloud.bigtable.data.v2.models.ConditionalRowMutation;
import com.google.cloud.bigtable.data.v2.models.KeyOffset;
import com.google.cloud.bigtable.data.v2.models.Mutation;
import com.google.cloud.bigtable.data.v2.models.Query;
import com.google.cloud.bigtable.data.v2.models.ReadModifyWriteRow;
import com.google.cloud.bigtable.data.v2.models.Row;
import com.google.cloud.bigtable.data.v2.models.RowMutation;
import com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStub;
import io.grpc.Status.Code;
import java.util.List;
import java.util.concurrent.TimeoutException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.threeten.bp.Duration;

@RunWith(MockitoJUnitRunner.class)
public class BigtableDataClientTest {
  @Mock private EnhancedBigtableStub mockStub;
  @Mock private ServerStreamingCallable<Query, Row> mockReadRowsCallable;
  @Mock private UnaryCallable<String, List<KeyOffset>> mockSampleRowKeysCallable;
  @Mock private UnaryCallable<RowMutation, Void> mockMutateRowCallable;
  @Mock private UnaryCallable<ConditionalRowMutation, Boolean> mockCheckAndMutateRowCallable;
  @Mock private UnaryCallable<ReadModifyWriteRow, Row> mockReadModifyWriteRowCallable;
  @Mock private UnaryCallable<RowMutation, Void> mockBulkMutateRowsCallable;

  private BigtableDataClient bigtableDataClient;

  @Before
  public void setUp() {
    bigtableDataClient = new BigtableDataClient(mockStub);
    Mockito.when(mockStub.readRowsCallable()).thenReturn(mockReadRowsCallable);
    Mockito.when(mockStub.sampleRowKeysCallable()).thenReturn(mockSampleRowKeysCallable);
    Mockito.when(mockStub.mutateRowCallable()).thenReturn(mockMutateRowCallable);
    Mockito.when(mockStub.checkAndMutateRowCallable()).thenReturn(mockCheckAndMutateRowCallable);
    Mockito.when(mockStub.readModifyWriteRowCallable()).thenReturn(mockReadModifyWriteRowCallable);
    Mockito.when(mockStub.mutateRowsCallable()).thenReturn(mockBulkMutateRowsCallable);
  }

  @Test
  public void proxyCloseTest() throws Exception {
    bigtableDataClient.close();
    Mockito.verify(mockStub).close();
  }

  @Test
  public void proxyReadRowsCallableTest() {
    assertThat(bigtableDataClient.readRowsCallable()).isSameAs(mockReadRowsCallable);
  }

  @Test
  public void proxyReadRowsSyncTest() {
    Query query = Query.create("fake-table");
    bigtableDataClient.readRows(query);

    Mockito.verify(mockReadRowsCallable).call(query);
  }

  @Test
  public void proxyReadRowsAsyncTest() {
    Query query = Query.create("fake-table");
    @SuppressWarnings("unchecked")
    ResponseObserver<Row> mockObserver = Mockito.mock(ResponseObserver.class);
    bigtableDataClient.readRowsAsync(query, mockObserver);

    Mockito.verify(mockReadRowsCallable).call(query, mockObserver);
  }

  @Test
  public void proxySampleRowKeysCallableTest() {
    assertThat(bigtableDataClient.sampleRowKeysCallable()).isSameAs(mockSampleRowKeysCallable);
  }

  @Test
  public void proxySampleRowKeysTest() {
    bigtableDataClient.sampleRowKeysAsync("fake-table");
    Mockito.verify(mockSampleRowKeysCallable).futureCall("fake-table");
  }

  @Test
  public void proxyMutateRowCallableTest() {
    assertThat(bigtableDataClient.mutateRowCallable()).isSameAs(mockMutateRowCallable);
  }

  @Test
  public void proxyMutateRowTest() {
    RowMutation request =
        RowMutation.create("fake-table", "some-key")
            .setCell("some-family", "fake-qualifier", "fake-value");

    bigtableDataClient.mutateRowAsync(request);
    Mockito.verify(mockMutateRowCallable).futureCall(request);
  }

  @Test
  public void proxyBulkMutationsSendTest() {
    BulkMutations bulkMutations = bigtableDataClient.newBulkMutations();

    RowMutation request =
        RowMutation.create("fake-table", "some-key")
            .setCell("some-family", "fake-qualifier", "fake-value");

    SettableApiFuture<Void> innerResult = SettableApiFuture.create();
    Mockito.when(mockBulkMutateRowsCallable.futureCall(request)).thenReturn(innerResult);

    ApiFuture<Void> actualResult = bulkMutations.send(request);
    assertThat(actualResult).isSameAs(innerResult);
  }

  @Test
  public void bulkMutationsCloseTest() throws Exception {
    BulkMutations bulkMutations = bigtableDataClient.newBulkMutations();

    RowMutation request =
        RowMutation.create("fake-table", "some-key")
            .setCell("some-family", "fake-qualifier", "fake-value");

    SettableApiFuture<Void> innerResult = SettableApiFuture.create();
    Mockito.when(mockBulkMutateRowsCallable.futureCall(request)).thenReturn(innerResult);

    bulkMutations.send(request);

    // Close will timeout while the request is outstanding.
    Throwable error = null;
    try {
      bulkMutations.close(Duration.ofMillis(20));
    } catch (Throwable t) {
      error = t;
    }
    assertThat(error).isInstanceOf(TimeoutException.class);

    // Resolve the request
    innerResult.set(null);

    // Now, close will promptly finish
    bulkMutations.close(Duration.ofMillis(20));
  }

  @Test
  public void bulkMutationsNoSendAfterCloseTest() throws InterruptedException, TimeoutException {
    BulkMutations bulkMutations = bigtableDataClient.newBulkMutations();

    bulkMutations.close();

    RowMutation request =
        RowMutation.create("fake-table", "some-key")
            .setCell("some-family", "fake-qualifier", "fake-value");

    Throwable error = null;
    try {
      bulkMutations.send(request);
    } catch (Throwable t) {
      error = t;
    }
    assertThat(error).isInstanceOf(IllegalStateException.class);
  }

  @Test
  public void bulkMutationsFailureTest() throws Exception {
    BulkMutations bulkMutations = bigtableDataClient.newBulkMutations();
    RowMutation request =
        RowMutation.create("fake-table", "some-key")
            .setCell("some-family", "fake-qualifier", "fake-value");

    SettableApiFuture<Void> innerResult = SettableApiFuture.create();
    Mockito.when(mockBulkMutateRowsCallable.futureCall(request)).thenReturn(innerResult);

    ApiException innerError = new ApiException(null, GrpcStatusCode.of(Code.INTERNAL), false);

    bulkMutations.send(request);
    innerResult.setException(innerError);

    Throwable outerError = null;
    try {
      bulkMutations.close(Duration.ofMillis(10));
    } catch (Throwable t) {
      outerError = t;
    }
    assertThat(outerError).isInstanceOf(BulkMutationFailure.class);
  }

  @Test
  public void proxyCheckAndMutateRowCallableTest() {
    assertThat(bigtableDataClient.checkAndMutateRowCallable())
        .isSameAs(mockStub.checkAndMutateRowCallable());
  }

  @Test
  public void proxyCheckAndMutateRowTest() {
    ConditionalRowMutation mutation =
        ConditionalRowMutation.create("fake-table", "fake-key")
            .then(Mutation.create().setCell("fake-family", "fake-qualifier", "fake-value"));
    bigtableDataClient.checkAndMutateRowAsync(mutation);

    Mockito.verify(mockCheckAndMutateRowCallable).futureCall(mutation);
  }

  @Test
  public void proxyReadModifyWriteRowTest() {
    ReadModifyWriteRow request =
        ReadModifyWriteRow.create("fake-table", "some-key")
            .append("fake-family", "fake-qualifier", "suffix");
    bigtableDataClient.readModifyWriteRowAsync(request);
    Mockito.verify(mockReadModifyWriteRowCallable).futureCall(request);
  }

  @Test
  public void proxyReadModifyWriterRowCallableTest() {
    assertThat(bigtableDataClient.readModifyWriteRowCallable())
        .isSameAs(mockReadModifyWriteRowCallable);
  }
}
