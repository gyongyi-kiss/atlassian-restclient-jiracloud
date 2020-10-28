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
import java.net.URI;
import org.everit.atlassian.restclient.jiracloud.v2.model.AvatarUrlsBean;
import org.everit.atlassian.restclient.jiracloud.v2.model.SimpleListWrapperApplicationRole;
import org.everit.atlassian.restclient.jiracloud.v2.model.SimpleListWrapperGroupName;

/**
 * A user with details as permitted by the user&#39;s Atlassian Account privacy settings. However, be aware of these exceptions:   *  User record deleted from Atlassian: This occurs as the result of a right to be forgotten request. In this case, &#x60;displayName&#x60; provides an indication and other parameters have default values or are blank (for example, email is blank).  *  User record corrupted: This occurs as a results of events such as a server import and can only happen to deleted users. In this case, &#x60;accountId&#x60; returns *unknown* and all other parameters have fallback values.  *  User record unavailable: This usually occurs due to an internal service outage. In this case, all parameters have fallback values.
 */
@ApiModel(description = "A user with details as permitted by the user's Atlassian Account privacy settings. However, be aware of these exceptions:   *  User record deleted from Atlassian: This occurs as the result of a right to be forgotten request. In this case, `displayName` provides an indication and other parameters have default values or are blank (for example, email is blank).  *  User record corrupted: This occurs as a results of events such as a server import and can only happen to deleted users. In this case, `accountId` returns *unknown* and all other parameters have fallback values.  *  User record unavailable: This usually occurs due to an internal service outage. In this case, all parameters have fallback values.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-28T14:12:34.799+01:00[Europe/Prague]")
public class User {
  @JsonProperty("self")
  private URI self;

  @JsonProperty("key")
  private String key;

  @JsonProperty("accountId")
  private String accountId;

  /**
   * The user account type. Can take the following values:   *  &#x60;atlassian&#x60; regular Atlassian user account  *  &#x60;app&#x60; system account used for Connect applications and OAuth to represent external systems  *  &#x60;customer&#x60; Jira Service Desk account representing an external service desk
   */
  public enum AccountTypeEnum {
    ATLASSIAN("atlassian"),
    
    APP("app"),
    
    CUSTOMER("customer"),
    
    UNKNOWN("unknown");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equalsIgnoreCase(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("accountType")
  private AccountTypeEnum accountType;

  @JsonProperty("name")
  private String name;

  @JsonProperty("emailAddress")
  private String emailAddress;

  @JsonProperty("avatarUrls")
  private AvatarUrlsBean avatarUrls;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("active")
  private Boolean active;

  @JsonProperty("timeZone")
  private String timeZone;

  @JsonProperty("locale")
  private String locale;

  @JsonProperty("groups")
  private SimpleListWrapperGroupName groups;

  @JsonProperty("applicationRoles")
  private SimpleListWrapperApplicationRole applicationRoles;

  @JsonProperty("expand")
  private String expand;

   /**
   * The URL of the user.
   * @return self
  **/
  @ApiModelProperty(value = "The URL of the user.")
  public URI getSelf() {
    return self;
  }

  public User key(String key) {
    this.key = key;
    return this;
  }

   /**
   * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return key
  **/
  @ApiModelProperty(value = "This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public User accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.
   * @return accountId
  **/
  @ApiModelProperty(value = "The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

   /**
   * The user account type. Can take the following values:   *  &#x60;atlassian&#x60; regular Atlassian user account  *  &#x60;app&#x60; system account used for Connect applications and OAuth to represent external systems  *  &#x60;customer&#x60; Jira Service Desk account representing an external service desk
   * @return accountType
  **/
  @ApiModelProperty(value = "The user account type. Can take the following values:   *  `atlassian` regular Atlassian user account  *  `app` system account used for Connect applications and OAuth to represent external systems  *  `customer` Jira Service Desk account representing an external service desk")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public User name(String name) {
    this.name = name;
    return this;
  }

   /**
   * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return name
  **/
  @ApiModelProperty(value = "This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   /**
   * The email address of the user. Depending on the user’s privacy setting, this may be returned as null.
   * @return emailAddress
  **/
  @ApiModelProperty(value = "The email address of the user. Depending on the user’s privacy setting, this may be returned as null.")
  public String getEmailAddress() {
    return emailAddress;
  }

   /**
   * The avatars of the user.
   * @return avatarUrls
  **/
  @ApiModelProperty(value = "The avatars of the user.")
  public AvatarUrlsBean getAvatarUrls() {
    return avatarUrls;
  }

   /**
   * The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
   * @return displayName
  **/
  @ApiModelProperty(value = "The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.")
  public String getDisplayName() {
    return displayName;
  }

   /**
   * Whether the user is active.
   * @return active
  **/
  @ApiModelProperty(value = "Whether the user is active.")
  public Boolean getActive() {
    return active;
  }

   /**
   * The time zone specified in the user&#39;s profile. Depending on the user’s privacy setting, this may be returned as null.
   * @return timeZone
  **/
  @ApiModelProperty(value = "The time zone specified in the user's profile. Depending on the user’s privacy setting, this may be returned as null.")
  public String getTimeZone() {
    return timeZone;
  }

   /**
   * The locale of the user. Depending on the user’s privacy setting, this may be returned as null.
   * @return locale
  **/
  @ApiModelProperty(value = "The locale of the user. Depending on the user’s privacy setting, this may be returned as null.")
  public String getLocale() {
    return locale;
  }

   /**
   * The groups that the user belongs to.
   * @return groups
  **/
  @ApiModelProperty(value = "The groups that the user belongs to.")
  public SimpleListWrapperGroupName getGroups() {
    return groups;
  }

   /**
   * The application roles the user is assigned to.
   * @return applicationRoles
  **/
  @ApiModelProperty(value = "The application roles the user is assigned to.")
  public SimpleListWrapperApplicationRole getApplicationRoles() {
    return applicationRoles;
  }

   /**
   * Expand options that include additional user details in the response.
   * @return expand
  **/
  @ApiModelProperty(value = "Expand options that include additional user details in the response.")
  public String getExpand() {
    return expand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.self, user.self) &&
        Objects.equals(this.key, user.key) &&
        Objects.equals(this.accountId, user.accountId) &&
        Objects.equals(this.accountType, user.accountType) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.emailAddress, user.emailAddress) &&
        Objects.equals(this.avatarUrls, user.avatarUrls) &&
        Objects.equals(this.displayName, user.displayName) &&
        Objects.equals(this.active, user.active) &&
        Objects.equals(this.timeZone, user.timeZone) &&
        Objects.equals(this.locale, user.locale) &&
        Objects.equals(this.groups, user.groups) &&
        Objects.equals(this.applicationRoles, user.applicationRoles) &&
        Objects.equals(this.expand, user.expand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, key, accountId, accountType, name, emailAddress, avatarUrls, displayName, active, timeZone, locale, groups, applicationRoles, expand);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    applicationRoles: ").append(toIndentedString(applicationRoles)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
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

