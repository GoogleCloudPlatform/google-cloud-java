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

import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.rpc.ResponseObserver;
import com.google.api.gax.rpc.ServerStream;
import com.google.api.gax.rpc.ServerStreamingCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.bigtable.data.v2.models.BulkMutation;
import com.google.cloud.bigtable.data.v2.models.InstanceName;
import com.google.cloud.bigtable.data.v2.models.BulkMutationBatcher;
import com.google.cloud.bigtable.data.v2.models.ConditionalRowMutation;
import com.google.cloud.bigtable.data.v2.models.KeyOffset;
import com.google.cloud.bigtable.data.v2.models.Query;
import com.google.cloud.bigtable.data.v2.models.ReadModifyWriteRow;
import com.google.cloud.bigtable.data.v2.models.Row;
import com.google.cloud.bigtable.data.v2.models.RowAdapter;
import com.google.cloud.bigtable.data.v2.models.RowMutation;
import com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStub;
import com.google.protobuf.ByteString;
import java.io.IOException;
import java.util.List;

/**
 * Client for reading from and writing to existing Bigtable tables.
 *
 * <p>This class provides the ability to make remote calls to the backing service. Sample code to
 * get started:
 *
 * <pre>{@code
 * InstanceName instanceName = InstanceName.of("[PROJECT]", "[INSTANCE]");
 * try (BigtableDataClient bigtableDataClient = BigtableDataClient.create(instanceName)) {
 *   for(Row row : bigtableDataClient.readRows(Query.create("[TABLE]")) {
 *     // Do something with row
 *   }
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the bigtableDataClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method, like `readRows()`. With this type of method, the fields of the
 *       request type have been converted into function parameters. It may be the case that not all
 *       fields are available as parameters, and not every API method will have a flattened method
 *       entry point.
 *   <li>A "callable" method, like `readRowsCallable()`. This type of method takes no parameters and
 *       returns an immutable API callable object, which can be used to initiate calls to the
 *       service.
 * </ol>
 *
 * <p>All RPC related errors are represented as subclasses of {@link com.google.api.gax.rpc.ApiException}.
 * For example, a nonexistent table will trigger a {@link com.google.api.gax.rpc.NotFoundException}.
 * Async methods will wrap the error inside the future. Synchronous methods will re-throw the async
 * error but will try to preserve the caller's stacktrace by attaching a suppressed exception at the
 * callsite. This allows callers to use typesafe exceptions, without losing their callsite.
 * Streaming methods (ie. readRows) will re-throw the async exception (like sync methods) when
 * starting iteration.
 *
 * <p>See the individual methods for example code.
 *
 * <p>This class can be customized by passing in a custom instance of BigtableDataSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * BigtableDataSettings bigtableDataSettings =
 *     BigtableDataSettings.newBuilder()
 *         .setInstanceName(InstanceName.of("[PROJECT]", "[INSTANCE]"))
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * try(BigtableDataClient bigtableDataClient = BigtableDataClient.create(bigtableDataSettings)) {
 *   // ..
 * }
 * }</pre>
 *
 * To customize the endpoint:
 *
 * <pre>{@code
 * BigtableDataSettings bigtableDataSettings =
 *     BigtableDataSettings.newBuilder()
 *       .setInstanceName(InstanceName.of("[PROJECT]", "[INSTANCE]"))
 *       .setEndpoint(myEndpoint).build();
 * try(BigtableDataClient bigtableDataClient = BigtableDataClient.create(bigtableDataSettings)) {
 *   // ..
 * }
 * }</pre>
 */
public class BigtableDataClient implements AutoCloseable {
  private final EnhancedBigtableStub stub;

  /**
   * Constructs an instance of BigtableClient with default settings.
   *
   * @param instanceName The instance to connect to.
   * @return A new client.
   * @throws IOException If any.
   */
  public static BigtableDataClient create(InstanceName instanceName) throws IOException {
    BigtableDataSettings settings =
        BigtableDataSettings.newBuilder().setInstanceName(instanceName).build();
    return create(settings);
  }

