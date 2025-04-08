/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.news.items;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.intercom.api.core.ClientOptions;
import com.intercom.api.core.IntercomApiException;
import com.intercom.api.core.IntercomException;
import com.intercom.api.core.IntercomHttpResponse;
import com.intercom.api.core.MediaTypes;
import com.intercom.api.core.ObjectMappers;
import com.intercom.api.core.RequestOptions;
import com.intercom.api.errors.NotFoundError;
import com.intercom.api.errors.UnauthorizedError;
import com.intercom.api.resources.news.items.requests.DeleteNewsItemRequest;
import com.intercom.api.resources.news.items.requests.FindNewsItemRequest;
import com.intercom.api.resources.news.items.requests.UpdateNewsItemRequest;
import com.intercom.api.resources.news.types.NewsItem;
import com.intercom.api.types.DeletedObject;
import com.intercom.api.types.Error;
import com.intercom.api.types.NewsItemRequest;
import com.intercom.api.types.PaginatedNewsItemResponse;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

public class AsyncRawItemsClient {
    protected final ClientOptions clientOptions;

    public AsyncRawItemsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * You can fetch a list of all news items
     */
    public CompletableFuture<IntercomHttpResponse<PaginatedNewsItemResponse>> list() {
        return list(null);
    }

    /**
     * You can fetch a list of all news items
     */
    public CompletableFuture<IntercomHttpResponse<PaginatedNewsItemResponse>> list(RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("news/news_items")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<IntercomHttpResponse<PaginatedNewsItemResponse>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new IntercomHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(
                                        responseBody.string(), PaginatedNewsItemResponse.class),
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
     * You can create a news item
     */
    public CompletableFuture<IntercomHttpResponse<NewsItem>> create(NewsItemRequest request) {
        return create(request, null);
    }

    /**
     * You can create a news item
     */
    public CompletableFuture<IntercomHttpResponse<NewsItem>> create(
            NewsItemRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("news/news_items")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (JsonProcessingException e) {
            throw new IntercomException("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<IntercomHttpResponse<NewsItem>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new IntercomHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), NewsItem.class), response));
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
     * You can fetch the details of a single news item.
     */
    public CompletableFuture<IntercomHttpResponse<NewsItem>> find(FindNewsItemRequest request) {
        return find(request, null);
    }

    /**
     * You can fetch the details of a single news item.
     */
    public CompletableFuture<IntercomHttpResponse<NewsItem>> find(
            FindNewsItemRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("news/news_items")
                .addPathSegment(request.getNewsItemId())
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
        CompletableFuture<IntercomHttpResponse<NewsItem>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new IntercomHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), NewsItem.class), response));
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

    public CompletableFuture<IntercomHttpResponse<NewsItem>> update(UpdateNewsItemRequest request) {
        return update(request, null);
    }

    public CompletableFuture<IntercomHttpResponse<NewsItem>> update(
            UpdateNewsItemRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("news/news_items")
                .addPathSegment(request.getNewsItemId())
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request.getBody()), MediaTypes.APPLICATION_JSON);
        } catch (JsonProcessingException e) {
            throw new IntercomException("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("PUT", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<IntercomHttpResponse<NewsItem>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new IntercomHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), NewsItem.class), response));
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

    /**
     * You can delete a single news item.
     */
    public CompletableFuture<IntercomHttpResponse<DeletedObject>> delete(DeleteNewsItemRequest request) {
        return delete(request, null);
    }

    /**
     * You can delete a single news item.
     */
    public CompletableFuture<IntercomHttpResponse<DeletedObject>> delete(
            DeleteNewsItemRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("news/news_items")
                .addPathSegment(request.getNewsItemId())
                .build();
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl)
                .method("DELETE", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        CompletableFuture<IntercomHttpResponse<DeletedObject>> future = new CompletableFuture<>();
        client.newCall(okhttpRequest).enqueue(new Callback() {
            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    if (response.isSuccessful()) {
                        future.complete(new IntercomHttpResponse<>(
                                ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), DeletedObject.class),
                                response));
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
