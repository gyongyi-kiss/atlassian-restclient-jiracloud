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
import org.everit.atlassian.restclient.jiracloud.v2.model.WorkflowScheme;

/**
 * A workflow scheme along with a list of projects that use it.
 */
@ApiModel(description = "A workflow scheme along with a list of projects that use it.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-28T14:12:34.799+01:00[Europe/Prague]")
public class WorkflowSchemeAssociations {
  @JsonProperty("projectIds")
  private List<String> projectIds = new ArrayList<>();

  @JsonProperty("workflowScheme")
  private WorkflowScheme workflowScheme;

  public WorkflowSchemeAssociations projectIds(List<String> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public WorkflowSchemeAssociations addProjectIdsItem(String projectIdsItem) {
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * The list of projects that use the workflow scheme.
   * @return projectIds
  **/
  @ApiModelProperty(required = true, value = "The list of projects that use the workflow scheme.")
  public List<String> getProjectIds() {
    return projectIds;
  }

  public void setProjectIds(List<String> projectIds) {
    this.projectIds = projectIds;
  }

  public WorkflowSchemeAssociations workflowScheme(WorkflowScheme workflowScheme) {
    this.workflowScheme = workflowScheme;
    return this;
  }

   /**
   * The workflow scheme.
   * @return workflowScheme
  **/
  @ApiModelProperty(value = "The workflow scheme.")
  public WorkflowScheme getWorkflowScheme() {
    return workflowScheme;
  }

  public void setWorkflowScheme(WorkflowScheme workflowScheme) {
    this.workflowScheme = workflowScheme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowSchemeAssociations workflowSchemeAssociations = (WorkflowSchemeAssociations) o;
    return Objects.equals(this.projectIds, workflowSchemeAssociations.projectIds) &&
        Objects.equals(this.workflowScheme, workflowSchemeAssociations.workflowScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectIds, workflowScheme);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowSchemeAssociations {\n");
    
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    workflowScheme: ").append(toIndentedString(workflowScheme)).append("\n");
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