  /**
   * Constructs an instance of BigtableDataClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static BigtableDataClient create(BigtableDataSettings settings) throws IOException {
    EnhancedBigtableStub stub = EnhancedBigtableStub.create(settings.getTypedStubSettings());
    return new BigtableDataClient(stub);
  }

  @InternalApi("Visible for testing")
  BigtableDataClient(EnhancedBigtableStub stub) {
    this.stub = stub;
  }

  /**
   * Convenience method for asynchronously reading a single row. If the row does not exist, the
   * future's value will be null.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * InstanceName instanceName = InstanceName.of("[PROJECT]", "[INSTANCE]");
   * try (BigtableClient bigtableClient = BigtableClient.create(instanceName)) {
   *   String tableId = "[TABLE]";
   *
   *   ApiFuture<Row> futureResult = bigtableClient.readRow(tableId,  "key");
   *
   *   ApiFutures.addCallback(futureResult, new ApiFutureCallback<Row>() {
   *     public void onFailure(Throwable t) {
   *       if (t instanceof NotFoundException) {
   *         System.out.println("Tried to read a non-existent table");
   *       } else {
   *         t.printStackTrace();
   *       }
   *     }
   *     public void onSuccess(Row result) {
   *       System.out.println("Got row: " + result);
   *     }
   *   }, MoreExecutors.directExecutor());
   * }
   * }</pre>
   */
  public ApiFuture<Row> readRowAsync(String tableId, String rowKey) {
    return readRowAsync(tableId, ByteString.copyFromUtf8(rowKey));
  }

  /**
   * Convenience method for asynchronously reading a single row. If the row does not exist, the
   * future's value will be null.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * InstanceName instanceName = InstanceName.of("[PROJECT]", "[INSTANCE]");
   * try (BigtableClient bigtableClient = BigtableClient.create(instanceName)) {
   *   String tableId = "[TABLE]";
   *
   *   ApiFuture<Row> result = bigtableClient.readRow(tableId,  ByteString.copyFromUtf8("key"));
   *
   *   ApiFutures.addCallback(futureResult, new ApiFutureCallback<Row>() {
   *     public void onFailure(Throwable t) {
   *       if (t instanceof NotFoundException) {
   *         System.out.println("Tried to read a non-existent table");
   *       } else {
   *         t.printStackTrace();
   *       }
   *     }
   *     public void onSuccess(Row row) {
   *       System.out.println("Got row: " + row);
   *     }
   *   }, MoreExecutors.directExecutor());
   * }
   * }</pre>
   */
  public ApiFuture<Row> readRowAsync(String tableId, ByteString rowKey) {
    return readRowsCallable().first().futureCall(Query.create(tableId).rowKey(rowKey));
  }

  /**
   * Convenience method for synchronous streaming the results of a {@link Query}.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // Import the filter DSL
   * import static com.google.cloud.bigtable.data.v2.models.Filters.FILTERS;
   *
   * InstanceName instanceName = InstanceName.of("[PROJECT]", "[INSTANCE]");
   * try (BigtableClient bigtableClient = BigtableClient.create(instanceName)) {
   *   String tableId = "[TABLE]";
   *
   *   Query query = Query.create(tableId)
   *          .range("[START KEY]", "[END KEY]")
   *          .filter(FILTERS.qualifier().regex("[COLUMN PREFIX].*"));
   *
   *   // Iterator style
   *   try {
   *     for(Row row : bigtableClient.readRows(query)) {
   *       // Do something with row
   *     }
   *   } catch (NotFoundException e) {
   *     System.out.println("Tried to read a non-existent table");
   *   } catch (RuntimeException e) {
   *     e.printStackTrace();
   *   }
   * }
   * }</pre>
   *
   * @see ServerStreamingCallable For call styles.
   * @see Query For query options.
   * @see com.google.cloud.bigtable.data.v2.models.Filters For the filter building DSL.
   */
  public ServerStream<Row> readRows(Query query) {
    return readRowsCallable().call(query);
  }

