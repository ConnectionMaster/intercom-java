/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.unstable.types;

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
@JsonDeserialize(builder = ContactLocation.Builder.class)
public final class ContactLocation {
    private final Optional<String> type;

    private final Optional<String> country;

    private final Optional<String> region;

    private final Optional<String> city;

    private final Map<String, Object> additionalProperties;

    private ContactLocation(
            Optional<String> type,
            Optional<String> country,
            Optional<String> region,
            Optional<String> city,
            Map<String, Object> additionalProperties) {
        this.type = type;
        this.country = country;
        this.region = region;
        this.city = city;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Always location
     */
    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    /**
     * @return The country that the contact is located in
     */
    @JsonProperty("country")
    public Optional<String> getCountry() {
        return country;
    }

    /**
     * @return The overal region that the contact is located in
     */
    @JsonProperty("region")
    public Optional<String> getRegion() {
        return region;
    }

    /**
     * @return The city that the contact is located in
     */
    @JsonProperty("city")
    public Optional<String> getCity() {
        return city;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ContactLocation && equalTo((ContactLocation) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ContactLocation other) {
        return type.equals(other.type)
                && country.equals(other.country)
                && region.equals(other.region)
                && city.equals(other.city);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.type, this.country, this.region, this.city);
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
        private Optional<String> type = Optional.empty();

        private Optional<String> country = Optional.empty();

        private Optional<String> region = Optional.empty();

        private Optional<String> city = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ContactLocation other) {
            type(other.getType());
            country(other.getCountry());
            region(other.getRegion());
            city(other.getCity());
            return this;
        }

        /**
         * <p>Always location</p>
         */
        @JsonSetter(value = "type", nulls = Nulls.SKIP)
        public Builder type(Optional<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(String type) {
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * <p>The country that the contact is located in</p>
         */
        @JsonSetter(value = "country", nulls = Nulls.SKIP)
        public Builder country(Optional<String> country) {
            this.country = country;
            return this;
        }

        public Builder country(String country) {
            this.country = Optional.ofNullable(country);
            return this;
        }

        /**
         * <p>The overal region that the contact is located in</p>
         */
        @JsonSetter(value = "region", nulls = Nulls.SKIP)
        public Builder region(Optional<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(String region) {
            this.region = Optional.ofNullable(region);
            return this;
        }

        /**
         * <p>The city that the contact is located in</p>
         */
        @JsonSetter(value = "city", nulls = Nulls.SKIP)
        public Builder city(Optional<String> city) {
            this.city = city;
            return this;
        }

        public Builder city(String city) {
            this.city = Optional.ofNullable(city);
            return this;
        }

        public ContactLocation build() {
            return new ContactLocation(type, country, region, city, additionalProperties);
        }
    }
}
