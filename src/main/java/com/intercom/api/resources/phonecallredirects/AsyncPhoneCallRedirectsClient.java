/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.phonecallredirects;

import com.intercom.api.core.ClientOptions;
import com.intercom.api.core.RequestOptions;
import com.intercom.api.resources.phonecallredirects.requests.CreatePhoneCallRedirectRequest;
import com.intercom.api.types.PhoneSwitch;
import java.util.concurrent.CompletableFuture;

public class AsyncPhoneCallRedirectsClient {
    protected final ClientOptions clientOptions;

    private final AsyncRawPhoneCallRedirectsClient rawClient;

    public AsyncPhoneCallRedirectsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new AsyncRawPhoneCallRedirectsClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public AsyncRawPhoneCallRedirectsClient withRawResponse() {
        return this.rawClient;
    }

    /**
     * You can use the API to deflect phone calls to the Intercom Messenger.
     * Calling this endpoint will send an SMS with a link to the Messenger to the phone number specified.
     * <p>If custom attributes are specified, they will be added to the user or lead's custom data attributes.</p>
     */
    public CompletableFuture<PhoneSwitch> create(CreatePhoneCallRedirectRequest request) {
        return this.rawClient.create(request).thenApply(response -> response.body());
    }

    /**
     * You can use the API to deflect phone calls to the Intercom Messenger.
     * Calling this endpoint will send an SMS with a link to the Messenger to the phone number specified.
     * <p>If custom attributes are specified, they will be added to the user or lead's custom data attributes.</p>
     */
    public CompletableFuture<PhoneSwitch> create(
            CreatePhoneCallRedirectRequest request, RequestOptions requestOptions) {
        return this.rawClient.create(request, requestOptions).thenApply(response -> response.body());
    }
}
