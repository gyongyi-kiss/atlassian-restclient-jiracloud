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

/**
 * Details about a project type.
 */
@ApiModel(description = "Details about a project type.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-01T13:57:05.408+02:00[Europe/Prague]")
public class ProjectType {
  @JsonProperty("key")
  private String key;

  @JsonProperty("formattedKey")
  private String formattedKey;

  @JsonProperty("descriptionI18nKey")
  private String descriptionI18nKey;

  @JsonProperty("icon")
  private String icon;

  @JsonProperty("color")
  private String color;

   /**
   * The key of the project type.
   * @return key
  **/
  @ApiModelProperty(value = "The key of the project type.")
  public String getKey() {
    return key;
  }

   /**
   * The formatted key of the project type.
   * @return formattedKey
  **/
  @ApiModelProperty(value = "The formatted key of the project type.")
  public String getFormattedKey() {
    return formattedKey;
  }

   /**
   * The key of the project type&#39;s description.
   * @return descriptionI18nKey
  **/
  @ApiModelProperty(value = "The key of the project type's description.")
  public String getDescriptionI18nKey() {
    return descriptionI18nKey;
  }

   /**
   * The icon of the project type.
   * @return icon
  **/
  @ApiModelProperty(value = "The icon of the project type.")
  public String getIcon() {
    return icon;
  }

   /**
   * The color of the project type.
   * @return color
  **/
  @ApiModelProperty(value = "The color of the project type.")
  public String getColor() {
    return color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectType projectType = (ProjectType) o;
    return Objects.equals(this.key, projectType.key) &&
        Objects.equals(this.formattedKey, projectType.formattedKey) &&
        Objects.equals(this.descriptionI18nKey, projectType.descriptionI18nKey) &&
        Objects.equals(this.icon, projectType.icon) &&
        Objects.equals(this.color, projectType.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, formattedKey, descriptionI18nKey, icon, color);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectType {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    formattedKey: ").append(toIndentedString(formattedKey)).append("\n");
    sb.append("    descriptionI18nKey: ").append(toIndentedString(descriptionI18nKey)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

