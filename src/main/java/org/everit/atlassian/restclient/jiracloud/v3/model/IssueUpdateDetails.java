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


package org.everit.atlassian.restclient.jiracloud.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.everit.atlassian.restclient.jiracloud.v3.model.EntityProperty;
import org.everit.atlassian.restclient.jiracloud.v3.model.FieldUpdateOperation;
import org.everit.atlassian.restclient.jiracloud.v3.model.HistoryMetadata;
import org.everit.atlassian.restclient.jiracloud.v3.model.IssueTransition;

/**
 * Details of an issue update request.
 */
@ApiModel(description = "Details of an issue update request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-28T14:12:40.546+01:00[Europe/Prague]")
public class IssueUpdateDetails {
  @JsonProperty("transition")
  private IssueTransition transition;

  @JsonProperty("fields")
  private Map<String, Object> fields = new HashMap<>();

  @JsonProperty("update")
  private Map<String, List<FieldUpdateOperation>> update = new HashMap<>();

  @JsonProperty("historyMetadata")
  private HistoryMetadata historyMetadata;

  @JsonProperty("properties")
  private List<EntityProperty> properties = new ArrayList<>();

  private HashMap<String, Object> additionalProperties_ = new HashMap<String, Object>();

  public IssueUpdateDetails transition(IssueTransition transition) {
    this.transition = transition;
    return this;
  }

   /**
   * Details of a transition. Required when performing a transition, optional when creating or editing an issue.
   * @return transition
  **/
  @ApiModelProperty(value = "Details of a transition. Required when performing a transition, optional when creating or editing an issue.")
  public IssueTransition getTransition() {
    return transition;
  }

  public void setTransition(IssueTransition transition) {
    this.transition = transition;
  }

  public IssueUpdateDetails fields(Map<String, Object> fields) {
    this.fields = fields;
    return this;
  }

  public IssueUpdateDetails putFieldsItem(String key, Object fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

   /**
   * List of issue screen fields to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. When multiple sub-fields or other operations are required, use &#x60;update&#x60;. Fields included in here cannot be included in &#x60;update&#x60;.
   * @return fields
  **/
  @ApiModelProperty(value = "List of issue screen fields to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. When multiple sub-fields or other operations are required, use `update`. Fields included in here cannot be included in `update`.")
  public Map<String, Object> getFields() {
    return fields;
  }

  public void setFields(Map<String, Object> fields) {
    this.fields = fields;
  }

  public IssueUpdateDetails update(Map<String, List<FieldUpdateOperation>> update) {
    this.update = update;
    return this;
  }

  public IssueUpdateDetails putUpdateItem(String key, List<FieldUpdateOperation> updateItem) {
    if (this.update == null) {
      this.update = new HashMap<>();
    }
    this.update.put(key, updateItem);
    return this;
  }

   /**
   * List of operations to perform on issue screen fields. Note that fields included in here cannot be included in &#x60;fields&#x60;.
   * @return update
  **/
  @ApiModelProperty(value = "List of operations to perform on issue screen fields. Note that fields included in here cannot be included in `fields`.")
  public Map<String, List<FieldUpdateOperation>> getUpdate() {
    return update;
  }

  public void setUpdate(Map<String, List<FieldUpdateOperation>> update) {
    this.update = update;
  }

  public IssueUpdateDetails historyMetadata(HistoryMetadata historyMetadata) {
    this.historyMetadata = historyMetadata;
    return this;
  }

   /**
   * Additional issue history details.
   * @return historyMetadata
  **/
  @ApiModelProperty(value = "Additional issue history details.")
  public HistoryMetadata getHistoryMetadata() {
    return historyMetadata;
  }

  public void setHistoryMetadata(HistoryMetadata historyMetadata) {
    this.historyMetadata = historyMetadata;
  }

  public IssueUpdateDetails properties(List<EntityProperty> properties) {
    this.properties = properties;
    return this;
  }

  public IssueUpdateDetails addPropertiesItem(EntityProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Details of issue properties to be add or update.
   * @return properties
  **/
  @ApiModelProperty(value = "Details of issue properties to be add or update.")
  public List<EntityProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<EntityProperty> properties) {
    this.properties = properties;
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
    IssueUpdateDetails issueUpdateDetails = (IssueUpdateDetails) o;
    return Objects.equals(this.transition, issueUpdateDetails.transition) &&
        Objects.equals(this.fields, issueUpdateDetails.fields) &&
        Objects.equals(this.update, issueUpdateDetails.update) &&
        Objects.equals(this.historyMetadata, issueUpdateDetails.historyMetadata) &&
        Objects.equals(this.properties, issueUpdateDetails.properties) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transition, fields, update, historyMetadata, properties, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueUpdateDetails {\n");
    
    sb.append("    transition: ").append(toIndentedString(transition)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    historyMetadata: ").append(toIndentedString(historyMetadata)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