  /**
   * Convenience method for asynchronous streaming the results of a {@link Query}.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * InstanceName instanceName = InstanceName.of("[PROJECT]", "[INSTANCE]");
   * try (BigtableClient bigtableClient = BigtableClient.create(instanceName)) {
   *   String tableId = "[TABLE]";
   *
   *   Query query = Query.create(tableId)
   *          .range("[START KEY]", "[END KEY]")
   *          .filter(FILTERS.qualifier().regex("[COLUMN PREFIX].*"));
   *
   *   client.readRowsAsync(query, new ResponseObserver<Row>() {
   *     public void onStart(StreamController controller) { }
   *     public void onResponse(Row row) {
   *       // Do something with Row
   *     }
   *     public void onError(Throwable t) {
   *       if (t instanceof NotFoundException) {
   *         System.out.println("Tried to read a non-existent table");
   *       } else {
   *         t.printStackTrace();
   *       }
   *     }
   *     public void onComplete() {
   *       // Handle stream completion
   *     }
   *   });
   * }
   * }</pre>
   */
  public void readRowsAsync(Query query, ResponseObserver<Row> observer) {
    readRowsCallable().call(query, observer);
  }

  /**
   * Streams back the results of the query. The returned callable object allows for customization of
   * api invocation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * InstanceName instanceName = InstanceName.of("[PROJECT]", "[INSTANCE]");
   * try (BigtableClient bigtableClient = BigtableClient.create(instanceName)) {
   *   String tableId = "[TABLE]";
   *
   *   Query query = Query.create(tableId)
   *          .range("[START KEY]", "[END KEY]")
   *          .filter(FILTERS.qualifier().regex("[COLUMN PREFIX].*"));
   *
   *   // Iterator style
   *   try {
   *     for(Row row : bigtableClient.readRowsCallable().call(query)) {
   *       // Do something with row
   *     }
   *   } catch (NotFoundException e) {
   *     System.out.println("Tried to read a non-existent table");
   *   } catch (RuntimeException e) {
   *     e.printStackTrace();
   *   }}
   *
   *   // Sync style
   *   try {
   *     List<Row> rows = bigtableClient.readRowsCallable().all().call(query);
   *   } catch (NotFoundException e) {
   *     System.out.println("Tried to read a non-existent table");
   *   } catch (RuntimeException e) {
   *     e.printStackTrace();
   *   }}
   *
   *   // Point look up
   *   ApiFuture<Row> rowFuture = bigtableClient.readRowsCallable().first().futureCall(query);
   *
   *   ApiFutures.addCallback(rowFuture, new ApiFutureCallback<Row>() {
   *     public void onFailure(Throwable t) {
   *       if (t instanceof NotFoundException) {
   *         System.out.println("Tried to read a non-existent table");
   *       } else {
   *         t.printStackTrace();
   *       }
   *     }
   *     public void onSuccess(Row result) {
   *       System.out.println("Got row: " + result);
   *     }
   *   }, MoreExecutors.directExecutor());
   *
   *   // etc
   * }
   * }</pre>
   *
   * @see ServerStreamingCallable For call styles.
   * @see Query For query options.
   * @see com.google.cloud.bigtable.data.v2.models.Filters For the filter building DSL.
   */
  public ServerStreamingCallable<Query, Row> readRowsCallable() {
    return stub.readRowsCallable();
  }

