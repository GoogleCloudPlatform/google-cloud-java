// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/job_state.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Describes the state of a job.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.aiplatform.v1.JobState}
 */
public enum JobState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The job state is unspecified.
   * </pre>
   *
   * <code>JOB_STATE_UNSPECIFIED = 0;</code>
   */
  JOB_STATE_UNSPECIFIED(0),
  /**
   * <pre>
   * The job has been just created or resumed and processing has not yet begun.
   * </pre>
   *
   * <code>JOB_STATE_QUEUED = 1;</code>
   */
  JOB_STATE_QUEUED(1),
  /**
   * <pre>
   * The service is preparing to run the job.
   * </pre>
   *
   * <code>JOB_STATE_PENDING = 2;</code>
   */
  JOB_STATE_PENDING(2),
  /**
   * <pre>
   * The job is in progress.
   * </pre>
   *
   * <code>JOB_STATE_RUNNING = 3;</code>
   */
  JOB_STATE_RUNNING(3),
  /**
   * <pre>
   * The job completed successfully.
   * </pre>
   *
   * <code>JOB_STATE_SUCCEEDED = 4;</code>
   */
  JOB_STATE_SUCCEEDED(4),
  /**
   * <pre>
   * The job failed.
   * </pre>
   *
   * <code>JOB_STATE_FAILED = 5;</code>
   */
  JOB_STATE_FAILED(5),
  /**
   * <pre>
   * The job is being cancelled. From this state the job may only go to
   * either `JOB_STATE_SUCCEEDED`, `JOB_STATE_FAILED` or `JOB_STATE_CANCELLED`.
   * </pre>
   *
   * <code>JOB_STATE_CANCELLING = 6;</code>
   */
  JOB_STATE_CANCELLING(6),
  /**
   * <pre>
   * The job has been cancelled.
   * </pre>
   *
   * <code>JOB_STATE_CANCELLED = 7;</code>
   */
  JOB_STATE_CANCELLED(7),
  /**
   * <pre>
   * The job has been stopped, and can be resumed.
   * </pre>
   *
   * <code>JOB_STATE_PAUSED = 8;</code>
   */
  JOB_STATE_PAUSED(8),
  /**
   * <pre>
   * The job has expired.
   * </pre>
   *
   * <code>JOB_STATE_EXPIRED = 9;</code>
   */
  JOB_STATE_EXPIRED(9),
  /**
   * <pre>
   * The job is being updated. Only jobs in the `RUNNING` state can be updated.
   * After updating, the job goes back to the `RUNNING` state.
   * </pre>
   *
   * <code>JOB_STATE_UPDATING = 10;</code>
   */
  JOB_STATE_UPDATING(10),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The job state is unspecified.
   * </pre>
   *
   * <code>JOB_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int JOB_STATE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * The job has been just created or resumed and processing has not yet begun.
   * </pre>
   *
   * <code>JOB_STATE_QUEUED = 1;</code>
   */
  public static final int JOB_STATE_QUEUED_VALUE = 1;
  /**
   * <pre>
   * The service is preparing to run the job.
   * </pre>
   *
   * <code>JOB_STATE_PENDING = 2;</code>
   */
  public static final int JOB_STATE_PENDING_VALUE = 2;
  /**
   * <pre>
   * The job is in progress.
   * </pre>
   *
   * <code>JOB_STATE_RUNNING = 3;</code>
   */
  public static final int JOB_STATE_RUNNING_VALUE = 3;
  /**
   * <pre>
   * The job completed successfully.
   * </pre>
   *
   * <code>JOB_STATE_SUCCEEDED = 4;</code>
   */
  public static final int JOB_STATE_SUCCEEDED_VALUE = 4;
  /**
   * <pre>
   * The job failed.
   * </pre>
   *
   * <code>JOB_STATE_FAILED = 5;</code>
   */
  public static final int JOB_STATE_FAILED_VALUE = 5;
  /**
   * <pre>
   * The job is being cancelled. From this state the job may only go to
   * either `JOB_STATE_SUCCEEDED`, `JOB_STATE_FAILED` or `JOB_STATE_CANCELLED`.
   * </pre>
   *
   * <code>JOB_STATE_CANCELLING = 6;</code>
   */
  public static final int JOB_STATE_CANCELLING_VALUE = 6;
  /**
   * <pre>
   * The job has been cancelled.
   * </pre>
   *
   * <code>JOB_STATE_CANCELLED = 7;</code>
   */
  public static final int JOB_STATE_CANCELLED_VALUE = 7;
  /**
   * <pre>
   * The job has been stopped, and can be resumed.
   * </pre>
   *
   * <code>JOB_STATE_PAUSED = 8;</code>
   */
  public static final int JOB_STATE_PAUSED_VALUE = 8;
  /**
   * <pre>
   * The job has expired.
   * </pre>
   *
   * <code>JOB_STATE_EXPIRED = 9;</code>
   */
  public static final int JOB_STATE_EXPIRED_VALUE = 9;
  /**
   * <pre>
   * The job is being updated. Only jobs in the `RUNNING` state can be updated.
   * After updating, the job goes back to the `RUNNING` state.
   * </pre>
   *
   * <code>JOB_STATE_UPDATING = 10;</code>
   */
  public static final int JOB_STATE_UPDATING_VALUE = 10;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static JobState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static JobState forNumber(int value) {
    switch (value) {
      case 0: return JOB_STATE_UNSPECIFIED;
      case 1: return JOB_STATE_QUEUED;
      case 2: return JOB_STATE_PENDING;
      case 3: return JOB_STATE_RUNNING;
      case 4: return JOB_STATE_SUCCEEDED;
      case 5: return JOB_STATE_FAILED;
      case 6: return JOB_STATE_CANCELLING;
      case 7: return JOB_STATE_CANCELLED;
      case 8: return JOB_STATE_PAUSED;
      case 9: return JOB_STATE_EXPIRED;
      case 10: return JOB_STATE_UPDATING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<JobState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      JobState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<JobState>() {
          public JobState findValueByNumber(int number) {
            return JobState.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.JobStateProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final JobState[] VALUES = values();

  public static JobState valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private JobState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1.JobState)
}

