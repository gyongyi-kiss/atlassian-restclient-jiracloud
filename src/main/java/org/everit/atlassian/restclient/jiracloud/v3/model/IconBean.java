/*
 * Copyright © 2011 Everit Kft. (http://www.everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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

/**
 * An icon.
 */
@ApiModel(description = "An icon.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-03T13:48:26.928+02:00[Europe/Prague]")
public class IconBean {
  @JsonProperty("url16x16")
  private String url16x16;

  @JsonProperty("title")
  private String title;

  @JsonProperty("link")
  private String link;

  public IconBean url16x16(String url16x16) {
    this.url16x16 = url16x16;
    return this;
  }

   /**
   * The URL of a 16x16 pixel icon.
   * @return url16x16
  **/
  @ApiModelProperty(value = "The URL of a 16x16 pixel icon.")
  public String getUrl16x16() {
    return url16x16;
  }

  public void setUrl16x16(String url16x16) {
    this.url16x16 = url16x16;
  }

  public IconBean title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the icon, for use as a tooltip on the icon.
   * @return title
  **/
  @ApiModelProperty(value = "The title of the icon, for use as a tooltip on the icon.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public IconBean link(String link) {
    this.link = link;
    return this;
  }

   /**
   * The URL of the tooltip, used only for a status icon.
   * @return link
  **/
  @ApiModelProperty(value = "The URL of the tooltip, used only for a status icon.")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IconBean iconBean = (IconBean) o;
    return Objects.equals(this.url16x16, iconBean.url16x16) &&
        Objects.equals(this.title, iconBean.title) &&
        Objects.equals(this.link, iconBean.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url16x16, title, link);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IconBean {\n");
    
    sb.append("    url16x16: ").append(toIndentedString(url16x16)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