  /**
   * Streams back the results of the query. This callable allows for customization of the logical
   * representation of a row. It's meant for advanced use cases.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * InstanceName instanceName = InstanceName.of("[PROJECT]", "[INSTANCE]");
   * try (BigtableClient bigtableClient = BigtableClient.create(instanceName)) {
   *   String tableId = "[TABLE]";
   *
   *   Query query = Query.create(tableId)
   *          .range("[START KEY]", "[END KEY]")
   *          .filter(FILTERS.qualifier().regex("[COLUMN PREFIX].*"));
   *
   *   // Iterator style
   *   try {
   *     for(CustomRow row : bigtableClient.readRowsCallable(new CustomRowAdapter()).call(query)) {
   *       // Do something with row
   *     }
   *   } catch (NotFoundException e) {
   *     System.out.println("Tried to read a non-existent table");
   *   } catch (RuntimeException e) {
   *     e.printStackTrace();
   *   }
   * }
   * }</pre>
   *
   * @see ServerStreamingCallable For call styles.
   * @see Query For query options.
   * @see com.google.cloud.bigtable.data.v2.models.Filters For the filter building DSL.
   */
  public <RowT> ServerStreamingCallable<Query, RowT> readRowsCallable(RowAdapter<RowT> rowAdapter) {
    return stub.createReadRowsCallable(rowAdapter);
  }

  /**
   * Convenience method to asynchronously return a sample of row keys in the table. The returned row
   * keys will delimit contiguous sections of the table of approximately equal size, which can be
   * used to break up the data for distributed tasks like mapreduces.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * InstanceName instanceName = InstanceName.of("[PROJECT]", "[INSTANCE]");
   * try (BigtableClient bigtableClient = BigtableClient.create(instanceName)) {
   *   ApiFuture<List<KeyOffset>> keyOffsetsFuture = bigtableClient.sampleRowKeysAsync("[TABLE]");
   *
   *   ApiFutures.addCallback(keyOffsetsFuture, new ApiFutureCallback<List<KeyOffset>>() {
   *     public void onFailure(Throwable t) {
   *       if (t instanceof NotFoundException) {
   *         System.out.println("Tried to sample keys of a non-existent table");
   *       } else {
   *         t.printStackTrace();
   *       }
   *     }
   *     public void onSuccess(List<KeyOffset> keyOffsets) {
   *       System.out.println("Got key offsets: " + keyOffsets);
   *     }
   *   }, MoreExecutors.directExecutor());
   * }
   * }</pre>
   */
  public ApiFuture<List<KeyOffset>> sampleRowKeysAsync(String tableId) {
    return sampleRowKeysCallable().futureCall(tableId);
  }

  /**
   * Returns a sample of row keys in the table. The returned row keys will delimit contiguous
   * sections of the table of approximately equal size, which can be used to break up the data for
   * distributed tasks like mapreduces. The returned callable object allows for customization of api
   * invocation.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * InstanceName instanceName = InstanceName.of("[PROJECT]", "[INSTANCE]");
   * try (BigtableClient bigtableClient = BigtableClient.create(instanceName)) {
   *   // Synchronous invocation
   *   try {
   *     List<KeyOffset> keyOffsets = bigtableClient.sampleRowKeysCallable().call("[TABLE]");
   *   } catch (NotFoundException e) {
   *     System.out.println("Tried to sample keys of a non-existent table");
   *   } catch (RuntimeException e) {
   *     e.printStackTrace();
   *   }
   *
   *   // Asynchronous invocation
   *   ApiFuture<List<KeyOffset>> keyOffsetsFuture = bigtableClient.sampleRowKeysCallable().futureCall("[TABLE]");
   *
   *   ApiFutures.addCallback(keyOffsetsFuture, new ApiFutureCallback<List<KeyOffset>>() {
   *     public void onFailure(Throwable t) {
   *       if (t instanceof NotFoundException) {
   *         System.out.println("Tried to sample keys of a non-existent table");
   *       } else {
   *         t.printStackTrace();
   *       }
   *     }
   *     public void onSuccess(List<KeyOffset> keyOffsets) {
   *       System.out.println("Got key offsets: " + keyOffsets);
   *     }
   *   }, MoreExecutors.directExecutor());
   * }
   * }</pre>
   */
  public UnaryCallable<String, List<KeyOffset>> sampleRowKeysCallable() {
    return stub.sampleRowKeysCallable();
  }

