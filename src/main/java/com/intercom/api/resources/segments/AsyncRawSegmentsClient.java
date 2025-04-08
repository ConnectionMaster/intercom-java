/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.segments;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.intercom.api.core.ClientOptions;
import com.intercom.api.core.IntercomApiException;
import com.intercom.api.core.IntercomException;
import com.intercom.api.core.IntercomHttpResponse;
import com.intercom.api.core.ObjectMappers;
import com.intercom.api.core.QueryStringMapper;
import com.intercom.api.core.RequestOptions;
import com.intercom.api.errors.NotFoundError;
import com.intercom.api.errors.UnauthorizedError;
import com.intercom.api.resources.segments.requests.FindSegmentRequest;
import com.intercom.api.resources.segments.requests.ListSegmentsRequest;
import com.intercom.api.resources.segments.types.Segment;
import com.intercom.api.types.Error;
import com.intercom.api.types.SegmentList;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

public class AsyncRawSegmentsClient {
    protected final ClientOptions clientOptions;

    public AsyncRawSegmentsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * You can fetch a list of all segments.
     */
    public CompletableFuture<IntercomHttpResponse<SegmentList>> list() {
        return list(ListSegmentsRequest.builder().build());
    }

    /**
     * You can fetch a list of all segments.
     */
    public CompletableFuture<IntercomHttpResponse<SegmentList>> list(ListSegmentsRequest request) {
        return list(request, null);
    }

    /**
     * You can fetch a list of all segments.
     */
    public CompletableFuture<IntercomHttpResponse<SegmentList>> list(
            ListSegmentsRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("segments");
        if (request.getIncludeCount().isPresent()) {
            QueryStringMapper.addQueryParameter(
                    httpUrl, "include_count", request.getIncludeCount().get().toString(), false);
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<IntercomHttpResponse<SegmentList>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new IntercomHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), SegmentList.class),
                                response));
                        return;
                    }
                    String responseBodyString = responseBody != null ? responseBody.string() : "{}";
                    try {
                        if (response.code() == 401) {
                            future.completeExceptionally(new UnauthorizedError(
                                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Error.class), response));
                            return;
                        }
                    } catch (JsonProcessingException ignored) {
                        // unable to map error response, throwing generic error
                    }
                    future.completeExceptionally(new IntercomApiException(
                            "Error with status code " + response.code(),
                            response.code(),
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                            response));
                    return;
                } catch (IOException e) {
                    future.completeExceptionally(new IntercomException("Network error executing HTTP request", e));
                }
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                future.completeExceptionally(new IntercomException("Network error executing HTTP request", e));
            }
        });
        return future;
    }

    /**
     * You can fetch the details of a single segment.
     */
    public CompletableFuture<IntercomHttpResponse<Segment>> find(FindSegmentRequest request) {
        return find(request, null);
    }

    /**
     * You can fetch the details of a single segment.
     */
    public CompletableFuture<IntercomHttpResponse<Segment>> find(
            FindSegmentRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("segments")
                .addPathSegment(request.getSegmentId())
                .build();
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<IntercomHttpResponse<Segment>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new IntercomHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Segment.class), response));
                        return;
                    }
                    String responseBodyString = responseBody != null ? responseBody.string() : "{}";
                    try {
                        switch (response.code()) {
                            case 401:
                                future.completeExceptionally(new UnauthorizedError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Error.class),
                                        response));
                                return;
                            case 404:
                                future.completeExceptionally(new NotFoundError(
                                        ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                                        response));
                                return;
                        }
                    } catch (JsonProcessingException ignored) {
                        // unable to map error response, throwing generic error
                    }
                    future.completeExceptionally(new IntercomApiException(
                            "Error with status code " + response.code(),
                            response.code(),
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                            response));
                    return;
                } catch (IOException e) {
                    future.completeExceptionally(new IntercomException("Network error executing HTTP request", e));
                }
            }

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                future.completeExceptionally(new IntercomException("Network error executing HTTP request", e));
            }
        });
        return future;
    }
}
