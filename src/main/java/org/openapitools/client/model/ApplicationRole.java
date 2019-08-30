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
 * Details of an application role.
 */
@ApiModel(description = "Details of an application role.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-30T01:56:21.684+02:00[Europe/Prague]")
public class ApplicationRole {
  @JsonProperty("key")
  private String key;

  @JsonProperty("groups")
  private List<String> groups = new ArrayList<>();

  @JsonProperty("name")
  private String name;

  @JsonProperty("defaultGroups")
  private List<String> defaultGroups = new ArrayList<>();

  @JsonProperty("selectedByDefault")
  private Boolean selectedByDefault;

  @JsonProperty("defined")
  private Boolean defined;

  @JsonProperty("numberOfSeats")
  private Integer numberOfSeats;

  @JsonProperty("remainingSeats")
  private Integer remainingSeats;

  @JsonProperty("userCount")
  private Integer userCount;

  @JsonProperty("userCountDescription")
  private String userCountDescription;

  @JsonProperty("hasUnlimitedSeats")
  private Boolean hasUnlimitedSeats;

  @JsonProperty("platform")
  private Boolean platform;

  public ApplicationRole key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key of the application role.
   * @return key
  **/
  @ApiModelProperty(value = "The key of the application role.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ApplicationRole groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public ApplicationRole addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * The groups associated with the application role.
   * @return groups
  **/
  @ApiModelProperty(value = "The groups associated with the application role.")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public ApplicationRole name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The display name of the application role.
   * @return name
  **/
  @ApiModelProperty(value = "The display name of the application role.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApplicationRole defaultGroups(List<String> defaultGroups) {
    this.defaultGroups = defaultGroups;
    return this;
  }

  public ApplicationRole addDefaultGroupsItem(String defaultGroupsItem) {
    if (this.defaultGroups == null) {
      this.defaultGroups = new ArrayList<>();
    }
    this.defaultGroups.add(defaultGroupsItem);
    return this;
  }

   /**
   * The groups that are granted default access for this application role.
   * @return defaultGroups
  **/
  @ApiModelProperty(value = "The groups that are granted default access for this application role.")
  public List<String> getDefaultGroups() {
    return defaultGroups;
  }

  public void setDefaultGroups(List<String> defaultGroups) {
    this.defaultGroups = defaultGroups;
  }

  public ApplicationRole selectedByDefault(Boolean selectedByDefault) {
    this.selectedByDefault = selectedByDefault;
    return this;
  }

   /**
   * Determines whether this application role should be selected by default on user creation.
   * @return selectedByDefault
  **/
  @ApiModelProperty(value = "Determines whether this application role should be selected by default on user creation.")
  public Boolean getSelectedByDefault() {
    return selectedByDefault;
  }

  public void setSelectedByDefault(Boolean selectedByDefault) {
    this.selectedByDefault = selectedByDefault;
  }

  public ApplicationRole defined(Boolean defined) {
    this.defined = defined;
    return this;
  }

   /**
   * Deprecated.
   * @return defined
  **/
  @ApiModelProperty(value = "Deprecated.")
  public Boolean getDefined() {
    return defined;
  }

  public void setDefined(Boolean defined) {
    this.defined = defined;
  }

  public ApplicationRole numberOfSeats(Integer numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
    return this;
  }

   /**
   * The maximum count of users on your license.
   * @return numberOfSeats
  **/
  @ApiModelProperty(value = "The maximum count of users on your license.")
  public Integer getNumberOfSeats() {
    return numberOfSeats;
  }

  public void setNumberOfSeats(Integer numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
  }

  public ApplicationRole remainingSeats(Integer remainingSeats) {
    this.remainingSeats = remainingSeats;
    return this;
  }

   /**
   * The count of users remaining on your license.
   * @return remainingSeats
  **/
  @ApiModelProperty(value = "The count of users remaining on your license.")
  public Integer getRemainingSeats() {
    return remainingSeats;
  }

  public void setRemainingSeats(Integer remainingSeats) {
    this.remainingSeats = remainingSeats;
  }

  public ApplicationRole userCount(Integer userCount) {
    this.userCount = userCount;
    return this;
  }

   /**
   * The number of users counting against your license.
   * @return userCount
  **/
  @ApiModelProperty(value = "The number of users counting against your license.")
  public Integer getUserCount() {
    return userCount;
  }

  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }

  public ApplicationRole userCountDescription(String userCountDescription) {
    this.userCountDescription = userCountDescription;
    return this;
  }

   /**
   * The [type of users](https://confluence.atlassian.com/x/lRW3Ng) being counted against your license.
   * @return userCountDescription
  **/
  @ApiModelProperty(value = "The [type of users](https://confluence.atlassian.com/x/lRW3Ng) being counted against your license.")
  public String getUserCountDescription() {
    return userCountDescription;
  }

  public void setUserCountDescription(String userCountDescription) {
    this.userCountDescription = userCountDescription;
  }

  public ApplicationRole hasUnlimitedSeats(Boolean hasUnlimitedSeats) {
    this.hasUnlimitedSeats = hasUnlimitedSeats;
    return this;
  }

   /**
   * Get hasUnlimitedSeats
   * @return hasUnlimitedSeats
  **/
  @ApiModelProperty(value = "")
  public Boolean getHasUnlimitedSeats() {
    return hasUnlimitedSeats;
  }

  public void setHasUnlimitedSeats(Boolean hasUnlimitedSeats) {
    this.hasUnlimitedSeats = hasUnlimitedSeats;
  }

  public ApplicationRole platform(Boolean platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Indicates if the application role belongs to Jira platform (&#x60;jira-core&#x60;).
   * @return platform
  **/
  @ApiModelProperty(value = "Indicates if the application role belongs to Jira platform (`jira-core`).")
  public Boolean getPlatform() {
    return platform;
  }

  public void setPlatform(Boolean platform) {
    this.platform = platform;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationRole applicationRole = (ApplicationRole) o;
    return Objects.equals(this.key, applicationRole.key) &&
        Objects.equals(this.groups, applicationRole.groups) &&
        Objects.equals(this.name, applicationRole.name) &&
        Objects.equals(this.defaultGroups, applicationRole.defaultGroups) &&
        Objects.equals(this.selectedByDefault, applicationRole.selectedByDefault) &&
        Objects.equals(this.defined, applicationRole.defined) &&
        Objects.equals(this.numberOfSeats, applicationRole.numberOfSeats) &&
        Objects.equals(this.remainingSeats, applicationRole.remainingSeats) &&
        Objects.equals(this.userCount, applicationRole.userCount) &&
        Objects.equals(this.userCountDescription, applicationRole.userCountDescription) &&
        Objects.equals(this.hasUnlimitedSeats, applicationRole.hasUnlimitedSeats) &&
        Objects.equals(this.platform, applicationRole.platform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, groups, name, defaultGroups, selectedByDefault, defined, numberOfSeats, remainingSeats, userCount, userCountDescription, hasUnlimitedSeats, platform);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationRole {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultGroups: ").append(toIndentedString(defaultGroups)).append("\n");
    sb.append("    selectedByDefault: ").append(toIndentedString(selectedByDefault)).append("\n");
    sb.append("    defined: ").append(toIndentedString(defined)).append("\n");
    sb.append("    numberOfSeats: ").append(toIndentedString(numberOfSeats)).append("\n");
    sb.append("    remainingSeats: ").append(toIndentedString(remainingSeats)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
    sb.append("    userCountDescription: ").append(toIndentedString(userCountDescription)).append("\n");
    sb.append("    hasUnlimitedSeats: ").append(toIndentedString(hasUnlimitedSeats)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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

