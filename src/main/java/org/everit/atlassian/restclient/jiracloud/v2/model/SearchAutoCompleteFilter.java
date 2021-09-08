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
 * Details of how to filter and list search auto complete information.
 */
@ApiModel(description = "Details of how to filter and list search auto complete information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-03T13:48:17.349+02:00[Europe/Prague]")
public class SearchAutoCompleteFilter {
  @JsonProperty("projectIds")
  private List<Long> projectIds = new ArrayList<>();

  @JsonProperty("includeCollapsedFields")
  private Boolean includeCollapsedFields = false;

  public SearchAutoCompleteFilter projectIds(List<Long> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public SearchAutoCompleteFilter addProjectIdsItem(Long projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * List of project IDs used to filter the visible field details returned.
   * @return projectIds
  **/
  @ApiModelProperty(value = "List of project IDs used to filter the visible field details returned.")
  public List<Long> getProjectIds() {
    return projectIds;
  }

  public void setProjectIds(List<Long> projectIds) {
    this.projectIds = projectIds;
  }

  public SearchAutoCompleteFilter includeCollapsedFields(Boolean includeCollapsedFields) {
    this.includeCollapsedFields = includeCollapsedFields;
    return this;
  }

   /**
   * Include collapsed fields for fields that have non-unique names.
   * @return includeCollapsedFields
  **/
  @ApiModelProperty(value = "Include collapsed fields for fields that have non-unique names.")
  public Boolean getIncludeCollapsedFields() {
    return includeCollapsedFields;
  }

  public void setIncludeCollapsedFields(Boolean includeCollapsedFields) {
    this.includeCollapsedFields = includeCollapsedFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchAutoCompleteFilter searchAutoCompleteFilter = (SearchAutoCompleteFilter) o;
    return Objects.equals(this.projectIds, searchAutoCompleteFilter.projectIds) &&
        Objects.equals(this.includeCollapsedFields, searchAutoCompleteFilter.includeCollapsedFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectIds, includeCollapsedFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchAutoCompleteFilter {\n");
    
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    includeCollapsedFields: ").append(toIndentedString(includeCollapsedFields)).append("\n");
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

