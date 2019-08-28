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
import org.openapitools.client.model.RegisteredWebhook;

/**
 * Container for a list of registered webhooks. Webhook details are returned in the same order as the request.
 */
@ApiModel(description = "Container for a list of registered webhooks. Webhook details are returned in the same order as the request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-08-07T22:31:05.639+02:00[Europe/Prague]")
public class ContainerForRegisteredWebhooks {
/* xxxxxxxxxxxxx , , ,  */
  @JsonProperty("webhookRegistrationResult")
  private List<RegisteredWebhook> webhookRegistrationResult = new ArrayList<>();

  public ContainerForRegisteredWebhooks webhookRegistrationResult(List<RegisteredWebhook> webhookRegistrationResult) {
    this.webhookRegistrationResult = webhookRegistrationResult;
    return this;
  }

  public ContainerForRegisteredWebhooks addWebhookRegistrationResultItem(RegisteredWebhook webhookRegistrationResultItem) {
    if (this.webhookRegistrationResult == null) {
      this.webhookRegistrationResult = new ArrayList<>();
    }
    this.webhookRegistrationResult.add(webhookRegistrationResultItem);
    return this;
  }

   /**
   * A list of registered webhooks.
   * @return webhookRegistrationResult
  **/
  @ApiModelProperty(value = "A list of registered webhooks.")
  public List<RegisteredWebhook> getWebhookRegistrationResult() {
    return webhookRegistrationResult;
  }

  public void setWebhookRegistrationResult(List<RegisteredWebhook> webhookRegistrationResult) {
    this.webhookRegistrationResult = webhookRegistrationResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerForRegisteredWebhooks containerForRegisteredWebhooks = (ContainerForRegisteredWebhooks) o;
    return Objects.equals(this.webhookRegistrationResult, containerForRegisteredWebhooks.webhookRegistrationResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookRegistrationResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerForRegisteredWebhooks {\n");
    sb.append("    webhookRegistrationResult: ").append(toIndentedString(webhookRegistrationResult)).append("\n");
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

