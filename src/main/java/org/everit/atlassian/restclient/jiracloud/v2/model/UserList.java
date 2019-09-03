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
import org.everit.atlassian.restclient.jiracloud.v2.model.User;

/**
 * A paginated list of users sharing the filter. This includes users that are members of the groups or can browse the projects that the filter is shared with.
 */
@ApiModel(description = "A paginated list of users sharing the filter. This includes users that are members of the groups or can browse the projects that the filter is shared with.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-01T13:56:58.037+02:00[Europe/Prague]")
public class UserList {
  @JsonProperty("size")
  private Integer size;

  @JsonProperty("items")
  private List<User> items = new ArrayList<>();

  @JsonProperty("max-results")
  private Integer maxResults;

  @JsonProperty("start-index")
  private Integer startIndex;

  @JsonProperty("end-index")
  private Integer endIndex;

   /**
   * The number of items on the page.
   * @return size
  **/
  @ApiModelProperty(value = "The number of items on the page.")
  public Integer getSize() {
    return size;
  }

   /**
   * The list of items.
   * @return items
  **/
  @ApiModelProperty(value = "The list of items.")
  public List<User> getItems() {
    return items;
  }

   /**
   * The maximum number of results that could be on the page.
   * @return maxResults
  **/
  @ApiModelProperty(value = "The maximum number of results that could be on the page.")
  public Integer getMaxResults() {
    return maxResults;
  }

   /**
   * The index of the first item returned on the page.
   * @return startIndex
  **/
  @ApiModelProperty(value = "The index of the first item returned on the page.")
  public Integer getStartIndex() {
    return startIndex;
  }

   /**
   * The index of the last item returned on the page.
   * @return endIndex
  **/
  @ApiModelProperty(value = "The index of the last item returned on the page.")
  public Integer getEndIndex() {
    return endIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserList userList = (UserList) o;
    return Objects.equals(this.size, userList.size) &&
        Objects.equals(this.items, userList.items) &&
        Objects.equals(this.maxResults, userList.maxResults) &&
        Objects.equals(this.startIndex, userList.startIndex) &&
        Objects.equals(this.endIndex, userList.endIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, items, maxResults, startIndex, endIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserList {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
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

