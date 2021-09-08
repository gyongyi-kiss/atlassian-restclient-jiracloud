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
import org.everit.atlassian.restclient.jiracloud.v2.model.ConnectCustomFieldValue;

/**
 * Details of updates for a custom field.
 */
@ApiModel(description = "Details of updates for a custom field.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-03T13:48:17.349+02:00[Europe/Prague]")
public class ConnectCustomFieldValues {
  @JsonProperty("updateValueList")
  private List<ConnectCustomFieldValue> updateValueList = new ArrayList<>();

  public ConnectCustomFieldValues updateValueList(List<ConnectCustomFieldValue> updateValueList) {
    this.updateValueList = updateValueList;
    return this;
  }

  public ConnectCustomFieldValues addUpdateValueListItem(ConnectCustomFieldValue updateValueListItem) {
    if (this.updateValueList == null) {
      this.updateValueList = new ArrayList<>();
    }
    this.updateValueList.add(updateValueListItem);
    return this;
  }

   /**
   * The list of custom field update details.
   * @return updateValueList
  **/
  @ApiModelProperty(value = "The list of custom field update details.")
  public List<ConnectCustomFieldValue> getUpdateValueList() {
    return updateValueList;
  }

  public void setUpdateValueList(List<ConnectCustomFieldValue> updateValueList) {
    this.updateValueList = updateValueList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectCustomFieldValues connectCustomFieldValues = (ConnectCustomFieldValues) o;
    return Objects.equals(this.updateValueList, connectCustomFieldValues.updateValueList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateValueList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectCustomFieldValues {\n");
    
    sb.append("    updateValueList: ").append(toIndentedString(updateValueList)).append("\n");
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

