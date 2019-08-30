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

/**
 * Details of a user, group, field, or project role that holds a permission. See [Holder object](#holder-object) in *Get all permission schemes* for more information.
 */
@ApiModel(description = "Details of a user, group, field, or project role that holds a permission. See [Holder object](#holder-object) in *Get all permission schemes* for more information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-30T01:56:21.684+02:00[Europe/Prague]")
public class PermissionHolder {
  @JsonProperty("type")
  private String type;

  @JsonProperty("parameter")
  private String parameter;

  @JsonProperty("expand")
  private String expand;

  public PermissionHolder type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of permission holder.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of permission holder.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PermissionHolder parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

   /**
   * The identifier of permission holder.
   * @return parameter
  **/
  @ApiModelProperty(value = "The identifier of permission holder.")
  public String getParameter() {
    return parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = parameter;
  }

   /**
   * Expand options that include additional permission holder details in the response.
   * @return expand
  **/
  @ApiModelProperty(value = "Expand options that include additional permission holder details in the response.")
  public String getExpand() {
    return expand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionHolder permissionHolder = (PermissionHolder) o;
    return Objects.equals(this.type, permissionHolder.type) &&
        Objects.equals(this.parameter, permissionHolder.parameter) &&
        Objects.equals(this.expand, permissionHolder.expand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, parameter, expand);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionHolder {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
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

