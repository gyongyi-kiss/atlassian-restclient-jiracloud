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
import org.everit.atlassian.restclient.jiracloud.v2.model.IssueTypeBean;
import org.everit.atlassian.restclient.jiracloud.v2.model.Priority;
import org.everit.atlassian.restclient.jiracloud.v2.model.StatusDetails;
import org.everit.atlassian.restclient.jiracloud.v2.model.UserDetails;

/**
 * Key fields from the linked issue.
 */
@ApiModel(description = "Key fields from the linked issue.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-01T13:56:58.037+02:00[Europe/Prague]")
public class Fields {
  @JsonProperty("summary")
  private String summary;

  @JsonProperty("status")
  private StatusDetails status;

  @JsonProperty("priority")
  private Priority priority;

  @JsonProperty("assignee")
  private UserDetails assignee;

  @JsonProperty("issuetype")
  private IssueTypeBean issuetype;

  @JsonProperty("issueType")
  private IssueTypeBean issueType;

   /**
   * The summary description of the linked issue.
   * @return summary
  **/
  @ApiModelProperty(value = "The summary description of the linked issue.")
  public String getSummary() {
    return summary;
  }

   /**
   * The status of the linked issue.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the linked issue.")
  public StatusDetails getStatus() {
    return status;
  }

   /**
   * The priority of the linked issue.
   * @return priority
  **/
  @ApiModelProperty(value = "The priority of the linked issue.")
  public Priority getPriority() {
    return priority;
  }

   /**
   * The assignee of the linked issue.
   * @return assignee
  **/
  @ApiModelProperty(value = "The assignee of the linked issue.")
  public UserDetails getAssignee() {
    return assignee;
  }

  public Fields issuetype(IssueTypeBean issuetype) {
    this.issuetype = issuetype;
    return this;
  }

   /**
   * Get issuetype
   * @return issuetype
  **/
  @ApiModelProperty(value = "")
  public IssueTypeBean getIssuetype() {
    return issuetype;
  }

  public void setIssuetype(IssueTypeBean issuetype) {
    this.issuetype = issuetype;
  }

   /**
   * The type of the linked issue.
   * @return issueType
  **/
  @ApiModelProperty(value = "The type of the linked issue.")
  public IssueTypeBean getIssueType() {
    return issueType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fields fields = (Fields) o;
    return Objects.equals(this.summary, fields.summary) &&
        Objects.equals(this.status, fields.status) &&
        Objects.equals(this.priority, fields.priority) &&
        Objects.equals(this.assignee, fields.assignee) &&
        Objects.equals(this.issuetype, fields.issuetype) &&
        Objects.equals(this.issueType, fields.issueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, status, priority, assignee, issuetype, issueType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fields {\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    issuetype: ").append(toIndentedString(issuetype)).append("\n");
    sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
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

