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

import org.openapitools.client.model.IssueLink;
import org.openapitools.client.model.LinkIssueRequestJsonBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class LinkIssueApi {

  private static final String DEFAULT_BASE_PATH = "http://localhost";


  private static final TypeReference<IssueLink> returnType_getIssueLink = new TypeReference<IssueLink>() {};


  private static final TypeReference<Object> returnType_linkIssues = new TypeReference<Object>() {};


  private final HttpClient httpClient;

  public LinkIssueApi(HttpClient httpClient) {
    this.httpClient = httpClient;
  }

  /**
   * Delete issue link
   * <p>Deletes an issue link.</p> <p>This operation can be accessed anonymously.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li>Browse project <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for all the projects containing the issues in the link.</li> <li><em>Link issues</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for at least one of the projects containing issues in the link.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, permission to view both of the issues.</li> </ul> 
   * @param linkId <p>The ID of the issue link.</p>  (required)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Completable
   */
  public Completable deleteIssueLink(
    String linkId, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.DELETE;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issueLink/{linkId}";
    if (linkId != null) {
      request.pathParams.put("linkId", String.valueOf(linkId));
    }
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request);
  }

  /**
   * Get issue link
   * <p>Returns an issue link.</p> <p>This operation can be accessed anonymously.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse project</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for all the projects containing the linked issues.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, permission to view both of the issues.</li> </ul> 
   * @param linkId <p>The ID of the issue link.</p>  (required)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;IssueLink&gt;
   */
  public Single<IssueLink> getIssueLink(
    String linkId, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.GET;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issueLink/{linkId}";
    if (linkId != null) {
      request.pathParams.put("linkId", String.valueOf(linkId));
    }
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_getIssueLink);
  }

  /**
   * Create issue link
   * <p>Creates a link between two issues. Use this operation to indicate a relationship between two issues and optionally add a comment to the from (outward) issue. To use this resource the site must have <a href=\"https://confluence.atlassian.com/x/yoXKM\">Issue Linking</a> enabled.</p> <p>This resource returns nothing on the creation of an issue link. To obtain the ID of the issue link, use <code>https://your-domain.atlassian.net/rest/api/3/issue/[linked issue key]?fields=issuelinks</code>.</p> <p>If the link request duplicates a link, the response indicates that the issue link was created. If the request included a comment, the comment is added.</p> <p>This operation can be accessed anonymously.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse project</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for all the projects containing the issues to be linked,</li> <li><em>Link issues</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> on the project containing the from (outward) issue,</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> <li>If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to.</li> </ul> 
   * @param linkIssueRequestJsonBean <p>The issue link request.</p>  (required)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;Object&gt;
   */
  public Single<Object> linkIssues(
    LinkIssueRequestJsonBean linkIssueRequestJsonBean, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.POST;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issueLink";
      request.requestBody = Optional.ofNullable(linkIssueRequestJsonBean);
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_linkIssues);
  }

}