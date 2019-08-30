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
import org.openapitools.client.model.BulkProjectPermissions;

/**
 * Details of global permissions to look up and project permissions with associated projects and issues to look up.
 */
@ApiModel(description = "Details of global permissions to look up and project permissions with associated projects and issues to look up.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-30T01:56:21.684+02:00[Europe/Prague]")
public class BulkPermissionsRequestBean {
  @JsonProperty("projectPermissions")
  private List<BulkProjectPermissions> projectPermissions = new ArrayList<>();

  @JsonProperty("globalPermissions")
  private List<String> globalPermissions = new ArrayList<>();

  public BulkPermissionsRequestBean projectPermissions(List<BulkProjectPermissions> projectPermissions) {
    this.projectPermissions = projectPermissions;
    return this;
  }

  public BulkPermissionsRequestBean addProjectPermissionsItem(BulkProjectPermissions projectPermissionsItem) {
    if (this.projectPermissions == null) {
      this.projectPermissions = new ArrayList<>();
    }
    this.projectPermissions.add(projectPermissionsItem);
    return this;
  }

   /**
   * Project permissions with associated projects and issues to look up.
   * @return projectPermissions
  **/
  @ApiModelProperty(value = "Project permissions with associated projects and issues to look up.")
  public List<BulkProjectPermissions> getProjectPermissions() {
    return projectPermissions;
  }

  public void setProjectPermissions(List<BulkProjectPermissions> projectPermissions) {
    this.projectPermissions = projectPermissions;
  }

  public BulkPermissionsRequestBean globalPermissions(List<String> globalPermissions) {
    this.globalPermissions = globalPermissions;
    return this;
  }

  public BulkPermissionsRequestBean addGlobalPermissionsItem(String globalPermissionsItem) {
    if (this.globalPermissions == null) {
      this.globalPermissions = new ArrayList<>();
    }
    this.globalPermissions.add(globalPermissionsItem);
    return this;
  }

   /**
   * Global permissions to look up.
   * @return globalPermissions
  **/
  @ApiModelProperty(value = "Global permissions to look up.")
  public List<String> getGlobalPermissions() {
    return globalPermissions;
  }

  public void setGlobalPermissions(List<String> globalPermissions) {
    this.globalPermissions = globalPermissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkPermissionsRequestBean bulkPermissionsRequestBean = (BulkPermissionsRequestBean) o;
    return Objects.equals(this.projectPermissions, bulkPermissionsRequestBean.projectPermissions) &&
        Objects.equals(this.globalPermissions, bulkPermissionsRequestBean.globalPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectPermissions, globalPermissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkPermissionsRequestBean {\n");
    sb.append("    projectPermissions: ").append(toIndentedString(projectPermissions)).append("\n");
    sb.append("    globalPermissions: ").append(toIndentedString(globalPermissions)).append("\n");
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

