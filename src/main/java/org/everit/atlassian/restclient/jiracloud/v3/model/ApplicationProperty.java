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
import java.util.ArrayList;
import java.util.List;

/**
 * Details of an application property.
 */
@ApiModel(description = "Details of an application property.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-30T02:22:14.429+02:00[Europe/Prague]")
public class ApplicationProperty {
  @JsonProperty("id")
  private String id;

  @JsonProperty("key")
  private String key;

  @JsonProperty("value")
  private String value;

  @JsonProperty("name")
  private String name;

  @JsonProperty("desc")
  private String desc;

  @JsonProperty("type")
  private String type;

  @JsonProperty("defaultValue")
  private String defaultValue;

  @JsonProperty("example")
  private String example;

  @JsonProperty("allowedValues")
  private List<String> allowedValues = new ArrayList<>();

  public ApplicationProperty id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the application property. The ID and key are the same.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the application property. The ID and key are the same.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ApplicationProperty key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key of the application property. The ID and key are the same.
   * @return key
  **/
  @ApiModelProperty(value = "The key of the application property. The ID and key are the same.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ApplicationProperty value(String value) {
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

  public ApplicationProperty name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the application property.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the application property.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApplicationProperty desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * The description of the application property.
   * @return desc
  **/
  @ApiModelProperty(value = "The description of the application property.")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public ApplicationProperty type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The data type of the application property.
   * @return type
  **/
  @ApiModelProperty(value = "The data type of the application property.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ApplicationProperty defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * The default value of the application property.
   * @return defaultValue
  **/
  @ApiModelProperty(value = "The default value of the application property.")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public ApplicationProperty example(String example) {
    this.example = example;
    return this;
  }

   /**
   * Get example
   * @return example
  **/
  @ApiModelProperty(value = "")
  public String getExample() {
    return example;
  }

  public void setExample(String example) {
    this.example = example;
  }

  public ApplicationProperty allowedValues(List<String> allowedValues) {
    this.allowedValues = allowedValues;
    return this;
  }

  public ApplicationProperty addAllowedValuesItem(String allowedValuesItem) {
    if (this.allowedValues == null) {
      this.allowedValues = new ArrayList<>();
    }
    this.allowedValues.add(allowedValuesItem);
    return this;
  }

   /**
   * The allowed values, if applicable.
   * @return allowedValues
  **/
  @ApiModelProperty(value = "The allowed values, if applicable.")
  public List<String> getAllowedValues() {
    return allowedValues;
  }

  public void setAllowedValues(List<String> allowedValues) {
    this.allowedValues = allowedValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationProperty applicationProperty = (ApplicationProperty) o;
    return Objects.equals(this.id, applicationProperty.id) &&
        Objects.equals(this.key, applicationProperty.key) &&
        Objects.equals(this.value, applicationProperty.value) &&
        Objects.equals(this.name, applicationProperty.name) &&
        Objects.equals(this.desc, applicationProperty.desc) &&
        Objects.equals(this.type, applicationProperty.type) &&
        Objects.equals(this.defaultValue, applicationProperty.defaultValue) &&
        Objects.equals(this.example, applicationProperty.example) &&
        Objects.equals(this.allowedValues, applicationProperty.allowedValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, value, name, desc, type, defaultValue, example, allowedValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationProperty {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    example: ").append(toIndentedString(example)).append("\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
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
