/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.admins;

import com.intercom.api.core.ClientOptions;
import com.intercom.api.core.RequestOptions;
import com.intercom.api.resources.admins.requests.ConfigureAwayAdminRequest;
import com.intercom.api.resources.admins.requests.FindAdminRequest;
import com.intercom.api.resources.admins.requests.ListAllActivityLogsRequest;
import com.intercom.api.resources.admins.types.Admin;
import com.intercom.api.types.ActivityLogList;
import com.intercom.api.types.AdminList;
import com.intercom.api.types.AdminWithApp;
import java.util.concurrent.CompletableFuture;

public class AsyncAdminsClient {
    protected final ClientOptions clientOptions;

    private final AsyncRawAdminsClient rawClient;

    public AsyncAdminsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new AsyncRawAdminsClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public AsyncRawAdminsClient withRawResponse() {
        return this.rawClient;
    }

    /**
     * You can view the currently authorised admin along with the embedded app object (a &quot;workspace&quot; in legacy terminology).
     * <blockquote>
     * <p>🚧 Single Sign On</p>
     * <p>If you are building a custom &quot;Log in with Intercom&quot; flow for your site, and you call the <code>/me</code> endpoint to identify the logged-in user, you should not accept any sign-ins from users with unverified email addresses as it poses a potential impersonation security risk.</p>
     * </blockquote>
     */
    public CompletableFuture<AdminWithApp> identify() {
        return this.rawClient.identify().thenApply(response -> response.body());
    }

    /**
     * You can view the currently authorised admin along with the embedded app object (a &quot;workspace&quot; in legacy terminology).
     * <blockquote>
     * <p>🚧 Single Sign On</p>
     * <p>If you are building a custom &quot;Log in with Intercom&quot; flow for your site, and you call the <code>/me</code> endpoint to identify the logged-in user, you should not accept any sign-ins from users with unverified email addresses as it poses a potential impersonation security risk.</p>
     * </blockquote>
     */
    public CompletableFuture<AdminWithApp> identify(RequestOptions requestOptions) {
        return this.rawClient.identify(requestOptions).thenApply(response -> response.body());
    }

    /**
     * You can set an Admin as away for the Inbox.
     */
    public CompletableFuture<Admin> away(ConfigureAwayAdminRequest request) {
        return this.rawClient.away(request).thenApply(response -> response.body());
    }

    /**
     * You can set an Admin as away for the Inbox.
     */
    public CompletableFuture<Admin> away(ConfigureAwayAdminRequest request, RequestOptions requestOptions) {
        return this.rawClient.away(request, requestOptions).thenApply(response -> response.body());
    }

    /**
     * You can get a log of activities by all admins in an app.
     */
    public CompletableFuture<ActivityLogList> listAllActivityLogs(ListAllActivityLogsRequest request) {
        return this.rawClient.listAllActivityLogs(request).thenApply(response -> response.body());
    }

    /**
     * You can get a log of activities by all admins in an app.
     */
    public CompletableFuture<ActivityLogList> listAllActivityLogs(
            ListAllActivityLogsRequest request, RequestOptions requestOptions) {
        return this.rawClient.listAllActivityLogs(request, requestOptions).thenApply(response -> response.body());
    }

    /**
     * You can fetch a list of admins for a given workspace.
     */
    public CompletableFuture<AdminList> list() {
        return this.rawClient.list().thenApply(response -> response.body());
    }

    /**
     * You can fetch a list of admins for a given workspace.
     */
    public CompletableFuture<AdminList> list(RequestOptions requestOptions) {
        return this.rawClient.list(requestOptions).thenApply(response -> response.body());
    }

    /**
     * You can retrieve the details of a single admin.
     */
    public CompletableFuture<Admin> find(FindAdminRequest request) {
        return this.rawClient.find(request).thenApply(response -> response.body());
    }

    /**
     * You can retrieve the details of a single admin.
     */
    public CompletableFuture<Admin> find(FindAdminRequest request, RequestOptions requestOptions) {
        return this.rawClient.find(request, requestOptions).thenApply(response -> response.body());
    }
}
