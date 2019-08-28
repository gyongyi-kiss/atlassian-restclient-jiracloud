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
import org.openapitools.client.model.UserBeanAvatarUrls;

/**
 * UserBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-07T22:31:05.639+02:00[Europe/Prague]")
public class UserBean {
/* xxxxxxxxxxxxx , , ,  */
  @JsonProperty("key")
  private String key;

  @JsonProperty("self")
  private URI self;

  @JsonProperty("name")
  private String name;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("active")
  private Boolean active;

  @JsonProperty("accountId")
  private String accountId;

  @JsonProperty("avatarUrls")
  private UserBeanAvatarUrls avatarUrls;

  public UserBean key(String key) {
    this.key = key;
    return this;
  }

   /**
   * This property is deprecated in favor of &#x60;accountId&#x60; because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The key of the user.
   * @return key
  **/
  @ApiModelProperty(value = "This property is deprecated in favor of `accountId` because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The key of the user.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public UserBean self(URI self) {
    this.self = self;
    return this;
  }

   /**
   * The URL of the user.
   * @return self
  **/
  @ApiModelProperty(value = "The URL of the user.")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  public UserBean name(String name) {
    this.name = name;
    return this;
  }

   /**
   * This property is deprecated in favor of &#x60;accountId&#x60; because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The username of the user.
   * @return name
  **/
  @ApiModelProperty(value = "This property is deprecated in favor of `accountId` because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The username of the user.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserBean displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
   * @return displayName
  **/
  @ApiModelProperty(value = "The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UserBean active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Indicates whether the user is active.
   * @return active
  **/
  @ApiModelProperty(value = "Indicates whether the user is active.")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public UserBean accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The accountId of the user, which uniquely identifies the user across all Atlassian products. For example, *384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192*.
   * @return accountId
  **/
  @ApiModelProperty(value = "The accountId of the user, which uniquely identifies the user across all Atlassian products. For example, *384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192*.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public UserBean avatarUrls(UserBeanAvatarUrls avatarUrls) {
    this.avatarUrls = avatarUrls;
    return this;
  }

   /**
   * The avatars of the user.
   * @return avatarUrls
  **/
  @ApiModelProperty(value = "The avatars of the user.")
  public UserBeanAvatarUrls getAvatarUrls() {
    return avatarUrls;
  }

  public void setAvatarUrls(UserBeanAvatarUrls avatarUrls) {
    this.avatarUrls = avatarUrls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBean userBean = (UserBean) o;
    return Objects.equals(this.key, userBean.key) &&
        Objects.equals(this.self, userBean.self) &&
        Objects.equals(this.name, userBean.name) &&
        Objects.equals(this.displayName, userBean.displayName) &&
        Objects.equals(this.active, userBean.active) &&
        Objects.equals(this.accountId, userBean.accountId) &&
        Objects.equals(this.avatarUrls, userBean.avatarUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, self, name, displayName, active, accountId, avatarUrls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBean {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
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
