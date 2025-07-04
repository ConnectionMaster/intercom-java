/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.unstable.switch_;

import com.intercom.api.core.ClientOptions;
import com.intercom.api.core.RequestOptions;
import com.intercom.api.resources.unstable.types.PhoneSwitch;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class AsyncSwitchClient {
    protected final ClientOptions clientOptions;

    private final AsyncRawSwitchClient rawClient;

    public AsyncSwitchClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new AsyncRawSwitchClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public AsyncRawSwitchClient withRawResponse() {
        return this.rawClient;
    }

    /**
     * You can use the API to deflect phone calls to the Intercom Messenger.
     * Calling this endpoint will send an SMS with a link to the Messenger to the phone number specified.
     * <p>If custom attributes are specified, they will be added to the user or lead's custom data attributes.</p>
     */
    public CompletableFuture<Optional<PhoneSwitch>> createPhoneSwitch(Object request) {
        return this.rawClient.createPhoneSwitch(request).thenApply(response -> response.body());
    }

    /**
     * You can use the API to deflect phone calls to the Intercom Messenger.
     * Calling this endpoint will send an SMS with a link to the Messenger to the phone number specified.
     * <p>If custom attributes are specified, they will be added to the user or lead's custom data attributes.</p>
     */
    public CompletableFuture<Optional<PhoneSwitch>> createPhoneSwitch(Object request, RequestOptions requestOptions) {
        return this.rawClient.createPhoneSwitch(request, requestOptions).thenApply(response -> response.body());
    }
}
