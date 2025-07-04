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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.intercom.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ListCollectionsRequest.Builder.class)
public final class ListCollectionsRequest {
    private final Optional<Integer> page;

    private final Optional<Integer> perPage;

    private final Map<String, Object> additionalProperties;

    private ListCollectionsRequest(
            Optional<Integer> page, Optional<Integer> perPage, Map<String, Object> additionalProperties) {
        this.page = page;
        this.perPage = perPage;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The page of results to fetch. Defaults to first page
     */
    @JsonProperty("page")
    public Optional<Integer> getPage() {
        return page;
    }

    /**
     * @return How many results to display per page. Defaults to 15
     */
    @JsonProperty("per_page")
    public Optional<Integer> getPerPage() {
        return perPage;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ListCollectionsRequest && equalTo((ListCollectionsRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ListCollectionsRequest other) {
        return page.equals(other.page) && perPage.equals(other.perPage);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.page, this.perPage);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<Integer> page = Optional.empty();

        private Optional<Integer> perPage = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ListCollectionsRequest other) {
            page(other.getPage());
            perPage(other.getPerPage());
            return this;
        }

        /**
         * <p>The page of results to fetch. Defaults to first page</p>
         */
        @JsonSetter(value = "page", nulls = Nulls.SKIP)
        public Builder page(Optional<Integer> page) {
            this.page = page;
            return this;
        }

        public Builder page(Integer page) {
            this.page = Optional.ofNullable(page);
            return this;
        }

        /**
         * <p>How many results to display per page. Defaults to 15</p>
         */
        @JsonSetter(value = "per_page", nulls = Nulls.SKIP)
        public Builder perPage(Optional<Integer> perPage) {
            this.perPage = perPage;
            return this;
        }

        public Builder perPage(Integer perPage) {
            this.perPage = Optional.ofNullable(perPage);
            return this;
        }

        public ListCollectionsRequest build() {
            return new ListCollectionsRequest(page, perPage, additionalProperties);
        }
    }
}
