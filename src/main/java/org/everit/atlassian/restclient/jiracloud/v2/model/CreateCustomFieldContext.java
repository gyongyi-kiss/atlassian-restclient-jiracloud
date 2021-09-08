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
import java.util.ArrayList;
import java.util.List;

/**
 * The details of a created custom field context.
 */
@ApiModel(description = "The details of a created custom field context.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-03T13:48:17.349+02:00[Europe/Prague]")
public class CreateCustomFieldContext {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("projectIds")
  private List<String> projectIds = new ArrayList<>();

  @JsonProperty("issueTypeIds")
  private List<String> issueTypeIds = new ArrayList<>();

   /**
   * The ID of the context.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the context.")
  public String getId() {
    return id;
  }

  public CreateCustomFieldContext name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the context.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the context.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateCustomFieldContext description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the context.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the context.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateCustomFieldContext projectIds(List<String> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public CreateCustomFieldContext addProjectIdsItem(String projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * The list of project IDs associated with the context. If the list is empty, the context is global.
   * @return projectIds
  **/
  @ApiModelProperty(value = "The list of project IDs associated with the context. If the list is empty, the context is global.")
  public List<String> getProjectIds() {
    return projectIds;
  }

  public void setProjectIds(List<String> projectIds) {
    this.projectIds = projectIds;
  }

  public CreateCustomFieldContext issueTypeIds(List<String> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
    return this;
  }

  public CreateCustomFieldContext addIssueTypeIdsItem(String issueTypeIdsItem) {
    if (this.issueTypeIds == null) {
      this.issueTypeIds = new ArrayList<>();
    }
    this.issueTypeIds.add(issueTypeIdsItem);
    return this;
  }

   /**
   * The list of issue types IDs for the context. If the list is empty, the context refers to all issue types.
   * @return issueTypeIds
  **/
  @ApiModelProperty(value = "The list of issue types IDs for the context. If the list is empty, the context refers to all issue types.")
  public List<String> getIssueTypeIds() {
    return issueTypeIds;
  }

  public void setIssueTypeIds(List<String> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCustomFieldContext createCustomFieldContext = (CreateCustomFieldContext) o;
    return Objects.equals(this.id, createCustomFieldContext.id) &&
        Objects.equals(this.name, createCustomFieldContext.name) &&
        Objects.equals(this.description, createCustomFieldContext.description) &&
        Objects.equals(this.projectIds, createCustomFieldContext.projectIds) &&
        Objects.equals(this.issueTypeIds, createCustomFieldContext.issueTypeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, projectIds, issueTypeIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCustomFieldContext {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    issueTypeIds: ").append(toIndentedString(issueTypeIds)).append("\n");
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
