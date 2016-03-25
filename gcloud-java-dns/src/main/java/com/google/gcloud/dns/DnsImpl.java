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

package com.google.gcloud.dns;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.gcloud.RetryHelper.RetryHelperException;
import static com.google.gcloud.RetryHelper.runWithRetries;
import static com.google.gcloud.dns.ChangeRequest.fromPb;

import com.google.api.client.googleapis.batch.BatchRequest;
import com.google.api.client.googleapis.batch.json.JsonBatchCallback;
import com.google.api.client.googleapis.json.GoogleJsonError;
import com.google.api.client.http.HttpHeaders;
import com.google.api.services.dns.model.Change;
import com.google.api.services.dns.model.ManagedZone;
import com.google.api.services.dns.model.ManagedZonesListResponse;
import com.google.api.services.dns.model.ResourceRecordSet;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.gcloud.BaseService;
import com.google.gcloud.Page;
import com.google.gcloud.PageImpl;
import com.google.gcloud.RetryHelper;
import com.google.gcloud.dns.spi.DnsRpc;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;

/**
 * A default implementation of Dns.
 */
final class DnsImpl extends BaseService<DnsOptions> implements Dns {

  private final DnsRpc dnsRpc;

  private static class ZonePageFetcher implements PageImpl.NextPageFetcher<Zone> {

    private static final long serialVersionUID = 2158209410430566961L;
    private final Map<DnsRpc.Option, ?> requestOptions;
    private final DnsOptions serviceOptions;

    ZonePageFetcher(DnsOptions serviceOptions, String cursor,
        Map<DnsRpc.Option, ?> optionMap) {
      this.requestOptions =
          PageImpl.nextRequestOptions(DnsRpc.Option.PAGE_TOKEN, cursor, optionMap);
      this.serviceOptions = serviceOptions;
    }

    @Override
    public Page<Zone> nextPage() {
      return listZones(serviceOptions, requestOptions);
    }
  }

  private static class ChangeRequestPageFetcher implements PageImpl.NextPageFetcher<ChangeRequest> {

    private static final long serialVersionUID = 4473265130673029139L;
    private final String zoneName;
    private final Map<DnsRpc.Option, ?> requestOptions;
    private final DnsOptions serviceOptions;

    ChangeRequestPageFetcher(String zoneName, DnsOptions serviceOptions, String cursor,
        Map<DnsRpc.Option, ?> optionMap) {
      this.zoneName = zoneName;
      this.requestOptions =
          PageImpl.nextRequestOptions(DnsRpc.Option.PAGE_TOKEN, cursor, optionMap);
      this.serviceOptions = serviceOptions;
    }

    @Override
    public Page<ChangeRequest> nextPage() {
      return listChangeRequests(zoneName, serviceOptions, requestOptions);
    }
  }

  private static class DnsRecordPageFetcher implements PageImpl.NextPageFetcher<DnsRecord> {

    private static final long serialVersionUID = -6039369212511530846L;
    private final Map<DnsRpc.Option, ?> requestOptions;
    private final DnsOptions serviceOptions;
    private final String zoneName;

    DnsRecordPageFetcher(String zoneName, DnsOptions serviceOptions, String cursor,
        Map<DnsRpc.Option, ?> optionMap) {
      this.zoneName = zoneName;
      this.requestOptions =
          PageImpl.nextRequestOptions(DnsRpc.Option.PAGE_TOKEN, cursor, optionMap);
      this.serviceOptions = serviceOptions;
    }

    @Override
    public Page<DnsRecord> nextPage() {
      return listDnsRecords(zoneName, serviceOptions, requestOptions);
    }
  }

  DnsImpl(DnsOptions options) {
    super(options);
    dnsRpc = options.rpc();
  }

  @Override
  public Page<Zone> listZones(ZoneListOption... options) {
    return listZones(options(), optionMap(options));
  }

  private static Page<Zone> listZones(final DnsOptions serviceOptions,
      final Map<DnsRpc.Option, ?> optionsMap) {
    // define transformation function
    // this differs from the other list operations since zone is functional and requires dns service
    Function<ManagedZone, Zone> pbToZoneFunction = new Function<ManagedZone, Zone>() {
      @Override
      public Zone apply(
          com.google.api.services.dns.model.ManagedZone zonePb) {
        return Zone.fromPb(serviceOptions.service(), zonePb);
      }
    };
    try {
      // get a list of managed zones
      final DnsRpc rpc = serviceOptions.rpc();
      DnsRpc.ListResult<ManagedZone> result =
          runWithRetries(new Callable<DnsRpc.ListResult<ManagedZone>>() {
            @Override
            public DnsRpc.ListResult<ManagedZone> call() {
              return rpc.listZones(optionsMap);
            }
          }, serviceOptions.retryParams(), EXCEPTION_HANDLER);
      String cursor = result.pageToken();
      // transform that list into zone objects
      Iterable<Zone> zones = result.results() == null
          ? ImmutableList.<Zone>of() : Iterables.transform(result.results(), pbToZoneFunction);
      return new PageImpl<>(new ZonePageFetcher(serviceOptions, cursor, optionsMap),
          cursor, zones);
    } catch (RetryHelperException e) {
      throw DnsException.translateAndThrow(e);
    }
  }

