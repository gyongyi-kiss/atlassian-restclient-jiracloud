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

/**
 * A custom field and its new value with a list of issue to update.
 */
@ApiModel(description = "A custom field and its new value with a list of issue to update.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-13T15:26:43.813+01:00[Europe/Prague]")
public class MultipleCustomFieldValuesUpdate {
  @JsonProperty("customField")
  private String customField;

  @JsonProperty("issueIds")
  private List<Long> issueIds = new ArrayList<>();

  @JsonProperty("value")
  private Object value = null;

  public MultipleCustomFieldValuesUpdate customField(String customField) {
    this.customField = customField;
    return this;
  }

   /**
   * The ID or key of the custom field. For example, &#x60;customfield_10010&#x60;.
   * @return customField
  **/
  @ApiModelProperty(required = true, value = "The ID or key of the custom field. For example, `customfield_10010`.")
  public String getCustomField() {
    return customField;
  }

  public void setCustomField(String customField) {
    this.customField = customField;
  }

  public MultipleCustomFieldValuesUpdate issueIds(List<Long> issueIds) {
    this.issueIds = issueIds;
    return this;
  }

  public MultipleCustomFieldValuesUpdate addIssueIdsItem(Long issueIdsItem) {
    this.issueIds.add(issueIdsItem);
    return this;
  }

   /**
   * The list of issue IDs.
   * @return issueIds
  **/
  @ApiModelProperty(required = true, value = "The list of issue IDs.")
  public List<Long> getIssueIds() {
    return issueIds;
  }

  public void setIssueIds(List<Long> issueIds) {
    this.issueIds = issueIds;
  }

  public MultipleCustomFieldValuesUpdate value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * The value for the custom field. The value must be compatible with the [custom field type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/#data-types) as follows:   *  &#x60;string&#x60; the value must be a string.  *  &#x60;number&#x60; the value must be a number.  *  &#x60;datetime&#x60; the value must be a string that represents a date in the ISO format or the simplified extended ISO format. For example, &#x60;\&quot;2023-01-18T12:00:00-03:00\&quot;&#x60; or &#x60;\&quot;2023-01-18T12:00:00.000Z\&quot;&#x60;. However, the milliseconds part is ignored.  *  &#x60;user&#x60; the value must be an object that contains the &#x60;accountId&#x60; field.  *  &#x60;group&#x60; the value must be an object that contains the group &#x60;name&#x60; or &#x60;groupId&#x60; field. Because group names can change, we recommend using &#x60;groupId&#x60;.  A list of appropriate values must be provided if the field is of the &#x60;list&#x60; [collection type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/#collection-types).
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The value for the custom field. The value must be compatible with the [custom field type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/#data-types) as follows:   *  `string` the value must be a string.  *  `number` the value must be a number.  *  `datetime` the value must be a string that represents a date in the ISO format or the simplified extended ISO format. For example, `\"2023-01-18T12:00:00-03:00\"` or `\"2023-01-18T12:00:00.000Z\"`. However, the milliseconds part is ignored.  *  `user` the value must be an object that contains the `accountId` field.  *  `group` the value must be an object that contains the group `name` or `groupId` field. Because group names can change, we recommend using `groupId`.  A list of appropriate values must be provided if the field is of the `list` [collection type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/#collection-types).")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipleCustomFieldValuesUpdate multipleCustomFieldValuesUpdate = (MultipleCustomFieldValuesUpdate) o;
    return Objects.equals(this.customField, multipleCustomFieldValuesUpdate.customField) &&
        Objects.equals(this.issueIds, multipleCustomFieldValuesUpdate.issueIds) &&
        Objects.equals(this.value, multipleCustomFieldValuesUpdate.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customField, issueIds, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipleCustomFieldValuesUpdate {\n");
    
    sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
    sb.append("    issueIds: ").append(toIndentedString(issueIds)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
