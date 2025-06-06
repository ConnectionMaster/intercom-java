/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.dataattributes;

import com.intercom.api.core.ClientOptions;
import com.intercom.api.core.RequestOptions;
import com.intercom.api.resources.dataattributes.requests.CreateDataAttributeRequest;
import com.intercom.api.resources.dataattributes.requests.ListDataAttributesRequest;
import com.intercom.api.resources.dataattributes.requests.UpdateDataAttributeRequest;
import com.intercom.api.resources.dataattributes.types.DataAttribute;
import com.intercom.api.types.DataAttributeList;

public class DataAttributesClient {
    protected final ClientOptions clientOptions;

    private final RawDataAttributesClient rawClient;

    public DataAttributesClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new RawDataAttributesClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public RawDataAttributesClient withRawResponse() {
        return this.rawClient;
    }

    /**
     * You can fetch a list of all data attributes belonging to a workspace for contacts, companies or conversations.
     */
    public DataAttributeList list() {
        return this.rawClient.list().body();
    }

    /**
     * You can fetch a list of all data attributes belonging to a workspace for contacts, companies or conversations.
     */
    public DataAttributeList list(ListDataAttributesRequest request) {
        return this.rawClient.list(request).body();
    }

    /**
     * You can fetch a list of all data attributes belonging to a workspace for contacts, companies or conversations.
     */
    public DataAttributeList list(ListDataAttributesRequest request, RequestOptions requestOptions) {
        return this.rawClient.list(request, requestOptions).body();
    }

    /**
     * You can create a data attributes for a <code>contact</code> or a <code>company</code>.
     */
    public DataAttribute create(CreateDataAttributeRequest request) {
        return this.rawClient.create(request).body();
    }

    /**
     * You can create a data attributes for a <code>contact</code> or a <code>company</code>.
     */
    public DataAttribute create(CreateDataAttributeRequest request, RequestOptions requestOptions) {
        return this.rawClient.create(request, requestOptions).body();
    }

    /**
     * You can update a data attribute.
     * <blockquote>
     * <p>🚧 Updating the data type is not possible</p>
     * <p>It is currently a dangerous action to execute changing a data attribute's type via the API. You will need to update the type via the UI instead.</p>
     * </blockquote>
     */
    public DataAttribute update(UpdateDataAttributeRequest request) {
        return this.rawClient.update(request).body();
    }

    /**
     * You can update a data attribute.
     * <blockquote>
     * <p>🚧 Updating the data type is not possible</p>
     * <p>It is currently a dangerous action to execute changing a data attribute's type via the API. You will need to update the type via the UI instead.</p>
     * </blockquote>
     */
    public DataAttribute update(UpdateDataAttributeRequest request, RequestOptions requestOptions) {
        return this.rawClient.update(request, requestOptions).body();
    }
}
