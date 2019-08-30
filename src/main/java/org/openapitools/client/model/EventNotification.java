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
import org.openapitools.client.model.Field;
import org.openapitools.client.model.GroupName;
import org.openapitools.client.model.ProjectRole;
import org.openapitools.client.model.UserDetails;

/**
 * Details about a notification associated with an event.
 */
@ApiModel(description = "Details about a notification associated with an event.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-30T01:56:21.684+02:00[Europe/Prague]")
public class EventNotification {
  @JsonProperty("expand")
  private String expand;

  @JsonProperty("id")
  private Long id;

  /**
   * Identifies the recipients of the notification.
   */
  public enum NotificationTypeEnum {
    CURRENTASSIGNEE("CurrentAssignee"),
    
    REPORTER("Reporter"),
    
    CURRENTUSER("CurrentUser"),
    
    PROJECTLEAD("ProjectLead"),
    
    COMPONENTLEAD("ComponentLead"),
    
    USER("User"),
    
    GROUP("Group"),
    
    PROJECTROLE("ProjectRole"),
    
    EMAILADDRESS("EmailAddress"),
    
    ALLWATCHERS("AllWatchers"),
    
    USERCUSTOMFIELD("UserCustomField"),
    
    GROUPCUSTOMFIELD("GroupCustomField");

    private String value;

    NotificationTypeEnum(String value) {
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
    public static NotificationTypeEnum fromValue(String value) {
      for (NotificationTypeEnum b : NotificationTypeEnum.values()) {
        if (b.value.equalsIgnoreCase(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("notificationType")
  private NotificationTypeEnum notificationType;

  @JsonProperty("parameter")
  private String parameter;

  @JsonProperty("group")
  private GroupName group;

  @JsonProperty("field")
  private Field field;

  @JsonProperty("emailAddress")
  private String emailAddress;

  @JsonProperty("projectRole")
  private ProjectRole projectRole;

  @JsonProperty("user")
  private UserDetails user;

  public EventNotification expand(String expand) {
    this.expand = expand;
    return this;
  }

   /**
   * Expand options that include additional event notification details in the response.
   * @return expand
  **/
  @ApiModelProperty(value = "Expand options that include additional event notification details in the response.")
  public String getExpand() {
    return expand;
  }

  public void setExpand(String expand) {
    this.expand = expand;
  }

  public EventNotification id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the notification.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the notification.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public EventNotification notificationType(NotificationTypeEnum notificationType) {
    this.notificationType = notificationType;
    return this;
  }

   /**
   * Identifies the recipients of the notification.
   * @return notificationType
  **/
  @ApiModelProperty(value = "Identifies the recipients of the notification.")
  public NotificationTypeEnum getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(NotificationTypeEnum notificationType) {
    this.notificationType = notificationType;
  }

  public EventNotification parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

   /**
   * The value of the &#x60;notificationType&#x60;:   *  &#x60;User&#x60; The &#x60;parameter&#x60; is the user key.  *  &#x60;Group&#x60; The &#x60;parameter&#x60; is the group name.  *  &#x60;ProjectRole&#x60; The &#x60;parameter&#x60; is the project role ID.  *  &#x60;UserCustomField&#x60; The &#x60;parameter&#x60; is the ID of the custom field.  *  &#x60;GroupCustomField&#x60; The &#x60;parameter&#x60; is the ID of the custom field.
   * @return parameter
  **/
  @ApiModelProperty(value = "The value of the `notificationType`:   *  `User` The `parameter` is the user key.  *  `Group` The `parameter` is the group name.  *  `ProjectRole` The `parameter` is the project role ID.  *  `UserCustomField` The `parameter` is the ID of the custom field.  *  `GroupCustomField` The `parameter` is the ID of the custom field.")
  public String getParameter() {
    return parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = parameter;
  }

  public EventNotification group(GroupName group) {
    this.group = group;
    return this;
  }

   /**
   * The specified group.
   * @return group
  **/
  @ApiModelProperty(value = "The specified group.")
  public GroupName getGroup() {
    return group;
  }

  public void setGroup(GroupName group) {
    this.group = group;
  }

  public EventNotification field(Field field) {
    this.field = field;
    return this;
  }

   /**
   * The custom user or group field.
   * @return field
  **/
  @ApiModelProperty(value = "The custom user or group field.")
  public Field getField() {
    return field;
  }

  public void setField(Field field) {
    this.field = field;
  }

  public EventNotification emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address.
   * @return emailAddress
  **/
  @ApiModelProperty(value = "The email address.")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public EventNotification projectRole(ProjectRole projectRole) {
    this.projectRole = projectRole;
    return this;
  }

   /**
   * The specified project role.
   * @return projectRole
  **/
  @ApiModelProperty(value = "The specified project role.")
  public ProjectRole getProjectRole() {
    return projectRole;
  }

  public void setProjectRole(ProjectRole projectRole) {
    this.projectRole = projectRole;
  }

  public EventNotification user(UserDetails user) {
    this.user = user;
    return this;
  }

   /**
   * The specified user.
   * @return user
  **/
  @ApiModelProperty(value = "The specified user.")
  public UserDetails getUser() {
    return user;
  }

  public void setUser(UserDetails user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventNotification eventNotification = (EventNotification) o;
    return Objects.equals(this.expand, eventNotification.expand) &&
        Objects.equals(this.id, eventNotification.id) &&
        Objects.equals(this.notificationType, eventNotification.notificationType) &&
        Objects.equals(this.parameter, eventNotification.parameter) &&
        Objects.equals(this.group, eventNotification.group) &&
        Objects.equals(this.field, eventNotification.field) &&
        Objects.equals(this.emailAddress, eventNotification.emailAddress) &&
        Objects.equals(this.projectRole, eventNotification.projectRole) &&
        Objects.equals(this.user, eventNotification.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, id, notificationType, parameter, group, field, emailAddress, projectRole, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventNotification {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    projectRole: ").append(toIndentedString(projectRole)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

