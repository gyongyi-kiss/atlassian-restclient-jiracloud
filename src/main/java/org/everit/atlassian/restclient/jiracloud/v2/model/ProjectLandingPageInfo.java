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

/**
 * ProjectLandingPageInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-03T13:48:17.349+02:00[Europe/Prague]")
public class ProjectLandingPageInfo {
  @JsonProperty("url")
  private String url;

  @JsonProperty("projectKey")
  private String projectKey;

  @JsonProperty("projectType")
  private String projectType;

  @JsonProperty("boardId")
  private Long boardId;

  @JsonProperty("simplified")
  private Boolean simplified;

  public ProjectLandingPageInfo url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ProjectLandingPageInfo projectKey(String projectKey) {
    this.projectKey = projectKey;
    return this;
  }

   /**
   * Get projectKey
   * @return projectKey
  **/
  @ApiModelProperty(value = "")
  public String getProjectKey() {
    return projectKey;
  }

  public void setProjectKey(String projectKey) {
    this.projectKey = projectKey;
  }

  public ProjectLandingPageInfo projectType(String projectType) {
    this.projectType = projectType;
    return this;
  }

   /**
   * Get projectType
   * @return projectType
  **/
  @ApiModelProperty(value = "")
  public String getProjectType() {
    return projectType;
  }

  public void setProjectType(String projectType) {
    this.projectType = projectType;
  }

  public ProjectLandingPageInfo boardId(Long boardId) {
    this.boardId = boardId;
    return this;
  }

   /**
   * Get boardId
   * @return boardId
  **/
  @ApiModelProperty(value = "")
  public Long getBoardId() {
    return boardId;
  }

  public void setBoardId(Long boardId) {
    this.boardId = boardId;
  }

  public ProjectLandingPageInfo simplified(Boolean simplified) {
    this.simplified = simplified;
    return this;
  }

   /**
   * Get simplified
   * @return simplified
  **/
  @ApiModelProperty(value = "")
  public Boolean getSimplified() {
    return simplified;
  }

  public void setSimplified(Boolean simplified) {
    this.simplified = simplified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectLandingPageInfo projectLandingPageInfo = (ProjectLandingPageInfo) o;
    return Objects.equals(this.url, projectLandingPageInfo.url) &&
        Objects.equals(this.projectKey, projectLandingPageInfo.projectKey) &&
        Objects.equals(this.projectType, projectLandingPageInfo.projectType) &&
        Objects.equals(this.boardId, projectLandingPageInfo.boardId) &&
        Objects.equals(this.simplified, projectLandingPageInfo.simplified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, projectKey, projectType, boardId, simplified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectLandingPageInfo {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
    sb.append("    projectType: ").append(toIndentedString(projectType)).append("\n");
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    simplified: ").append(toIndentedString(simplified)).append("\n");
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

