package org.openapitools.client.api;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Optional;

import io.reactivex.Single;
import io.reactivex.Completable;

import org.everit.atlassian.restclient.common.RestCallUtil;
import org.everit.atlassian.restclient.common.RestRequest;
import org.everit.atlassian.restclient.common.RestRequestInterceptor;

import org.everit.http.client.HttpClient;
import org.everit.http.client.HttpMethod;
import org.everit.http.client.HttpRequest;

import org.openapitools.client.model.NotificationScheme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class ProjectNotificationSchemeApi {

  private static final String DEFAULT_BASE_PATH = "http://localhost";


  private static final TypeReference<NotificationScheme> returnType_getNotificationScheme = new TypeReference<NotificationScheme>() {};


  private final HttpClient httpClient;

  public ProjectNotificationSchemeApi(HttpClient httpClient) {
    this.httpClient = httpClient;
  }

  /**
   * Get project notification scheme
   * <p>Gets a <a href=\"https://confluence.atlassian.com/x/8YdKLg\">notification scheme</a> associated with the project. See the <a href=\"#api-rest-api-3-notificationscheme-id-get\">Get notification scheme</a> resource for more information about notification schemes.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> <em>Administer Jira</em> <a href=\"https://confluence.atlassian.com/x/x4dKLg\">global permission</a> or <em>Administer Projects</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a>.</p> 
   * @param projectKeyOrId <p>The project ID or project key (case sensitive).</p>  (required)
   * @param expand <p>Use <a href=\"#expansion\">expand</a> to include additional information in the response. This parameter accepts multiple values separated by a comma:</p> <ul> <li><code>all</code> Returns all expandable information.</li> <li><code>field</code> Returns information about any custom fields assigned to receive an event.</li> <li><code>group</code> Returns information about any groups assigned to receive an event.</li> <li><code>notificationSchemeEvents</code> Returns a list of event associations. This list is returned for all expandable information.</li> <li><code>projectRole</code> Returns information about any project roles assigned to receive an event.</li> <li><code>user</code> Returns information about any users assigned to receive an event.</li> </ul>  (optional)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;NotificationScheme&gt;
   */
  public Single<NotificationScheme> getNotificationScheme(
    String projectKeyOrId, String expand, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.GET;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/project/{projectKeyOrId}/notificationscheme";
    if (projectKeyOrId != null) {
      request.pathParams.put("projectKeyOrId", String.valueOf(projectKeyOrId));
    }
    if (expand != null) {
      request.queryParams.put("expand", Collections.singleton(String.valueOf(expand)));
    }
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_getNotificationScheme);
  }

}
