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
 * Details of the scope of the default sharing for new filters and dashboards.
 */
@ApiModel(description = "Details of the scope of the default sharing for new filters and dashboards.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-28T14:12:40.546+01:00[Europe/Prague]")
public class DefaultShareScope {
  /**
   * The scope of the default sharing for new filters and dashboards:   *  &#x60;AUTHENTICATED&#x60; Shared with all logged-in users.  *  &#x60;GLOBAL&#x60; Shared with all logged-in users. This shows as &#x60;AUTHENTICATED&#x60; in the response.  *  &#x60;PRIVATE&#x60; Not shared with any users.
   */
  public enum ScopeEnum {
    GLOBAL("GLOBAL"),
    
    AUTHENTICATED("AUTHENTICATED"),
    
    PRIVATE("PRIVATE");

    private String value;

    ScopeEnum(String value) {
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
    public static ScopeEnum fromValue(String value) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equalsIgnoreCase(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("scope")
  private ScopeEnum scope;

  public DefaultShareScope scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the default sharing for new filters and dashboards:   *  &#x60;AUTHENTICATED&#x60; Shared with all logged-in users.  *  &#x60;GLOBAL&#x60; Shared with all logged-in users. This shows as &#x60;AUTHENTICATED&#x60; in the response.  *  &#x60;PRIVATE&#x60; Not shared with any users.
   * @return scope
  **/
  @ApiModelProperty(required = true, value = "The scope of the default sharing for new filters and dashboards:   *  `AUTHENTICATED` Shared with all logged-in users.  *  `GLOBAL` Shared with all logged-in users. This shows as `AUTHENTICATED` in the response.  *  `PRIVATE` Not shared with any users.")
  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultShareScope defaultShareScope = (DefaultShareScope) o;
    return Objects.equals(this.scope, defaultShareScope.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultShareScope {\n");
    
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

