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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.client.model.IssuesMetaBean;
import org.openapitools.client.model.JiraExpressionsComplexityBean;

/**
 * JiraExpressionEvaluationMetaDataBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-30T01:56:21.684+02:00[Europe/Prague]")
public class JiraExpressionEvaluationMetaDataBean {
  @JsonProperty("complexity")
  private JiraExpressionsComplexityBean complexity;

  @JsonProperty("issues")
  private IssuesMetaBean issues;

  public JiraExpressionEvaluationMetaDataBean complexity(JiraExpressionsComplexityBean complexity) {
    this.complexity = complexity;
    return this;
  }

   /**
   * Contains information about the expression complexity. For example, the number of steps it took to evaluate the expression.
   * @return complexity
  **/
  @ApiModelProperty(value = "Contains information about the expression complexity. For example, the number of steps it took to evaluate the expression.")
  public JiraExpressionsComplexityBean getComplexity() {
    return complexity;
  }

  public void setComplexity(JiraExpressionsComplexityBean complexity) {
    this.complexity = complexity;
  }

  public JiraExpressionEvaluationMetaDataBean issues(IssuesMetaBean issues) {
    this.issues = issues;
    return this;
  }

   /**
   * Contains information about the &#x60;issues&#x60; variable in the context. For example, is the issues were loaded with JQL, information about the page will be included here.
   * @return issues
  **/
  @ApiModelProperty(value = "Contains information about the `issues` variable in the context. For example, is the issues were loaded with JQL, information about the page will be included here.")
  public IssuesMetaBean getIssues() {
    return issues;
  }

  public void setIssues(IssuesMetaBean issues) {
    this.issues = issues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionEvaluationMetaDataBean jiraExpressionEvaluationMetaDataBean = (JiraExpressionEvaluationMetaDataBean) o;
    return Objects.equals(this.complexity, jiraExpressionEvaluationMetaDataBean.complexity) &&
        Objects.equals(this.issues, jiraExpressionEvaluationMetaDataBean.issues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complexity, issues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionEvaluationMetaDataBean {\n");
    sb.append("    complexity: ").append(toIndentedString(complexity)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
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

