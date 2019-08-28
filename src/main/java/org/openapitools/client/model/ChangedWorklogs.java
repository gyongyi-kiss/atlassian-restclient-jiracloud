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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ChangedWorklog;

/**
 * List of changed worklogs.
 */
@ApiModel(description = "List of changed worklogs.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-07T22:31:05.639+02:00[Europe/Prague]")
public class ChangedWorklogs {
/* xxxxxxxxxxxxx , , ,  */
  @JsonProperty("values")
  private List<ChangedWorklog> values = new ArrayList<>();

  @JsonProperty("since")
  private Long since;

  @JsonProperty("until")
  private Long until;

  @JsonProperty("self")
  private URI self;

  @JsonProperty("nextPage")
  private URI nextPage;

  @JsonProperty("lastPage")
  private Boolean lastPage;

   /**
   * Changed worklog list.
   * @return values
  **/
  @ApiModelProperty(value = "Changed worklog list.")
  public List<ChangedWorklog> getValues() {
    return values;
  }

   /**
   * The datetime of the first worklog item in the list.
   * @return since
  **/
  @ApiModelProperty(value = "The datetime of the first worklog item in the list.")
  public Long getSince() {
    return since;
  }

   /**
   * The datetime of the last worklog item in the list.
   * @return until
  **/
  @ApiModelProperty(value = "The datetime of the last worklog item in the list.")
  public Long getUntil() {
    return until;
  }

   /**
   * The URL of this changed worklogs list.
   * @return self
  **/
  @ApiModelProperty(value = "The URL of this changed worklogs list.")
  public URI getSelf() {
    return self;
  }

   /**
   * The URL of the next list of changed worklogs.
   * @return nextPage
  **/
  @ApiModelProperty(value = "The URL of the next list of changed worklogs.")
  public URI getNextPage() {
    return nextPage;
  }

  public ChangedWorklogs lastPage(Boolean lastPage) {
    this.lastPage = lastPage;
    return this;
  }

   /**
   * Get lastPage
   * @return lastPage
  **/
  @ApiModelProperty(value = "")
  public Boolean getLastPage() {
    return lastPage;
  }

  public void setLastPage(Boolean lastPage) {
    this.lastPage = lastPage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangedWorklogs changedWorklogs = (ChangedWorklogs) o;
    return Objects.equals(this.values, changedWorklogs.values) &&
        Objects.equals(this.since, changedWorklogs.since) &&
        Objects.equals(this.until, changedWorklogs.until) &&
        Objects.equals(this.self, changedWorklogs.self) &&
        Objects.equals(this.nextPage, changedWorklogs.nextPage) &&
        Objects.equals(this.lastPage, changedWorklogs.lastPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, since, until, self, nextPage, lastPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangedWorklogs {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
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

