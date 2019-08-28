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
 * AttachmentArchiveEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-07T22:31:05.639+02:00[Europe/Prague]")
public class AttachmentArchiveEntry {
/* xxxxxxxxxxxxx , , ,  */
  @JsonProperty("entryIndex")
  private Long entryIndex;

  @JsonProperty("abbreviatedName")
  private String abbreviatedName;

  @JsonProperty("mediaType")
  private String mediaType;

  @JsonProperty("name")
  private String name;

  @JsonProperty("size")
  private Long size;

  public AttachmentArchiveEntry entryIndex(Long entryIndex) {
    this.entryIndex = entryIndex;
    return this;
  }

   /**
   * Get entryIndex
   * @return entryIndex
  **/
  @ApiModelProperty(value = "")
  public Long getEntryIndex() {
    return entryIndex;
  }

  public void setEntryIndex(Long entryIndex) {
    this.entryIndex = entryIndex;
  }

  public AttachmentArchiveEntry abbreviatedName(String abbreviatedName) {
    this.abbreviatedName = abbreviatedName;
    return this;
  }

   /**
   * Get abbreviatedName
   * @return abbreviatedName
  **/
  @ApiModelProperty(value = "")
  public String getAbbreviatedName() {
    return abbreviatedName;
  }

  public void setAbbreviatedName(String abbreviatedName) {
    this.abbreviatedName = abbreviatedName;
  }

  public AttachmentArchiveEntry mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  @ApiModelProperty(value = "")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public AttachmentArchiveEntry name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AttachmentArchiveEntry size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentArchiveEntry attachmentArchiveEntry = (AttachmentArchiveEntry) o;
    return Objects.equals(this.entryIndex, attachmentArchiveEntry.entryIndex) &&
        Objects.equals(this.abbreviatedName, attachmentArchiveEntry.abbreviatedName) &&
        Objects.equals(this.mediaType, attachmentArchiveEntry.mediaType) &&
        Objects.equals(this.name, attachmentArchiveEntry.name) &&
        Objects.equals(this.size, attachmentArchiveEntry.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryIndex, abbreviatedName, mediaType, name, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentArchiveEntry {\n");
    sb.append("    entryIndex: ").append(toIndentedString(entryIndex)).append("\n");
    sb.append("    abbreviatedName: ").append(toIndentedString(abbreviatedName)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