  @Override
  public Page<ChangeRequest> listChangeRequests(String zoneName,
      ChangeRequestListOption... options) {
    return listChangeRequests(zoneName, options(), optionMap(options));
  }

  private static Page<ChangeRequest> listChangeRequests(final String zoneName,
      final DnsOptions serviceOptions, final Map<DnsRpc.Option, ?> optionsMap) {
    try {
      // get a list of changes
      final DnsRpc rpc = serviceOptions.rpc();
      DnsRpc.ListResult<Change> result = runWithRetries(new Callable<DnsRpc.ListResult<Change>>() {
        @Override
        public DnsRpc.ListResult<Change> call() {
          return rpc.listChangeRequests(zoneName, optionsMap);
        }
      }, serviceOptions.retryParams(), EXCEPTION_HANDLER);
      String cursor = result.pageToken();
      // transform that list into change request objects
      Iterable<ChangeRequest> changes = result.results() == null
          ? ImmutableList.<ChangeRequest>of()
          : Iterables.transform(result.results(), ChangeRequest.FROM_PB_FUNCTION);
      return new PageImpl<>(new ChangeRequestPageFetcher(zoneName, serviceOptions, cursor,
          optionsMap), cursor, changes);
    } catch (RetryHelperException e) {
      throw DnsException.translateAndThrow(e);
    }
  }

  @Override
  public Page<DnsRecord> listDnsRecords(String zoneName, DnsRecordListOption... options) {
    return listDnsRecords(zoneName, options(), optionMap(options));
  }

  private static Page<DnsRecord> listDnsRecords(final String zoneName,
      final DnsOptions serviceOptions, final Map<DnsRpc.Option, ?> optionsMap) {
    try {
      // get a list of resource record sets
      final DnsRpc rpc = serviceOptions.rpc();
      DnsRpc.ListResult<ResourceRecordSet> result = runWithRetries(
          new Callable<DnsRpc.ListResult<ResourceRecordSet>>() {
            @Override
            public DnsRpc.ListResult<ResourceRecordSet> call() {
              return rpc.listDnsRecords(zoneName, optionsMap);
            }
          }, serviceOptions.retryParams(), EXCEPTION_HANDLER);
      String cursor = result.pageToken();
      // transform that list into dns records
      Iterable<DnsRecord> records = result.results() == null
          ? ImmutableList.<DnsRecord>of()
          : Iterables.transform(result.results(), DnsRecord.FROM_PB_FUNCTION);
      return new PageImpl<>(new DnsRecordPageFetcher(zoneName, serviceOptions, cursor, optionsMap),
          cursor, records);
    } catch (RetryHelperException e) {
      throw DnsException.translateAndThrow(e);
    }
  }

  @Override
  public Zone create(final ZoneInfo zoneInfo, Dns.ZoneOption... options) {
    final Map<DnsRpc.Option, ?> optionsMap = optionMap(options);
    try {
      com.google.api.services.dns.model.ManagedZone answer = runWithRetries(
          new Callable<com.google.api.services.dns.model.ManagedZone>() {
            @Override
            public com.google.api.services.dns.model.ManagedZone call() {
              return dnsRpc.create(zoneInfo.toPb(), optionsMap);
            }
          }, options().retryParams(), EXCEPTION_HANDLER);
      return answer == null ? null : Zone.fromPb(this, answer);
    } catch (RetryHelper.RetryHelperException ex) {
      throw DnsException.translateAndThrow(ex);
    }
  }

  @Override
  public Zone getZone(final String zoneName, Dns.ZoneOption... options) {
    final Map<DnsRpc.Option, ?> optionsMap = optionMap(options);
    try {
      com.google.api.services.dns.model.ManagedZone answer = runWithRetries(
          new Callable<com.google.api.services.dns.model.ManagedZone>() {
            @Override
            public com.google.api.services.dns.model.ManagedZone call() {
              return dnsRpc.getZone(zoneName, optionsMap);
            }
          }, options().retryParams(), EXCEPTION_HANDLER);
      return answer == null ? null : Zone.fromPb(this, answer);
    } catch (RetryHelper.RetryHelperException ex) {
      throw DnsException.translateAndThrow(ex);
    }
  }

  @Override
  public boolean delete(final String zoneName) {
    try {
      return runWithRetries(new Callable<Boolean>() {
        @Override
        public Boolean call() {
          return dnsRpc.deleteZone(zoneName);
        }
      }, options().retryParams(), EXCEPTION_HANDLER);
    } catch (RetryHelper.RetryHelperException ex) {
      throw DnsException.translateAndThrow(ex);
    }
  }

  @Override
  public ProjectInfo getProject(Dns.ProjectOption... fields) {
    final Map<DnsRpc.Option, ?> optionsMap = optionMap(fields);
    try {
      com.google.api.services.dns.model.Project answer = runWithRetries(
          new Callable<com.google.api.services.dns.model.Project>() {
            @Override
            public com.google.api.services.dns.model.Project call() {
              return dnsRpc.getProject(optionsMap);
            }
          }, options().retryParams(), EXCEPTION_HANDLER);
      return answer == null ? null : ProjectInfo.fromPb(answer); // should never be null
    } catch (RetryHelper.RetryHelperException ex) {
      throw DnsException.translateAndThrow(ex);
    }
  }

