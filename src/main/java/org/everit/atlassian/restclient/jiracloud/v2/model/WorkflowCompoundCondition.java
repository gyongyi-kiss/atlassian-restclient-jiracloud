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

/**
 * A compound workflow transition rule condition. This object returns &#x60;nodeType&#x60; as &#x60;compound&#x60;.
 */
@ApiModel(description = "A compound workflow transition rule condition. This object returns `nodeType` as `compound`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-03T13:48:17.349+02:00[Europe/Prague]")
public class WorkflowCompoundCondition {
  /**
   * The compound condition operator.
   */
  public enum OperatorEnum {
    AND("AND"),
    
    OR("OR");

    private String value;

    OperatorEnum(String value) {
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
    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equalsIgnoreCase(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("operator")
  private OperatorEnum operator;

  @JsonProperty("conditions")
  private List<Object> conditions = new ArrayList<>();

  @JsonProperty("nodeType")
  private String nodeType;

  public WorkflowCompoundCondition operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * The compound condition operator.
   * @return operator
  **/
  @ApiModelProperty(required = true, value = "The compound condition operator.")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public WorkflowCompoundCondition conditions(List<Object> conditions) {
    this.conditions = conditions;
    return this;
  }

  public WorkflowCompoundCondition addConditionsItem(Object conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * The list of workflow conditions.
   * @return conditions
  **/
  @ApiModelProperty(required = true, value = "The list of workflow conditions.")
  public List<Object> getConditions() {
    return conditions;
  }

  public void setConditions(List<Object> conditions) {
    this.conditions = conditions;
  }

  public WorkflowCompoundCondition nodeType(String nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowCompoundCondition workflowCompoundCondition = (WorkflowCompoundCondition) o;
    return Objects.equals(this.operator, workflowCompoundCondition.operator) &&
        Objects.equals(this.conditions, workflowCompoundCondition.conditions) &&
        Objects.equals(this.nodeType, workflowCompoundCondition.nodeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, conditions, nodeType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowCompoundCondition {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
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

