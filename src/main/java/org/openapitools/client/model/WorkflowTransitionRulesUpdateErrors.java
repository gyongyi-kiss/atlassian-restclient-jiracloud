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
import org.openapitools.client.model.WorkflowTransitionRulesUpdateErrorDetails;

/**
 * Details of any errors encountered while updating workflow transition rules.
 */
@ApiModel(description = "Details of any errors encountered while updating workflow transition rules.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-07T22:31:05.639+02:00[Europe/Prague]")
public class WorkflowTransitionRulesUpdateErrors {
/* xxxxxxxxxxxxx , , ,  */
  @JsonProperty("updateResults")
  private List<WorkflowTransitionRulesUpdateErrorDetails> updateResults = new ArrayList<>();

  public WorkflowTransitionRulesUpdateErrors updateResults(List<WorkflowTransitionRulesUpdateErrorDetails> updateResults) {
    this.updateResults = updateResults;
    return this;
  }

  public WorkflowTransitionRulesUpdateErrors addUpdateResultsItem(WorkflowTransitionRulesUpdateErrorDetails updateResultsItem) {
    this.updateResults.add(updateResultsItem);
    return this;
  }

   /**
   * A list of workflows.
   * @return updateResults
  **/
  @ApiModelProperty(required = true, value = "A list of workflows.")
  public List<WorkflowTransitionRulesUpdateErrorDetails> getUpdateResults() {
    return updateResults;
  }

  public void setUpdateResults(List<WorkflowTransitionRulesUpdateErrorDetails> updateResults) {
    this.updateResults = updateResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowTransitionRulesUpdateErrors workflowTransitionRulesUpdateErrors = (WorkflowTransitionRulesUpdateErrors) o;
    return Objects.equals(this.updateResults, workflowTransitionRulesUpdateErrors.updateResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowTransitionRulesUpdateErrors {\n");
    sb.append("    updateResults: ").append(toIndentedString(updateResults)).append("\n");
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