  @Override
  public ChangeRequest applyChangeRequest(final String zoneName, final ChangeRequest changeRequest,
      Dns.ChangeRequestOption... options) {
    final Map<DnsRpc.Option, ?> optionsMap = optionMap(options);
    try {
      com.google.api.services.dns.model.Change answer =
          runWithRetries(
              new Callable<com.google.api.services.dns.model.Change>() {
                @Override
                public com.google.api.services.dns.model.Change call() {
                  return dnsRpc.applyChangeRequest(zoneName, changeRequest.toPb(), optionsMap);
                }
              }, options().retryParams(), EXCEPTION_HANDLER);
      return answer == null ? null : fromPb(answer); // should never be null
    } catch (RetryHelper.RetryHelperException ex) {
      throw DnsException.translateAndThrow(ex);
    }
  }

  @Override
  public ChangeRequest getChangeRequest(final String zoneName, final String changeRequestId,
      Dns.ChangeRequestOption... options) {
    final Map<DnsRpc.Option, ?> optionsMap = optionMap(options);
    try {
      com.google.api.services.dns.model.Change answer =
          runWithRetries(
              new Callable<com.google.api.services.dns.model.Change>() {
                @Override
                public com.google.api.services.dns.model.Change call() {
                  return dnsRpc.getChangeRequest(zoneName, changeRequestId, optionsMap);
                }
              }, options().retryParams(), EXCEPTION_HANDLER);
      return answer == null ? null : fromPb(answer);
    } catch (RetryHelper.RetryHelperException ex) {
      throw DnsException.translateAndThrow(ex);
    }
  }

  @Override
  public void submitBatch(DnsBatch toSubmit) {
    try {
      BatchRequest batchRequest = prepareBatch(toSubmit);
      batchRequest.execute();
    } catch (IOException ex) {
      throw new DnsException(ex);
    }
  }

  /**
   * Since {@code BatchRequest} is a final class, it cannot be mocked with easy mock and the call of
   * {@code execute()} cannot be tested. Thus, most of the functionality of {@link
   * #submitBatch(DnsBatch)} is extracted to this method which does not make the call so it does not
   * communicate with the service.
   */
  BatchRequest prepareBatch(DnsBatch toSubmit) throws IOException {
    BatchRequest batch = null;
    for (Map.Entry<DnsBatch.Request, DnsBatch.Callback> entry : toSubmit.requests().entrySet()) {
      DnsBatch.Request request = entry.getKey();
      DnsBatch.Callback callback = entry.getValue();
      switch (request.operation()) {
        case LIST_ZONES:
          JsonBatchCallback rpcCallback = listZonesCallback(callback, request);
          batch =
              dnsRpc.enqueueListZones(batch, request, rpcCallback, optionMap(request.options()));
          break;
        default:
          // todo(mderka) implement the rest of the operations
          throw new UnsupportedOperationException("Not implemented yet");
      }
    }
    return batch;
  }

  @Override
  public DnsBatch batch() {
    return new DnsBatch(this);
  }

  private JsonBatchCallback listZonesCallback(final DnsBatch.Callback callback,
      final DnsBatch.Request request) {
    return new JsonBatchCallback<ManagedZonesListResponse>() {
      @Override
      public void onFailure(GoogleJsonError error, HttpHeaders httpHeaders) {
        if (callback != null) {
          callback.error(new DnsException(error), request);
        }
      }

      @Override
      public void onSuccess(ManagedZonesListResponse zoneList, HttpHeaders httpHeaders) {
        if (callback != null) {
          DnsRpc.ListResult<ManagedZone> listResult =
              DnsRpc.ListResult.of(zoneList.getNextPageToken(), zoneList.getManagedZones());
          String cursor = listResult.pageToken();
          Iterable<Zone> zones = listResult.results() == null ? ImmutableList.<Zone>of()
              : Iterables.transform(listResult.results(), new Function<ManagedZone, Zone>() {
                @Override
                public Zone apply(ManagedZone managedZone) {
                  return new Zone(options().service(),
                      new ZoneInfo.BuilderImpl(ZoneInfo.fromPb(managedZone)));
                }
              }
          );
          Page<Zone> page = new PageImpl<>(
              new ZonePageFetcher(options(), cursor, optionMap(request.options())), cursor, zones);
          callback.success(page, request);
        }
      }
    };
  }

  private Map<DnsRpc.Option, ?> optionMap(AbstractOption... options) {
    Map<DnsRpc.Option, Object> temp = Maps.newEnumMap(DnsRpc.Option.class);
    if (options != null) {
      for (AbstractOption option : options) {
        Object prev = temp.put(option.rpcOption(), option.value());
        checkArgument(prev == null, "Duplicate option %s", option);
      }
    }
    return ImmutableMap.copyOf(temp);
  }
}
