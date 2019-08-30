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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.client.model.FoundGroups;
import org.openapitools.client.model.FoundUsers;

/**
 * List of users and groups found in a search.
 */
@ApiModel(description = "List of users and groups found in a search.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-30T01:56:21.684+02:00[Europe/Prague]")
public class FoundUsersAndGroups {
  @JsonProperty("users")
  private FoundUsers users;

  @JsonProperty("groups")
  private FoundGroups groups;

  public FoundUsersAndGroups users(FoundUsers users) {
    this.users = users;
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(value = "")
  public FoundUsers getUsers() {
    return users;
  }

  public void setUsers(FoundUsers users) {
    this.users = users;
  }

  public FoundUsersAndGroups groups(FoundGroups groups) {
    this.groups = groups;
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(value = "")
  public FoundGroups getGroups() {
    return groups;
  }

  public void setGroups(FoundGroups groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoundUsersAndGroups foundUsersAndGroups = (FoundUsersAndGroups) o;
    return Objects.equals(this.users, foundUsersAndGroups.users) &&
        Objects.equals(this.groups, foundUsersAndGroups.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, groups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FoundUsersAndGroups {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

