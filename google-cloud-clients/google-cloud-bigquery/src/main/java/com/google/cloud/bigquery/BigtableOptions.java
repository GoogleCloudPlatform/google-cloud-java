package com.google.cloud.bigquery;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.io.Serializable;
import java.util.List;


public class BigtableOptions implements Serializable {


  private static final long serialVersionUID = 1L;

  public Boolean getIgnoreUnspecifiedColumnFamilies() {
    return ignoreUnspecifiedColumnFamilies;
  }

  public Boolean getReadRowkeyAsString() {
    return readRowkeyAsString;
  }

  public List<BigtableColumnFamily> getColumnFamilies() {
    return columnFamilies;
  }

  private final Boolean ignoreUnspecifiedColumnFamilies;
  private final Boolean readRowkeyAsString;
  private final List<BigtableColumnFamily> columnFamilies;

  static final class Builder {

    private Boolean ignoreUnspecifiedColumnFamilies;
    private Boolean readRowkeyAsString;
    private List<BigtableColumnFamily> columnFamilies;

    private Builder() {
    }

    /**
     * If field is true, then the column families that are not specified in columnFamilies list are
     * not exposed in the table schema. Otherwise, they are read with BYTES type values. The default
     * value is false.
     */
    Builder setIgnoreUnspecifiedColumnFamilies(Boolean ignoreUnspecifiedColumnFamilies) {
      this.ignoreUnspecifiedColumnFamilies = ignoreUnspecifiedColumnFamilies;
      return this;
    }

    /**
     * If readRowkeyAsString is true, then the rowkey column families will be read and converted to
     * string. Otherwise they are read with BYTES type values and users need to manually cast them
     * with CAST if necessary. The default value is false.
     */
    Builder setReadRowkeyAsString(Boolean readRowkeyAsString) {
      this.readRowkeyAsString = readRowkeyAsString;
      return this;
    }

    /**
     * List of column families to expose in the table schema along with their types.
     *
     * This list restricts the column families that can be referenced in queries and specifies their
     * value types. You can use this list to do type conversions - see the 'type' field for more
     * details. If you leave this list empty, all column families are present in the table schema
     * and their values are read as BYTES. During a query only the column families referenced in
     * that query are read from Bigtable.
     */
    Builder setColumnFamilies(List<BigtableColumnFamily> columnFamilies) {
      this.columnFamilies = columnFamilies;
      return this;
    }

    BigtableOptions build() {
      return new BigtableOptions(this);
    }

  }

  BigtableOptions(Builder builder) {
    ignoreUnspecifiedColumnFamilies = builder.ignoreUnspecifiedColumnFamilies;
    readRowkeyAsString = builder.readRowkeyAsString;
    columnFamilies = builder.columnFamilies;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("ignoreUnspecifiedColumnFamilies", ignoreUnspecifiedColumnFamilies)
        .add("readRowkeyAsString", readRowkeyAsString)
        .add("columnFamilies", columnFamilies)
        .toString();
  }

  static BigtableOptions fromPb(com.google.api.services.bigquery.model.BigtableOptions options) {
    Builder builder = new BigtableOptions.Builder();
    builder.setIgnoreUnspecifiedColumnFamilies(options.getIgnoreUnspecifiedColumnFamilies());
    builder.setReadRowkeyAsString(options.getReadRowkeyAsString());
    builder.setColumnFamilies(Lists.transform(options.getColumnFamilies(), BigtableColumnFamily.FROM_PB_FUNCTION));
    return builder.build();
  }

  com.google.api.services.bigquery.model.BigtableOptions toPb() {
    com.google.api.services.bigquery.model.BigtableOptions options = new com.google.api.services.bigquery.model.BigtableOptions()
        .setIgnoreUnspecifiedColumnFamilies(ignoreUnspecifiedColumnFamilies)
        .setReadRowkeyAsString(readRowkeyAsString);
    if (columnFamilies != null) {
      options.setColumnFamilies(Lists.transform(columnFamilies, BigtableColumnFamily.TO_PB_FUNCTION));
    }
    return options;
  }
}
