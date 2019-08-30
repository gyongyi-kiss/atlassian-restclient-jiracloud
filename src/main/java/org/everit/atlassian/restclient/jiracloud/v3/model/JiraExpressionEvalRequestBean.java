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
import org.everit.atlassian.restclient.jiracloud.v3.model.JiraExpressionEvalContextBean;

/**
 * JiraExpressionEvalRequestBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-30T02:22:14.429+02:00[Europe/Prague]")
public class JiraExpressionEvalRequestBean {
  @JsonProperty("expression")
  private String expression;

  @JsonProperty("context")
  private JiraExpressionEvalContextBean context;

  public JiraExpressionEvalRequestBean expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * The Jira expression to evaluate.
   * @return expression
  **/
  @ApiModelProperty(example = "{ key: issue.key, type: issue.issueType.name, links: issue.links.map(link => link.linkedIssue.id) }", required = true, value = "The Jira expression to evaluate.")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public JiraExpressionEvalRequestBean context(JiraExpressionEvalContextBean context) {
    this.context = context;
    return this;
  }

   /**
   * The context in which the Jira expression is evaluated.
   * @return context
  **/
  @ApiModelProperty(value = "The context in which the Jira expression is evaluated.")
  public JiraExpressionEvalContextBean getContext() {
    return context;
  }

  public void setContext(JiraExpressionEvalContextBean context) {
    this.context = context;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionEvalRequestBean jiraExpressionEvalRequestBean = (JiraExpressionEvalRequestBean) o;
    return Objects.equals(this.expression, jiraExpressionEvalRequestBean.expression) &&
        Objects.equals(this.context, jiraExpressionEvalRequestBean.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression, context);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionEvalRequestBean {\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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
