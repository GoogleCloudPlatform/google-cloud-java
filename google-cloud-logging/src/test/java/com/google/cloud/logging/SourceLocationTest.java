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

package com.google.cloud.logging;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SourceLocationTest {

  private static final String FILE = "file";
  private static final Long LINE = 42L;
  private static final String FUNCTION = "function";
  private static final SourceLocation SOURCE_LOCATION = SourceLocation.newBuilder()
      .setFile(FILE)
      .setLine(LINE)
      .setFunction(FUNCTION)
      .build();

  @Test
  public void testBuilder() {
    assertEquals(FILE, SOURCE_LOCATION.getFile());
    assertEquals(LINE, SOURCE_LOCATION.getLine());
    assertEquals(FUNCTION, SOURCE_LOCATION.getFunction());
  }


  @Test
  public void testToBuilder() {
    compareSourceLocation(SOURCE_LOCATION, SOURCE_LOCATION.toBuilder().build());
    SourceLocation sourceLocation = SOURCE_LOCATION.toBuilder()
        .setFile("newFile")
        .setLine(43L)
        .setFunction("newFunction")
        .build();
    assertEquals("newFile", sourceLocation.getFile());
    assertEquals(Long.valueOf(43L), sourceLocation.getLine());
    assertEquals("newFunction", sourceLocation.getFunction());
    sourceLocation = sourceLocation.toBuilder()
        .setFile(FILE)
        .setLine(LINE)
        .setFunction(FUNCTION)
        .build();
    compareSourceLocation(SOURCE_LOCATION, sourceLocation);
  }

  @Test
  public void testToAndFromPb() {
    compareSourceLocation(SOURCE_LOCATION, SourceLocation.fromPb(SOURCE_LOCATION.toPb()));
  }

  private void compareSourceLocation(SourceLocation expected, SourceLocation value) {
    assertEquals(expected, value);
    assertEquals(expected.getFile(), value.getFile());
    assertEquals(expected.getLine(), value.getLine());
    assertEquals(expected.getFunction(), value.getFunction());
    assertEquals(expected.hashCode(), value.hashCode());
    assertEquals(expected.toString(), value.toString());
  }
}
