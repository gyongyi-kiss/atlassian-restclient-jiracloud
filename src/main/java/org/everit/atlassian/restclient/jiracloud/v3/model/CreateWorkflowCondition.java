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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A workflow transition condition.
 */
@ApiModel(description = "A workflow transition condition.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-03T13:48:26.928+02:00[Europe/Prague]")
public class CreateWorkflowCondition {
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
  private List<CreateWorkflowCondition> conditions = new ArrayList<>();

  @JsonProperty("type")
  private String type;

  @JsonProperty("configuration")
  private Map<String, Object> _configuration = new HashMap<>();

  public CreateWorkflowCondition operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * The compound condition operator.
   * @return operator
  **/
  @ApiModelProperty(value = "The compound condition operator.")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public CreateWorkflowCondition conditions(List<CreateWorkflowCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public CreateWorkflowCondition addConditionsItem(CreateWorkflowCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * The list of workflow conditions.
   * @return conditions
  **/
  @ApiModelProperty(value = "The list of workflow conditions.")
  public List<CreateWorkflowCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<CreateWorkflowCondition> conditions) {
    this.conditions = conditions;
  }

  public CreateWorkflowCondition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the transition rule.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the transition rule.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CreateWorkflowCondition _configuration(Map<String, Object> _configuration) {
    this._configuration = _configuration;
    return this;
  }

  public CreateWorkflowCondition putConfigurationItem(String key, Object _configurationItem) {
    if (this._configuration == null) {
      this._configuration = new HashMap<>();
    }
    this._configuration.put(key, _configurationItem);
    return this;
  }

   /**
   * EXPERIMENTAL. The configuration of the transition rule.
   * @return _configuration
  **/
  @ApiModelProperty(value = "EXPERIMENTAL. The configuration of the transition rule.")
  public Map<String, Object> getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(Map<String, Object> _configuration) {
    this._configuration = _configuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWorkflowCondition createWorkflowCondition = (CreateWorkflowCondition) o;
    return Objects.equals(this.operator, createWorkflowCondition.operator) &&
        Objects.equals(this.conditions, createWorkflowCondition.conditions) &&
        Objects.equals(this.type, createWorkflowCondition.type) &&
        Objects.equals(this._configuration, createWorkflowCondition._configuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, conditions, type, _configuration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkflowCondition {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

