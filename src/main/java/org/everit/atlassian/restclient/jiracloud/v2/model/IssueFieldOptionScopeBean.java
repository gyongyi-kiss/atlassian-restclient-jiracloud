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
import org.everit.atlassian.restclient.jiracloud.v2.model.GlobalScopeBean;
import org.everit.atlassian.restclient.jiracloud.v2.model.ProjectScopeBean;

/**
 * IssueFieldOptionScopeBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-28T14:12:34.799+01:00[Europe/Prague]")
public class IssueFieldOptionScopeBean {
  @JsonProperty("projects")
  private List<Long> projects = new ArrayList<>();

  @JsonProperty("projects2")
  private List<ProjectScopeBean> projects2 = new ArrayList<>();

  @JsonProperty("global")
  private GlobalScopeBean global;

  public IssueFieldOptionScopeBean projects(List<Long> projects) {
    this.projects = projects;
    return this;
  }

  public IssueFieldOptionScopeBean addProjectsItem(Long projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * DEPRECATED
   * @return projects
  **/
  @ApiModelProperty(value = "DEPRECATED")
  public List<Long> getProjects() {
    return projects;
  }

  public void setProjects(List<Long> projects) {
    this.projects = projects;
  }

  public IssueFieldOptionScopeBean projects2(List<ProjectScopeBean> projects2) {
    this.projects2 = projects2;
    return this;
  }

  public IssueFieldOptionScopeBean addProjects2Item(ProjectScopeBean projects2Item) {
    if (this.projects2 == null) {
      this.projects2 = new ArrayList<>();
    }
    this.projects2.add(projects2Item);
    return this;
  }

   /**
   * Defines the projects in which the option is available and the behavior of the option within each project. Specify one object per project. The behavior of the option in a project context overrides the behavior in the global context.
   * @return projects2
  **/
  @ApiModelProperty(value = "Defines the projects in which the option is available and the behavior of the option within each project. Specify one object per project. The behavior of the option in a project context overrides the behavior in the global context.")
  public List<ProjectScopeBean> getProjects2() {
    return projects2;
  }

  public void setProjects2(List<ProjectScopeBean> projects2) {
    this.projects2 = projects2;
  }

  public IssueFieldOptionScopeBean global(GlobalScopeBean global) {
    this.global = global;
    return this;
  }

   /**
   * Defines the behavior of the option within the global context. If this property is set, even if set to an empty object, then the option is available in all projects.
   * @return global
  **/
  @ApiModelProperty(value = "Defines the behavior of the option within the global context. If this property is set, even if set to an empty object, then the option is available in all projects.")
  public GlobalScopeBean getGlobal() {
    return global;
  }

  public void setGlobal(GlobalScopeBean global) {
    this.global = global;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueFieldOptionScopeBean issueFieldOptionScopeBean = (IssueFieldOptionScopeBean) o;
    return Objects.equals(this.projects, issueFieldOptionScopeBean.projects) &&
        Objects.equals(this.projects2, issueFieldOptionScopeBean.projects2) &&
        Objects.equals(this.global, issueFieldOptionScopeBean.global);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projects, projects2, global);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueFieldOptionScopeBean {\n");
    
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    projects2: ").append(toIndentedString(projects2)).append("\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
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

