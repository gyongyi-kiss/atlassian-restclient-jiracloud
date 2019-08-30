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
import org.openapitools.client.model.NestedResponse;

/**
 * Details about a created issue or subtask.
 */
@ApiModel(description = "Details about a created issue or subtask.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-30T01:56:21.684+02:00[Europe/Prague]")
public class CreatedIssue {
  @JsonProperty("id")
  private String id;

  @JsonProperty("key")
  private String key;

  @JsonProperty("self")
  private String self;

  @JsonProperty("transition")
  private NestedResponse transition;

   /**
   * The ID of the created issue or subtask.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the created issue or subtask.")
  public String getId() {
    return id;
  }

   /**
   * The key of the created issue or subtask.
   * @return key
  **/
  @ApiModelProperty(value = "The key of the created issue or subtask.")
  public String getKey() {
    return key;
  }

   /**
   * The URL of the created issue or subtask.
   * @return self
  **/
  @ApiModelProperty(value = "The URL of the created issue or subtask.")
  public String getSelf() {
    return self;
  }

   /**
   * The response code and messages related to any requested transition.
   * @return transition
  **/
  @ApiModelProperty(value = "The response code and messages related to any requested transition.")
  public NestedResponse getTransition() {
    return transition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatedIssue createdIssue = (CreatedIssue) o;
    return Objects.equals(this.id, createdIssue.id) &&
        Objects.equals(this.key, createdIssue.key) &&
        Objects.equals(this.self, createdIssue.self) &&
        Objects.equals(this.transition, createdIssue.transition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, self, transition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatedIssue {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    transition: ").append(toIndentedString(transition)).append("\n");
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

