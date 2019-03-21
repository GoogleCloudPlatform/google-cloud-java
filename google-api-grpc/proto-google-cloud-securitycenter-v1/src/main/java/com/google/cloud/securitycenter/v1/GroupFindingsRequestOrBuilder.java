// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1;

public interface GroupFindingsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.GroupFindingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the source to groupBy. Its format is
   * "organizations/[organization_id]/sources/[source_id]". To groupBy across
   * all sources provide a source_id of `-`. For example:
   * organizations/123/sources/-
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Name of the source to groupBy. Its format is
   * "organizations/[organization_id]/sources/[source_id]". To groupBy across
   * all sources provide a source_id of `-`. For example:
   * organizations/123/sources/-
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Expression that defines the filter to apply across findings.
   * The expression is a list of one or more restrictions combined via logical
   * operators `AND` and `OR`.
   * Parentheses are supported, and `OR` has higher precedence than `AND`.
   * Restrictions have the form `&lt;field&gt; &lt;operator&gt; &lt;value&gt;` and may have a `-`
   * character in front of them to indicate negation. Examples include:
   *  * name
   *  * source_properties.a_property
   *  * security_marks.marks.marka
   * The supported operators are:
   * * `=` for all value types.
   * * `&gt;`, `&lt;`, `&gt;=`, `&lt;=` for integer values.
   * * `:`, meaning substring matching, for strings.
   * The supported value types are:
   * * string literals in quotes.
   * * integer literals without quotes.
   * * boolean literals `true` and `false` without quotes.
   * For example, `source_properties.size = 100` is a valid filter string.
   * </pre>
   *
   * <code>string filter = 2;</code>
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Expression that defines the filter to apply across findings.
   * The expression is a list of one or more restrictions combined via logical
   * operators `AND` and `OR`.
   * Parentheses are supported, and `OR` has higher precedence than `AND`.
   * Restrictions have the form `&lt;field&gt; &lt;operator&gt; &lt;value&gt;` and may have a `-`
   * character in front of them to indicate negation. Examples include:
   *  * name
   *  * source_properties.a_property
   *  * security_marks.marks.marka
   * The supported operators are:
   * * `=` for all value types.
   * * `&gt;`, `&lt;`, `&gt;=`, `&lt;=` for integer values.
   * * `:`, meaning substring matching, for strings.
   * The supported value types are:
   * * string literals in quotes.
   * * integer literals without quotes.
   * * boolean literals `true` and `false` without quotes.
   * For example, `source_properties.size = 100` is a valid filter string.
   * </pre>
   *
   * <code>string filter = 2;</code>
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Expression that defines what assets fields to use for grouping (including
   * `state_change`). The string value should follow SQL syntax: comma separated
   * list of fields. For example: "parent,resource_name".
   * The following fields are supported:
   * * resource_name
   * * category
   * * state
   * * state_change
   * * parent
   * </pre>
   *
   * <code>string group_by = 3;</code>
   */
  java.lang.String getGroupBy();
  /**
   *
   *
   * <pre>
   * Expression that defines what assets fields to use for grouping (including
   * `state_change`). The string value should follow SQL syntax: comma separated
   * list of fields. For example: "parent,resource_name".
   * The following fields are supported:
   * * resource_name
   * * category
   * * state
   * * state_change
   * * parent
   * </pre>
   *
   * <code>string group_by = 3;</code>
   */
  com.google.protobuf.ByteString getGroupByBytes();

  /**
   *
   *
   * <pre>
   * Time used as a reference point when filtering findings. The filter is
   * limited to findings existing at the supplied time and their values are
   * those at that specific time. Absence of this field will default to the
   * API's version of NOW.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   */
  boolean hasReadTime();
  /**
   *
   *
   * <pre>
   * Time used as a reference point when filtering findings. The filter is
   * limited to findings existing at the supplied time and their values are
   * those at that specific time. Absence of this field will default to the
   * API's version of NOW.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   *
   *
   * <pre>
   * Time used as a reference point when filtering findings. The filter is
   * limited to findings existing at the supplied time and their values are
   * those at that specific time. Absence of this field will default to the
   * API's version of NOW.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * When compare_duration is set, the GroupResult's "state_change" attribute is
   * updated to indicate whether the finding had its state changed, the
   * finding's state remained unchanged, or if the finding was added during the
   * compare_duration period of time that precedes the read_time. This is the
   * time between (read_time - compare_duration) and read_time.
   * The state_change value is derived based on the presence and state of the
   * finding at the two points in time. Intermediate state changes between the
   * two times don't affect the result. For example, the results aren't affected
   * if the finding is made inactive and then active again.
   * Possible "state_change" values when compare_duration is specified:
   * * "CHANGED":   indicates that the finding was present at the start of
   *                  compare_duration, but changed its state at read_time.
   * * "UNCHANGED": indicates that the finding was present at the start of
   *                  compare_duration and did not change state at read_time.
   * * "ADDED":     indicates that the finding was not present at the start
   *                  of compare_duration, but was present at read_time.
   * If compare_duration is not specified, then the only possible state_change
   * is "UNUSED",  which will be the state_change set for all findings present
   * at read_time.
   * If this field is set then `state_change` must be a specified field in
   * `group_by`.
   * </pre>
   *
   * <code>.google.protobuf.Duration compare_duration = 5;</code>
   */
  boolean hasCompareDuration();
  /**
   *
   *
   * <pre>
   * When compare_duration is set, the GroupResult's "state_change" attribute is
   * updated to indicate whether the finding had its state changed, the
   * finding's state remained unchanged, or if the finding was added during the
   * compare_duration period of time that precedes the read_time. This is the
   * time between (read_time - compare_duration) and read_time.
   * The state_change value is derived based on the presence and state of the
   * finding at the two points in time. Intermediate state changes between the
   * two times don't affect the result. For example, the results aren't affected
   * if the finding is made inactive and then active again.
   * Possible "state_change" values when compare_duration is specified:
   * * "CHANGED":   indicates that the finding was present at the start of
   *                  compare_duration, but changed its state at read_time.
   * * "UNCHANGED": indicates that the finding was present at the start of
   *                  compare_duration and did not change state at read_time.
   * * "ADDED":     indicates that the finding was not present at the start
   *                  of compare_duration, but was present at read_time.
   * If compare_duration is not specified, then the only possible state_change
   * is "UNUSED",  which will be the state_change set for all findings present
   * at read_time.
   * If this field is set then `state_change` must be a specified field in
   * `group_by`.
   * </pre>
   *
   * <code>.google.protobuf.Duration compare_duration = 5;</code>
   */
  com.google.protobuf.Duration getCompareDuration();
  /**
   *
   *
   * <pre>
   * When compare_duration is set, the GroupResult's "state_change" attribute is
   * updated to indicate whether the finding had its state changed, the
   * finding's state remained unchanged, or if the finding was added during the
   * compare_duration period of time that precedes the read_time. This is the
   * time between (read_time - compare_duration) and read_time.
   * The state_change value is derived based on the presence and state of the
   * finding at the two points in time. Intermediate state changes between the
   * two times don't affect the result. For example, the results aren't affected
   * if the finding is made inactive and then active again.
   * Possible "state_change" values when compare_duration is specified:
   * * "CHANGED":   indicates that the finding was present at the start of
   *                  compare_duration, but changed its state at read_time.
   * * "UNCHANGED": indicates that the finding was present at the start of
   *                  compare_duration and did not change state at read_time.
   * * "ADDED":     indicates that the finding was not present at the start
   *                  of compare_duration, but was present at read_time.
   * If compare_duration is not specified, then the only possible state_change
   * is "UNUSED",  which will be the state_change set for all findings present
   * at read_time.
   * If this field is set then `state_change` must be a specified field in
   * `group_by`.
   * </pre>
   *
   * <code>.google.protobuf.Duration compare_duration = 5;</code>
   */
  com.google.protobuf.DurationOrBuilder getCompareDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * The value returned by the last `GroupFindingsResponse`; indicates
   * that this is a continuation of a prior `GroupFindings` call, and
   * that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 7;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The value returned by the last `GroupFindingsResponse`; indicates
   * that this is a continuation of a prior `GroupFindings` call, and
   * that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 7;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of results to return in a single response. Default is
   * 10, minimum is 1, maximum is 1000.
   * </pre>
   *
   * <code>int32 page_size = 8;</code>
   */
  int getPageSize();
}
