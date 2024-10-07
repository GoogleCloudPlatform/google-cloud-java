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
// source: google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_tables.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1.schema.trainingjob.definition;

public final class AutoMLTablesProto {
  private AutoMLTablesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTables_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTables_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_AutoTransformation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_AutoTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericTransformation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalTransformation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TimestampTransformation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TimestampTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextTransformation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericArrayTransformation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericArrayTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalArrayTransformation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalArrayTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextArrayTransformation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextArrayTransformation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nLgoogle/cloud/aiplatform/v1/schema/trai"
          + "ningjob/definition/automl_tables.proto\0228"
          + "google.cloud.aiplatform.v1.schema.traini"
          + "ngjob.definition\032agoogle/cloud/aiplatfor"
          + "m/v1/schema/trainingjob/definition/expor"
          + "t_evaluated_data_items_config.proto\"\316\001\n\014"
          + "AutoMlTables\022\\\n\006inputs\030\001 \001(\0132L.google.cl"
          + "oud.aiplatform.v1.schema.trainingjob.def"
          + "inition.AutoMlTablesInputs\022`\n\010metadata\030\002"
          + " \001(\0132N.google.cloud.aiplatform.v1.schema"
          + ".trainingjob.definition.AutoMlTablesMeta"
          + "data\"\364\021\n\022AutoMlTablesInputs\022-\n#optimizat"
          + "ion_objective_recall_value\030\005 \001(\002H\000\0220\n&op"
          + "timization_objective_precision_value\030\006 \001"
          + "(\002H\000\022\027\n\017prediction_type\030\001 \001(\t\022\025\n\rtarget_"
          + "column\030\002 \001(\t\022t\n\017transformations\030\003 \003(\0132[."
          + "google.cloud.aiplatform.v1.schema.traini"
          + "ngjob.definition.AutoMlTablesInputs.Tran"
          + "sformation\022\036\n\026optimization_objective\030\004 \001"
          + "(\t\022%\n\035train_budget_milli_node_hours\030\007 \001("
          + "\003\022\036\n\026disable_early_stopping\030\010 \001(\010\022\032\n\022wei"
          + "ght_column_name\030\t \001(\t\022\204\001\n\"export_evaluat"
          + "ed_data_items_config\030\n \001(\0132X.google.clou"
          + "d.aiplatform.v1.schema.trainingjob.defin"
          + "ition.ExportEvaluatedDataItemsConfig\022\036\n\026"
          + "additional_experiments\030\013 \003(\t\032\200\r\n\016Transfo"
          + "rmation\022~\n\004auto\030\001 \001(\0132n.google.cloud.aip"
          + "latform.v1.schema.trainingjob.definition"
          + ".AutoMlTablesInputs.Transformation.AutoT"
          + "ransformationH\000\022\204\001\n\007numeric\030\002 \001(\0132q.goog"
          + "le.cloud.aiplatform.v1.schema.trainingjo"
          + "b.definition.AutoMlTablesInputs.Transfor"
          + "mation.NumericTransformationH\000\022\214\001\n\013categ"
          + "orical\030\003 \001(\0132u.google.cloud.aiplatform.v"
          + "1.schema.trainingjob.definition.AutoMlTa"
          + "blesInputs.Transformation.CategoricalTra"
          + "nsformationH\000\022\210\001\n\ttimestamp\030\004 \001(\0132s.goog"
          + "le.cloud.aiplatform.v1.schema.trainingjo"
          + "b.definition.AutoMlTablesInputs.Transfor"
          + "mation.TimestampTransformationH\000\022~\n\004text"
          + "\030\005 \001(\0132n.google.cloud.aiplatform.v1.sche"
          + "ma.trainingjob.definition.AutoMlTablesIn"
          + "puts.Transformation.TextTransformationH\000"
          + "\022\222\001\n\020repeated_numeric\030\006 \001(\0132v.google.clo"
          + "ud.aiplatform.v1.schema.trainingjob.defi"
          + "nition.AutoMlTablesInputs.Transformation"
          + ".NumericArrayTransformationH\000\022\232\001\n\024repeat"
          + "ed_categorical\030\007 \001(\0132z.google.cloud.aipl"
          + "atform.v1.schema.trainingjob.definition."
          + "AutoMlTablesInputs.Transformation.Catego"
          + "ricalArrayTransformationH\000\022\214\001\n\rrepeated_"
          + "text\030\010 \001(\0132s.google.cloud.aiplatform.v1."
          + "schema.trainingjob.definition.AutoMlTabl"
          + "esInputs.Transformation.TextArrayTransfo"
          + "rmationH\000\032)\n\022AutoTransformation\022\023\n\013colum"
          + "n_name\030\001 \001(\t\032L\n\025NumericTransformation\022\023\n"
          + "\013column_name\030\001 \001(\t\022\036\n\026invalid_values_all"
          + "owed\030\002 \001(\010\0320\n\031CategoricalTransformation\022"
          + "\023\n\013column_name\030\001 \001(\t\032c\n\027TimestampTransfo"
          + "rmation\022\023\n\013column_name\030\001 \001(\t\022\023\n\013time_for"
          + "mat\030\002 \001(\t\022\036\n\026invalid_values_allowed\030\003 \001("
          + "\010\032)\n\022TextTransformation\022\023\n\013column_name\030\001"
          + " \001(\t\032Q\n\032NumericArrayTransformation\022\023\n\013co"
          + "lumn_name\030\001 \001(\t\022\036\n\026invalid_values_allowe"
          + "d\030\002 \001(\010\0325\n\036CategoricalArrayTransformatio"
          + "n\022\023\n\013column_name\030\001 \001(\t\032.\n\027TextArrayTrans"
          + "formation\022\023\n\013column_name\030\001 \001(\tB\027\n\025transf"
          + "ormation_detailB*\n(additional_optimizati"
          + "on_objective_config\";\n\024AutoMlTablesMetad"
          + "ata\022#\n\033train_cost_milli_node_hours\030\001 \001(\003"
          + "B\350\002\n<com.google.cloud.aiplatform.v1.sche"
          + "ma.trainingjob.definitionB\021AutoMLTablesP"
          + "rotoP\001Z\\cloud.google.com/go/aiplatform/a"
          + "piv1/schema/trainingjob/definition/defin"
          + "itionpb;definitionpb\252\0028Google.Cloud.AIPl"
          + "atform.V1.Schema.TrainingJob.Definition\312"
          + "\0028Google\\Cloud\\AIPlatform\\V1\\Schema\\Trai"
          + "ningJob\\Definition\352\002>Google::Cloud::AIPl"
          + "atform::V1::Schema::TrainingJob::Definit"
          + "ionb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.aiplatform.v1.schema.trainingjob.definition
                  .ExportEvaluatedDataItemsConfigProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTables_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTables_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTables_descriptor,
            new java.lang.String[] {
              "Inputs", "Metadata",
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_descriptor,
            new java.lang.String[] {
              "OptimizationObjectiveRecallValue",
              "OptimizationObjectivePrecisionValue",
              "PredictionType",
              "TargetColumn",
              "Transformations",
              "OptimizationObjective",
              "TrainBudgetMilliNodeHours",
              "DisableEarlyStopping",
              "WeightColumnName",
              "ExportEvaluatedDataItemsConfig",
              "AdditionalExperiments",
              "AdditionalOptimizationObjectiveConfig",
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor =
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor,
            new java.lang.String[] {
              "Auto",
              "Numeric",
              "Categorical",
              "Timestamp",
              "Text",
              "RepeatedNumeric",
              "RepeatedCategorical",
              "RepeatedText",
              "TransformationDetail",
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_AutoTransformation_descriptor =
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_AutoTransformation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_AutoTransformation_descriptor,
            new java.lang.String[] {
              "ColumnName",
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericTransformation_descriptor =
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericTransformation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericTransformation_descriptor,
            new java.lang.String[] {
              "ColumnName", "InvalidValuesAllowed",
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalTransformation_descriptor =
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalTransformation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalTransformation_descriptor,
            new java.lang.String[] {
              "ColumnName",
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TimestampTransformation_descriptor =
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TimestampTransformation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TimestampTransformation_descriptor,
            new java.lang.String[] {
              "ColumnName", "TimeFormat", "InvalidValuesAllowed",
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextTransformation_descriptor =
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextTransformation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextTransformation_descriptor,
            new java.lang.String[] {
              "ColumnName",
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericArrayTransformation_descriptor =
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor
            .getNestedTypes()
            .get(5);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericArrayTransformation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_NumericArrayTransformation_descriptor,
            new java.lang.String[] {
              "ColumnName", "InvalidValuesAllowed",
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalArrayTransformation_descriptor =
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor
            .getNestedTypes()
            .get(6);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalArrayTransformation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_CategoricalArrayTransformation_descriptor,
            new java.lang.String[] {
              "ColumnName",
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextArrayTransformation_descriptor =
        internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_descriptor
            .getNestedTypes()
            .get(7);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextArrayTransformation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesInputs_Transformation_TextArrayTransformation_descriptor,
            new java.lang.String[] {
              "ColumnName",
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlTablesMetadata_descriptor,
            new java.lang.String[] {
              "TrainCostMilliNodeHours",
            });
    com.google.cloud.aiplatform.v1.schema.trainingjob.definition.ExportEvaluatedDataItemsConfigProto
        .getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
