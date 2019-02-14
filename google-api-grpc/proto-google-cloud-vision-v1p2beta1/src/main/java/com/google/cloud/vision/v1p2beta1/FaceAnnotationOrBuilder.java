// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p2beta1/image_annotator.proto

package com.google.cloud.vision.v1p2beta1;

public interface FaceAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p2beta1.FaceAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The bounding polygon around the face. The coordinates of the bounding box
   * are in the original image's scale, as returned in `ImageParams`.
   * The bounding box is computed to "frame" the face in accordance with human
   * expectations. It is based on the landmarker results.
   * Note that one or more x and/or y coordinates may not be generated in the
   * `BoundingPoly` (the polygon will be unbounded) if only a partial face
   * appears in the image to be annotated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.BoundingPoly bounding_poly = 1;</code>
   */
  boolean hasBoundingPoly();
  /**
   *
   *
   * <pre>
   * The bounding polygon around the face. The coordinates of the bounding box
   * are in the original image's scale, as returned in `ImageParams`.
   * The bounding box is computed to "frame" the face in accordance with human
   * expectations. It is based on the landmarker results.
   * Note that one or more x and/or y coordinates may not be generated in the
   * `BoundingPoly` (the polygon will be unbounded) if only a partial face
   * appears in the image to be annotated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.BoundingPoly bounding_poly = 1;</code>
   */
  com.google.cloud.vision.v1p2beta1.BoundingPoly getBoundingPoly();
  /**
   *
   *
   * <pre>
   * The bounding polygon around the face. The coordinates of the bounding box
   * are in the original image's scale, as returned in `ImageParams`.
   * The bounding box is computed to "frame" the face in accordance with human
   * expectations. It is based on the landmarker results.
   * Note that one or more x and/or y coordinates may not be generated in the
   * `BoundingPoly` (the polygon will be unbounded) if only a partial face
   * appears in the image to be annotated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.BoundingPoly bounding_poly = 1;</code>
   */
  com.google.cloud.vision.v1p2beta1.BoundingPolyOrBuilder getBoundingPolyOrBuilder();

  /**
   *
   *
   * <pre>
   * The `fd_bounding_poly` bounding polygon is tighter than the
   * `boundingPoly`, and encloses only the skin part of the face. Typically, it
   * is used to eliminate the face from any image analysis that detects the
   * "amount of skin" visible in an image. It is not based on the
   * landmarker results, only on the initial face detection, hence
   * the &lt;code&gt;fd&lt;/code&gt; (face detection) prefix.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.BoundingPoly fd_bounding_poly = 2;</code>
   */
  boolean hasFdBoundingPoly();
  /**
   *
   *
   * <pre>
   * The `fd_bounding_poly` bounding polygon is tighter than the
   * `boundingPoly`, and encloses only the skin part of the face. Typically, it
   * is used to eliminate the face from any image analysis that detects the
   * "amount of skin" visible in an image. It is not based on the
   * landmarker results, only on the initial face detection, hence
   * the &lt;code&gt;fd&lt;/code&gt; (face detection) prefix.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.BoundingPoly fd_bounding_poly = 2;</code>
   */
  com.google.cloud.vision.v1p2beta1.BoundingPoly getFdBoundingPoly();
  /**
   *
   *
   * <pre>
   * The `fd_bounding_poly` bounding polygon is tighter than the
   * `boundingPoly`, and encloses only the skin part of the face. Typically, it
   * is used to eliminate the face from any image analysis that detects the
   * "amount of skin" visible in an image. It is not based on the
   * landmarker results, only on the initial face detection, hence
   * the &lt;code&gt;fd&lt;/code&gt; (face detection) prefix.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.BoundingPoly fd_bounding_poly = 2;</code>
   */
  com.google.cloud.vision.v1p2beta1.BoundingPolyOrBuilder getFdBoundingPolyOrBuilder();

  /**
   *
   *
   * <pre>
   * Detected face landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.FaceAnnotation.Landmark landmarks = 3;</code>
   */
  java.util.List<com.google.cloud.vision.v1p2beta1.FaceAnnotation.Landmark> getLandmarksList();
  /**
   *
   *
   * <pre>
   * Detected face landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.FaceAnnotation.Landmark landmarks = 3;</code>
   */
  com.google.cloud.vision.v1p2beta1.FaceAnnotation.Landmark getLandmarks(int index);
  /**
   *
   *
   * <pre>
   * Detected face landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.FaceAnnotation.Landmark landmarks = 3;</code>
   */
  int getLandmarksCount();
  /**
   *
   *
   * <pre>
   * Detected face landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.FaceAnnotation.Landmark landmarks = 3;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p2beta1.FaceAnnotation.LandmarkOrBuilder>
      getLandmarksOrBuilderList();
  /**
   *
   *
   * <pre>
   * Detected face landmarks.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p2beta1.FaceAnnotation.Landmark landmarks = 3;</code>
   */
  com.google.cloud.vision.v1p2beta1.FaceAnnotation.LandmarkOrBuilder getLandmarksOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Roll angle, which indicates the amount of clockwise/anti-clockwise rotation
   * of the face relative to the image vertical about the axis perpendicular to
   * the face. Range [-180,180].
   * </pre>
   *
   * <code>float roll_angle = 4;</code>
   */
  float getRollAngle();

  /**
   *
   *
   * <pre>
   * Yaw angle, which indicates the leftward/rightward angle that the face is
   * pointing relative to the vertical plane perpendicular to the image. Range
   * [-180,180].
   * </pre>
   *
   * <code>float pan_angle = 5;</code>
   */
  float getPanAngle();

  /**
   *
   *
   * <pre>
   * Pitch angle, which indicates the upwards/downwards angle that the face is
   * pointing relative to the image's horizontal plane. Range [-180,180].
   * </pre>
   *
   * <code>float tilt_angle = 6;</code>
   */
  float getTiltAngle();

  /**
   *
   *
   * <pre>
   * Detection confidence. Range [0, 1].
   * </pre>
   *
   * <code>float detection_confidence = 7;</code>
   */
  float getDetectionConfidence();

  /**
   *
   *
   * <pre>
   * Face landmarking confidence. Range [0, 1].
   * </pre>
   *
   * <code>float landmarking_confidence = 8;</code>
   */
  float getLandmarkingConfidence();

  /**
   *
   *
   * <pre>
   * Joy likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.Likelihood joy_likelihood = 9;</code>
   */
  int getJoyLikelihoodValue();
  /**
   *
   *
   * <pre>
   * Joy likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.Likelihood joy_likelihood = 9;</code>
   */
  com.google.cloud.vision.v1p2beta1.Likelihood getJoyLikelihood();

  /**
   *
   *
   * <pre>
   * Sorrow likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.Likelihood sorrow_likelihood = 10;</code>
   */
  int getSorrowLikelihoodValue();
  /**
   *
   *
   * <pre>
   * Sorrow likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.Likelihood sorrow_likelihood = 10;</code>
   */
  com.google.cloud.vision.v1p2beta1.Likelihood getSorrowLikelihood();

  /**
   *
   *
   * <pre>
   * Anger likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.Likelihood anger_likelihood = 11;</code>
   */
  int getAngerLikelihoodValue();
  /**
   *
   *
   * <pre>
   * Anger likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.Likelihood anger_likelihood = 11;</code>
   */
  com.google.cloud.vision.v1p2beta1.Likelihood getAngerLikelihood();

  /**
   *
   *
   * <pre>
   * Surprise likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.Likelihood surprise_likelihood = 12;</code>
   */
  int getSurpriseLikelihoodValue();
  /**
   *
   *
   * <pre>
   * Surprise likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.Likelihood surprise_likelihood = 12;</code>
   */
  com.google.cloud.vision.v1p2beta1.Likelihood getSurpriseLikelihood();

  /**
   *
   *
   * <pre>
   * Under-exposed likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.Likelihood under_exposed_likelihood = 13;</code>
   */
  int getUnderExposedLikelihoodValue();
  /**
   *
   *
   * <pre>
   * Under-exposed likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.Likelihood under_exposed_likelihood = 13;</code>
   */
  com.google.cloud.vision.v1p2beta1.Likelihood getUnderExposedLikelihood();

  /**
   *
   *
   * <pre>
   * Blurred likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.Likelihood blurred_likelihood = 14;</code>
   */
  int getBlurredLikelihoodValue();
  /**
   *
   *
   * <pre>
   * Blurred likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.Likelihood blurred_likelihood = 14;</code>
   */
  com.google.cloud.vision.v1p2beta1.Likelihood getBlurredLikelihood();

  /**
   *
   *
   * <pre>
   * Headwear likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.Likelihood headwear_likelihood = 15;</code>
   */
  int getHeadwearLikelihoodValue();
  /**
   *
   *
   * <pre>
   * Headwear likelihood.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.Likelihood headwear_likelihood = 15;</code>
   */
  com.google.cloud.vision.v1p2beta1.Likelihood getHeadwearLikelihood();
}
