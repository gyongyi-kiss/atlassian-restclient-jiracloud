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


package org.everit.atlassian.restclient.jiracloud.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.everit.atlassian.restclient.jiracloud.v2.model.JsonTypeBean;
import org.everit.atlassian.restclient.jiracloud.v2.model.Scope;

/**
 * Details about a field.
 */
@ApiModel(description = "Details about a field.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-01T13:56:58.037+02:00[Europe/Prague]")
public class Field {
  @JsonProperty("id")
  private String id;

  @JsonProperty("key")
  private String key;

  @JsonProperty("name")
  private String name;

  @JsonProperty("custom")
  private Boolean custom;

  @JsonProperty("orderable")
  private Boolean orderable;

  @JsonProperty("navigable")
  private Boolean navigable;

  @JsonProperty("searchable")
  private Boolean searchable;

  @JsonProperty("clauseNames")
  private List<String> clauseNames = new ArrayList<>();

  @JsonProperty("scope")
  private Scope scope;

  @JsonProperty("schema")
  private JsonTypeBean schema;

  public Field id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the field.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the field.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Field key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key of the field.
   * @return key
  **/
  @ApiModelProperty(value = "The key of the field.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Field name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the field.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the field.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Field custom(Boolean custom) {
    this.custom = custom;
    return this;
  }

   /**
   * Indicates whether the field is a custom field.
   * @return custom
  **/
  @ApiModelProperty(value = "Indicates whether the field is a custom field.")
  public Boolean getCustom() {
    return custom;
  }

  public void setCustom(Boolean custom) {
    this.custom = custom;
  }

  public Field orderable(Boolean orderable) {
    this.orderable = orderable;
    return this;
  }

   /**
   * Indicates whether the content of the field can be used to order lists.
   * @return orderable
  **/
  @ApiModelProperty(value = "Indicates whether the content of the field can be used to order lists.")
  public Boolean getOrderable() {
    return orderable;
  }

  public void setOrderable(Boolean orderable) {
    this.orderable = orderable;
  }

  public Field navigable(Boolean navigable) {
    this.navigable = navigable;
    return this;
  }

   /**
   * Indicates whether the field can be used as a column on the issue navigator.
   * @return navigable
  **/
  @ApiModelProperty(value = "Indicates whether the field can be used as a column on the issue navigator.")
  public Boolean getNavigable() {
    return navigable;
  }

  public void setNavigable(Boolean navigable) {
    this.navigable = navigable;
  }

  public Field searchable(Boolean searchable) {
    this.searchable = searchable;
    return this;
  }

   /**
   * Indicates whether the content of the field can be searched.
   * @return searchable
  **/
  @ApiModelProperty(value = "Indicates whether the content of the field can be searched.")
  public Boolean getSearchable() {
    return searchable;
  }

  public void setSearchable(Boolean searchable) {
    this.searchable = searchable;
  }

  public Field clauseNames(List<String> clauseNames) {
    this.clauseNames = clauseNames;
    return this;
  }

  public Field addClauseNamesItem(String clauseNamesItem) {
    if (this.clauseNames == null) {
      this.clauseNames = new ArrayList<>();
    }
    this.clauseNames.add(clauseNamesItem);
    return this;
  }

   /**
   * The names that can be used to reference the field in an advanced search. For more information, see [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ).
   * @return clauseNames
  **/
  @ApiModelProperty(value = "The names that can be used to reference the field in an advanced search. For more information, see [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ).")
  public List<String> getClauseNames() {
    return clauseNames;
  }

  public void setClauseNames(List<String> clauseNames) {
    this.clauseNames = clauseNames;
  }

  public Field scope(Scope scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the field.
   * @return scope
  **/
  @ApiModelProperty(value = "The scope of the field.")
  public Scope getScope() {
    return scope;
  }

  public void setScope(Scope scope) {
    this.scope = scope;
  }

  public Field schema(JsonTypeBean schema) {
    this.schema = schema;
    return this;
  }

   /**
   * The data schema for the field.
   * @return schema
  **/
  @ApiModelProperty(value = "The data schema for the field.")
  public JsonTypeBean getSchema() {
    return schema;
  }

  public void setSchema(JsonTypeBean schema) {
    this.schema = schema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Field field = (Field) o;
    return Objects.equals(this.id, field.id) &&
        Objects.equals(this.key, field.key) &&
        Objects.equals(this.name, field.name) &&
        Objects.equals(this.custom, field.custom) &&
        Objects.equals(this.orderable, field.orderable) &&
        Objects.equals(this.navigable, field.navigable) &&
        Objects.equals(this.searchable, field.searchable) &&
        Objects.equals(this.clauseNames, field.clauseNames) &&
        Objects.equals(this.scope, field.scope) &&
        Objects.equals(this.schema, field.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, name, custom, orderable, navigable, searchable, clauseNames, scope, schema);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Field {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    orderable: ").append(toIndentedString(orderable)).append("\n");
    sb.append("    navigable: ").append(toIndentedString(navigable)).append("\n");
    sb.append("    searchable: ").append(toIndentedString(searchable)).append("\n");
    sb.append("    clauseNames: ").append(toIndentedString(clauseNames)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

