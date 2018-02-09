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
package com.google.cloud.bigtable.data.v2.wrappers;

import com.google.api.core.InternalApi;
import com.google.auto.value.AutoValue;
import com.google.protobuf.ByteString;

/** Represents the offset of a row key in a table. */
@AutoValue
public abstract class KeyOffset {
  @InternalApi
  public static KeyOffset create(ByteString key, long offsetBytes) {
    return new AutoValue_KeyOffset(key, offsetBytes);
  }

  /**
   * Sorted streamed sequence of sample row keys in the table. The table might have contents before
   * the first row key in the list and after the last one, but a key containing the empty string
   * indicates "end of table" and will be the last response given, if present.
   *
   * <p>Note that row keys in this list may not have ever been written to or read from, and users
   * should therefore not make any assumptions about the row key structure that are specific to
   * their use case.
   */
  public abstract ByteString geyKey();

  /**
   * Approximate total storage space used by all rows in the table which precede {@link #geyKey()}.
   * Buffering the contents of all rows between two subsequent samples would require space roughly
   * equal to the difference in their {@link #getOffsetBytes()} fields.
   */
  public abstract long getOffsetBytes();
}
