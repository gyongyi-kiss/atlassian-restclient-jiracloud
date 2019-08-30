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
import org.openapitools.client.model.ErrorCollection;

/**
 * NestedResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-30T01:56:21.684+02:00[Europe/Prague]")
public class NestedResponse {
  @JsonProperty("status")
  private Integer status;

  @JsonProperty("errorCollection")
  private ErrorCollection errorCollection;

  public NestedResponse status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public NestedResponse errorCollection(ErrorCollection errorCollection) {
    this.errorCollection = errorCollection;
    return this;
  }

   /**
   * Get errorCollection
   * @return errorCollection
  **/
  @ApiModelProperty(value = "")
  public ErrorCollection getErrorCollection() {
    return errorCollection;
  }

  public void setErrorCollection(ErrorCollection errorCollection) {
    this.errorCollection = errorCollection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedResponse nestedResponse = (NestedResponse) o;
    return Objects.equals(this.status, nestedResponse.status) &&
        Objects.equals(this.errorCollection, nestedResponse.errorCollection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, errorCollection);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorCollection: ").append(toIndentedString(errorCollection)).append("\n");
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

