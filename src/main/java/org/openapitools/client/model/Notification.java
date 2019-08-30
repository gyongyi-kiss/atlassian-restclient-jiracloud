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
import org.openapitools.client.model.NotificationRecipients;
import org.openapitools.client.model.NotificationRecipientsRestrictions;

/**
 * Details about a notification.
 */
@ApiModel(description = "Details about a notification.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-30T01:56:21.684+02:00[Europe/Prague]")
public class Notification {
  @JsonProperty("subject")
  private String subject;

  @JsonProperty("textBody")
  private String textBody;

  @JsonProperty("htmlBody")
  private String htmlBody;

  @JsonProperty("to")
  private NotificationRecipients to;

  @JsonProperty("restrict")
  private NotificationRecipientsRestrictions restrict;

  private HashMap<String, Object> additionalProperties_ = new HashMap<String, Object>();

  public Notification subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The subject of the email notification for the issue. If this is not specified, then the subject is set to the issue key and summary.
   * @return subject
  **/
  @ApiModelProperty(value = "The subject of the email notification for the issue. If this is not specified, then the subject is set to the issue key and summary.")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Notification textBody(String textBody) {
    this.textBody = textBody;
    return this;
  }

   /**
   * The plain text body of the email notification for the issue.
   * @return textBody
  **/
  @ApiModelProperty(value = "The plain text body of the email notification for the issue.")
  public String getTextBody() {
    return textBody;
  }

  public void setTextBody(String textBody) {
    this.textBody = textBody;
  }

  public Notification htmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
    return this;
  }

   /**
   * The HTML body of the email notification for the issue.
   * @return htmlBody
  **/
  @ApiModelProperty(value = "The HTML body of the email notification for the issue.")
  public String getHtmlBody() {
    return htmlBody;
  }

  public void setHtmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
  }

  public Notification to(NotificationRecipients to) {
    this.to = to;
    return this;
  }

   /**
   * The recipients of the email notification for the issue.
   * @return to
  **/
  @ApiModelProperty(value = "The recipients of the email notification for the issue.")
  public NotificationRecipients getTo() {
    return to;
  }

  public void setTo(NotificationRecipients to) {
    this.to = to;
  }

  public Notification restrict(NotificationRecipientsRestrictions restrict) {
    this.restrict = restrict;
    return this;
  }

   /**
   * Restricts the notifications to users with the specified permissions.
   * @return restrict
  **/
  @ApiModelProperty(value = "Restricts the notifications to users with the specified permissions.")
  public NotificationRecipientsRestrictions getRestrict() {
    return restrict;
  }

  public void setRestrict(NotificationRecipientsRestrictions restrict) {
    this.restrict = restrict;
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
    Notification notification = (Notification) o;
    return Objects.equals(this.subject, notification.subject) &&
        Objects.equals(this.textBody, notification.textBody) &&
        Objects.equals(this.htmlBody, notification.htmlBody) &&
        Objects.equals(this.to, notification.to) &&
        Objects.equals(this.restrict, notification.restrict) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, textBody, htmlBody, to, restrict, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
    sb.append("    htmlBody: ").append(toIndentedString(htmlBody)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    restrict: ").append(toIndentedString(restrict)).append("\n");
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

