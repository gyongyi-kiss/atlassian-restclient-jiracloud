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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.everit.atlassian.restclient.jiracloud.v3.model.FieldMetadata;
import org.everit.atlassian.restclient.jiracloud.v3.model.StatusDetails;

/**
 * Details of an issue transition.
 */
@ApiModel(description = "Details of an issue transition.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-03T13:48:26.928+02:00[Europe/Prague]")
public class IssueTransition {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("to")
  private StatusDetails to;

  @JsonProperty("hasScreen")
  private Boolean hasScreen;

  @JsonProperty("isGlobal")
  private Boolean isGlobal;

  @JsonProperty("isInitial")
  private Boolean isInitial;

  @JsonProperty("isAvailable")
  private Boolean isAvailable;

  @JsonProperty("isConditional")
  private Boolean isConditional;

  @JsonProperty("fields")
  private Map<String, FieldMetadata> fields = new HashMap<>();

  @JsonProperty("expand")
  private String expand;

  @JsonProperty("looped")
  private Boolean looped;

  private HashMap<String, Object> additionalProperties_ = new HashMap<String, Object>();

  public IssueTransition id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the issue transition. Required when specifying a transition to undertake.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the issue transition. Required when specifying a transition to undertake.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * The name of the issue transition.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the issue transition.")
  public String getName() {
    return name;
  }

   /**
   * Details of the issue status after the transition.
   * @return to
  **/
  @ApiModelProperty(value = "Details of the issue status after the transition.")
  public StatusDetails getTo() {
    return to;
  }

   /**
   * Whether there is a screen associated with the issue transition.
   * @return hasScreen
  **/
  @ApiModelProperty(value = "Whether there is a screen associated with the issue transition.")
  public Boolean getHasScreen() {
    return hasScreen;
  }

   /**
   * Whether the issue transition is global, that is, the transition is applied to issues regardless of their status.
   * @return isGlobal
  **/
  @ApiModelProperty(value = "Whether the issue transition is global, that is, the transition is applied to issues regardless of their status.")
  public Boolean getIsGlobal() {
    return isGlobal;
  }

   /**
   * Whether this is the initial issue transition for the workflow.
   * @return isInitial
  **/
  @ApiModelProperty(value = "Whether this is the initial issue transition for the workflow.")
  public Boolean getIsInitial() {
    return isInitial;
  }

   /**
   * Whether the transition is available to be performed.
   * @return isAvailable
  **/
  @ApiModelProperty(value = "Whether the transition is available to be performed.")
  public Boolean getIsAvailable() {
    return isAvailable;
  }

   /**
   * Whether the issue has to meet criteria before the issue transition is applied.
   * @return isConditional
  **/
  @ApiModelProperty(value = "Whether the issue has to meet criteria before the issue transition is applied.")
  public Boolean getIsConditional() {
    return isConditional;
  }

   /**
   * Details of the fields associated with the issue transition screen. Use this information to populate &#x60;fields&#x60; and &#x60;update&#x60; in a transition request.
   * @return fields
  **/
  @ApiModelProperty(value = "Details of the fields associated with the issue transition screen. Use this information to populate `fields` and `update` in a transition request.")
  public Map<String, FieldMetadata> getFields() {
    return fields;
  }

   /**
   * Expand options that include additional transition details in the response.
   * @return expand
  **/
  @ApiModelProperty(value = "Expand options that include additional transition details in the response.")
  public String getExpand() {
    return expand;
  }

  public IssueTransition looped(Boolean looped) {
    this.looped = looped;
    return this;
  }

   /**
   * Get looped
   * @return looped
  **/
  @ApiModelProperty(value = "")
  public Boolean getLooped() {
    return looped;
  }

  public void setLooped(Boolean looped) {
    this.looped = looped;
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
    IssueTransition issueTransition = (IssueTransition) o;
    return Objects.equals(this.id, issueTransition.id) &&
        Objects.equals(this.name, issueTransition.name) &&
        Objects.equals(this.to, issueTransition.to) &&
        Objects.equals(this.hasScreen, issueTransition.hasScreen) &&
        Objects.equals(this.isGlobal, issueTransition.isGlobal) &&
        Objects.equals(this.isInitial, issueTransition.isInitial) &&
        Objects.equals(this.isAvailable, issueTransition.isAvailable) &&
        Objects.equals(this.isConditional, issueTransition.isConditional) &&
        Objects.equals(this.fields, issueTransition.fields) &&
        Objects.equals(this.expand, issueTransition.expand) &&
        Objects.equals(this.looped, issueTransition.looped) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, to, hasScreen, isGlobal, isInitial, isAvailable, isConditional, fields, expand, looped, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTransition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    hasScreen: ").append(toIndentedString(hasScreen)).append("\n");
    sb.append("    isGlobal: ").append(toIndentedString(isGlobal)).append("\n");
    sb.append("    isInitial: ").append(toIndentedString(isInitial)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    isConditional: ").append(toIndentedString(isConditional)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    looped: ").append(toIndentedString(looped)).append("\n");
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

