/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.unstable.articles.requests;

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

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = RetrieveArticleRequest.Builder.class)
public final class RetrieveArticleRequest {
    private final int id;

    private final Map<String, Object> additionalProperties;

    private RetrieveArticleRequest(int id, Map<String, Object> additionalProperties) {
        this.id = id;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The unique identifier for the article which is given by Intercom.
     */
    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RetrieveArticleRequest && equalTo((RetrieveArticleRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(RetrieveArticleRequest other) {
        return id == other.id;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        /**
         * The unique identifier for the article which is given by Intercom.
         */
        _FinalStage id(int id);

        Builder from(RetrieveArticleRequest other);
    }

    public interface _FinalStage {
        RetrieveArticleRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, _FinalStage {
        private int id;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(RetrieveArticleRequest other) {
            id(other.getId());
            return this;
        }

        /**
         * The unique identifier for the article which is given by Intercom.<p>The unique identifier for the article which is given by Intercom.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("id")
        public _FinalStage id(int id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        public RetrieveArticleRequest build() {
            return new RetrieveArticleRequest(id, additionalProperties);
        }
    }
}
