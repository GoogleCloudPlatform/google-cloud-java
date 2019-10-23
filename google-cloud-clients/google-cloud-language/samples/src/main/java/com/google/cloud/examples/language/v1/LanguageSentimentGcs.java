/*
 * Copyright 2019 Google LLC
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
// DO NOT EDIT! This is a generated sample ("Request",  "language_sentiment_gcs")
// sample-metadata:
//   title: Analyzing Sentiment (GCS)
//   description: Analyzing Sentiment in text file stored in Cloud Storage
//   usage: gradle run -PmainClass=com.google.cloud.examples.language.v1.LanguageSentimentGcs [--args='[--gcs_content_uri "gs://cloud-samples-data/language/sentiment-positive.txt"]']

package com.google.cloud.examples.language.v1;

import com.google.cloud.language.v1.AnalyzeSentimentRequest;
import com.google.cloud.language.v1.AnalyzeSentimentResponse;
import com.google.cloud.language.v1.Document;
import com.google.cloud.language.v1.EncodingType;
import com.google.cloud.language.v1.LanguageServiceClient;
import com.google.cloud.language.v1.Sentence;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public class LanguageSentimentGcs {
  // [START language_sentiment_gcs]
  /*
   * Please include the following imports to run this sample.
   *
   * import com.google.cloud.language.v1.AnalyzeSentimentRequest;
   * import com.google.cloud.language.v1.AnalyzeSentimentResponse;
   * import com.google.cloud.language.v1.Document;
   * import com.google.cloud.language.v1.EncodingType;
   * import com.google.cloud.language.v1.LanguageServiceClient;
   * import com.google.cloud.language.v1.Sentence;
   */

  /**
   * Analyzing Sentiment in text file stored in Cloud Storage
   *
   * @param gcsContentUri Google Cloud Storage URI where the file content is located. e.g.
   *     gs://[Your Bucket]/[Path to File]
   */
  public static void sampleAnalyzeSentiment(String gcsContentUri) {
    try (LanguageServiceClient languageServiceClient = LanguageServiceClient.create()) {
      // gcsContentUri = "gs://cloud-samples-data/language/sentiment-positive.txt";

      // Available types: PLAIN_TEXT, HTML
      Document.Type type = Document.Type.PLAIN_TEXT;

      // Optional. If not specified, the language is automatically detected.
      // For list of supported languages:
      // https://cloud.google.com/natural-language/docs/languages
      String language = "en";
      Document document =
          Document.newBuilder()
              .setGcsContentUri(gcsContentUri)
              .setType(type)
              .setLanguage(language)
              .build();

      // Available values: NONE, UTF8, UTF16, UTF32
      EncodingType encodingType = EncodingType.UTF8;
      AnalyzeSentimentRequest request =
          AnalyzeSentimentRequest.newBuilder()
              .setDocument(document)
              .setEncodingType(encodingType)
              .build();
      AnalyzeSentimentResponse response = languageServiceClient.analyzeSentiment(request);
      // Get overall sentiment of the input document
      System.out.printf(
          "Document sentiment score: %s\n", response.getDocumentSentiment().getScore());
      System.out.printf(
          "Document sentiment magnitude: %s\n", response.getDocumentSentiment().getMagnitude());
      // Get sentiment for all sentences in the document
      for (Sentence sentence : response.getSentencesList()) {
        System.out.printf("Sentence text: %s\n", sentence.getText().getContent());
        System.out.printf("Sentence sentiment score: %s\n", sentence.getSentiment().getScore());
        System.out.printf(
            "Sentence sentiment magnitude: %s\n", sentence.getSentiment().getMagnitude());
      }
      // Get the language of the text, which will be the same as
      // the language specified in the request or, if not specified,
      // the automatically-detected language.
      System.out.printf("Language of the text: %s\n", response.getLanguage());
    } catch (Exception exception) {
      System.err.println("Failed to create the client due to: " + exception);
    }
  }
  // [END language_sentiment_gcs]

  public static void main(String[] args) throws Exception {
    Options options = new Options();
    options.addOption(
        Option.builder("").required(false).hasArg(true).longOpt("gcs_content_uri").build());

    CommandLine cl = (new DefaultParser()).parse(options, args);
    String gcsContentUri =
        cl.getOptionValue(
            "gcs_content_uri", "gs://cloud-samples-data/language/sentiment-positive.txt");

    sampleAnalyzeSentiment(gcsContentUri);
  }
}
