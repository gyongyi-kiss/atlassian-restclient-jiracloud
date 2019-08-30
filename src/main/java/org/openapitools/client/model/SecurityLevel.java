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
 * Details of an issue level security item.
 */
@ApiModel(description = "Details of an issue level security item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-30T01:56:21.684+02:00[Europe/Prague]")
public class SecurityLevel {
  @JsonProperty("self")
  private String self;

  @JsonProperty("id")
  private String id;

  @JsonProperty("description")
  private String description;

  @JsonProperty("name")
  private String name;

   /**
   * The URL of the issue level security item.
   * @return self
  **/
  @ApiModelProperty(value = "The URL of the issue level security item.")
  public String getSelf() {
    return self;
  }

   /**
   * The ID of the issue level security item.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the issue level security item.")
  public String getId() {
    return id;
  }

   /**
   * The description of the issue level security item.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the issue level security item.")
  public String getDescription() {
    return description;
  }

   /**
   * The name of the issue level security item.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the issue level security item.")
  public String getName() {
    return name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityLevel securityLevel = (SecurityLevel) o;
    return Objects.equals(this.self, securityLevel.self) &&
        Objects.equals(this.id, securityLevel.id) &&
        Objects.equals(this.description, securityLevel.description) &&
        Objects.equals(this.name, securityLevel.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, description, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityLevel {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

