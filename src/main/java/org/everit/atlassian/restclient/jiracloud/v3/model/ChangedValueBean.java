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
 * Details of names changed in the record event.
 */
@ApiModel(description = "Details of names changed in the record event.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-28T14:12:40.546+01:00[Europe/Prague]")
public class ChangedValueBean {
  @JsonProperty("fieldName")
  private String fieldName;

  @JsonProperty("changedFrom")
  private String changedFrom;

  @JsonProperty("changedTo")
  private String changedTo;

   /**
   * The name of the field changed.
   * @return fieldName
  **/
  @ApiModelProperty(value = "The name of the field changed.")
  public String getFieldName() {
    return fieldName;
  }

   /**
   * The value of the field before the change.
   * @return changedFrom
  **/
  @ApiModelProperty(value = "The value of the field before the change.")
  public String getChangedFrom() {
    return changedFrom;
  }

   /**
   * The value of the field after the change.
   * @return changedTo
  **/
  @ApiModelProperty(value = "The value of the field after the change.")
  public String getChangedTo() {
    return changedTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangedValueBean changedValueBean = (ChangedValueBean) o;
    return Objects.equals(this.fieldName, changedValueBean.fieldName) &&
        Objects.equals(this.changedFrom, changedValueBean.changedFrom) &&
        Objects.equals(this.changedTo, changedValueBean.changedTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, changedFrom, changedTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangedValueBean {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    changedFrom: ").append(toIndentedString(changedFrom)).append("\n");
    sb.append("    changedTo: ").append(toIndentedString(changedTo)).append("\n");
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

