// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/texttospeech/v1beta1/cloud_tts.proto

package com.google.cloud.texttospeech.v1beta1;

/**
 * <pre>
 * Configuration to set up audio encoder. The encoding determines the output
 * audio format that we'd like.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.texttospeech.v1beta1.AudioEncoding}
 */
public enum AudioEncoding
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Not specified. Will return result [google.rpc.Code.INVALID_ARGUMENT][].
   * </pre>
   *
   * <code>AUDIO_ENCODING_UNSPECIFIED = 0;</code>
   */
  AUDIO_ENCODING_UNSPECIFIED(0),
  /**
   * <pre>
   * Uncompressed 16-bit signed little-endian samples (Linear PCM).
   * Audio content returned as LINEAR16 also contains a WAV header.
   * </pre>
   *
   * <code>LINEAR16 = 1;</code>
   */
  LINEAR16(1),
  /**
   * <pre>
   * MP3 audio.
   * </pre>
   *
   * <code>MP3 = 2;</code>
   */
  MP3(2),
  /**
   * <pre>
   * Opus encoded audio wrapped in an ogg container. The result will be a
   * file which can be played natively on Android, and in browsers (at least
   * Chrome and Firefox). The quality of the encoding is considerably higher
   * than MP3 while using approximately the same bitrate.
   * </pre>
   *
   * <code>OGG_OPUS = 3;</code>
   */
  OGG_OPUS(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Not specified. Will return result [google.rpc.Code.INVALID_ARGUMENT][].
   * </pre>
   *
   * <code>AUDIO_ENCODING_UNSPECIFIED = 0;</code>
   */
  public static final int AUDIO_ENCODING_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Uncompressed 16-bit signed little-endian samples (Linear PCM).
   * Audio content returned as LINEAR16 also contains a WAV header.
   * </pre>
   *
   * <code>LINEAR16 = 1;</code>
   */
  public static final int LINEAR16_VALUE = 1;
  /**
   * <pre>
   * MP3 audio.
   * </pre>
   *
   * <code>MP3 = 2;</code>
   */
  public static final int MP3_VALUE = 2;
  /**
   * <pre>
   * Opus encoded audio wrapped in an ogg container. The result will be a
   * file which can be played natively on Android, and in browsers (at least
   * Chrome and Firefox). The quality of the encoding is considerably higher
   * than MP3 while using approximately the same bitrate.
   * </pre>
   *
   * <code>OGG_OPUS = 3;</code>
   */
  public static final int OGG_OPUS_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static AudioEncoding valueOf(int value) {
    return forNumber(value);
  }

  public static AudioEncoding forNumber(int value) {
    switch (value) {
      case 0: return AUDIO_ENCODING_UNSPECIFIED;
      case 1: return LINEAR16;
      case 2: return MP3;
      case 3: return OGG_OPUS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AudioEncoding>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AudioEncoding> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AudioEncoding>() {
          public AudioEncoding findValueByNumber(int number) {
            return AudioEncoding.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.cloud.texttospeech.v1beta1.TextToSpeechProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final AudioEncoding[] VALUES = values();

  public static AudioEncoding valueOf(
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

  private AudioEncoding(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.texttospeech.v1beta1.AudioEncoding)
}

