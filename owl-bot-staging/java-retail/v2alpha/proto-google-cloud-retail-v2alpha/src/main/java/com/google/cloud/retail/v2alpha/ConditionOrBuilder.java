// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2alpha/common.proto

package com.google.cloud.retail.v2alpha;

public interface ConditionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.Condition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list (up to 10 entries) of terms to match the query on. If not
   * specified, match all queries.
   * If many query terms are specified, the condition
   * is matched if any of the terms is a match (i.e. using the OR operator).
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Condition.QueryTerm query_terms = 1;</code>
   */
  java.util.List<com.google.cloud.retail.v2alpha.Condition.QueryTerm> 
      getQueryTermsList();
  /**
   * <pre>
   * A list (up to 10 entries) of terms to match the query on. If not
   * specified, match all queries.
   * If many query terms are specified, the condition
   * is matched if any of the terms is a match (i.e. using the OR operator).
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Condition.QueryTerm query_terms = 1;</code>
   */
  com.google.cloud.retail.v2alpha.Condition.QueryTerm getQueryTerms(int index);
  /**
   * <pre>
   * A list (up to 10 entries) of terms to match the query on. If not
   * specified, match all queries.
   * If many query terms are specified, the condition
   * is matched if any of the terms is a match (i.e. using the OR operator).
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Condition.QueryTerm query_terms = 1;</code>
   */
  int getQueryTermsCount();
  /**
   * <pre>
   * A list (up to 10 entries) of terms to match the query on. If not
   * specified, match all queries.
   * If many query terms are specified, the condition
   * is matched if any of the terms is a match (i.e. using the OR operator).
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Condition.QueryTerm query_terms = 1;</code>
   */
  java.util.List<? extends com.google.cloud.retail.v2alpha.Condition.QueryTermOrBuilder> 
      getQueryTermsOrBuilderList();
  /**
   * <pre>
   * A list (up to 10 entries) of terms to match the query on. If not
   * specified, match all queries.
   * If many query terms are specified, the condition
   * is matched if any of the terms is a match (i.e. using the OR operator).
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Condition.QueryTerm query_terms = 1;</code>
   */
  com.google.cloud.retail.v2alpha.Condition.QueryTermOrBuilder getQueryTermsOrBuilder(
      int index);

  /**
   * <pre>
   * Range of time(s) specifying when Condition is active.
   * Condition true if any time range matches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Condition.TimeRange active_time_range = 3;</code>
   */
  java.util.List<com.google.cloud.retail.v2alpha.Condition.TimeRange> 
      getActiveTimeRangeList();
  /**
   * <pre>
   * Range of time(s) specifying when Condition is active.
   * Condition true if any time range matches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Condition.TimeRange active_time_range = 3;</code>
   */
  com.google.cloud.retail.v2alpha.Condition.TimeRange getActiveTimeRange(int index);
  /**
   * <pre>
   * Range of time(s) specifying when Condition is active.
   * Condition true if any time range matches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Condition.TimeRange active_time_range = 3;</code>
   */
  int getActiveTimeRangeCount();
  /**
   * <pre>
   * Range of time(s) specifying when Condition is active.
   * Condition true if any time range matches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Condition.TimeRange active_time_range = 3;</code>
   */
  java.util.List<? extends com.google.cloud.retail.v2alpha.Condition.TimeRangeOrBuilder> 
      getActiveTimeRangeOrBuilderList();
  /**
   * <pre>
   * Range of time(s) specifying when Condition is active.
   * Condition true if any time range matches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.Condition.TimeRange active_time_range = 3;</code>
   */
  com.google.cloud.retail.v2alpha.Condition.TimeRangeOrBuilder getActiveTimeRangeOrBuilder(
      int index);
}
