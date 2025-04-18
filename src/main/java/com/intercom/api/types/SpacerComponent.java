/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.intercom.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = SpacerComponent.Builder.class)
public final class SpacerComponent {
    private final Optional<String> id;

    private final Optional<Size> size;

    private final Map<String, Object> additionalProperties;

    private SpacerComponent(Optional<String> id, Optional<Size> size, Map<String, Object> additionalProperties) {
        this.id = id;
        this.size = size;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return A unique identifier for the component.
     */
    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    /**
     * @return The amount of space between components. Default is <code>s</code>.
     */
    @JsonProperty("size")
    public Optional<Size> getSize() {
        return size;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SpacerComponent && equalTo((SpacerComponent) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SpacerComponent other) {
        return id.equals(other.id) && size.equals(other.size);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.size);
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
        private Optional<String> id = Optional.empty();

        private Optional<Size> size = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(SpacerComponent other) {
            id(other.getId());
            size(other.getSize());
            return this;
        }

        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(String id) {
            this.id = Optional.ofNullable(id);
            return this;
        }

        @JsonSetter(value = "size", nulls = Nulls.SKIP)
        public Builder size(Optional<Size> size) {
            this.size = size;
            return this;
        }

        public Builder size(Size size) {
            this.size = Optional.ofNullable(size);
            return this;
        }

        public SpacerComponent build() {
            return new SpacerComponent(id, size, additionalProperties);
        }
    }

    public enum Size {
        XS("xs"),

        S("s"),

        M("m"),

        L("l"),

        XL("xl");

        private final String value;

        Size(String value) {
            this.value = value;
        }

        @JsonValue
        @java.lang.Override
        public String toString() {
            return this.value;
        }
    }
}
