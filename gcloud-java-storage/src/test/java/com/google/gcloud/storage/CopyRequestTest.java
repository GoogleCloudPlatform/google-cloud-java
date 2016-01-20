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

package com.google.gcloud.storage;

import static com.google.gcloud.storage.Storage.PredefinedAcl.PUBLIC_READ;
import static org.junit.Assert.assertEquals;

import com.google.common.collect.ImmutableList;
import com.google.gcloud.storage.Storage.BlobSourceOption;
import com.google.gcloud.storage.Storage.BlobTargetOption;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CopyRequestTest {

  private static final String SOURCE_BUCKET_NAME = "b0";
  private static final String SOURCE_BLOB_NAME = "o0";
  private static final String TARGET_BUCKET_NAME = "b1";
  private static final String TARGET_BLOB_NAME = "o1";
  private static final String TARGET_BLOB_CONTENT_TYPE = "contentType";
  private static final BlobId SOURCE_BLOB_ID = BlobId.of(SOURCE_BUCKET_NAME, SOURCE_BLOB_NAME);
  private static final BlobId TARGET_BLOB_ID = BlobId.of(TARGET_BUCKET_NAME, TARGET_BLOB_NAME);


  private Storage storage;
  private Blob targetBlob;

  @Before
  public void setUp() {
    storage = EasyMock.createMock(Storage.class);
    EasyMock.expect(storage.options()).andReturn(null).anyTimes();
    EasyMock.replay(storage);
    targetBlob =
        Blob.builder(storage, TARGET_BLOB_ID).contentType(TARGET_BLOB_CONTENT_TYPE).build();
  }

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void testCopyRequest() {
    Storage.CopyRequest copyRequest1 = Storage.CopyRequest.builder()
        .source(SOURCE_BLOB_ID)
        .sourceOptions(BlobSourceOption.generationMatch(1))
        .target(targetBlob, BlobTargetOption.predefinedAcl(PUBLIC_READ))
        .build();
    assertEquals(SOURCE_BLOB_ID, copyRequest1.source());
    assertEquals(1, copyRequest1.sourceOptions().size());
    assertEquals(BlobSourceOption.generationMatch(1), copyRequest1.sourceOptions().get(0));
    assertEquals(targetBlob, copyRequest1.target());
    assertEquals(1, copyRequest1.targetOptions().size());
    assertEquals(BlobTargetOption.predefinedAcl(PUBLIC_READ), copyRequest1.targetOptions().get(0));

    Storage.CopyRequest copyRequest2 = Storage.CopyRequest.builder()
        .source(SOURCE_BUCKET_NAME, SOURCE_BLOB_NAME)
        .target(storage, TARGET_BLOB_ID)
        .build();
    assertEquals(SOURCE_BLOB_ID, copyRequest2.source());
    assertEquals(Blob.builder(storage, TARGET_BLOB_ID).build(), copyRequest2.target());

    Storage.CopyRequest copyRequest3 = Storage.CopyRequest.builder()
        .source(SOURCE_BLOB_ID)
        .target(targetBlob, ImmutableList.of(BlobTargetOption.predefinedAcl(PUBLIC_READ)))
        .build();
    assertEquals(SOURCE_BLOB_ID, copyRequest3.source());
    assertEquals(targetBlob, copyRequest3.target());
    assertEquals(ImmutableList.of(BlobTargetOption.predefinedAcl(PUBLIC_READ)),
        copyRequest3.targetOptions());
  }

  @Test
  public void testCopyRequestOf() {
    Storage.CopyRequest copyRequest1 = Storage.CopyRequest.of(SOURCE_BLOB_ID, targetBlob);
    assertEquals(SOURCE_BLOB_ID, copyRequest1.source());
    assertEquals(targetBlob, copyRequest1.target());

    Storage.CopyRequest copyRequest2 =
        Storage.CopyRequest.of(storage, SOURCE_BLOB_ID, TARGET_BLOB_NAME);
    assertEquals(SOURCE_BLOB_ID, copyRequest2.source());
    assertEquals(
        Blob.builder(storage, SOURCE_BUCKET_NAME, TARGET_BLOB_NAME).build(),
        copyRequest2.target());

    Storage.CopyRequest copyRequest3 =
        Storage.CopyRequest.of(SOURCE_BUCKET_NAME, SOURCE_BLOB_NAME, targetBlob);
    assertEquals(SOURCE_BLOB_ID, copyRequest3.source());
    assertEquals(targetBlob, copyRequest3.target());

    Storage.CopyRequest copyRequest4 =
        Storage.CopyRequest.of(storage, SOURCE_BUCKET_NAME, SOURCE_BLOB_NAME, TARGET_BLOB_NAME);
    assertEquals(SOURCE_BLOB_ID, copyRequest4.source());
    assertEquals(
        Blob.builder(storage, SOURCE_BUCKET_NAME, TARGET_BLOB_NAME).build(),
        copyRequest4.target());

    Storage.CopyRequest copyRequest5 =
        Storage.CopyRequest.of(storage, SOURCE_BLOB_ID, TARGET_BLOB_ID);
    assertEquals(SOURCE_BLOB_ID, copyRequest5.source());
    assertEquals(Blob.builder(storage, TARGET_BLOB_ID).build(), copyRequest5.target());

    Storage.CopyRequest copyRequest6 =
        Storage.CopyRequest.of(storage, SOURCE_BUCKET_NAME, SOURCE_BLOB_NAME, TARGET_BLOB_ID);
    assertEquals(SOURCE_BLOB_ID, copyRequest6.source());
    assertEquals(Blob.builder(storage, TARGET_BLOB_ID).build(), copyRequest6.target());
  }

  @Test
  public void testCopyRequestFail() {
    thrown.expect(IllegalArgumentException.class);
    Storage.CopyRequest.builder()
        .source(SOURCE_BLOB_ID)
        .target(Blob.builder(storage, TARGET_BLOB_ID).build())
        .build();
  }

  @Test
  public void testCopyRequestOfBlobFail() {
    thrown.expect(IllegalArgumentException.class);
    Storage.CopyRequest.of(SOURCE_BLOB_ID, Blob.builder(storage, TARGET_BLOB_ID).build());
  }

  @Test
  public void testCopyRequestOfStringFail() {
    thrown.expect(IllegalArgumentException.class);
    Storage.CopyRequest.of(
        SOURCE_BUCKET_NAME, SOURCE_BLOB_NAME, Blob.builder(storage, TARGET_BLOB_ID).build());
  }
}
