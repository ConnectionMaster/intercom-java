/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.unstable.awaystatusreasons;

import com.intercom.api.core.ClientOptions;
import com.intercom.api.core.RequestOptions;
import com.intercom.api.resources.unstable.types.AwayStatusReason;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class AsyncAwayStatusReasonsClient {
    protected final ClientOptions clientOptions;

    private final AsyncRawAwayStatusReasonsClient rawClient;

    public AsyncAwayStatusReasonsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new AsyncRawAwayStatusReasonsClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public AsyncRawAwayStatusReasonsClient withRawResponse() {
        return this.rawClient;
    }

    /**
     * Returns a list of all away status reasons configured for the workspace, including deleted ones.
     */
    public CompletableFuture<List<AwayStatusReason>> listAwayStatusReasons() {
        return this.rawClient.listAwayStatusReasons().thenApply(response -> response.body());
    }

    /**
     * Returns a list of all away status reasons configured for the workspace, including deleted ones.
     */
    public CompletableFuture<List<AwayStatusReason>> listAwayStatusReasons(RequestOptions requestOptions) {
        return this.rawClient.listAwayStatusReasons(requestOptions).thenApply(response -> response.body());
    }
}