  /**
   * Convenience method to asynchronously mutate a single row atomically. Cells already present in
   * the row are left unchanged unless explicitly changed by the {@link RowMutation}.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * InstanceName instanceName = InstanceName.of("[PROJECT]", "[INSTANCE]");
   * try (BigtableClient bigtableClient = BigtableClient.create(instanceName)) {
   *   RowMutation mutation = RowMutation.create("[TABLE]", "[ROW KEY]")
   *     .setCell("[FAMILY NAME]", "[QUALIFIER]", "[VALUE]");
   *
   *   ApiFuture<Void> future = bigtableClient.mutateRowAsync(mutation);
   *
   *   ApiFutures.addCallback(future, new ApiFutureCallback<Void>() {
   *     public void onFailure(Throwable t) {
   *       if (t instanceof NotFoundException) {
   *         System.out.println("Tried to mutate a non-existent table");
   *       } else {
   *         t.printStackTrace();
   *       }
   *     }
   *     public void onSuccess(Void ignored) {
   *       System.out.println("Successfully applied mutation");
   *     }
   *   }, MoreExecutors.directExecutor());
   * }
   * }</pre>
   */
  public ApiFuture<Void> mutateRowAsync(RowMutation rowMutation) {
    return mutateRowCallable().futureCall(rowMutation);
  }

  /**
   * Mutates a single row atomically. Cells already present in the row are left unchanged unless
   * explicitly changed by the {@link RowMutation}.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * InstanceName instanceName = InstanceName.of("[PROJECT]", "[INSTANCE]");
   * try (BigtableClient bigtableClient = BigtableClient.create(instanceName)) {
   *   RowMutation mutation = RowMutation.create("[TABLE]", "[ROW KEY]")
   *     .setCell("[FAMILY NAME]", "[QUALIFIER]", "[VALUE]");
   *
   *   // Sync style
   *   try {
   *     bigtableClient.mutateRowCallable().call(mutation);
   *   } catch (NotFoundException e) {
   *     System.out.println("Tried to mutate a non-existent table");
   *   } catch (RuntimeException e) {
   *     e.printStackTrace();
   *   }
   * }
   * }</pre>
   */
  public UnaryCallable<RowMutation, Void> mutateRowCallable() {
    return stub.mutateRowCallable();
  }

  /**
   * Mutates multiple rows in a batch. Each individual row is mutated atomically as in MutateRow,
   * but the entire batch is not executed atomically.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * InstanceName instanceName = InstanceName.of("[PROJECT]", "[INSTANCE]");
   * try (BigtableClient bigtableClient = BigtableClient.create(instanceName)) {
   *   try (BulkMutationBatcher batcher = bigtableClient.newBulkMutationBatcher()) {
   *     for (String someValue : someCollection) {
   *       RowMutation mutation = RowMutation.create("[TABLE]", "[ROW KEY]")
   *         .setCell("[FAMILY NAME]", "[QUALIFIER]", "[VALUE]");
   *
   *       ApiFuture<Void> entryFuture = batcher.add(mutation);
   *     }
   *   } catch (BulkMutationFailure failure) {
   *     // Handle error
   *   }
   *   // After `batcher` is closed, all mutations have been applied
   * }
   * }</pre>
   */
  @BetaApi("This surface is likely to change as the batching surface evolves.")
  public BulkMutationBatcher newBulkMutationBatcher() {
    return new BulkMutationBatcher(stub.bulkMutateRowsBatchingCallable());
  }

