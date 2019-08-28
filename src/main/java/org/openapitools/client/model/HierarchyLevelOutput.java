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
import java.util.UUID;
import org.openapitools.client.model.MinimalIssueTypeOutput;

/**
 * HierarchyLevelOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-07T22:31:05.639+02:00[Europe/Prague]")
public class HierarchyLevelOutput {
/* xxxxxxxxxxxxx , , ,  */
  @JsonProperty("entityId")
  private UUID entityId;

  @JsonProperty("level")
  private Integer level;

  @JsonProperty("name")
  private String name;

  @JsonProperty("issueTypes")
  private List<MinimalIssueTypeOutput> issueTypes = new ArrayList<>();

  public HierarchyLevelOutput entityId(UUID entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @ApiModelProperty(value = "")
  public UUID getEntityId() {
    return entityId;
  }

  public void setEntityId(UUID entityId) {
    this.entityId = entityId;
  }

  public HierarchyLevelOutput level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(value = "")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public HierarchyLevelOutput name(String name) {
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

  public HierarchyLevelOutput issueTypes(List<MinimalIssueTypeOutput> issueTypes) {
    this.issueTypes = issueTypes;
    return this;
  }

  public HierarchyLevelOutput addIssueTypesItem(MinimalIssueTypeOutput issueTypesItem) {
    if (this.issueTypes == null) {
      this.issueTypes = new ArrayList<>();
    }
    this.issueTypes.add(issueTypesItem);
    return this;
  }

   /**
   * Get issueTypes
   * @return issueTypes
  **/
  @ApiModelProperty(value = "")
  public List<MinimalIssueTypeOutput> getIssueTypes() {
    return issueTypes;
  }

  public void setIssueTypes(List<MinimalIssueTypeOutput> issueTypes) {
    this.issueTypes = issueTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HierarchyLevelOutput hierarchyLevelOutput = (HierarchyLevelOutput) o;
    return Objects.equals(this.entityId, hierarchyLevelOutput.entityId) &&
        Objects.equals(this.level, hierarchyLevelOutput.level) &&
        Objects.equals(this.name, hierarchyLevelOutput.name) &&
        Objects.equals(this.issueTypes, hierarchyLevelOutput.issueTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, level, name, issueTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HierarchyLevelOutput {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    issueTypes: ").append(toIndentedString(issueTypes)).append("\n");
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
