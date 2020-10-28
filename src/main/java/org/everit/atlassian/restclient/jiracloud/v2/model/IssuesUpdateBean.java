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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.everit.atlassian.restclient.jiracloud.v2.model.IssueUpdateDetails;

/**
 * IssuesUpdateBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-28T14:12:34.799+01:00[Europe/Prague]")
public class IssuesUpdateBean {
  @JsonProperty("issueUpdates")
  private List<IssueUpdateDetails> issueUpdates = new ArrayList<>();

  private HashMap<String, Object> additionalProperties_ = new HashMap<String, Object>();

  public IssuesUpdateBean issueUpdates(List<IssueUpdateDetails> issueUpdates) {
    this.issueUpdates = issueUpdates;
    return this;
  }

  public IssuesUpdateBean addIssueUpdatesItem(IssueUpdateDetails issueUpdatesItem) {
    if (this.issueUpdates == null) {
      this.issueUpdates = new ArrayList<>();
    }
    this.issueUpdates.add(issueUpdatesItem);
    return this;
  }

   /**
   * Get issueUpdates
   * @return issueUpdates
  **/
  @ApiModelProperty(value = "")
  public List<IssueUpdateDetails> getIssueUpdates() {
    return issueUpdates;
  }

  public void setIssueUpdates(List<IssueUpdateDetails> issueUpdates) {
    this.issueUpdates = issueUpdates;
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
    IssuesUpdateBean issuesUpdateBean = (IssuesUpdateBean) o;
    return Objects.equals(this.issueUpdates, issuesUpdateBean.issueUpdates) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueUpdates, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuesUpdateBean {\n");
    
    sb.append("    issueUpdates: ").append(toIndentedString(issueUpdates)).append("\n");
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

