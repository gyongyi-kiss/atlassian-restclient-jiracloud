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
import org.everit.atlassian.restclient.jiracloud.v2.model.JiraExpressionsComplexityValueBean;

/**
 * JiraExpressionsComplexityBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-28T14:12:34.799+01:00[Europe/Prague]")
public class JiraExpressionsComplexityBean {
  @JsonProperty("steps")
  private JiraExpressionsComplexityValueBean steps;

  @JsonProperty("expensiveOperations")
  private JiraExpressionsComplexityValueBean expensiveOperations;

  @JsonProperty("beans")
  private JiraExpressionsComplexityValueBean beans;

  @JsonProperty("primitiveValues")
  private JiraExpressionsComplexityValueBean primitiveValues;

  public JiraExpressionsComplexityBean steps(JiraExpressionsComplexityValueBean steps) {
    this.steps = steps;
    return this;
  }

   /**
   * The number of steps it took to evaluate the expression, where a step is a high-level operation performed by the expression. A step is an operation such as arithmetic, accessing a property, accessing a context variable, or calling a function.
   * @return steps
  **/
  @ApiModelProperty(value = "The number of steps it took to evaluate the expression, where a step is a high-level operation performed by the expression. A step is an operation such as arithmetic, accessing a property, accessing a context variable, or calling a function.")
  public JiraExpressionsComplexityValueBean getSteps() {
    return steps;
  }

  public void setSteps(JiraExpressionsComplexityValueBean steps) {
    this.steps = steps;
  }

  public JiraExpressionsComplexityBean expensiveOperations(JiraExpressionsComplexityValueBean expensiveOperations) {
    this.expensiveOperations = expensiveOperations;
    return this;
  }

   /**
   * The number of expensive operations executed while evaluating the expression. Expensive operations are those that load additional data, such as entity properties, comments, or custom fields.
   * @return expensiveOperations
  **/
  @ApiModelProperty(value = "The number of expensive operations executed while evaluating the expression. Expensive operations are those that load additional data, such as entity properties, comments, or custom fields.")
  public JiraExpressionsComplexityValueBean getExpensiveOperations() {
    return expensiveOperations;
  }

  public void setExpensiveOperations(JiraExpressionsComplexityValueBean expensiveOperations) {
    this.expensiveOperations = expensiveOperations;
  }

  public JiraExpressionsComplexityBean beans(JiraExpressionsComplexityValueBean beans) {
    this.beans = beans;
    return this;
  }

   /**
   * The number of Jira REST API beans returned in the response.
   * @return beans
  **/
  @ApiModelProperty(value = "The number of Jira REST API beans returned in the response.")
  public JiraExpressionsComplexityValueBean getBeans() {
    return beans;
  }

  public void setBeans(JiraExpressionsComplexityValueBean beans) {
    this.beans = beans;
  }

  public JiraExpressionsComplexityBean primitiveValues(JiraExpressionsComplexityValueBean primitiveValues) {
    this.primitiveValues = primitiveValues;
    return this;
  }

   /**
   * The number of primitive values returned in the response.
   * @return primitiveValues
  **/
  @ApiModelProperty(value = "The number of primitive values returned in the response.")
  public JiraExpressionsComplexityValueBean getPrimitiveValues() {
    return primitiveValues;
  }

  public void setPrimitiveValues(JiraExpressionsComplexityValueBean primitiveValues) {
    this.primitiveValues = primitiveValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionsComplexityBean jiraExpressionsComplexityBean = (JiraExpressionsComplexityBean) o;
    return Objects.equals(this.steps, jiraExpressionsComplexityBean.steps) &&
        Objects.equals(this.expensiveOperations, jiraExpressionsComplexityBean.expensiveOperations) &&
        Objects.equals(this.beans, jiraExpressionsComplexityBean.beans) &&
        Objects.equals(this.primitiveValues, jiraExpressionsComplexityBean.primitiveValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(steps, expensiveOperations, beans, primitiveValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionsComplexityBean {\n");
    
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    expensiveOperations: ").append(toIndentedString(expensiveOperations)).append("\n");
    sb.append("    beans: ").append(toIndentedString(beans)).append("\n");
    sb.append("    primitiveValues: ").append(toIndentedString(primitiveValues)).append("\n");
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

