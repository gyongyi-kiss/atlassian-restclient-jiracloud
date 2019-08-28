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

import org.openapitools.client.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class CurrentUserApi {

  private static final String DEFAULT_BASE_PATH = "http://localhost";


  private static final TypeReference<User> returnType_getCurrentUser = new TypeReference<User>() {};


  private final HttpClient httpClient;

  public CurrentUserApi(HttpClient httpClient) {
    this.httpClient = httpClient;
  }

  /**
   * Get current user
   * <p>Returns details for the current user.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> Permission to access Jira.</p> 
   * @param expand <p>Use <a href=\"#expansion\">expand</a> to include additional information about user in the response. This parameter accepts multiple values separated by a comma:</p> <ul> <li><code>groups</code> Returns all groups, including nested groups, the user belongs to.</li> <li><code>applicationRoles</code> Returns the application roles the user is assigned to.</li> </ul>  (optional)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;User&gt;
   */
  public Single<User> getCurrentUser(
    String expand, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.GET;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/myself";
    if (expand != null) {
      request.queryParams.put("expand", Collections.singleton(String.valueOf(expand)));
    }
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_getCurrentUser);
  }

}
