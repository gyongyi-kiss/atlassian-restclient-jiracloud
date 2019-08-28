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
 * A group label.
 */
@ApiModel(description = "A group label.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-07T22:31:05.639+02:00[Europe/Prague]")
public class GroupLabel {
/* xxxxxxxxxxxxx , , ,  */
  @JsonProperty("text")
  private String text;

  @JsonProperty("title")
  private String title;

  /**
   * The type of the group label.
   */
  public enum TypeEnum {
    ADMIN("ADMIN"),
    
    SINGLE("SINGLE"),
    
    MULTIPLE("MULTIPLE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equalsIgnoreCase(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  public GroupLabel text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The group label name.
   * @return text
  **/
  @ApiModelProperty(value = "The group label name.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public GroupLabel title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the group label.
   * @return title
  **/
  @ApiModelProperty(value = "The title of the group label.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public GroupLabel type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the group label.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the group label.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupLabel groupLabel = (GroupLabel) o;
    return Objects.equals(this.text, groupLabel.text) &&
        Objects.equals(this.title, groupLabel.title) &&
        Objects.equals(this.type, groupLabel.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, title, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupLabel {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