  /**
   * Convenience method to mutate multiple rows in a batch. Each individual row is mutated
   * atomically as in MutateRow, but the entire batch is not executed atomically. Unlike {@link
   * #newBulkMutationBatcher()}, this method expects the mutations to be pre-batched.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * InstanceName instanceName = InstanceName.of("[PROJECT]", "[INSTANCE]");
   * try (BigtableClient bigtableClient = BigtableClient.create(instanceName)) {
   *   BulkMutation batch = BulkMutation.create("[TABLE]");
   *   for (String someValue : someCollection) {
   *     ApiFuture<Void> entryFuture = batch.add("[ROW KEY]",
   *       Mutation.create().setCell("[FAMILY NAME]", "[QUALIFIER]", "[VALUE]"));
   *   }
   *   ApiFuture<Void> resultFuture = bigtableClient.bulkMutateRowsAsync(batch);
   *
   *   ApiFutures.addCallback(future, new ApiFutureCallback<Void>() {
   *     public void onFailure(Throwable t) {
   *       if (t instanceof BulkMutationFailure) {
   *         System.out.println("Some entries failed to apply");
   *       } else {
   *         t.printStackTrace();
   *       }
   *     }
   *     public void onSuccess(Void ignored) {
   *       System.out.println("Successfully applied all mutation");
   *     }
   *   }, MoreExecutors.directExecutor());
   * }
   * }</pre>
   */
  public ApiFuture<Void> bulkMutateRowsAsync(BulkMutation mutation) {
    return bulkMutationCallable().futureCall(mutation);
  }

  /**
   * Mutates multiple rows in a batch. Each individual row is mutated atomically as in MutateRow,
   * but the entire batch is not executed atomically. Unlike {@link #newBulkMutationBatcher()}, this
   * method expects the mutations to be pre-batched.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * InstanceName instanceName = InstanceName.of("[PROJECT]", "[INSTANCE]");
   * try (BigtableClient bigtableClient = BigtableClient.create(instanceName)) {
   *   BulkMutation batch = BulkMutation.create("[TABLE]");
   *   for (String someValue : someCollection) {
   *     ApiFuture<Void> entryFuture = batch.add("[ROW KEY]",
   *       Mutation.create().setCell("[FAMILY NAME]", "[QUALIFIER]", "[VALUE]");
   *   }
   *   bigtableClient.bulkMutateRowsCallable().call(batch);
   * }
   * }</pre>
   */
  public UnaryCallable<BulkMutation, Void> bulkMutationCallable() {
    return stub.bulkMutateRowsCallable();
  }

  /**
   * Convenience method to asynchronously mutate a row atomically based on the output of a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * InstanceName instanceName = InstanceName.of("[PROJECT]", "[INSTANCE]");
   * try (BigtableClient bigtableClient = BigtableClient.create(instanceName)) {
   *   ConditionalRowMutation mutation = ConditionalRowMutation.create("[TABLE]", "[KEY]")
   *     .condition(FILTERS.value().regex("old-value"))
   *     .then(
   *       Mutation.create()
   *         .setCell("[FAMILY]", "[QUALIFIER]", "[VALUE]")
   *       );
   *
   *   ApiFuture<Boolean> future = bigtableClient.checkAndMutateRowAsync(mutation);
   *
   *   ApiFutures.addCallback(future, new ApiFutureCallback<Boolean>() {
   *     public void onFailure(Throwable t) {
   *       if (t instanceof NotFoundException) {
   *         System.out.println("Tried to mutate a non-existent table");
   *       } else {
   *         t.printStackTrace();
   *       }
   *     }
   *     public void onSuccess(Boolean wasApplied) {
   *       System.out.println("Row was modified: " + wasApplied);
   *     }
   *   }, MoreExecutors.directExecutor());
   * }
   * }</pre>
   */
  public ApiFuture<Boolean> checkAndMutateRowAsync(ConditionalRowMutation mutation) {
    return checkAndMutateRowCallable().futureCall(mutation);
  }

