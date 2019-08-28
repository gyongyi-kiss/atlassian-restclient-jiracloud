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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.WorkflowTransitionRules;

/**
 * Details about a workflow configuration update request.
 */
@ApiModel(description = "Details about a workflow configuration update request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-07T22:31:05.639+02:00[Europe/Prague]")
public class WorkflowTransitionRulesUpdate {
/* xxxxxxxxxxxxx , , ,  */
  @JsonProperty("workflows")
  private List<WorkflowTransitionRules> workflows = new ArrayList<>();

  public WorkflowTransitionRulesUpdate workflows(List<WorkflowTransitionRules> workflows) {
    this.workflows = workflows;
    return this;
  }

  public WorkflowTransitionRulesUpdate addWorkflowsItem(WorkflowTransitionRules workflowsItem) {
    if (this.workflows == null) {
      this.workflows = new ArrayList<>();
    }
    this.workflows.add(workflowsItem);
    return this;
  }

   /**
   * The list of workflows with transition rules to update.
   * @return workflows
  **/
  @ApiModelProperty(value = "The list of workflows with transition rules to update.")
  public List<WorkflowTransitionRules> getWorkflows() {
    return workflows;
  }

  public void setWorkflows(List<WorkflowTransitionRules> workflows) {
    this.workflows = workflows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowTransitionRulesUpdate workflowTransitionRulesUpdate = (WorkflowTransitionRulesUpdate) o;
    return Objects.equals(this.workflows, workflowTransitionRulesUpdate.workflows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflows);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowTransitionRulesUpdate {\n");
    sb.append("    workflows: ").append(toIndentedString(workflows)).append("\n");
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

