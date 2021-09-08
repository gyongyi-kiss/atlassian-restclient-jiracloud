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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.everit.atlassian.restclient.jiracloud.v3.model.ChangeDetails;
import org.everit.atlassian.restclient.jiracloud.v3.model.HistoryMetadata;
import org.everit.atlassian.restclient.jiracloud.v3.model.UserDetails;

/**
 * A changelog.
 */
@ApiModel(description = "A changelog.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-03T13:48:26.928+02:00[Europe/Prague]")
public class Changelog {
  @JsonProperty("id")
  private String id;

  @JsonProperty("author")
  private UserDetails author;

  @JsonProperty("created")
  private OffsetDateTime created;

  @JsonProperty("items")
  private List<ChangeDetails> items = new ArrayList<>();

  @JsonProperty("historyMetadata")
  private HistoryMetadata historyMetadata;

   /**
   * The ID of the changelog.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the changelog.")
  public String getId() {
    return id;
  }

   /**
   * The user who made the change.
   * @return author
  **/
  @ApiModelProperty(value = "The user who made the change.")
  public UserDetails getAuthor() {
    return author;
  }

   /**
   * The date on which the change took place.
   * @return created
  **/
  @ApiModelProperty(value = "The date on which the change took place.")
  public OffsetDateTime getCreated() {
    return created;
  }

   /**
   * The list of items changed.
   * @return items
  **/
  @ApiModelProperty(value = "The list of items changed.")
  public List<ChangeDetails> getItems() {
    return items;
  }

   /**
   * The history metadata associated with the changed.
   * @return historyMetadata
  **/
  @ApiModelProperty(value = "The history metadata associated with the changed.")
  public HistoryMetadata getHistoryMetadata() {
    return historyMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Changelog changelog = (Changelog) o;
    return Objects.equals(this.id, changelog.id) &&
        Objects.equals(this.author, changelog.author) &&
        Objects.equals(this.created, changelog.created) &&
        Objects.equals(this.items, changelog.items) &&
        Objects.equals(this.historyMetadata, changelog.historyMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, author, created, items, historyMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Changelog {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    historyMetadata: ").append(toIndentedString(historyMetadata)).append("\n");
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

