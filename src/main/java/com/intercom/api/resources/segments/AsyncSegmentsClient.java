/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.segments;

import com.intercom.api.core.ClientOptions;
import com.intercom.api.core.RequestOptions;
import com.intercom.api.resources.segments.requests.FindSegmentRequest;
import com.intercom.api.resources.segments.requests.ListSegmentsRequest;
import com.intercom.api.resources.segments.types.Segment;
import com.intercom.api.types.SegmentList;
import java.util.concurrent.CompletableFuture;

public class AsyncSegmentsClient {
    protected final ClientOptions clientOptions;

    private final AsyncRawSegmentsClient rawClient;

    public AsyncSegmentsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new AsyncRawSegmentsClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public AsyncRawSegmentsClient withRawResponse() {
        return this.rawClient;
    }

    /**
     * You can fetch a list of all segments.
     */
    public CompletableFuture<SegmentList> list() {
        return this.rawClient.list().thenApply(response -> response.body());
    }

    /**
     * You can fetch a list of all segments.
     */
    public CompletableFuture<SegmentList> list(ListSegmentsRequest request) {
        return this.rawClient.list(request).thenApply(response -> response.body());
    }

    /**
     * You can fetch a list of all segments.
     */
    public CompletableFuture<SegmentList> list(ListSegmentsRequest request, RequestOptions requestOptions) {
        return this.rawClient.list(request, requestOptions).thenApply(response -> response.body());
    }

    /**
     * You can fetch the details of a single segment.
     */
    public CompletableFuture<Segment> find(FindSegmentRequest request) {
        return this.rawClient.find(request).thenApply(response -> response.body());
    }

    /**
     * You can fetch the details of a single segment.
     */
    public CompletableFuture<Segment> find(FindSegmentRequest request, RequestOptions requestOptions) {
        return this.rawClient.find(request, requestOptions).thenApply(response -> response.body());
    }
}
