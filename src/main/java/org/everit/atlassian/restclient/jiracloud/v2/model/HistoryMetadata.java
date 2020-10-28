/*
 * Copyright © 2011 Everit Kft. (http://www.everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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


package org.everit.atlassian.restclient.jiracloud.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.everit.atlassian.restclient.jiracloud.v2.model.HistoryMetadataParticipant;

/**
 * Details of issue history metadata.
 */
@ApiModel(description = "Details of issue history metadata.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-28T14:12:34.799+01:00[Europe/Prague]")
public class HistoryMetadata {
  @JsonProperty("type")
  private String type;

  @JsonProperty("description")
  private String description;

  @JsonProperty("descriptionKey")
  private String descriptionKey;

  @JsonProperty("activityDescription")
  private String activityDescription;

  @JsonProperty("activityDescriptionKey")
  private String activityDescriptionKey;

  @JsonProperty("emailDescription")
  private String emailDescription;

  @JsonProperty("emailDescriptionKey")
  private String emailDescriptionKey;

  @JsonProperty("actor")
  private HistoryMetadataParticipant actor;

  @JsonProperty("generator")
  private HistoryMetadataParticipant generator;

  @JsonProperty("cause")
  private HistoryMetadataParticipant cause;

  @JsonProperty("extraData")
  private Map<String, String> extraData = new HashMap<>();

  private HashMap<String, Object> additionalProperties_ = new HashMap<String, Object>();

  public HistoryMetadata type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the history record.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the history record.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public HistoryMetadata description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the history record.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the history record.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public HistoryMetadata descriptionKey(String descriptionKey) {
    this.descriptionKey = descriptionKey;
    return this;
  }

   /**
   * The description key of the history record.
   * @return descriptionKey
  **/
  @ApiModelProperty(value = "The description key of the history record.")
  public String getDescriptionKey() {
    return descriptionKey;
  }

  public void setDescriptionKey(String descriptionKey) {
    this.descriptionKey = descriptionKey;
  }

  public HistoryMetadata activityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
    return this;
  }

   /**
   * The activity described in the history record.
   * @return activityDescription
  **/
  @ApiModelProperty(value = "The activity described in the history record.")
  public String getActivityDescription() {
    return activityDescription;
  }

  public void setActivityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
  }

  public HistoryMetadata activityDescriptionKey(String activityDescriptionKey) {
    this.activityDescriptionKey = activityDescriptionKey;
    return this;
  }

   /**
   * The key of the activity described in the history record.
   * @return activityDescriptionKey
  **/
  @ApiModelProperty(value = "The key of the activity described in the history record.")
  public String getActivityDescriptionKey() {
    return activityDescriptionKey;
  }

  public void setActivityDescriptionKey(String activityDescriptionKey) {
    this.activityDescriptionKey = activityDescriptionKey;
  }

  public HistoryMetadata emailDescription(String emailDescription) {
    this.emailDescription = emailDescription;
    return this;
  }

   /**
   * The description of the email address associated the history record.
   * @return emailDescription
  **/
  @ApiModelProperty(value = "The description of the email address associated the history record.")
  public String getEmailDescription() {
    return emailDescription;
  }

  public void setEmailDescription(String emailDescription) {
    this.emailDescription = emailDescription;
  }

  public HistoryMetadata emailDescriptionKey(String emailDescriptionKey) {
    this.emailDescriptionKey = emailDescriptionKey;
    return this;
  }

   /**
   * The description key of the email address associated the history record.
   * @return emailDescriptionKey
  **/
  @ApiModelProperty(value = "The description key of the email address associated the history record.")
  public String getEmailDescriptionKey() {
    return emailDescriptionKey;
  }

  public void setEmailDescriptionKey(String emailDescriptionKey) {
    this.emailDescriptionKey = emailDescriptionKey;
  }

  public HistoryMetadata actor(HistoryMetadataParticipant actor) {
    this.actor = actor;
    return this;
  }

   /**
   * Details of the user whose action created the history record.
   * @return actor
  **/
  @ApiModelProperty(value = "Details of the user whose action created the history record.")
  public HistoryMetadataParticipant getActor() {
    return actor;
  }

  public void setActor(HistoryMetadataParticipant actor) {
    this.actor = actor;
  }

  public HistoryMetadata generator(HistoryMetadataParticipant generator) {
    this.generator = generator;
    return this;
  }

   /**
   * Details of the system that generated the history record.
   * @return generator
  **/
  @ApiModelProperty(value = "Details of the system that generated the history record.")
  public HistoryMetadataParticipant getGenerator() {
    return generator;
  }

  public void setGenerator(HistoryMetadataParticipant generator) {
    this.generator = generator;
  }

  public HistoryMetadata cause(HistoryMetadataParticipant cause) {
    this.cause = cause;
    return this;
  }

   /**
   * Details of the cause that triggered the creation the history record.
   * @return cause
  **/
  @ApiModelProperty(value = "Details of the cause that triggered the creation the history record.")
  public HistoryMetadataParticipant getCause() {
    return cause;
  }

  public void setCause(HistoryMetadataParticipant cause) {
    this.cause = cause;
  }

  public HistoryMetadata extraData(Map<String, String> extraData) {
    this.extraData = extraData;
    return this;
  }

  public HistoryMetadata putExtraDataItem(String key, String extraDataItem) {
    if (this.extraData == null) {
      this.extraData = new HashMap<>();
    }
    this.extraData.put(key, extraDataItem);
    return this;
  }

   /**
   * Additional arbitrary information about the history record.
   * @return extraData
  **/
  @ApiModelProperty(value = "Additional arbitrary information about the history record.")
  public Map<String, String> getExtraData() {
    return extraData;
  }

  public void setExtraData(Map<String, String> extraData) {
    this.extraData = extraData;
  }


  @com.fasterxml.jackson.annotation.JsonAnyGetter
  public Map<String, Object> any() {
   return this.additionalProperties_;
  }

  @com.fasterxml.jackson.annotation.JsonAnySetter
  public void set(String name, Object value) {
   this.additionalProperties_.put(name, value);
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryMetadata historyMetadata = (HistoryMetadata) o;
    return Objects.equals(this.type, historyMetadata.type) &&
        Objects.equals(this.description, historyMetadata.description) &&
        Objects.equals(this.descriptionKey, historyMetadata.descriptionKey) &&
        Objects.equals(this.activityDescription, historyMetadata.activityDescription) &&
        Objects.equals(this.activityDescriptionKey, historyMetadata.activityDescriptionKey) &&
        Objects.equals(this.emailDescription, historyMetadata.emailDescription) &&
        Objects.equals(this.emailDescriptionKey, historyMetadata.emailDescriptionKey) &&
        Objects.equals(this.actor, historyMetadata.actor) &&
        Objects.equals(this.generator, historyMetadata.generator) &&
        Objects.equals(this.cause, historyMetadata.cause) &&
        Objects.equals(this.extraData, historyMetadata.extraData) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, description, descriptionKey, activityDescription, activityDescriptionKey, emailDescription, emailDescriptionKey, actor, generator, cause, extraData, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryMetadata {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionKey: ").append(toIndentedString(descriptionKey)).append("\n");
    sb.append("    activityDescription: ").append(toIndentedString(activityDescription)).append("\n");
    sb.append("    activityDescriptionKey: ").append(toIndentedString(activityDescriptionKey)).append("\n");
    sb.append("    emailDescription: ").append(toIndentedString(emailDescription)).append("\n");
    sb.append("    emailDescriptionKey: ").append(toIndentedString(emailDescriptionKey)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    generator: ").append(toIndentedString(generator)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties_)).append("\n");
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

