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
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Details of an avatar.
 */
@ApiModel(description = "Details of an avatar.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-07T22:31:05.639+02:00[Europe/Prague]")
public class Avatar {
/* xxxxxxxxxxxxx , , ,  */
  @JsonProperty("id")
  private String id;

  @JsonProperty("owner")
  private String owner;

  @JsonProperty("isSystemAvatar")
  private Boolean isSystemAvatar;

  @JsonProperty("isSelected")
  private Boolean isSelected;

  @JsonProperty("isDeletable")
  private Boolean isDeletable;

  @JsonProperty("fileName")
  private String fileName;

  @JsonProperty("urls")
  private Map<String, URI> urls = new HashMap<>();

  public Avatar id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the avatar. Required when setting the project avatar.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the avatar. Required when setting the project avatar.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * The owner of the avatar. For a system avatar the owner is null (and nothing is returned). For non-system avatars this is the appropriate identifier, such as the ID for a project or the accountId for a user.
   * @return owner
  **/
  @ApiModelProperty(value = "The owner of the avatar. For a system avatar the owner is null (and nothing is returned). For non-system avatars this is the appropriate identifier, such as the ID for a project or the accountId for a user.")
  public String getOwner() {
    return owner;
  }

   /**
   * Indicates whether the avatar is a system avatar.
   * @return isSystemAvatar
  **/
  @ApiModelProperty(value = "Indicates whether the avatar is a system avatar.")
  public Boolean getIsSystemAvatar() {
    return isSystemAvatar;
  }

   /**
   * Indicates whether the avatar is used in Jira. For example, shown as a project&#39;s avatar.
   * @return isSelected
  **/
  @ApiModelProperty(value = "Indicates whether the avatar is used in Jira. For example, shown as a project's avatar.")
  public Boolean getIsSelected() {
    return isSelected;
  }

   /**
   * Indicates whether the avatar can be deleted.
   * @return isDeletable
  **/
  @ApiModelProperty(value = "Indicates whether the avatar can be deleted.")
  public Boolean getIsDeletable() {
    return isDeletable;
  }

   /**
   * The file name of the avatar icon. Returned for system avatars.
   * @return fileName
  **/
  @ApiModelProperty(value = "The file name of the avatar icon. Returned for system avatars.")
  public String getFileName() {
    return fileName;
  }

   /**
   * The list of avatar icon URLs.
   * @return urls
  **/
  @ApiModelProperty(value = "The list of avatar icon URLs.")
  public Map<String, URI> getUrls() {
    return urls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Avatar avatar = (Avatar) o;
    return Objects.equals(this.id, avatar.id) &&
        Objects.equals(this.owner, avatar.owner) &&
        Objects.equals(this.isSystemAvatar, avatar.isSystemAvatar) &&
        Objects.equals(this.isSelected, avatar.isSelected) &&
        Objects.equals(this.isDeletable, avatar.isDeletable) &&
        Objects.equals(this.fileName, avatar.fileName) &&
        Objects.equals(this.urls, avatar.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, owner, isSystemAvatar, isSelected, isDeletable, fileName, urls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Avatar {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    isSystemAvatar: ").append(toIndentedString(isSystemAvatar)).append("\n");
    sb.append("    isSelected: ").append(toIndentedString(isSelected)).append("\n");
    sb.append("    isDeletable: ").append(toIndentedString(isDeletable)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

