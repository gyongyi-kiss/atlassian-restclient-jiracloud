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
import java.util.HashMap;
import java.util.Map;

/**
 * UpdateUserToGroupBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-07T22:31:05.639+02:00[Europe/Prague]")
public class UpdateUserToGroupBean {
/* xxxxxxxxxxxxx Object, , HashMap<String, Object>,  */
  @JsonProperty("name")
  private String name;

  @JsonProperty("accountId")
  private String accountId;

  private HashMap<String, Object> additionalProperties_ = new HashMap<String, Object>();

  public UpdateUserToGroupBean name(String name) {
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

  public UpdateUserToGroupBean accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192*.
   * @return accountId
  **/
  @ApiModelProperty(value = "The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192*.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  @com.fasterxml.jackson.annotation.JsonAnyGetter
  public Map<String, Object> any() {
   return this.additionalProperties_;
  }

  @com.fasterxml.jackson.annotation.JsonAnySetter
  public void set(String name, Object value) {
   this.additionalProperties_.put(name, value);
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserToGroupBean updateUserToGroupBean = (UpdateUserToGroupBean) o;
    return Objects.equals(this.name, updateUserToGroupBean.name) &&
        Objects.equals(this.accountId, updateUserToGroupBean.accountId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, accountId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserToGroupBean {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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

