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
import java.util.ArrayList;
import java.util.List;
import org.everit.atlassian.restclient.jiracloud.v3.model.AvatarUrlsBean;
import org.everit.atlassian.restclient.jiracloud.v3.model.IssueTypeIssueCreateMetadata;

/**
 * Details of the issue creation metadata for a project.
 */
@ApiModel(description = "Details of the issue creation metadata for a project.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-28T14:12:40.546+01:00[Europe/Prague]")
public class ProjectIssueCreateMetadata {
  @JsonProperty("expand")
  private String expand;

  @JsonProperty("self")
  private String self;

  @JsonProperty("id")
  private String id;

  @JsonProperty("key")
  private String key;

  @JsonProperty("name")
  private String name;

  @JsonProperty("avatarUrls")
  private AvatarUrlsBean avatarUrls;

  @JsonProperty("issuetypes")
  private List<IssueTypeIssueCreateMetadata> issuetypes = new ArrayList<>();

   /**
   * Expand options that include additional project issue create metadata details in the response.
   * @return expand
  **/
  @ApiModelProperty(value = "Expand options that include additional project issue create metadata details in the response.")
  public String getExpand() {
    return expand;
  }

   /**
   * The URL of the project.
   * @return self
  **/
  @ApiModelProperty(value = "The URL of the project.")
  public String getSelf() {
    return self;
  }

   /**
   * The ID of the project.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the project.")
  public String getId() {
    return id;
  }

   /**
   * The key of the project.
   * @return key
  **/
  @ApiModelProperty(value = "The key of the project.")
  public String getKey() {
    return key;
  }

   /**
   * The name of the project.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the project.")
  public String getName() {
    return name;
  }

   /**
   * List of the project&#39;s avatars, returning the avatar size and associated URL.
   * @return avatarUrls
  **/
  @ApiModelProperty(value = "List of the project's avatars, returning the avatar size and associated URL.")
  public AvatarUrlsBean getAvatarUrls() {
    return avatarUrls;
  }

   /**
   * List of the issue types supported by the project.
   * @return issuetypes
  **/
  @ApiModelProperty(value = "List of the issue types supported by the project.")
  public List<IssueTypeIssueCreateMetadata> getIssuetypes() {
    return issuetypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectIssueCreateMetadata projectIssueCreateMetadata = (ProjectIssueCreateMetadata) o;
    return Objects.equals(this.expand, projectIssueCreateMetadata.expand) &&
        Objects.equals(this.self, projectIssueCreateMetadata.self) &&
        Objects.equals(this.id, projectIssueCreateMetadata.id) &&
        Objects.equals(this.key, projectIssueCreateMetadata.key) &&
        Objects.equals(this.name, projectIssueCreateMetadata.name) &&
        Objects.equals(this.avatarUrls, projectIssueCreateMetadata.avatarUrls) &&
        Objects.equals(this.issuetypes, projectIssueCreateMetadata.issuetypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, self, id, key, name, avatarUrls, issuetypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectIssueCreateMetadata {\n");
    
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    issuetypes: ").append(toIndentedString(issuetypes)).append("\n");
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

