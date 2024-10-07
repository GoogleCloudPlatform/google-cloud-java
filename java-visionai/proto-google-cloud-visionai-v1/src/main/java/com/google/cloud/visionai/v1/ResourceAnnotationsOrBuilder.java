/*
 * Copyright 2024 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/visionai/v1/platform.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.visionai.v1;

public interface ResourceAnnotationsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.ResourceAnnotations)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Annotations that will be applied to the whole application.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.StreamAnnotation application_annotations = 1;</code>
   */
  java.util.List<com.google.cloud.visionai.v1.StreamAnnotation> getApplicationAnnotationsList();
  /**
   *
   *
   * <pre>
   * Annotations that will be applied to the whole application.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.StreamAnnotation application_annotations = 1;</code>
   */
  com.google.cloud.visionai.v1.StreamAnnotation getApplicationAnnotations(int index);
  /**
   *
   *
   * <pre>
   * Annotations that will be applied to the whole application.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.StreamAnnotation application_annotations = 1;</code>
   */
  int getApplicationAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Annotations that will be applied to the whole application.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.StreamAnnotation application_annotations = 1;</code>
   */
  java.util.List<? extends com.google.cloud.visionai.v1.StreamAnnotationOrBuilder>
      getApplicationAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Annotations that will be applied to the whole application.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.StreamAnnotation application_annotations = 1;</code>
   */
  com.google.cloud.visionai.v1.StreamAnnotationOrBuilder getApplicationAnnotationsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Annotations that will be applied to the specific node of the application.
   * If the same type of the annotations is applied to both application and
   * node, the node annotation will be added in addition to the global
   * application one.
   * For example, if there is one active zone annotation for the whole
   * application and one active zone annotation for the Occupancy Analytic
   * processor, then the Occupancy Analytic processor will have two active zones
   * defined.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.ApplicationNodeAnnotation node_annotations = 2;</code>
   */
  java.util.List<com.google.cloud.visionai.v1.ApplicationNodeAnnotation> getNodeAnnotationsList();
  /**
   *
   *
   * <pre>
   * Annotations that will be applied to the specific node of the application.
   * If the same type of the annotations is applied to both application and
   * node, the node annotation will be added in addition to the global
   * application one.
   * For example, if there is one active zone annotation for the whole
   * application and one active zone annotation for the Occupancy Analytic
   * processor, then the Occupancy Analytic processor will have two active zones
   * defined.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.ApplicationNodeAnnotation node_annotations = 2;</code>
   */
  com.google.cloud.visionai.v1.ApplicationNodeAnnotation getNodeAnnotations(int index);
  /**
   *
   *
   * <pre>
   * Annotations that will be applied to the specific node of the application.
   * If the same type of the annotations is applied to both application and
   * node, the node annotation will be added in addition to the global
   * application one.
   * For example, if there is one active zone annotation for the whole
   * application and one active zone annotation for the Occupancy Analytic
   * processor, then the Occupancy Analytic processor will have two active zones
   * defined.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.ApplicationNodeAnnotation node_annotations = 2;</code>
   */
  int getNodeAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Annotations that will be applied to the specific node of the application.
   * If the same type of the annotations is applied to both application and
   * node, the node annotation will be added in addition to the global
   * application one.
   * For example, if there is one active zone annotation for the whole
   * application and one active zone annotation for the Occupancy Analytic
   * processor, then the Occupancy Analytic processor will have two active zones
   * defined.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.ApplicationNodeAnnotation node_annotations = 2;</code>
   */
  java.util.List<? extends com.google.cloud.visionai.v1.ApplicationNodeAnnotationOrBuilder>
      getNodeAnnotationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Annotations that will be applied to the specific node of the application.
   * If the same type of the annotations is applied to both application and
   * node, the node annotation will be added in addition to the global
   * application one.
   * For example, if there is one active zone annotation for the whole
   * application and one active zone annotation for the Occupancy Analytic
   * processor, then the Occupancy Analytic processor will have two active zones
   * defined.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.ApplicationNodeAnnotation node_annotations = 2;</code>
   */
  com.google.cloud.visionai.v1.ApplicationNodeAnnotationOrBuilder getNodeAnnotationsOrBuilder(
      int index);
}
