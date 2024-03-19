// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/predict/prediction/image_segmentation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1.schema.predict.prediction;

public interface ImageSegmentationPredictionResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.schema.predict.prediction.ImageSegmentationPredictionResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A PNG image where each pixel in the mask represents the category in which
   * the pixel in the original image was predicted to belong to. The size of
   * this image will be the same as the original image. The mapping between the
   * AnntoationSpec and the color can be found in model's metadata. The model
   * will choose the most likely category and if none of the categories reach
   * the confidence threshold, the pixel will be marked as background.
   * </pre>
   *
   * <code>string category_mask = 1;</code>
   * @return The categoryMask.
   */
  java.lang.String getCategoryMask();
  /**
   * <pre>
   * A PNG image where each pixel in the mask represents the category in which
   * the pixel in the original image was predicted to belong to. The size of
   * this image will be the same as the original image. The mapping between the
   * AnntoationSpec and the color can be found in model's metadata. The model
   * will choose the most likely category and if none of the categories reach
   * the confidence threshold, the pixel will be marked as background.
   * </pre>
   *
   * <code>string category_mask = 1;</code>
   * @return The bytes for categoryMask.
   */
  com.google.protobuf.ByteString
      getCategoryMaskBytes();

  /**
   * <pre>
   * A one channel image which is encoded as an 8bit lossless PNG. The size of
   * the image will be the same as the original image. For a specific pixel,
   * darker color means less confidence in correctness of the cateogry in the
   * categoryMask for the corresponding pixel. Black means no confidence and
   * white means complete confidence.
   * </pre>
   *
   * <code>string confidence_mask = 2;</code>
   * @return The confidenceMask.
   */
  java.lang.String getConfidenceMask();
  /**
   * <pre>
   * A one channel image which is encoded as an 8bit lossless PNG. The size of
   * the image will be the same as the original image. For a specific pixel,
   * darker color means less confidence in correctness of the cateogry in the
   * categoryMask for the corresponding pixel. Black means no confidence and
   * white means complete confidence.
   * </pre>
   *
   * <code>string confidence_mask = 2;</code>
   * @return The bytes for confidenceMask.
   */
  com.google.protobuf.ByteString
      getConfidenceMaskBytes();
}
