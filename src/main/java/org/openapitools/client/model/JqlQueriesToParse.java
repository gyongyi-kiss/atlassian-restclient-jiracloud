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
import java.util.ArrayList;
import java.util.List;

/**
 * A list of JQL queries to parse.
 */
@ApiModel(description = "A list of JQL queries to parse.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-30T01:56:21.684+02:00[Europe/Prague]")
public class JqlQueriesToParse {
  @JsonProperty("queries")
  private List<String> queries = new ArrayList<>();

  public JqlQueriesToParse queries(List<String> queries) {
    this.queries = queries;
    return this;
  }

  public JqlQueriesToParse addQueriesItem(String queriesItem) {
    this.queries.add(queriesItem);
    return this;
  }

   /**
   * A list of queries to parse.
   * @return queries
  **/
  @ApiModelProperty(required = true, value = "A list of queries to parse.")
  public List<String> getQueries() {
    return queries;
  }

  public void setQueries(List<String> queries) {
    this.queries = queries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JqlQueriesToParse jqlQueriesToParse = (JqlQueriesToParse) o;
    return Objects.equals(this.queries, jqlQueriesToParse.queries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQueriesToParse {\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
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

