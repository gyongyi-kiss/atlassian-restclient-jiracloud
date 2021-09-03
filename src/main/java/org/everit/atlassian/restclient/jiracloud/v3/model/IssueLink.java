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
import java.net.URI;
import org.everit.atlassian.restclient.jiracloud.v3.model.IssueLinkType;
import org.everit.atlassian.restclient.jiracloud.v3.model.LinkedIssue;

/**
 * Details of a link between issues.
 */
@ApiModel(description = "Details of a link between issues.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-03T13:48:26.928+02:00[Europe/Prague]")
public class IssueLink {
  @JsonProperty("id")
  private String id;

  @JsonProperty("self")
  private URI self;

  @JsonProperty("type")
  private IssueLinkType type;

  @JsonProperty("inwardIssue")
  private LinkedIssue inwardIssue;

  @JsonProperty("outwardIssue")
  private LinkedIssue outwardIssue;

   /**
   * The ID of the issue link.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the issue link.")
  public String getId() {
    return id;
  }

   /**
   * The URL of the issue link.
   * @return self
  **/
  @ApiModelProperty(value = "The URL of the issue link.")
  public URI getSelf() {
    return self;
  }

  public IssueLink type(IssueLinkType type) {
    this.type = type;
    return this;
  }

   /**
   * The type of link between the issues.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of link between the issues.")
  public IssueLinkType getType() {
    return type;
  }

  public void setType(IssueLinkType type) {
    this.type = type;
  }

  public IssueLink inwardIssue(LinkedIssue inwardIssue) {
    this.inwardIssue = inwardIssue;
    return this;
  }

   /**
   * The issue the link joins to.
   * @return inwardIssue
  **/
  @ApiModelProperty(required = true, value = "The issue the link joins to.")
  public LinkedIssue getInwardIssue() {
    return inwardIssue;
  }

  public void setInwardIssue(LinkedIssue inwardIssue) {
    this.inwardIssue = inwardIssue;
  }

  public IssueLink outwardIssue(LinkedIssue outwardIssue) {
    this.outwardIssue = outwardIssue;
    return this;
  }

   /**
   * The issue the link originates from.
   * @return outwardIssue
  **/
  @ApiModelProperty(required = true, value = "The issue the link originates from.")
  public LinkedIssue getOutwardIssue() {
    return outwardIssue;
  }

  public void setOutwardIssue(LinkedIssue outwardIssue) {
    this.outwardIssue = outwardIssue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueLink issueLink = (IssueLink) o;
    return Objects.equals(this.id, issueLink.id) &&
        Objects.equals(this.self, issueLink.self) &&
        Objects.equals(this.type, issueLink.type) &&
        Objects.equals(this.inwardIssue, issueLink.inwardIssue) &&
        Objects.equals(this.outwardIssue, issueLink.outwardIssue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, self, type, inwardIssue, outwardIssue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueLink {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inwardIssue: ").append(toIndentedString(inwardIssue)).append("\n");
    sb.append("    outwardIssue: ").append(toIndentedString(outwardIssue)).append("\n");
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

