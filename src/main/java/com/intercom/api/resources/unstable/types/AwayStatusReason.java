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
@JsonDeserialize(builder = AwayStatusReason.Builder.class)
public final class AwayStatusReason {
    private final Optional<String> type;

    private final Optional<String> id;

    private final Optional<String> label;

    private final Optional<String> emoji;

    private final Optional<Integer> order;

    private final Optional<Boolean> deleted;

    private final Optional<Integer> createdAt;

    private final Optional<Integer> updatedAt;

    private final Map<String, Object> additionalProperties;

    private AwayStatusReason(
            Optional<String> type,
            Optional<String> id,
            Optional<String> label,
            Optional<String> emoji,
            Optional<Integer> order,
            Optional<Boolean> deleted,
            Optional<Integer> createdAt,
            Optional<Integer> updatedAt,
            Map<String, Object> additionalProperties) {
        this.type = type;
        this.id = id;
        this.label = label;
        this.emoji = emoji;
        this.order = order;
        this.deleted = deleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    /**
     * @return The unique identifier for the away status reason
     */
    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    /**
     * @return The display text for the away status reason
     */
    @JsonProperty("label")
    public Optional<String> getLabel() {
        return label;
    }

    /**
     * @return The emoji associated with the status reason
     */
    @JsonProperty("emoji")
    public Optional<String> getEmoji() {
        return emoji;
    }

    /**
     * @return The display order of the status reason
     */
    @JsonProperty("order")
    public Optional<Integer> getOrder() {
        return order;
    }

    /**
     * @return Whether the status reason has been soft deleted
     */
    @JsonProperty("deleted")
    public Optional<Boolean> getDeleted() {
        return deleted;
    }

    /**
     * @return The Unix timestamp when the status reason was created
     */
    @JsonProperty("created_at")
    public Optional<Integer> getCreatedAt() {
        return createdAt;
    }

    /**
     * @return The Unix timestamp when the status reason was last updated
     */
    @JsonProperty("updated_at")
    public Optional<Integer> getUpdatedAt() {
        return updatedAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AwayStatusReason && equalTo((AwayStatusReason) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AwayStatusReason other) {
        return type.equals(other.type)
                && id.equals(other.id)
                && label.equals(other.label)
                && emoji.equals(other.emoji)
                && order.equals(other.order)
                && deleted.equals(other.deleted)
                && createdAt.equals(other.createdAt)
                && updatedAt.equals(other.updatedAt);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.type, this.id, this.label, this.emoji, this.order, this.deleted, this.createdAt, this.updatedAt);
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

        private Optional<String> label = Optional.empty();

        private Optional<String> emoji = Optional.empty();

        private Optional<Integer> order = Optional.empty();

        private Optional<Boolean> deleted = Optional.empty();

        private Optional<Integer> createdAt = Optional.empty();

        private Optional<Integer> updatedAt = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(AwayStatusReason other) {
            type(other.getType());
            id(other.getId());
            label(other.getLabel());
            emoji(other.getEmoji());
            order(other.getOrder());
            deleted(other.getDeleted());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            return this;
        }

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
         * <p>The unique identifier for the away status reason</p>
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
         * <p>The display text for the away status reason</p>
         */
        @JsonSetter(value = "label", nulls = Nulls.SKIP)
        public Builder label(Optional<String> label) {
            this.label = label;
            return this;
        }

        public Builder label(String label) {
            this.label = Optional.ofNullable(label);
            return this;
        }

        /**
         * <p>The emoji associated with the status reason</p>
         */
        @JsonSetter(value = "emoji", nulls = Nulls.SKIP)
        public Builder emoji(Optional<String> emoji) {
            this.emoji = emoji;
            return this;
        }

        public Builder emoji(String emoji) {
            this.emoji = Optional.ofNullable(emoji);
            return this;
        }

        /**
         * <p>The display order of the status reason</p>
         */
        @JsonSetter(value = "order", nulls = Nulls.SKIP)
        public Builder order(Optional<Integer> order) {
            this.order = order;
            return this;
        }

        public Builder order(Integer order) {
            this.order = Optional.ofNullable(order);
            return this;
        }

        /**
         * <p>Whether the status reason has been soft deleted</p>
         */
        @JsonSetter(value = "deleted", nulls = Nulls.SKIP)
        public Builder deleted(Optional<Boolean> deleted) {
            this.deleted = deleted;
            return this;
        }

        public Builder deleted(Boolean deleted) {
            this.deleted = Optional.ofNullable(deleted);
            return this;
        }

        /**
         * <p>The Unix timestamp when the status reason was created</p>
         */
        @JsonSetter(value = "created_at", nulls = Nulls.SKIP)
        public Builder createdAt(Optional<Integer> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(Integer createdAt) {
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        /**
         * <p>The Unix timestamp when the status reason was last updated</p>
         */
        @JsonSetter(value = "updated_at", nulls = Nulls.SKIP)
        public Builder updatedAt(Optional<Integer> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedAt(Integer updatedAt) {
            this.updatedAt = Optional.ofNullable(updatedAt);
            return this;
        }

        public AwayStatusReason build() {
            return new AwayStatusReason(
                    type, id, label, emoji, order, deleted, createdAt, updatedAt, additionalProperties);
        }
    }
}
