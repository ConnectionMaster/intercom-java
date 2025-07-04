/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.unstable.visitors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.intercom.api.core.ClientOptions;
import com.intercom.api.core.IntercomApiException;
import com.intercom.api.core.IntercomException;
import com.intercom.api.core.IntercomHttpResponse;
import com.intercom.api.core.MediaTypes;
import com.intercom.api.core.ObjectMappers;
import com.intercom.api.core.QueryStringMapper;
import com.intercom.api.core.RequestOptions;
import com.intercom.api.resources.unstable.contacts.types.Contact;
import com.intercom.api.resources.unstable.errors.NotFoundError;
import com.intercom.api.resources.unstable.errors.UnauthorizedError;
import com.intercom.api.resources.unstable.types.Error;
import com.intercom.api.resources.unstable.types.Visitor;
import com.intercom.api.resources.unstable.visitors.requests.ConvertVisitorRequest;
import com.intercom.api.resources.unstable.visitors.requests.RetrieveVisitorWithUserIdRequest;
import java.io.IOException;
import java.util.Optional;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class RawVisitorsClient {
    protected final ClientOptions clientOptions;

    public RawVisitorsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * You can fetch the details of a single visitor.
     */
    public IntercomHttpResponse<Optional<Visitor>> retrieveVisitorWithUserId(RetrieveVisitorWithUserIdRequest request) {
        return retrieveVisitorWithUserId(request, null);
    }

    /**
     * You can fetch the details of a single visitor.
     */
    public IntercomHttpResponse<Optional<Visitor>> retrieveVisitorWithUserId(
            RetrieveVisitorWithUserIdRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("visitors");
        QueryStringMapper.addQueryParameter(httpUrl, "user_id", request.getUserId(), false);
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
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return new IntercomHttpResponse<>(
                        ObjectMappers.JSON_MAPPER.readValue(
                                responseBody.string(), new TypeReference<Optional<Visitor>>() {}),
                        response);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 401:
                        throw new UnauthorizedError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Error.class), response);
                    case 404:
                        throw new NotFoundError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class), response);
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new IntercomApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                    response);
        } catch (IOException e) {
            throw new IntercomException("Network error executing HTTP request", e);
        }
    }

    /**
     * Sending a PUT request to <code>/visitors</code> will result in an update of an existing Visitor.
     * <p><strong>Option 1.</strong> You can update a visitor by passing in the <code>user_id</code> of the visitor in the Request body.</p>
     * <p><strong>Option 2.</strong> You can update a visitor by passing in the <code>id</code> of the visitor in the Request body.</p>
     */
    public IntercomHttpResponse<Optional<Visitor>> updateVisitor(Object request) {
        return updateVisitor(request, null);
    }

    /**
     * Sending a PUT request to <code>/visitors</code> will result in an update of an existing Visitor.
     * <p><strong>Option 1.</strong> You can update a visitor by passing in the <code>user_id</code> of the visitor in the Request body.</p>
     * <p><strong>Option 2.</strong> You can update a visitor by passing in the <code>id</code> of the visitor in the Request body.</p>
     */
    public IntercomHttpResponse<Optional<Visitor>> updateVisitor(Object request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("visitors")
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
                .method("PUT", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return new IntercomHttpResponse<>(
                        ObjectMappers.JSON_MAPPER.readValue(
                                responseBody.string(), new TypeReference<Optional<Visitor>>() {}),
                        response);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                switch (response.code()) {
                    case 401:
                        throw new UnauthorizedError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Error.class), response);
                    case 404:
                        throw new NotFoundError(
                                ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class), response);
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new IntercomApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                    response);
        } catch (IOException e) {
            throw new IntercomException("Network error executing HTTP request", e);
        }
    }

    /**
     * You can merge a Visitor to a Contact of role type <code>lead</code> or <code>user</code>.
     * <blockquote>
     * <p>📘 What happens upon a visitor being converted?</p>
     * <p>If the User exists, then the Visitor will be merged into it, the Visitor deleted and the User returned. If the User does not exist, the Visitor will be converted to a User, with the User identifiers replacing it's Visitor identifiers.</p>
     * </blockquote>
     */
    public IntercomHttpResponse<Contact> convertVisitor(ConvertVisitorRequest request) {
        return convertVisitor(request, null);
    }

    /**
     * You can merge a Visitor to a Contact of role type <code>lead</code> or <code>user</code>.
     * <blockquote>
     * <p>📘 What happens upon a visitor being converted?</p>
     * <p>If the User exists, then the Visitor will be merged into it, the Visitor deleted and the User returned. If the User does not exist, the Visitor will be converted to a User, with the User identifiers replacing it's Visitor identifiers.</p>
     * </blockquote>
     */
    public IntercomHttpResponse<Contact> convertVisitor(ConvertVisitorRequest request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("visitors/convert")
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
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return new IntercomHttpResponse<>(
                        ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), Contact.class), response);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                if (response.code() == 401) {
                    throw new UnauthorizedError(
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Error.class), response);
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new IntercomApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class),
                    response);
        } catch (IOException e) {
            throw new IntercomException("Network error executing HTTP request", e);
        }
    }
}
