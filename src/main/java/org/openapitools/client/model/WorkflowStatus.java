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
import org.openapitools.client.model.WorkflowStatusProperties;

/**
 * Details of a workflow status.
 */
@ApiModel(description = "Details of a workflow status.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-30T01:56:21.684+02:00[Europe/Prague]")
public class WorkflowStatus {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("properties")
  private WorkflowStatusProperties properties;

  public WorkflowStatus id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the issue status.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of the issue status.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WorkflowStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the status in the workflow.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the status in the workflow.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkflowStatus properties(WorkflowStatusProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public WorkflowStatusProperties getProperties() {
    return properties;
  }

  public void setProperties(WorkflowStatusProperties properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowStatus workflowStatus = (WorkflowStatus) o;
    return Objects.equals(this.id, workflowStatus.id) &&
        Objects.equals(this.name, workflowStatus.name) &&
        Objects.equals(this.properties, workflowStatus.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowStatus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

