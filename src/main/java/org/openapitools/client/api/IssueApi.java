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

import org.openapitools.client.model.CreatedIssue;
import org.openapitools.client.model.CreatedIssues;
import org.openapitools.client.model.ErrorCollection;
import org.openapitools.client.model.IssueBean;
import org.openapitools.client.model.IssueCreateMetadata;
import org.openapitools.client.model.IssuePickerSuggestions;
import org.openapitools.client.model.IssueUpdateDetails;
import org.openapitools.client.model.IssueUpdateMetadata;
import org.openapitools.client.model.IssuesUpdateBean;
import org.openapitools.client.model.Notification;
import org.openapitools.client.model.RemoteIssueLink;
import org.openapitools.client.model.RemoteIssueLinkIdentifies;
import org.openapitools.client.model.RemoteIssueLinkRequest;
import org.openapitools.client.model.Transitions;
import org.openapitools.client.model.User;
import org.openapitools.client.model.Votes;
import org.openapitools.client.model.Watchers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class IssueApi {

  private static final String DEFAULT_BASE_PATH = "http://localhost";


  private static final TypeReference<Object> returnType_addVote = new TypeReference<Object>() {};


  private static final TypeReference<Object> returnType_addWatcher = new TypeReference<Object>() {};


  private static final TypeReference<Object> returnType_assignIssue = new TypeReference<Object>() {};


  private static final TypeReference<CreatedIssue> returnType_createIssue = new TypeReference<CreatedIssue>() {};


  private static final TypeReference<CreatedIssues> returnType_createIssues = new TypeReference<CreatedIssues>() {};


  private static final TypeReference<RemoteIssueLinkIdentifies> returnType_createOrUpdateRemoteIssueLink = new TypeReference<RemoteIssueLinkIdentifies>() {};


  private static final TypeReference<Object> returnType_doTransition = new TypeReference<Object>() {};


  private static final TypeReference<Object> returnType_editIssue = new TypeReference<Object>() {};


  private static final TypeReference<IssueCreateMetadata> returnType_getCreateIssueMeta = new TypeReference<IssueCreateMetadata>() {};


  private static final TypeReference<IssueUpdateMetadata> returnType_getEditIssueMeta = new TypeReference<IssueUpdateMetadata>() {};


  private static final TypeReference<IssueBean> returnType_getIssue = new TypeReference<IssueBean>() {};


  private static final TypeReference<IssuePickerSuggestions> returnType_getIssuePickerResource = new TypeReference<IssuePickerSuggestions>() {};


  private static final TypeReference<Watchers> returnType_getIssueWatchers = new TypeReference<Watchers>() {};


  private static final TypeReference<RemoteIssueLink> returnType_getRemoteIssueLinkById = new TypeReference<RemoteIssueLink>() {};


  private static final TypeReference<RemoteIssueLink> returnType_getRemoteIssueLinks = new TypeReference<RemoteIssueLink>() {};


  private static final TypeReference<Transitions> returnType_getTransitions = new TypeReference<Transitions>() {};


  private static final TypeReference<Votes> returnType_getVotes = new TypeReference<Votes>() {};


  private static final TypeReference<Object> returnType_notify = new TypeReference<Object>() {};


  private static final TypeReference<Object> returnType_updateRemoteIssueLink = new TypeReference<Object>() {};


  private final HttpClient httpClient;

  public IssueApi(HttpClient httpClient) {
    this.httpClient = httpClient;
  }

  /**
   * Add vote
   * <p>Adds the user's vote to an issue. This is the equivalent of the user clicking <em>Vote</em> on an issue in Jira.</p> <p>This operation requires the <strong>Allow users to vote on issues</strong> option to be <em>ON</em>. This option is set in General configuration for Jira. See <a href=\"https://confluence.atlassian.com/x/uYXKM\">Configuring Jira application options</a> for details.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse projects</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is in.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> </ul> 
   * @param issueIdOrKey <p>The ID or key of the issue.</p>  (required)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;Object&gt;
   */
  public Single<Object> addVote(
    String issueIdOrKey, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.POST;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/{issueIdOrKey}/votes";
    if (issueIdOrKey != null) {
      request.pathParams.put("issueIdOrKey", String.valueOf(issueIdOrKey));
    }
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_addVote);
  }

  /**
   * Add watcher
   * <p>Adds a user as a watcher of an issue by passing the account ID of the user. For example, <code>&quot;384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192&quot;</code>. If no user is specified the calling user is added.</p> <p>This operation requires the <strong>Allow users to watch issues</strong> option to be <em>ON</em>. This option is set in General configuration for Jira. See <a href=\"https://confluence.atlassian.com/x/uYXKM\">Configuring Jira application options</a> for details.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse projects</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is in.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> <li>To add users other than themselves to the watchlist, <em>Manage watcher list</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is in.</li> </ul> 
   * @param issueIdOrKey <p>The ID or key of the issue.</p>  (required)
   * @param body <p>The account ID of the user. Note that username cannot be used due to privacy changes.</p>  (required)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;Object&gt;
   */
  public Single<Object> addWatcher(
    String issueIdOrKey, String body, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.POST;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/{issueIdOrKey}/watchers";
    if (issueIdOrKey != null) {
      request.pathParams.put("issueIdOrKey", String.valueOf(issueIdOrKey));
    }
      request.requestBody = Optional.ofNullable(body);
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_addWatcher);
  }

  /**
   * Assign issue
   * <p>Assigns an issue to a user. Use this operation when the calling user does not have the <em>Edit Issues</em> permission but has the <em>Assign issue</em> permission for the project that the issue is in.</p> <p>If <code>name</code> or <code>accountId</code> is set to:</p> <ul> <li><code>&quot;-1&quot;</code>, the issue is assigned to the default assignee for the project.</li> <li><code>null</code>, the issue is set to unassigned.</li> </ul> <p>This operation can be accessed anonymously.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse Projects</em> and <em>Assign Issues</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\"> project permission</a> for the project that the issue is in.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> </ul> 
   * @param issueIdOrKey <p>The ID or key of the issue to be assigned.</p>  (required)
   * @param user <p>The request object with the user that the issue is assigned to.</p>  (required)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;Object&gt;
   */
  public Single<Object> assignIssue(
    String issueIdOrKey, User user, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.PUT;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/{issueIdOrKey}/assignee";
    if (issueIdOrKey != null) {
      request.pathParams.put("issueIdOrKey", String.valueOf(issueIdOrKey));
    }
      request.requestBody = Optional.ofNullable(user);
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_assignIssue);
  }

  /**
   * Create issue
   * <p>Creates an issue or, where the option to create subtasks is enabled in Jira, a subtask. A transition may be applied, to move the issue or subtask to a workflow step other than the default start step, and issue properties set.</p> <p>The content of the issue or subtask is defined using <code>update</code> and <code>fields</code>. The fields that can be set in the issue or subtask are determined using the <a href=\"#api-rest-api-3-issue-createmeta-get\"> Get create issue metadata</a>. These are the same fields that appear on the issue's create screen.</p> <p>Creating a subtask differs from creating an issue as follows:</p> <ul> <li><code>issueType</code> must be set to a subtask issue type (use <a href=\"#api-rest-api-3-issue-createmeta-get\"> Get create issue metadata</a> to find subtask issue types).</li> <li><code>parent</code> MUST contain the ID or key of the parent issue.</li> </ul> <p>A parent MAY be supplied for any issue provided both parent and child are members of the same next-gen project. In a classic project the parent field is only valid for subtasks.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> <em>Browse projects</em> and <em>Create issues</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permissions</a> for the project in which the issue or subtask is created.</p> 
   * @param requestBody  (required)
   * @param updateHistory <p>Indicates whether the project in which the issue is created is added to the user's <strong>Recently viewed</strong> project list, as shown under <strong>Projects</strong> in Jira.</p>  (optional, default to false)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;CreatedIssue&gt;
   */
  public Single<CreatedIssue> createIssue(
    IssueUpdateDetails requestBody, Boolean updateHistory, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.POST;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue";
    if (updateHistory != null) {
      request.queryParams.put("updateHistory", Collections.singleton(String.valueOf(updateHistory)));
    }
      request.requestBody = Optional.ofNullable(requestBody);
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_createIssue);
  }

  /**
   * Bulk create issue
   * <p>Creates issues and, where the option to create subtasks is enabled in Jira, subtasks. Transitions may be applied, to move the issues or subtasks to a workflow step other than the default start step, and issue properties set.</p> <p>The content of each issue or subtask is defined using <code>update</code> and <code>fields</code>. The fields that can be set in the issue or subtask are determined using the <a href=\"#api-rest-api-3-issue-createmeta-get\"> Get create issue metadata</a>. These are the same fields that appear on the issues' create screens.</p> <p>Creating a subtask differs from creating an issue as follows:</p> <ul> <li><code>issueType</code> must be set to a subtask issue type (use <a href=\"#api-rest-api-3-issue-createmeta-get\"> Get create issue metadata</a> to find subtask issue types).</li> <li><code>parent</code> the must contain the ID or key of the parent issue.</li> </ul> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> <em>Browse projects</em> and <em>Create issues</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permissions</a> for the project in which each issue or subtask is created.</p> 
   * @param requestBody  (required)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;CreatedIssues&gt;
   */
  public Single<CreatedIssues> createIssues(
    IssuesUpdateBean requestBody, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.POST;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/bulk";
      request.requestBody = Optional.ofNullable(requestBody);
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_createIssues);
  }

  /**
   * Create or update remote issue link
   * <p>Creates or updates a remote issue link for an issue.</p> <p>If a <code>globalId</code> is provided and a remote issue link with that global ID is found it is updated. Any fields without values in the request are set to null. Otherwise, the remote issue link is created.</p> <p>This operation requires <a href=\"https://confluence.atlassian.com/x/yoXKM\">issue linking to be active</a>.</p> <p>This operation can be accessed anonymously.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse projects</em> and <em>Link issues</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is in.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> </ul> 
   * @param issueIdOrKey <p>The ID or key of the issue.</p>  (required)
   * @param requestBody  (required)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;RemoteIssueLinkIdentifies&gt;
   */
  public Single<RemoteIssueLinkIdentifies> createOrUpdateRemoteIssueLink(
    String issueIdOrKey, RemoteIssueLinkRequest requestBody, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.POST;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/{issueIdOrKey}/remotelink";
    if (issueIdOrKey != null) {
      request.pathParams.put("issueIdOrKey", String.valueOf(issueIdOrKey));
    }
      request.requestBody = Optional.ofNullable(requestBody);
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_createOrUpdateRemoteIssueLink);
  }

  /**
   * Delete issue
   * <p>Deletes an issue.</p> <p>An issue cannot be deleted if it has one or more subtasks. To delete an issue with subtasks, set <code>deleteSubtasks</code>. This causes the issue's subtasks to be deleted with the issue.</p> <p>This operation can be accessed anonymously.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse projects</em> and <em>Delete issues</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project containing the issue.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> </ul> 
   * @param issueIdOrKey <p>The ID or key of the issue.</p>  (required)
   * @param deleteSubtasks <p>Indicates whether the issue's subtasks are deleted when the issue is deleted.</p>  (optional, default to false)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Completable
   */
  public Completable deleteIssue(
    String issueIdOrKey, String deleteSubtasks, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.DELETE;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/{issueIdOrKey}";
    if (issueIdOrKey != null) {
      request.pathParams.put("issueIdOrKey", String.valueOf(issueIdOrKey));
    }
    if (deleteSubtasks != null) {
      request.queryParams.put("deleteSubtasks", Collections.singleton(String.valueOf(deleteSubtasks)));
    }
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request);
  }

  /**
   * Delete remote issue link by global id
   * <p>Deletes the remote issue link from the issue using the link's global ID.</p> <p>This operation requires <a href=\"https://confluence.atlassian.com/x/yoXKM\">issue linking to be active</a>.</p> <p>This operation can be accessed anonymously.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse projects</em> and <em>Link issues</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is in.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is implemented, issue-level security permission to view the issue.</li> </ul> 
   * @param issueIdOrKey <p>The ID or key of the issue.</p>  (required)
   * @param globalId <p>The global ID of a remote issue link.</p>  (optional)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Completable
   */
  public Completable deleteRemoteIssueLinkByGlobalId(
    String issueIdOrKey, String globalId, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.DELETE;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/{issueIdOrKey}/remotelink";
    if (issueIdOrKey != null) {
      request.pathParams.put("issueIdOrKey", String.valueOf(issueIdOrKey));
    }
    if (globalId != null) {
      request.queryParams.put("globalId", Collections.singleton(String.valueOf(globalId)));
    }
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request);
  }

  /**
   * Delete remote issue link by id
   * <p>Deletes a remote issue link from an issue.</p> <p>This operation requires <a href=\"https://confluence.atlassian.com/x/yoXKM\">issue linking to be active</a>.</p> <p>This operation can be accessed anonymously.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse projects</em>, <em>Edit issues</em>, and <em>Link issues</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is in.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> </ul> 
   * @param issueIdOrKey <p>The ID or key of the issue.</p>  (required)
   * @param linkId <p>The ID of a remote issue link.</p>  (required)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Completable
   */
  public Completable deleteRemoteIssueLinkById(
    String issueIdOrKey, String linkId, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.DELETE;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/{issueIdOrKey}/remotelink/{linkId}";
    if (issueIdOrKey != null) {
      request.pathParams.put("issueIdOrKey", String.valueOf(issueIdOrKey));
    }
    if (linkId != null) {
      request.pathParams.put("linkId", String.valueOf(linkId));
    }
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request);
  }

  /**
   * Transition issue
   * <p>Performs an issue transition and, if the transition has a screen, updates the fields from the transition screen.</p> <p>To update the fields on the transition screen, specify the fields in the <code>fields</code> or <code>update</code> parameters in the request body. Get details about the fields using <a href=\"#api-rest-api-3-issue-issueIdOrKey-transitions-get\"> Get transitions</a> with the <code>transitions.fields</code> expand.</p> <p>This operation can be accessed anonymously.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse projects</em> and <em>Transition issues</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is in.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> </ul> 
   * @param issueIdOrKey <p>The ID or key of the issue.</p>  (required)
   * @param requestBody  (required)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;Object&gt;
   */
  public Single<Object> doTransition(
    String issueIdOrKey, IssueUpdateDetails requestBody, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.POST;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/{issueIdOrKey}/transitions";
    if (issueIdOrKey != null) {
      request.pathParams.put("issueIdOrKey", String.valueOf(issueIdOrKey));
    }
      request.requestBody = Optional.ofNullable(requestBody);
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_doTransition);
  }

  /**
   * Edit issue
   * <p>Edits an issue. A transition may be applied and issue properties updated as part of the edit.</p> <p>The edits to the issue's fields are defined using <code>update</code> and <code>fields</code>. The fields that can be edited are determined using <a href=\"#api-rest-api-3-issue-issueIdOrKey-editmeta-get\"> Get edit issue metadata</a>.</p> <p>Connect app users with admin permissions (from user permissions and app scopes) can override the screen security configuration using <code>overrideScreenSecurity</code> and <code>overrideEditableFlag</code>.</p> <p>This operation can be accessed anonymously.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse projects</em> and <em>Edit issues</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is in.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> </ul> 
   * @param issueIdOrKey <p>The ID or key of the issue.</p>  (required)
   * @param requestBody  (required)
   * @param notifyUsers <p>Indicates whether a notification email about the issue update is sent to all watchers. To disable the notification, administer Jira or administer project permissions are required. If the user doesn't have the necessary permission the request is ignored.</p>  (optional, default to true)
   * @param overrideScreenSecurity <p>Indicates whether screen security should be overridden to enable hidden fields to be edited. Available to Connect app users with admin permissions.</p>  (optional, default to false)
   * @param overrideEditableFlag <p>Indicates whether screen security should be overridden to enable uneditable fields to be edited. Available to Connect app users with admin permissions.</p>  (optional, default to false)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;Object&gt;
   */
  public Single<Object> editIssue(
    String issueIdOrKey, IssueUpdateDetails requestBody, Boolean notifyUsers, Boolean overrideScreenSecurity, Boolean overrideEditableFlag, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.PUT;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/{issueIdOrKey}";
    if (issueIdOrKey != null) {
      request.pathParams.put("issueIdOrKey", String.valueOf(issueIdOrKey));
    }
    if (notifyUsers != null) {
      request.queryParams.put("notifyUsers", Collections.singleton(String.valueOf(notifyUsers)));
    }
    if (overrideScreenSecurity != null) {
      request.queryParams.put("overrideScreenSecurity", Collections.singleton(String.valueOf(overrideScreenSecurity)));
    }
    if (overrideEditableFlag != null) {
      request.queryParams.put("overrideEditableFlag", Collections.singleton(String.valueOf(overrideEditableFlag)));
    }
      request.requestBody = Optional.ofNullable(requestBody);
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_editIssue);
  }

  /**
   * Get create issue metadata
   * <p>Returns details of projects, issue types within projects, and, when requested, the create screen fields for each issue type for the user. Use the information to populate the requests in <a href=\"#api-rest-api-3-issue-post\"> Create issue</a> and <a href=\"#api-rest-api-3-issue-bulk-post\">Create issues</a>.</p> <p>The request can be restricted to specific projects or issue types using the query parameters. The response will contain information for the valid projects, issue types, or project and issue type combinations requested. Note that invalid project, issue type, or project and issue type combinations do not generate errors.</p> <p>This operation can be accessed anonymously.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> <em>Create issues</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> in the requested projects.</p> 
   * @param projectIds <p>Comma-separated list of project IDs. This parameter may be specified multiple times. For example, <code>projectIds=10000,10001&amp;projectIds=10020,10021</code>. This parameter may be provided with <code>projectKeys</code>.</p>  (optional, default to new ArrayList&lt;&gt;())
   * @param projectKeys <p>Comma-separated list of project keys. This parameter may be specified multiple times. For example, <code>projectKeys=proj1,proj2&amp;projectKeys=proj3</code>. This parameter may be provided with <code>projectIds</code>.</p>  (optional, default to new ArrayList&lt;&gt;())
   * @param issuetypeIds <p>Comma-separated list of issue type IDs. This parameter may be specified multiple times. For example, <code>issuetypeIds=10000,10001&amp;issuetypeIds=10020,10021</code>. This parameter may be provided with <code>issuetypeNames</code>.</p>  (optional, default to new ArrayList&lt;&gt;())
   * @param issuetypeNames <p>Comma-separated list of issue type names. This parameter may be specified multiple times. For example, <code>issuetypeNames=name1,name2&amp;issuetypeNames=name3</code>. This parameter may be provided with <code>issuetypeIds</code>.</p>  (optional, default to new ArrayList&lt;&gt;())
   * @param expand <p>Use <a href=\"#expansion\">expand</a> to include additional information about issue metadata in the response. This parameter accepts <code>projects.issuetypes.fields</code> which returns information about the fields in the issue creation screen for each issue type. Fields hidden from the screen are not returned. Use the information to populate the <code>fields</code> and <code>update</code> fields in <a href=\"#api-rest-api-3-issue-post\">Create issue</a> and <a href=\"#api-rest-api-3-issue-bulk-post\">Create issues</a>.</p>  (optional)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;IssueCreateMetadata&gt;
   */
  public Single<IssueCreateMetadata> getCreateIssueMeta(
    List<String> projectIds, List<String> projectKeys, List<String> issuetypeIds, List<String> issuetypeNames, String expand, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.GET;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/createmeta";
    if (projectIds != null) {
      request.queryParams.put("projectIds", RestCallUtil.objectCollectionToStringCollection(projectIds));
    }
    if (projectKeys != null) {
      request.queryParams.put("projectKeys", RestCallUtil.objectCollectionToStringCollection(projectKeys));
    }
    if (issuetypeIds != null) {
      request.queryParams.put("issuetypeIds", RestCallUtil.objectCollectionToStringCollection(issuetypeIds));
    }
    if (issuetypeNames != null) {
      request.queryParams.put("issuetypeNames", RestCallUtil.objectCollectionToStringCollection(issuetypeNames));
    }
    if (expand != null) {
      request.queryParams.put("expand", Collections.singleton(String.valueOf(expand)));
    }
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_getCreateIssueMeta);
  }

  /**
   * Get edit issue metadata
   * <p>Returns the edit screen fields for an issue that are visible to and editable by the user. Use the information to populate the requests in <a href=\"#api-rest-api-3-issue-issueIdOrKey-put\">Edit issue</a>.</p> <p>Connect app users with admin permissions (from user permissions and app scopes) can return additional details using:</p> <ul> <li><code>overrideScreenSecurity</code> Returns hidden fields.</li> <li><code>overrideEditableFlag</code> Returns uneditable fields. For example, where an issue has a workflow status of closed none of its fields are editable.</li> </ul> <p>This operation can be accessed anonymously.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse projects</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is in.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> </ul> <p>Note: For any fields to be editable the user must have the <em>Edit issues</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the issue.</p> 
   * @param issueIdOrKey <p>The ID or key of the issue.</p>  (required)
   * @param overrideScreenSecurity <p>Indicates whether hidden fields should be returned. Available to connect app users with admin permissions.</p>  (optional, default to false)
   * @param overrideEditableFlag <p>Indicates whether non-editable fields should be returned. Available to connect app users with admin permissions.</p>  (optional, default to false)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;IssueUpdateMetadata&gt;
   */
  public Single<IssueUpdateMetadata> getEditIssueMeta(
    String issueIdOrKey, Boolean overrideScreenSecurity, Boolean overrideEditableFlag, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.GET;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/{issueIdOrKey}/editmeta";
    if (issueIdOrKey != null) {
      request.pathParams.put("issueIdOrKey", String.valueOf(issueIdOrKey));
    }
    if (overrideScreenSecurity != null) {
      request.queryParams.put("overrideScreenSecurity", Collections.singleton(String.valueOf(overrideScreenSecurity)));
    }
    if (overrideEditableFlag != null) {
      request.queryParams.put("overrideEditableFlag", Collections.singleton(String.valueOf(overrideEditableFlag)));
    }
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_getEditIssueMeta);
  }

  /**
   * Get issue
   * <p>Returns the details for an issue.</p> <p>The issue is identified by its ID or key, however, if the identifier doesn't match an issue, a case-insensitive search and check for moved issues is performed. If a matching issue is found its details are returned, a 302 or other redirect is <strong>not</strong> returned. The issue key returned in the response is the key of the issue found.</p> <p>This operation can be accessed anonymously.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse projects</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is in.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> </ul> 
   * @param issueIdOrKey <p>The ID or key of the issue.</p>  (required)
   * @param fields <p>A comma-separated list of fields to return for the issue. Use it to retrieve a subset of fields. Allowed values:</p> <ul> <li><code>*all</code> Returns all fields.</li> <li><code>*navigable</code> Returns navigable fields.</li> <li>Any issue field, prefixed with a minus to exclude.</li> </ul> <p>Examples:</p> <ul> <li><code>summary,comment</code> Returns only the summary and comments fields.</li> <li><code>-description</code> Returns all (default) fields except description.</li> <li><code>*navigable,-comment</code> Returns all navigable fields except comment.</li> </ul> <p>This parameter may be specified multiple times. For example, <code>fields=field1,field2&amp; fields=field3</code>.</p> <p>Note: All fields are returned by default. This differs from <a href=\"#api-rest-api-3-search-get\">Search for issues using JQL (GET)</a> and <a href=\"#api-rest-api-3-search-post\">Search for issues using JQL (POST)</a> where the default is all navigable fields.</p>  (optional, default to new ArrayList&lt;&gt;())
   * @param fieldsByKeys <p>Indicates whether fields in <code>fields</code> are referenced by keys rather than IDs. This parameter is useful where fields have been added by a connect app and a field's key may differ from its ID.</p>  (optional, default to false)
   * @param expand <p>Use <a href=\"#expansion\">expand</a> to include additional information about the issues in the response. This parameter accepts multiple values separated by a comma:</p> <ul> <li><code>renderedFields</code> Returns field values rendered in HTML format.</li> <li><code>names</code> Returns the display name of each field.</li> <li><code>schema</code> Returns the schema describing a field type.</li> <li><code>transitions</code> Returns all possible transitions for the issue.</li> <li><code>editmeta</code> Returns information about how each field can be edited.</li> <li><code>changelog</code> Returns a list of recent updates to an issue, sorted by date, starting from the most recent.</li> <li><code>versionedRepresentations</code> Returns a JSON array for each version of a field's value, with the highest number representing the most recent version. Note: When included in the request, the <code>fields</code> parameter is ignored.</li> </ul>  (optional)
   * @param properties <p>A comma-separated list of issue properties to return for the issue. Allowed values:</p> <ul> <li><code>*all</code> Returns all issue properties.</li> <li>Any issue property key, prefixed with a minus to exclude.</li> </ul> <p>Examples:</p> <ul> <li><code>*all</code> Returns all properties.</li> <li><code>*all,-prop1</code> Returns all properties except <code>prop1</code>.</li> <li><code>prop1,prop2</code> Returns <code>prop1</code> and <code>prop2</code> properties.</li> </ul> <p>This parameter may be specified multiple times. For example, <code>properties=prop1,prop2&amp; properties=prop3</code>.</p>  (optional, default to new ArrayList&lt;&gt;())
   * @param updateHistory <p>Indicates whether the project in which the issue is created is added to the user's <strong>Recently viewed</strong> project list, as shown under <strong>Projects</strong> in Jira. This also populates the <a href=\"#api-rest-api-3-search-get\">JQL issues search</a> <code>lastViewed</code> field.</p>  (optional, default to false)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;IssueBean&gt;
   */
  public Single<IssueBean> getIssue(
    String issueIdOrKey, List<String> fields, Boolean fieldsByKeys, String expand, List<String> properties, Boolean updateHistory, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.GET;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/{issueIdOrKey}";
    if (issueIdOrKey != null) {
      request.pathParams.put("issueIdOrKey", String.valueOf(issueIdOrKey));
    }
    if (fields != null) {
      request.queryParams.put("fields", RestCallUtil.objectCollectionToStringCollection(fields));
    }
    if (fieldsByKeys != null) {
      request.queryParams.put("fieldsByKeys", Collections.singleton(String.valueOf(fieldsByKeys)));
    }
    if (expand != null) {
      request.queryParams.put("expand", Collections.singleton(String.valueOf(expand)));
    }
    if (properties != null) {
      request.queryParams.put("properties", RestCallUtil.objectCollectionToStringCollection(properties));
    }
    if (updateHistory != null) {
      request.queryParams.put("updateHistory", Collections.singleton(String.valueOf(updateHistory)));
    }
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_getIssue);
  }

  /**
   * Get issue picker suggestions
   * <p>Returns lists of issues matching a query string. Use this resource to provide auto-completion suggestions when the user is looking for an issue using a word or string.</p> <p>This operation returns two lists:</p> <ul> <li><code>History Search</code> which includes issues from the user's history of created, edited, or viewed issues that contain the string in the <code>query</code> parameter.</li> <li><code>Current Search</code> which includes issues that match the JQL expression in <code>currentJQL</code> and contain the string in the <code>query</code> parameter.</li> </ul> <p>This operation can be accessed anonymously.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong> None.</p> 
   * @param query <p>A string to match against text fields in the issue such as title, description, or comments.</p>  (optional)
   * @param currentJQL <p>A JQL query defining a list of issues to search for the query term. Note that <code>username</code> and <code>userkey</code> cannot be used as search terms for this parameter, due to privacy reasons. Use <code>accountId</code> instead.</p>  (optional)
   * @param currentIssueKey <p>The key of an issue to exclude from search results. For example, the issue the user is viewing when they perform this query.</p>  (optional)
   * @param currentProjectId <p>The ID of a project that suggested issues must belong to.</p>  (optional)
   * @param showSubTasks <p>Indicate whether to include subtasks in the suggestions list.</p>  (optional)
   * @param showSubTaskParent <p>When <code>currentIssueKey</code> is a subtask, indicates whether to include the parent issue in the suggestions if it matches the query.</p>  (optional)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;IssuePickerSuggestions&gt;
   */
  public Single<IssuePickerSuggestions> getIssuePickerResource(
    String query, String currentJQL, String currentIssueKey, String currentProjectId, Boolean showSubTasks, Boolean showSubTaskParent, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.GET;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/picker";
    if (query != null) {
      request.queryParams.put("query", Collections.singleton(String.valueOf(query)));
    }
    if (currentJQL != null) {
      request.queryParams.put("currentJQL", Collections.singleton(String.valueOf(currentJQL)));
    }
    if (currentIssueKey != null) {
      request.queryParams.put("currentIssueKey", Collections.singleton(String.valueOf(currentIssueKey)));
    }
    if (currentProjectId != null) {
      request.queryParams.put("currentProjectId", Collections.singleton(String.valueOf(currentProjectId)));
    }
    if (showSubTasks != null) {
      request.queryParams.put("showSubTasks", Collections.singleton(String.valueOf(showSubTasks)));
    }
    if (showSubTaskParent != null) {
      request.queryParams.put("showSubTaskParent", Collections.singleton(String.valueOf(showSubTaskParent)));
    }
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_getIssuePickerResource);
  }

  /**
   * Get issue watchers
   * <p>Returns the watchers for an issue.</p> <p>This operation requires the <strong>Allow users to watch issues</strong> option to be <em>ON</em>. This option is set in General configuration for Jira. See <a href=\"https://confluence.atlassian.com/x/uYXKM\">Configuring Jira application options</a> for details.</p> <p>This operation can be accessed anonymously.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse projects</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is ini</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> <li>To see details of users on the watchlist other than themselves, <em>View voters and watchers</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is in.</li> </ul> 
   * @param issueIdOrKey <p>The ID or key of the issue.</p>  (required)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;Watchers&gt;
   */
  public Single<Watchers> getIssueWatchers(
    String issueIdOrKey, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.GET;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/{issueIdOrKey}/watchers";
    if (issueIdOrKey != null) {
      request.pathParams.put("issueIdOrKey", String.valueOf(issueIdOrKey));
    }
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_getIssueWatchers);
  }

  /**
   * Get remote issue link by id
   * <p>Returns a remote issue link for an issue.</p> <p>This operation requires <a href=\"https://confluence.atlassian.com/x/yoXKM\">issue linking to be active</a>.</p> <p>This operation can be accessed anonymously.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse projects</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is in.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> </ul> 
   * @param issueIdOrKey <p>The ID or key of the issue.</p>  (required)
   * @param linkId <p>The ID of the remote issue link.</p>  (required)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;RemoteIssueLink&gt;
   */
  public Single<RemoteIssueLink> getRemoteIssueLinkById(
    String issueIdOrKey, String linkId, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.GET;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/{issueIdOrKey}/remotelink/{linkId}";
    if (issueIdOrKey != null) {
      request.pathParams.put("issueIdOrKey", String.valueOf(issueIdOrKey));
    }
    if (linkId != null) {
      request.pathParams.put("linkId", String.valueOf(linkId));
    }
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_getRemoteIssueLinkById);
  }

  /**
   * Get remote issue links
   * <p>Returns the remote issue links for an issue. When a remote issue link global ID is provided the record with that global ID is returned, otherwise all remote issue links are returned.</p> <p>This operation requires <a href=\"https://confluence.atlassian.com/x/yoXKM\">issue linking to be active</a>.</p> <p>This operation can be accessed anonymously.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse projects</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is in.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> </ul> 
   * @param issueIdOrKey <p>The ID or key of the issue.</p>  (required)
   * @param globalId <p>The global ID of the remote issue link.</p>  (optional)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;RemoteIssueLink&gt;
   */
  public Single<RemoteIssueLink> getRemoteIssueLinks(
    String issueIdOrKey, String globalId, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.GET;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/{issueIdOrKey}/remotelink";
    if (issueIdOrKey != null) {
      request.pathParams.put("issueIdOrKey", String.valueOf(issueIdOrKey));
    }
    if (globalId != null) {
      request.queryParams.put("globalId", Collections.singleton(String.valueOf(globalId)));
    }
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_getRemoteIssueLinks);
  }

  /**
   * Get transitions
   * <p>Returns either all transitions or a transition that can be performed by the user on an issue, based on the issue's status.</p> <p>Note, if a request is made for a transition that does not exist or cannot be performed on the issue, given its status, the response will return any empty transitions list.</p> <p>This operation can be accessed anonymously.</p> <p><strong><a href=\"#permissions\">Permissions</a> required: A list or transition is returned only when the user has:</strong></p> <ul> <li><em>Browse projects</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is in.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> </ul> <p>However, if the user does not have the <em>Transition issues</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\"> project permission</a> the response will not list any transitions.</p> 
   * @param issueIdOrKey <p>The ID or key of the issue.</p>  (required)
   * @param expand <p>Use <a href=\"#expansion\">expand</a> to include additional information about transitions in the response. This parameter accepts <code>transitions.fields</code> which returns information about the fields in the transition screen for each transition. Fields hidden from the screen are not returned. Use this information to populate the <code>fields</code> and <code>update</code> fields in <a href=\"#api-rest-api-3-issue-issueIdOrKey-transitions-post\">Transition issue</a>.</p>  (optional)
   * @param transitionId <p>The ID of the transition.</p>  (optional)
   * @param skipRemoteOnlyCondition <p>Indicates whether transitions with the condition <em>Hide From User Condition</em> are included in the response.</p>  (optional, default to false)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;Transitions&gt;
   */
  public Single<Transitions> getTransitions(
    String issueIdOrKey, String expand, String transitionId, Boolean skipRemoteOnlyCondition, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.GET;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/{issueIdOrKey}/transitions";
    if (issueIdOrKey != null) {
      request.pathParams.put("issueIdOrKey", String.valueOf(issueIdOrKey));
    }
    if (expand != null) {
      request.queryParams.put("expand", Collections.singleton(String.valueOf(expand)));
    }
    if (transitionId != null) {
      request.queryParams.put("transitionId", Collections.singleton(String.valueOf(transitionId)));
    }
    if (skipRemoteOnlyCondition != null) {
      request.queryParams.put("skipRemoteOnlyCondition", Collections.singleton(String.valueOf(skipRemoteOnlyCondition)));
    }
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_getTransitions);
  }

  /**
   * Get votes
   * <p>Returns details about the votes on an issue.</p> <p>This operation requires the <strong>Allow users to vote on issues</strong> option to be <em>ON</em>. This option is set in General configuration for Jira. See <a href=\"https://confluence.atlassian.com/x/uYXKM\">Configuring Jira application options</a> for details.</p> <p>This operation can be accessed anonymously.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse projects</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is ini</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> </ul> <p>Note that users with the necessary permissions for this operation but without the <em>View voters and watchers</em> project permissions are not returned details in the <code>voters</code> field.</p> 
   * @param issueIdOrKey <p>The ID or key of the issue.</p>  (required)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;Votes&gt;
   */
  public Single<Votes> getVotes(
    String issueIdOrKey, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.GET;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/{issueIdOrKey}/votes";
    if (issueIdOrKey != null) {
      request.pathParams.put("issueIdOrKey", String.valueOf(issueIdOrKey));
    }
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_getVotes);
  }

  /**
   * Send notification for issue
   * <p>Creates an email notification for an issue and adds it to the mail queue.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse Projects</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is in.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> </ul> 
   * @param issueIdOrKey <p>ID or key of the issue that the notification is sent for.</p>  (required)
   * @param requestBody <p>The request object for the notification and recipients.</p>  (required)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;Object&gt;
   */
  public Single<Object> notify(
    String issueIdOrKey, Notification requestBody, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.POST;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/{issueIdOrKey}/notify";
    if (issueIdOrKey != null) {
      request.pathParams.put("issueIdOrKey", String.valueOf(issueIdOrKey));
    }
      request.requestBody = Optional.ofNullable(requestBody);
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_notify);
  }

  /**
   * Delete vote
   * <p>Deletes a user's vote from an issue. This is the equivalent of the user clicking <em>Unvote</em> on an issue in Jira.</p> <p>This operation requires the <strong>Allow users to vote on issues</strong> option to be <em>ON</em>. This option is set in General configuration for Jira. See <a href=\"https://confluence.atlassian.com/x/uYXKM\">Configuring Jira application options</a> for details.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse projects</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is in.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> </ul> 
   * @param issueIdOrKey <p>The ID or key of the issue.</p>  (required)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Completable
   */
  public Completable removeVote(
    String issueIdOrKey, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.DELETE;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/{issueIdOrKey}/votes";
    if (issueIdOrKey != null) {
      request.pathParams.put("issueIdOrKey", String.valueOf(issueIdOrKey));
    }
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request);
  }

  /**
   * Delete watcher
   * <p>Deletes a user as a watcher of an issue.</p> <p>This operation requires the <strong>Allow users to watch issues</strong> option to be <em>ON</em>. This option is set in General configuration for Jira. See <a href=\"https://confluence.atlassian.com/x/uYXKM\">Configuring Jira application options</a> for details.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse projects</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is in.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> <li>To remove users other than themselves from the watchlist, <em>Manage watcher list</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is in.</li> </ul> 
   * @param issueIdOrKey <p>The ID or key of the issue.</p>  (required)
   * @param username <p>This parameter is no longer available and will be removed from the documentation soon. See the <a href=\"&quot;https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/&quot;\">deprecation notice</a> for details.</p>  (optional)
   * @param accountId <p>The accountId of the user, which uniquely identifies the user across all Atlassian products. For example, <em>384093:32b4d9w0-f6a5-3535-11a3-9c8c88d10192</em>. Required.</p>  (optional)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Completable
   */
  public Completable removeWatcher(
    String issueIdOrKey, String username, String accountId, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.DELETE;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/{issueIdOrKey}/watchers";
    if (issueIdOrKey != null) {
      request.pathParams.put("issueIdOrKey", String.valueOf(issueIdOrKey));
    }
    if (username != null) {
      request.queryParams.put("username", Collections.singleton(String.valueOf(username)));
    }
    if (accountId != null) {
      request.queryParams.put("accountId", Collections.singleton(String.valueOf(accountId)));
    }
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request);
  }

  /**
   * Update remote issue link
   * <p>Updates a remote issue link for an issue.</p> <p>Note: Fields without values in the request are set to null.</p> <p>This operation requires <a href=\"https://confluence.atlassian.com/x/yoXKM\">issue linking to be active</a>.</p> <p>This operation can be accessed anonymously.</p> <p><strong><a href=\"#permissions\">Permissions</a> required:</strong></p> <ul> <li><em>Browse projects</em> and <em>Link issues</em> <a href=\"https://confluence.atlassian.com/x/yodKLg\">project permission</a> for the project that the issue is in.</li> <li>If <a href=\"https://confluence.atlassian.com/x/J4lKLg\">issue-level security</a> is configured, issue-level security permission to view the issue.</li> </ul> 
   * @param issueIdOrKey <p>The ID or key of the issue.</p>  (required)
   * @param linkId <p>The ID of the remote issue link.</p>  (required)
   * @param requestBody  (required)
   * @param restRequestInterceptor <p>Adds the possibility to modify the rest request before sending out. This can be useful to add authorizations tokens for example.</p>
   * @return Single&lt;Object&gt;
   */
  public Single<Object> updateRemoteIssueLink(
    String issueIdOrKey, String linkId, RemoteIssueLinkRequest requestBody, Optional<RestRequestInterceptor> restRequestInterceptor) {

    RestRequest request = new RestRequest();
    request.method = HttpMethod.PUT;
    request.basePath = DEFAULT_BASE_PATH;
    request.path = "/rest/api/3/issue/{issueIdOrKey}/remotelink/{linkId}";
    if (issueIdOrKey != null) {
      request.pathParams.put("issueIdOrKey", String.valueOf(issueIdOrKey));
    }
    if (linkId != null) {
      request.pathParams.put("linkId", String.valueOf(linkId));
    }
      request.requestBody = Optional.ofNullable(requestBody);
    
    if (restRequestInterceptor.isPresent()) {
      restRequestInterceptor.get().enhanceRestRequest(request);
    }

    return RestCallUtil.callEndpoint(httpClient, request, returnType_updateRemoteIssueLink);
  }

}