  /**
   * Mutates a row atomically based on the output of a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * InstanceName instanceName = InstanceName.of("[PROJECT]", "[INSTANCE]");
   * try (BigtableClient bigtableClient = BigtableClient.create(instanceName)) {
   *   ConditionalRowMutation mutation = ConditionalRowMutation.create("[TABLE]", "[KEY]")
   *     .condition(FILTERS.value().regex("old-value"))
   *     .then(
   *       Mutation.create()
   *         .setCell("[FAMILY]", "[QUALIFIER]", "[VALUE]")
   *       );
   *
   *   // Sync style
   *   try {
   *     boolean success = bigtableClient.checkAndMutateRowCallable().call(mutation);
   *   } catch (NotFoundException e) {
   *     System.out.println("Tried to mutate a non-existent table");
   *   } catch (RuntimeException e) {
   *     e.printStackTrace();
   *   }
   * }
   * }</pre>
   */
  public UnaryCallable<ConditionalRowMutation, Boolean> checkAndMutateRowCallable() {
    return stub.checkAndMutateRowCallable();
  }

  /**
   * Convenience method that asynchronously modifies a row atomically on the server. The method
   * reads the latest existing timestamp and value from the specified columns and writes a new
   * entry. The new value for the timestamp is the greater of the existing timestamp or the current
   * server time. The method returns the new contents of all modified cells.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * InstanceName instanceName = InstanceName.of("[PROJECT]", "[INSTANCE]");
   * try (BigtableClient bigtableClient = BigtableClient.create(instanceName)) {
   *   ReadModifyWriteRow mutation = ReadModifyWriteRow.create("[TABLE]", "[KEY]")
   *     .increment("[FAMILY]", "[QUALIFIER]", 1)
   *     .append("[FAMILY2]", "[QUALIFIER2]", "suffix");
   *
   *   ApiFuture<Row> rowFuture = bigtableClient.readModifyWriteRowAsync(mutation);
   *
   *   ApiFutures.addCallback(rowFuture, new ApiFutureCallback<Row>() {
   *     public void onFailure(Throwable t) {
   *       if (t instanceof NotFoundException) {
   *         System.out.println("Tried to mutate a non-existent table");
   *       } else {
   *         t.printStackTrace();
   *       }
   *     }
   *     public void onSuccess(Row resultingRow) {
   *       System.out.println("Resulting row: " + resultingRow);
   *     }
   *   }, MoreExecutors.directExecutor());
   * }
   * }</pre>
   */
  public ApiFuture<Row> readModifyWriteRowAsync(ReadModifyWriteRow mutation) {
    return readModifyWriteRowCallable().futureCall(mutation);
  }

  /**
   * Modifies a row atomically on the server. The method reads the latest existing timestamp and
   * value from the specified columns and writes a new entry. The new value for the timestamp is the
   * greater of the existing timestamp or the current server time. The method returns the new
   * contents of all modified cells.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * InstanceName instanceName = InstanceName.of("[PROJECT]", "[INSTANCE]");
   * try (BigtableClient bigtableClient = BigtableClient.create(instanceName)) {
   *   ReadModifyWriteRow mutation = ReadModifyWriteRow.create("[TABLE]", "[KEY]")
   *     .increment("[FAMILY]", "[QUALIFIER]", 1)
   *     .append("[FAMILY2]", "[QUALIFIER2]", "suffix");
   *
   *   try {
   *     Row row = bigtableClient.readModifyWriteRowCallable().call(mutation);
   *   } catch (NotFoundException e) {
   *     System.out.println("Tried to mutate a non-existent table");
   *   } catch (RuntimeException e) {
   *     e.printStackTrace();
   *   }
   * }
   * }</pre>
   */
  public UnaryCallable<ReadModifyWriteRow, Row> readModifyWriteRowCallable() {
    return stub.readModifyWriteRowCallable();
  }

  /** Close the clients and releases all associated resources. */
  @Override
  public void close() throws Exception {
    stub.close();
  }
}
