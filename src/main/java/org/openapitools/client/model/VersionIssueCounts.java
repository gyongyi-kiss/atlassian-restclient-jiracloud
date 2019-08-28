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
import org.openapitools.client.model.VersionUsageInCustomField;

/**
 * Various counts of issues within a version.
 */
@ApiModel(description = "Various counts of issues within a version.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-07T22:31:05.639+02:00[Europe/Prague]")
public class VersionIssueCounts {
/* xxxxxxxxxxxxx , , ,  */
  @JsonProperty("self")
  private URI self;

  @JsonProperty("issuesFixedCount")
  private Long issuesFixedCount;

  @JsonProperty("issuesAffectedCount")
  private Long issuesAffectedCount;

  @JsonProperty("issueCountWithCustomFieldsShowingVersion")
  private Long issueCountWithCustomFieldsShowingVersion;

  @JsonProperty("customFieldUsage")
  private List<VersionUsageInCustomField> customFieldUsage = new ArrayList<>();

   /**
   * The URL of these count details.
   * @return self
  **/
  @ApiModelProperty(value = "The URL of these count details.")
  public URI getSelf() {
    return self;
  }

   /**
   * Count of issues where the &#x60;fixVersion&#x60; is set to the version.
   * @return issuesFixedCount
  **/
  @ApiModelProperty(value = "Count of issues where the `fixVersion` is set to the version.")
  public Long getIssuesFixedCount() {
    return issuesFixedCount;
  }

   /**
   * Count of issues where the &#x60;affectedVersion&#x60; is set to the version.
   * @return issuesAffectedCount
  **/
  @ApiModelProperty(value = "Count of issues where the `affectedVersion` is set to the version.")
  public Long getIssuesAffectedCount() {
    return issuesAffectedCount;
  }

   /**
   * Count of issues where a version custom field is set to the version.
   * @return issueCountWithCustomFieldsShowingVersion
  **/
  @ApiModelProperty(value = "Count of issues where a version custom field is set to the version.")
  public Long getIssueCountWithCustomFieldsShowingVersion() {
    return issueCountWithCustomFieldsShowingVersion;
  }

   /**
   * List of custom fields using the version.
   * @return customFieldUsage
  **/
  @ApiModelProperty(value = "List of custom fields using the version.")
  public List<VersionUsageInCustomField> getCustomFieldUsage() {
    return customFieldUsage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionIssueCounts versionIssueCounts = (VersionIssueCounts) o;
    return Objects.equals(this.self, versionIssueCounts.self) &&
        Objects.equals(this.issuesFixedCount, versionIssueCounts.issuesFixedCount) &&
        Objects.equals(this.issuesAffectedCount, versionIssueCounts.issuesAffectedCount) &&
        Objects.equals(this.issueCountWithCustomFieldsShowingVersion, versionIssueCounts.issueCountWithCustomFieldsShowingVersion) &&
        Objects.equals(this.customFieldUsage, versionIssueCounts.customFieldUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, issuesFixedCount, issuesAffectedCount, issueCountWithCustomFieldsShowingVersion, customFieldUsage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionIssueCounts {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    issuesFixedCount: ").append(toIndentedString(issuesFixedCount)).append("\n");
    sb.append("    issuesAffectedCount: ").append(toIndentedString(issuesAffectedCount)).append("\n");
    sb.append("    issueCountWithCustomFieldsShowingVersion: ").append(toIndentedString(issueCountWithCustomFieldsShowingVersion)).append("\n");
    sb.append("    customFieldUsage: ").append(toIndentedString(customFieldUsage)).append("\n");
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

