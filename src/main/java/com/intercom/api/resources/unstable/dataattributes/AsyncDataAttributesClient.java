/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.unstable.dataattributes;

import com.intercom.api.core.ClientOptions;
import com.intercom.api.core.RequestOptions;
import com.intercom.api.resources.unstable.dataattributes.requests.CreateDataAttributeRequest;
import com.intercom.api.resources.unstable.dataattributes.requests.LisDataAttributesRequest;
import com.intercom.api.resources.unstable.dataattributes.requests.UpdateDataAttributeRequest;
import com.intercom.api.resources.unstable.dataattributes.types.DataAttribute;
import com.intercom.api.resources.unstable.types.DataAttributeList;
import java.util.concurrent.CompletableFuture;

public class AsyncDataAttributesClient {
    protected final ClientOptions clientOptions;

    private final AsyncRawDataAttributesClient rawClient;

    public AsyncDataAttributesClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new AsyncRawDataAttributesClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public AsyncRawDataAttributesClient withRawResponse() {
        return this.rawClient;
    }

    /**
     * You can fetch a list of all data attributes belonging to a workspace for contacts, companies or conversations.
     */
    public CompletableFuture<DataAttributeList> lisDataAttributes() {
        return this.rawClient.lisDataAttributes().thenApply(response -> response.body());
    }

    /**
     * You can fetch a list of all data attributes belonging to a workspace for contacts, companies or conversations.
     */
    public CompletableFuture<DataAttributeList> lisDataAttributes(LisDataAttributesRequest request) {
        return this.rawClient.lisDataAttributes(request).thenApply(response -> response.body());
    }

    /**
     * You can fetch a list of all data attributes belonging to a workspace for contacts, companies or conversations.
     */
    public CompletableFuture<DataAttributeList> lisDataAttributes(
            LisDataAttributesRequest request, RequestOptions requestOptions) {
        return this.rawClient.lisDataAttributes(request, requestOptions).thenApply(response -> response.body());
    }

    /**
     * You can create a data attributes for a <code>contact</code> or a <code>company</code>.
     */
    public CompletableFuture<DataAttribute> createDataAttribute(CreateDataAttributeRequest request) {
        return this.rawClient.createDataAttribute(request).thenApply(response -> response.body());
    }

    /**
     * You can create a data attributes for a <code>contact</code> or a <code>company</code>.
     */
    public CompletableFuture<DataAttribute> createDataAttribute(
            CreateDataAttributeRequest request, RequestOptions requestOptions) {
        return this.rawClient.createDataAttribute(request, requestOptions).thenApply(response -> response.body());
    }

    /**
     * You can update a data attribute.
     * <blockquote>
     * <p>🚧 Updating the data type is not possible</p>
     * <p>It is currently a dangerous action to execute changing a data attribute's type via the API. You will need to update the type via the UI instead.</p>
     * </blockquote>
     */
    public CompletableFuture<DataAttribute> updateDataAttribute(UpdateDataAttributeRequest request) {
        return this.rawClient.updateDataAttribute(request).thenApply(response -> response.body());
    }

    /**
     * You can update a data attribute.
     * <blockquote>
     * <p>🚧 Updating the data type is not possible</p>
     * <p>It is currently a dangerous action to execute changing a data attribute's type via the API. You will need to update the type via the UI instead.</p>
     * </blockquote>
     */
    public CompletableFuture<DataAttribute> updateDataAttribute(
            UpdateDataAttributeRequest request, RequestOptions requestOptions) {
        return this.rawClient.updateDataAttribute(request, requestOptions).thenApply(response -> response.body());
    }
}
