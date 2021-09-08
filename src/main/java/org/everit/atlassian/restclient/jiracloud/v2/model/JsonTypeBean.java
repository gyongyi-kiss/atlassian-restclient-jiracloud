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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The schema of a field.
 */
@ApiModel(description = "The schema of a field.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-03T13:48:17.349+02:00[Europe/Prague]")
public class JsonTypeBean {
  @JsonProperty("type")
  private String type;

  @JsonProperty("items")
  private String items;

  @JsonProperty("system")
  private String system;

  @JsonProperty("custom")
  private String custom;

  @JsonProperty("customId")
  private Long customId;

  @JsonProperty("configuration")
  private Map<String, Object> _configuration = new HashMap<>();

   /**
   * The data type of the field.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The data type of the field.")
  public String getType() {
    return type;
  }

   /**
   * When the data type is an array, the name of the field items within the array.
   * @return items
  **/
  @ApiModelProperty(value = "When the data type is an array, the name of the field items within the array.")
  public String getItems() {
    return items;
  }

   /**
   * If the field is a system field, the name of the field.
   * @return system
  **/
  @ApiModelProperty(value = "If the field is a system field, the name of the field.")
  public String getSystem() {
    return system;
  }

   /**
   * If the field is a custom field, the URI of the field.
   * @return custom
  **/
  @ApiModelProperty(value = "If the field is a custom field, the URI of the field.")
  public String getCustom() {
    return custom;
  }

   /**
   * If the field is a custom field, the custom ID of the field.
   * @return customId
  **/
  @ApiModelProperty(value = "If the field is a custom field, the custom ID of the field.")
  public Long getCustomId() {
    return customId;
  }

   /**
   * If the field is a custom field, the configuration of the field.
   * @return _configuration
  **/
  @ApiModelProperty(value = "If the field is a custom field, the configuration of the field.")
  public Map<String, Object> getConfiguration() {
    return _configuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonTypeBean jsonTypeBean = (JsonTypeBean) o;
    return Objects.equals(this.type, jsonTypeBean.type) &&
        Objects.equals(this.items, jsonTypeBean.items) &&
        Objects.equals(this.system, jsonTypeBean.system) &&
        Objects.equals(this.custom, jsonTypeBean.custom) &&
        Objects.equals(this.customId, jsonTypeBean.customId) &&
        Objects.equals(this._configuration, jsonTypeBean._configuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, items, system, custom, customId, _configuration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonTypeBean {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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

