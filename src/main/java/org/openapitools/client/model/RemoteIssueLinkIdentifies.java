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
 * Details of the identifiers for a created or updated remote issue link.
 */
@ApiModel(description = "Details of the identifiers for a created or updated remote issue link.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-30T01:56:21.684+02:00[Europe/Prague]")
public class RemoteIssueLinkIdentifies {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("self")
  private String self;

   /**
   * The ID of the remote issue link, such as the ID of the item on the remote system.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the remote issue link, such as the ID of the item on the remote system.")
  public Long getId() {
    return id;
  }

   /**
   * The URL of the remote issue link.
   * @return self
  **/
  @ApiModelProperty(value = "The URL of the remote issue link.")
  public String getSelf() {
    return self;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteIssueLinkIdentifies remoteIssueLinkIdentifies = (RemoteIssueLinkIdentifies) o;
    return Objects.equals(this.id, remoteIssueLinkIdentifies.id) &&
        Objects.equals(this.self, remoteIssueLinkIdentifies.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, self);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteIssueLinkIdentifies {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

