// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2beta1/dlp.proto

package com.google.privacy.dlp.v2beta1;

public interface FixedSizeBucketingConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2beta1.FixedSizeBucketingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Lower bound value of buckets. All values less than `lower_bound` are
   * grouped together into a single bucket; for example if `lower_bound` = 10,
   * then all values less than 10 are replaced with the value “-10”. [Required].
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.Value lower_bound = 1;</code>
   */
  boolean hasLowerBound();
  /**
   * <pre>
   * Lower bound value of buckets. All values less than `lower_bound` are
   * grouped together into a single bucket; for example if `lower_bound` = 10,
   * then all values less than 10 are replaced with the value “-10”. [Required].
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.Value lower_bound = 1;</code>
   */
  com.google.privacy.dlp.v2beta1.Value getLowerBound();
  /**
   * <pre>
   * Lower bound value of buckets. All values less than `lower_bound` are
   * grouped together into a single bucket; for example if `lower_bound` = 10,
   * then all values less than 10 are replaced with the value “-10”. [Required].
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.Value lower_bound = 1;</code>
   */
  com.google.privacy.dlp.v2beta1.ValueOrBuilder getLowerBoundOrBuilder();

  /**
   * <pre>
   * Upper bound value of buckets. All values greater than upper_bound are
   * grouped together into a single bucket; for example if `upper_bound` = 89,
   * then all values greater than 89 are replaced with the value “89+”.
   * [Required].
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.Value upper_bound = 2;</code>
   */
  boolean hasUpperBound();
  /**
   * <pre>
   * Upper bound value of buckets. All values greater than upper_bound are
   * grouped together into a single bucket; for example if `upper_bound` = 89,
   * then all values greater than 89 are replaced with the value “89+”.
   * [Required].
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.Value upper_bound = 2;</code>
   */
  com.google.privacy.dlp.v2beta1.Value getUpperBound();
  /**
   * <pre>
   * Upper bound value of buckets. All values greater than upper_bound are
   * grouped together into a single bucket; for example if `upper_bound` = 89,
   * then all values greater than 89 are replaced with the value “89+”.
   * [Required].
   * </pre>
   *
   * <code>.google.privacy.dlp.v2beta1.Value upper_bound = 2;</code>
   */
  com.google.privacy.dlp.v2beta1.ValueOrBuilder getUpperBoundOrBuilder();

  /**
   * <pre>
   * Size of each bucket (except for minimum and maximum buckets). So if
   * `lower_bound` = 10, `upper_bound` = 89, and `bucket_size` = 10, then the
   * following buckets would be used: -10, 10-20, 20-30, 30-40, 40-50, 50-60,
   * 60-70, 70-80, 80-89, 89+. Precision up to 2 decimals works. [Required].
   * </pre>
   *
   * <code>double bucket_size = 3;</code>
   */
  double getBucketSize();
}
