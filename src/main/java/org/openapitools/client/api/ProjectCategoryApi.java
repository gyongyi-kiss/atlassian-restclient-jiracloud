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

import org.openapitools.client.model.ProjectCategory;
import org.openapitools.client.model.UpdatedProjectCategory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class ProjectCategoryApi {

  private static final String DEFAULT_BASE_PATH = "http://localhost";


  private static final TypeReference<ProjectCategory> returnType_createProjectCategory = new TypeReference<ProjectCategory>() {};


  private static final TypeReference<List<ProjectCategory>> returnType_getAllProjectCategories = new TypeReference<List<ProjectCategory>>() {};


  private static final TypeReference<ProjectCategory> returnType_getProjectCategoryById = new TypeReference<ProjectCategory>() {};


  private static final TypeReference<UpdatedProjectCategory> returnType_updateProjectCategory = new TypeReference<UpdatedProjectCategory>() {};


  private final HttpClient httpClient;

  public ProjectCategoryApi(HttpClient httpClient) {
    this.httpClient = httpClient;
  }

  /**
   * Create project category
   * <p>Creates a project category.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> <em>Administer Jira</em> <a href=\"https://confluence.atlassian.com/x/x4dKLg\">global permission</a>.</p> 
   * @param projectCategory  (required)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;ProjectCategory&gt;
   */
  public Single<ProjectCategory> createProjectCategory(
    ProjectCategory projectCategory, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.POST;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/projectCategory";
      request.requestBody = Optional.ofNullable(projectCategory);
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_createProjectCategory);
  }

  /**
   * Get all project categories
   * <p>Returns all project categories.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> Permission to access Jira.</p> 
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;List&lt;ProjectCategory&gt;&gt;
   */
  public Single<List<ProjectCategory>> getAllProjectCategories(Optional<RestRequestInterceptor> restRequestInterceptor)
     {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.GET;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/projectCategory";
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_getAllProjectCategories);
  }

  /**
   * Get project category by id
   * <p>Returns a project category.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> Permission to access Jira.</p> 
   * @param id <p>The ID of the project category.</p>  (required)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;ProjectCategory&gt;
   */
  public Single<ProjectCategory> getProjectCategoryById(
    Long id, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.GET;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/projectCategory/{id}";
    if (id != null) {
      request.pathParams.put("id", String.valueOf(id));
    }
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_getProjectCategoryById);
  }

  /**
   * Delete project category
   * <p>Deletes a project category.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> <em>Administer Jira</em> <a href=\"https://confluence.atlassian.com/x/x4dKLg\">global permission</a>.</p> 
   * @param id <p>ID of the project category to delete.</p>  (required)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Completable
   */
  public Completable removeProjectCategory(
    Long id, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.DELETE;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/projectCategory/{id}";
    if (id != null) {
      request.pathParams.put("id", String.valueOf(id));
    }
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request);
  }

  /**
   * Update project category
   * <p>Updates a project category.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> <em>Administer Jira</em> <a href=\"https://confluence.atlassian.com/x/x4dKLg\">global permission</a>.</p> 
   * @param id  (required)
   * @param projectCategory  (required)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;UpdatedProjectCategory&gt;
   */
  public Single<UpdatedProjectCategory> updateProjectCategory(
    Long id, ProjectCategory projectCategory, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.PUT;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/projectCategory/{id}";
    if (id != null) {
      request.pathParams.put("id", String.valueOf(id));
    }
      request.requestBody = Optional.ofNullable(projectCategory);
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_updateProjectCategory);
  }

}