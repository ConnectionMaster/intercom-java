/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.helpcenters.collections.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.intercom.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = FindCollectionRequest.Builder.class)
public final class FindCollectionRequest {
    private final String collectionId;

    private final Map<String, Object> additionalProperties;

    private FindCollectionRequest(String collectionId, Map<String, Object> additionalProperties) {
        this.collectionId = collectionId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The unique identifier for the collection which is given by Intercom.
     */
    @JsonProperty("collection_id")
    public String getCollectionId() {
        return collectionId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof FindCollectionRequest && equalTo((FindCollectionRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(FindCollectionRequest other) {
        return collectionId.equals(other.collectionId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.collectionId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CollectionIdStage builder() {
        return new Builder();
    }

    public interface CollectionIdStage {
        /**
         * The unique identifier for the collection which is given by Intercom.
         */
        _FinalStage collectionId(@NotNull String collectionId);

        Builder from(FindCollectionRequest other);
    }

    public interface _FinalStage {
        FindCollectionRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements CollectionIdStage, _FinalStage {
        private String collectionId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(FindCollectionRequest other) {
            collectionId(other.getCollectionId());
            return this;
        }

        /**
         * The unique identifier for the collection which is given by Intercom.<p>The unique identifier for the collection which is given by Intercom.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("collection_id")
        public _FinalStage collectionId(@NotNull String collectionId) {
            this.collectionId = Objects.requireNonNull(collectionId, "collectionId must not be null");
            return this;
        }

        @java.lang.Override
        public FindCollectionRequest build() {
            return new FindCollectionRequest(collectionId, additionalProperties);
        }
    }
}
