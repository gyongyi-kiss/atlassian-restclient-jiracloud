/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An issue suggested for use in the issue picker auto-completion.
 */
@ApiModel(description = "An issue suggested for use in the issue picker auto-completion.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-30T01:56:21.684+02:00[Europe/Prague]")
public class SuggestedIssue {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("key")
  private String key;

  @JsonProperty("keyHtml")
  private String keyHtml;

  @JsonProperty("img")
  private String img;

  @JsonProperty("summary")
  private String summary;

  @JsonProperty("summaryText")
  private String summaryText;

   /**
   * The id of the issue.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the issue.")
  public Long getId() {
    return id;
  }

   /**
   * The key of the issue.
   * @return key
  **/
  @ApiModelProperty(value = "The key of the issue.")
  public String getKey() {
    return key;
  }

   /**
   * The key of the issue in HTML format.
   * @return keyHtml
  **/
  @ApiModelProperty(value = "The key of the issue in HTML format.")
  public String getKeyHtml() {
    return keyHtml;
  }

   /**
   * The URL of the issue type&#39;s avatar.
   * @return img
  **/
  @ApiModelProperty(value = "The URL of the issue type's avatar.")
  public String getImg() {
    return img;
  }

   /**
   * The phrase containing the query string in HTML format, with the string highlighted with HTML bold tags.
   * @return summary
  **/
  @ApiModelProperty(value = "The phrase containing the query string in HTML format, with the string highlighted with HTML bold tags.")
  public String getSummary() {
    return summary;
  }

   /**
   * The phrase containing the query string, as plain text.
   * @return summaryText
  **/
  @ApiModelProperty(value = "The phrase containing the query string, as plain text.")
  public String getSummaryText() {
    return summaryText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestedIssue suggestedIssue = (SuggestedIssue) o;
    return Objects.equals(this.id, suggestedIssue.id) &&
        Objects.equals(this.key, suggestedIssue.key) &&
        Objects.equals(this.keyHtml, suggestedIssue.keyHtml) &&
        Objects.equals(this.img, suggestedIssue.img) &&
        Objects.equals(this.summary, suggestedIssue.summary) &&
        Objects.equals(this.summaryText, suggestedIssue.summaryText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, keyHtml, img, summary, summaryText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestedIssue {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    keyHtml: ").append(toIndentedString(keyHtml)).append("\n");
    sb.append("    img: ").append(toIndentedString(img)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    summaryText: ").append(toIndentedString(summaryText)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

