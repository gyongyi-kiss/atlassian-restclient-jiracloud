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
 * SimpleApplicationPropertyBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-07T22:31:05.639+02:00[Europe/Prague]")
public class SimpleApplicationPropertyBean {
/* xxxxxxxxxxxxx , , ,  */
  @JsonProperty("id")
  private String id;

  @JsonProperty("value")
  private String value;

  public SimpleApplicationPropertyBean id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the application property.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the application property.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SimpleApplicationPropertyBean value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The new value.
   * @return value
  **/
  @ApiModelProperty(value = "The new value.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleApplicationPropertyBean simpleApplicationPropertyBean = (SimpleApplicationPropertyBean) o;
    return Objects.equals(this.id, simpleApplicationPropertyBean.id) &&
        Objects.equals(this.value, simpleApplicationPropertyBean.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleApplicationPropertyBean {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
