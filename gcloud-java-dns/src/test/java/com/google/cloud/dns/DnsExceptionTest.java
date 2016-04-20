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

package com.google.cloud.dns;

import com.google.cloud.BaseServiceException;
import com.google.cloud.RetryHelper.RetryHelperException;

import org.junit.Test;

import java.io.IOException;
import java.net.SocketTimeoutException;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class DnsExceptionTest {

  @Test
  public void testDnsException() throws Exception {
    IOException cause = new SocketTimeoutException("message");
    DnsException exception = new DnsException(cause, true);
    assertEquals(DnsException.UNKNOWN_CODE, exception.code());
    assertNull(exception.reason());
    assertEquals("message", exception.getMessage());
    assertEquals(cause, exception.getCause());
    assertTrue(exception.retryable());
    assertTrue(exception.idempotent());
  }

  @Test
  public void testTranslateAndThrow() throws Exception {
    IOException timeoutException = new SocketTimeoutException("message");
    Exception cause = new DnsException(timeoutException, true);
    RetryHelperException exceptionMock = createMock(RetryHelperException.class);
    expect(exceptionMock.getCause()).andReturn(cause).times(2);
    replay(exceptionMock);
    try {
      DnsException.translateAndThrow(exceptionMock);
    } catch (BaseServiceException ex) {
      assertEquals(DnsException.UNKNOWN_CODE, ex.code());
      assertNull(ex.reason());
      assertEquals("message", ex.getMessage());
      assertEquals(timeoutException, ex.getCause());
      assertTrue(ex.retryable());
      assertTrue(ex.idempotent());
    } finally {
      verify(exceptionMock);
    }
    cause = new IllegalArgumentException("message");
    exceptionMock = createMock(RetryHelperException.class);
    expect(exceptionMock.getMessage()).andReturn("message").times(1);
    expect(exceptionMock.getCause()).andReturn(cause).times(2);
    replay(exceptionMock);
    try {
      DnsException.translateAndThrow(exceptionMock);
    } catch (BaseServiceException ex) {
      assertEquals(DnsException.UNKNOWN_CODE, ex.code());
      assertEquals("message", ex.getMessage());
      assertFalse(ex.retryable());
      assertTrue(ex.idempotent());
      assertEquals(cause, ex.getCause());
    } finally {
      verify(exceptionMock);
    }
  }
}
