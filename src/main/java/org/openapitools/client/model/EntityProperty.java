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
 * An entity property, for more information see &lt;a href&#x3D;\&quot;https://developer.atlassian.com/cloud/jira/platform/jira-entity-properties/\&quot;&gt;Entity properties&lt;/a&gt;.
 */
@ApiModel(description = "An entity property, for more information see <a href=\"https://developer.atlassian.com/cloud/jira/platform/jira-entity-properties/\">Entity properties</a>.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-07T22:31:05.639+02:00[Europe/Prague]")
public class EntityProperty {
/* xxxxxxxxxxxxx , , ,  */
  @JsonProperty("key")
  private String key;

  @JsonProperty("value")
  private Object value = null;

  public EntityProperty key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key of the property. Required on create and update.
   * @return key
  **/
  @ApiModelProperty(value = "The key of the property. Required on create and update.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public EntityProperty value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the property. Required on create and update.
   * @return value
  **/
  @ApiModelProperty(value = "The value of the property. Required on create and update.")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
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
    EntityProperty entityProperty = (EntityProperty) o;
    return Objects.equals(this.key, entityProperty.key) &&
        Objects.equals(this.value, entityProperty.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityProperty {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

