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
import org.everit.atlassian.restclient.jiracloud.v3.model.UserPickerUser;

/**
 * The list of users found in a search, including header text (Showing X of Y matching users) and total of matched users.
 */
@ApiModel(description = "The list of users found in a search, including header text (Showing X of Y matching users) and total of matched users.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-03T13:48:26.928+02:00[Europe/Prague]")
public class FoundUsers {
  @JsonProperty("users")
  private List<UserPickerUser> users = new ArrayList<>();

  @JsonProperty("total")
  private Integer total;

  @JsonProperty("header")
  private String header;

  public FoundUsers users(List<UserPickerUser> users) {
    this.users = users;
    return this;
  }

  public FoundUsers addUsersItem(UserPickerUser usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(value = "")
  public List<UserPickerUser> getUsers() {
    return users;
  }

  public void setUsers(List<UserPickerUser> users) {
    this.users = users;
  }

  public FoundUsers total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * The total number of users found in the search.
   * @return total
  **/
  @ApiModelProperty(value = "The total number of users found in the search.")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public FoundUsers header(String header) {
    this.header = header;
    return this;
  }

   /**
   * Header text indicating the number of users in the response and the total number of users found in the search.
   * @return header
  **/
  @ApiModelProperty(value = "Header text indicating the number of users in the response and the total number of users found in the search.")
  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoundUsers foundUsers = (FoundUsers) o;
    return Objects.equals(this.users, foundUsers.users) &&
        Objects.equals(this.total, foundUsers.total) &&
        Objects.equals(this.header, foundUsers.header);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, total, header);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FoundUsers {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
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

