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

public class AdminsClient {
    protected final ClientOptions clientOptions;

    private final RawAdminsClient rawClient;

    public AdminsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new RawAdminsClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public RawAdminsClient withRawResponse() {
        return this.rawClient;
    }

    /**
     * You can view the currently authorised admin along with the embedded app object (a &quot;workspace&quot; in legacy terminology).
     * <blockquote>
     * <p>🚧 Single Sign On</p>
     * <p>If you are building a custom &quot;Log in with Intercom&quot; flow for your site, and you call the <code>/me</code> endpoint to identify the logged-in user, you should not accept any sign-ins from users with unverified email addresses as it poses a potential impersonation security risk.</p>
     * </blockquote>
     */
    public AdminWithApp identify() {
        return this.rawClient.identify().body();
    }

    /**
     * You can view the currently authorised admin along with the embedded app object (a &quot;workspace&quot; in legacy terminology).
     * <blockquote>
     * <p>🚧 Single Sign On</p>
     * <p>If you are building a custom &quot;Log in with Intercom&quot; flow for your site, and you call the <code>/me</code> endpoint to identify the logged-in user, you should not accept any sign-ins from users with unverified email addresses as it poses a potential impersonation security risk.</p>
     * </blockquote>
     */
    public AdminWithApp identify(RequestOptions requestOptions) {
        return this.rawClient.identify(requestOptions).body();
    }

    /**
     * You can set an Admin as away for the Inbox.
     */
    public Admin away(ConfigureAwayAdminRequest request) {
        return this.rawClient.away(request).body();
    }

    /**
     * You can set an Admin as away for the Inbox.
     */
    public Admin away(ConfigureAwayAdminRequest request, RequestOptions requestOptions) {
        return this.rawClient.away(request, requestOptions).body();
    }

    /**
     * You can get a log of activities by all admins in an app.
     */
    public ActivityLogList listAllActivityLogs(ListAllActivityLogsRequest request) {
        return this.rawClient.listAllActivityLogs(request).body();
    }

    /**
     * You can get a log of activities by all admins in an app.
     */
    public ActivityLogList listAllActivityLogs(ListAllActivityLogsRequest request, RequestOptions requestOptions) {
        return this.rawClient.listAllActivityLogs(request, requestOptions).body();
    }

    /**
     * You can fetch a list of admins for a given workspace.
     */
    public AdminList list() {
        return this.rawClient.list().body();
    }

    /**
     * You can fetch a list of admins for a given workspace.
     */
    public AdminList list(RequestOptions requestOptions) {
        return this.rawClient.list(requestOptions).body();
    }

    /**
     * You can retrieve the details of a single admin.
     */
    public Admin find(FindAdminRequest request) {
        return this.rawClient.find(request).body();
    }

    /**
     * You can retrieve the details of a single admin.
     */
    public Admin find(FindAdminRequest request, RequestOptions requestOptions) {
        return this.rawClient.find(request, requestOptions).body();
    }
}
