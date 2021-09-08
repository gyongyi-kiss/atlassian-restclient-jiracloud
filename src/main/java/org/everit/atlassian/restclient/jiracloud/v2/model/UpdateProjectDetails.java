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
 * Details about the project.
 */
@ApiModel(description = "Details about the project.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-03T13:48:17.349+02:00[Europe/Prague]")
public class UpdateProjectDetails {
  @JsonProperty("key")
  private String key;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("lead")
  private String lead;

  @JsonProperty("leadAccountId")
  private String leadAccountId;

  @JsonProperty("url")
  private String url;

  /**
   * The default assignee when creating issues for this project.
   */
  public enum AssigneeTypeEnum {
    PROJECT_LEAD("PROJECT_LEAD"),
    
    UNASSIGNED("UNASSIGNED");

    private String value;

    AssigneeTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AssigneeTypeEnum fromValue(String value) {
      for (AssigneeTypeEnum b : AssigneeTypeEnum.values()) {
        if (b.value.equalsIgnoreCase(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("assigneeType")
  private AssigneeTypeEnum assigneeType;

  @JsonProperty("avatarId")
  private Long avatarId;

  @JsonProperty("issueSecurityScheme")
  private Long issueSecurityScheme;

  @JsonProperty("permissionScheme")
  private Long permissionScheme;

  @JsonProperty("notificationScheme")
  private Long notificationScheme;

  @JsonProperty("categoryId")
  private Long categoryId;

  public UpdateProjectDetails key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.
   * @return key
  **/
  @ApiModelProperty(value = "Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public UpdateProjectDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the project.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the project.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateProjectDetails description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A brief description of the project.
   * @return description
  **/
  @ApiModelProperty(value = "A brief description of the project.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateProjectDetails lead(String lead) {
    this.lead = lead;
    return this;
  }

   /**
   * This parameter is deprecated because of privacy changes. Use &#x60;leadAccountId&#x60; instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Cannot be provided with &#x60;leadAccountId&#x60;.
   * @return lead
  **/
  @ApiModelProperty(value = "This parameter is deprecated because of privacy changes. Use `leadAccountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Cannot be provided with `leadAccountId`.")
  public String getLead() {
    return lead;
  }

  public void setLead(String lead) {
    this.lead = lead;
  }

  public UpdateProjectDetails leadAccountId(String leadAccountId) {
    this.leadAccountId = leadAccountId;
    return this;
  }

   /**
   * The account ID of the project lead. Cannot be provided with &#x60;lead&#x60;.
   * @return leadAccountId
  **/
  @ApiModelProperty(value = "The account ID of the project lead. Cannot be provided with `lead`.")
  public String getLeadAccountId() {
    return leadAccountId;
  }

  public void setLeadAccountId(String leadAccountId) {
    this.leadAccountId = leadAccountId;
  }

  public UpdateProjectDetails url(String url) {
    this.url = url;
    return this;
  }

   /**
   * A link to information about this project, such as project documentation
   * @return url
  **/
  @ApiModelProperty(value = "A link to information about this project, such as project documentation")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public UpdateProjectDetails assigneeType(AssigneeTypeEnum assigneeType) {
    this.assigneeType = assigneeType;
    return this;
  }

   /**
   * The default assignee when creating issues for this project.
   * @return assigneeType
  **/
  @ApiModelProperty(value = "The default assignee when creating issues for this project.")
  public AssigneeTypeEnum getAssigneeType() {
    return assigneeType;
  }

  public void setAssigneeType(AssigneeTypeEnum assigneeType) {
    this.assigneeType = assigneeType;
  }

  public UpdateProjectDetails avatarId(Long avatarId) {
    this.avatarId = avatarId;
    return this;
  }

   /**
   * An integer value for the project&#39;s avatar.
   * @return avatarId
  **/
  @ApiModelProperty(value = "An integer value for the project's avatar.")
  public Long getAvatarId() {
    return avatarId;
  }

  public void setAvatarId(Long avatarId) {
    this.avatarId = avatarId;
  }

  public UpdateProjectDetails issueSecurityScheme(Long issueSecurityScheme) {
    this.issueSecurityScheme = issueSecurityScheme;
    return this;
  }

   /**
   * The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-2-issuesecurityschemes-get) resource to get all issue security scheme IDs.
   * @return issueSecurityScheme
  **/
  @ApiModelProperty(value = "The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-2-issuesecurityschemes-get) resource to get all issue security scheme IDs.")
  public Long getIssueSecurityScheme() {
    return issueSecurityScheme;
  }

  public void setIssueSecurityScheme(Long issueSecurityScheme) {
    this.issueSecurityScheme = issueSecurityScheme;
  }

  public UpdateProjectDetails permissionScheme(Long permissionScheme) {
    this.permissionScheme = permissionScheme;
    return this;
  }

   /**
   * The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-2-permissionscheme-get) resource to see a list of all permission scheme IDs.
   * @return permissionScheme
  **/
  @ApiModelProperty(value = "The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-2-permissionscheme-get) resource to see a list of all permission scheme IDs.")
  public Long getPermissionScheme() {
    return permissionScheme;
  }

  public void setPermissionScheme(Long permissionScheme) {
    this.permissionScheme = permissionScheme;
  }

  public UpdateProjectDetails notificationScheme(Long notificationScheme) {
    this.notificationScheme = notificationScheme;
    return this;
  }

   /**
   * The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-2-notificationscheme-get) resource to get a list of notification scheme IDs.
   * @return notificationScheme
  **/
  @ApiModelProperty(value = "The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-2-notificationscheme-get) resource to get a list of notification scheme IDs.")
  public Long getNotificationScheme() {
    return notificationScheme;
  }

  public void setNotificationScheme(Long notificationScheme) {
    this.notificationScheme = notificationScheme;
  }

  public UpdateProjectDetails categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * The ID of the project&#39;s category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-2-projectCategory-get) operation.
   * @return categoryId
  **/
  @ApiModelProperty(value = "The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-2-projectCategory-get) operation.")
  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateProjectDetails updateProjectDetails = (UpdateProjectDetails) o;
    return Objects.equals(this.key, updateProjectDetails.key) &&
        Objects.equals(this.name, updateProjectDetails.name) &&
        Objects.equals(this.description, updateProjectDetails.description) &&
        Objects.equals(this.lead, updateProjectDetails.lead) &&
        Objects.equals(this.leadAccountId, updateProjectDetails.leadAccountId) &&
        Objects.equals(this.url, updateProjectDetails.url) &&
        Objects.equals(this.assigneeType, updateProjectDetails.assigneeType) &&
        Objects.equals(this.avatarId, updateProjectDetails.avatarId) &&
        Objects.equals(this.issueSecurityScheme, updateProjectDetails.issueSecurityScheme) &&
        Objects.equals(this.permissionScheme, updateProjectDetails.permissionScheme) &&
        Objects.equals(this.notificationScheme, updateProjectDetails.notificationScheme) &&
        Objects.equals(this.categoryId, updateProjectDetails.categoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, description, lead, leadAccountId, url, assigneeType, avatarId, issueSecurityScheme, permissionScheme, notificationScheme, categoryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateProjectDetails {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lead: ").append(toIndentedString(lead)).append("\n");
    sb.append("    leadAccountId: ").append(toIndentedString(leadAccountId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    assigneeType: ").append(toIndentedString(assigneeType)).append("\n");
    sb.append("    avatarId: ").append(toIndentedString(avatarId)).append("\n");
    sb.append("    issueSecurityScheme: ").append(toIndentedString(issueSecurityScheme)).append("\n");
    sb.append("    permissionScheme: ").append(toIndentedString(permissionScheme)).append("\n");
    sb.append("    notificationScheme: ").append(toIndentedString(notificationScheme)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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

