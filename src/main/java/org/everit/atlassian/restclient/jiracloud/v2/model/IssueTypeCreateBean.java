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
 * IssueTypeCreateBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-28T14:12:34.799+01:00[Europe/Prague]")
public class IssueTypeCreateBean {
  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  /**
   * Whether the issue type is &#x60;subtype&#x60; or &#x60;standard&#x60;. Defaults to &#x60;standard&#x60;.
   */
  public enum TypeEnum {
    SUBTASK("subtask"),
    
    STANDARD("standard");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equalsIgnoreCase(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  public IssueTypeCreateBean name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The unique name for the issue type. The maximum length is 60 characters.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The unique name for the issue type. The maximum length is 60 characters.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IssueTypeCreateBean description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the issue type.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the issue type.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IssueTypeCreateBean type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Whether the issue type is &#x60;subtype&#x60; or &#x60;standard&#x60;. Defaults to &#x60;standard&#x60;.
   * @return type
  **/
  @ApiModelProperty(value = "Whether the issue type is `subtype` or `standard`. Defaults to `standard`.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeCreateBean issueTypeCreateBean = (IssueTypeCreateBean) o;
    return Objects.equals(this.name, issueTypeCreateBean.name) &&
        Objects.equals(this.description, issueTypeCreateBean.description) &&
        Objects.equals(this.type, issueTypeCreateBean.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeCreateBean {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

