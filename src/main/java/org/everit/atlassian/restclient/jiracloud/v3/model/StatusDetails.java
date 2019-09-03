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
import java.util.HashMap;
import java.util.Map;
import org.everit.atlassian.restclient.jiracloud.v3.model.StatusCategory;

/**
 * A status.
 */
@ApiModel(description = "A status.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-01T13:57:05.408+02:00[Europe/Prague]")
public class StatusDetails {
  @JsonProperty("self")
  private String self;

  @JsonProperty("description")
  private String description;

  @JsonProperty("iconUrl")
  private String iconUrl;

  @JsonProperty("name")
  private String name;

  @JsonProperty("id")
  private String id;

  @JsonProperty("statusCategory")
  private StatusCategory statusCategory;

  private HashMap<String, Object> additionalProperties_ = new HashMap<String, Object>();

   /**
   * The URL of the status.
   * @return self
  **/
  @ApiModelProperty(value = "The URL of the status.")
  public String getSelf() {
    return self;
  }

   /**
   * The description of the status.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the status.")
  public String getDescription() {
    return description;
  }

   /**
   * The URL of the icon used to represent the status.
   * @return iconUrl
  **/
  @ApiModelProperty(value = "The URL of the icon used to represent the status.")
  public String getIconUrl() {
    return iconUrl;
  }

   /**
   * The name of the status.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the status.")
  public String getName() {
    return name;
  }

   /**
   * The ID of the status.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the status.")
  public String getId() {
    return id;
  }

   /**
   * The category assigned to the status.
   * @return statusCategory
  **/
  @ApiModelProperty(value = "The category assigned to the status.")
  public StatusCategory getStatusCategory() {
    return statusCategory;
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
    StatusDetails statusDetails = (StatusDetails) o;
    return Objects.equals(this.self, statusDetails.self) &&
        Objects.equals(this.description, statusDetails.description) &&
        Objects.equals(this.iconUrl, statusDetails.iconUrl) &&
        Objects.equals(this.name, statusDetails.name) &&
        Objects.equals(this.id, statusDetails.id) &&
        Objects.equals(this.statusCategory, statusDetails.statusCategory) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, description, iconUrl, name, id, statusCategory, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusDetails {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    statusCategory: ").append(toIndentedString(statusCategory)).append("\n");
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

