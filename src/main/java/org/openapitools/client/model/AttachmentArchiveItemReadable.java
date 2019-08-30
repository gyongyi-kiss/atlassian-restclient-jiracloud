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
 * Metadata for an item in an attachment archive.
 */
@ApiModel(description = "Metadata for an item in an attachment archive.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-30T01:56:21.684+02:00[Europe/Prague]")
public class AttachmentArchiveItemReadable {
  @JsonProperty("path")
  private String path;

  @JsonProperty("index")
  private Long index;

  @JsonProperty("size")
  private String size;

  @JsonProperty("mediaType")
  private String mediaType;

  @JsonProperty("label")
  private String label;

   /**
   * The path of the archive item.
   * @return path
  **/
  @ApiModelProperty(value = "The path of the archive item.")
  public String getPath() {
    return path;
  }

   /**
   * The position of the item within the archive.
   * @return index
  **/
  @ApiModelProperty(value = "The position of the item within the archive.")
  public Long getIndex() {
    return index;
  }

   /**
   * The size of the archive item.
   * @return size
  **/
  @ApiModelProperty(value = "The size of the archive item.")
  public String getSize() {
    return size;
  }

   /**
   * The MIME type of the archive item.
   * @return mediaType
  **/
  @ApiModelProperty(value = "The MIME type of the archive item.")
  public String getMediaType() {
    return mediaType;
  }

   /**
   * The label for the archive item.
   * @return label
  **/
  @ApiModelProperty(value = "The label for the archive item.")
  public String getLabel() {
    return label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentArchiveItemReadable attachmentArchiveItemReadable = (AttachmentArchiveItemReadable) o;
    return Objects.equals(this.path, attachmentArchiveItemReadable.path) &&
        Objects.equals(this.index, attachmentArchiveItemReadable.index) &&
        Objects.equals(this.size, attachmentArchiveItemReadable.size) &&
        Objects.equals(this.mediaType, attachmentArchiveItemReadable.mediaType) &&
        Objects.equals(this.label, attachmentArchiveItemReadable.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, index, size, mediaType, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentArchiveItemReadable {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

