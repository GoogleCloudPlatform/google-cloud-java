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

package com.google.cloud.bigquery;

/**
 * A type used in legacy SQL contexts. For example, these types are used in query results,
 * even if the query is a standard SQL query.
 */
public enum LegacySQLTypeName {
  /** Variable-length binary data. */
  BYTES(StandardSQLTypeName.BYTES),
  /** Variable-length character (Unicode) data. */
  STRING(StandardSQLTypeName.STRING),
  /** A 64-bit signed integer value. */
  INTEGER(StandardSQLTypeName.INT64),
  /** A 64-bit IEEE binary floating-point value. */
  FLOAT(StandardSQLTypeName.FLOAT64),
  /** A Boolean value (true or false). */
  BOOLEAN(StandardSQLTypeName.BOOL),
  /** Represents an absolute point in time, with microsecond precision. */
  TIMESTAMP(StandardSQLTypeName.TIMESTAMP),
  /** A record type with a nested schema. */
  RECORD(StandardSQLTypeName.STRUCT);

  private StandardSQLTypeName equivalent;

  LegacySQLTypeName(StandardSQLTypeName equivalent) {
    this.equivalent = equivalent;
  }

  /**
   * Provides the standard SQL type name equivalent to this type name.
   */
  public StandardSQLTypeName getStandardType() {
    return equivalent;
  }
}
