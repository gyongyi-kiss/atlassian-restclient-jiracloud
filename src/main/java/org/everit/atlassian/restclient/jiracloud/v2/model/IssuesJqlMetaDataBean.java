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
 * The description of the page of issues loaded by the provided JQL query.
 */
@ApiModel(description = "The description of the page of issues loaded by the provided JQL query.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-28T14:12:34.799+01:00[Europe/Prague]")
public class IssuesJqlMetaDataBean {
  @JsonProperty("startAt")
  private Long startAt;

  @JsonProperty("maxResults")
  private Integer maxResults;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("totalCount")
  private Long totalCount;

  @JsonProperty("validationWarnings")
  private List<String> validationWarnings = new ArrayList<>();

  public IssuesJqlMetaDataBean startAt(Long startAt) {
    this.startAt = startAt;
    return this;
  }

   /**
   * The index of the first issue.
   * @return startAt
  **/
  @ApiModelProperty(required = true, value = "The index of the first issue.")
  public Long getStartAt() {
    return startAt;
  }

  public void setStartAt(Long startAt) {
    this.startAt = startAt;
  }

  public IssuesJqlMetaDataBean maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * The maximum number of issues that could be loaded in this evaluation.
   * @return maxResults
  **/
  @ApiModelProperty(required = true, value = "The maximum number of issues that could be loaded in this evaluation.")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public IssuesJqlMetaDataBean count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The number of issues that were loaded in this evaluation.
   * @return count
  **/
  @ApiModelProperty(required = true, value = "The number of issues that were loaded in this evaluation.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public IssuesJqlMetaDataBean totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * The total number of issues the JQL returned.
   * @return totalCount
  **/
  @ApiModelProperty(required = true, value = "The total number of issues the JQL returned.")
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  public IssuesJqlMetaDataBean validationWarnings(List<String> validationWarnings) {
    this.validationWarnings = validationWarnings;
    return this;
  }

  public IssuesJqlMetaDataBean addValidationWarningsItem(String validationWarningsItem) {
    if (this.validationWarnings == null) {
      this.validationWarnings = new ArrayList<>();
    }
    this.validationWarnings.add(validationWarningsItem);
    return this;
  }

   /**
   * Any warnings related to the JQL query. Present only if the validation mode was set to &#x60;warn&#x60;.
   * @return validationWarnings
  **/
  @ApiModelProperty(value = "Any warnings related to the JQL query. Present only if the validation mode was set to `warn`.")
  public List<String> getValidationWarnings() {
    return validationWarnings;
  }

  public void setValidationWarnings(List<String> validationWarnings) {
    this.validationWarnings = validationWarnings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuesJqlMetaDataBean issuesJqlMetaDataBean = (IssuesJqlMetaDataBean) o;
    return Objects.equals(this.startAt, issuesJqlMetaDataBean.startAt) &&
        Objects.equals(this.maxResults, issuesJqlMetaDataBean.maxResults) &&
        Objects.equals(this.count, issuesJqlMetaDataBean.count) &&
        Objects.equals(this.totalCount, issuesJqlMetaDataBean.totalCount) &&
        Objects.equals(this.validationWarnings, issuesJqlMetaDataBean.validationWarnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startAt, maxResults, count, totalCount, validationWarnings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuesJqlMetaDataBean {\n");
    
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    validationWarnings: ").append(toIndentedString(validationWarnings)).append("\n");
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

