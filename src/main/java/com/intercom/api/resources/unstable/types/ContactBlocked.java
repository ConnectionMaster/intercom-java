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
@JsonDeserialize(builder = ContactBlocked.Builder.class)
public final class ContactBlocked implements IContactReference {
    private final Optional<String> type;

    private final Optional<String> id;

    private final Optional<String> externalId;

    private final Optional<Boolean> blocked;

    private final Map<String, Object> additionalProperties;

    private ContactBlocked(
            Optional<String> type,
            Optional<String> id,
            Optional<String> externalId,
            Optional<Boolean> blocked,
            Map<String, Object> additionalProperties) {
        this.type = type;
        this.id = id;
        this.externalId = externalId;
        this.blocked = blocked;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return always contact
     */
    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    /**
     * @return The unique identifier for the contact which is given by Intercom.
     */
    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    /**
     * @return The unique identifier for the contact which is provided by the Client.
     */
    @JsonProperty("external_id")
    public Optional<String> getExternalId() {
        return externalId;
    }

    /**
     * @return Always true.
     */
    @JsonProperty("blocked")
    public Optional<Boolean> getBlocked() {
        return blocked;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ContactBlocked && equalTo((ContactBlocked) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ContactBlocked other) {
        return type.equals(other.type)
                && id.equals(other.id)
                && externalId.equals(other.externalId)
                && blocked.equals(other.blocked);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.type, this.id, this.externalId, this.blocked);
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

        private Optional<String> id = Optional.empty();

        private Optional<String> externalId = Optional.empty();

        private Optional<Boolean> blocked = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ContactBlocked other) {
            type(other.getType());
            id(other.getId());
            externalId(other.getExternalId());
            blocked(other.getBlocked());
            return this;
        }

        /**
         * <p>always contact</p>
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
         * <p>The unique identifier for the contact which is given by Intercom.</p>
         */
        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(String id) {
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * <p>The unique identifier for the contact which is provided by the Client.</p>
         */
        @JsonSetter(value = "external_id", nulls = Nulls.SKIP)
        public Builder externalId(Optional<String> externalId) {
            this.externalId = externalId;
            return this;
        }

        public Builder externalId(String externalId) {
            this.externalId = Optional.ofNullable(externalId);
            return this;
        }

        /**
         * <p>Always true.</p>
         */
        @JsonSetter(value = "blocked", nulls = Nulls.SKIP)
        public Builder blocked(Optional<Boolean> blocked) {
            this.blocked = blocked;
            return this;
        }

        public Builder blocked(Boolean blocked) {
            this.blocked = Optional.ofNullable(blocked);
            return this;
        }

        public ContactBlocked build() {
            return new ContactBlocked(type, id, externalId, blocked, additionalProperties);
        }
    }
}
