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
import com.intercom.api.resources.unstable.conversations.types.Conversation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ConversationList.Builder.class)
public final class ConversationList {
    private final Optional<String> type;

    private final Optional<List<Conversation>> conversations;

    private final Optional<Integer> totalCount;

    private final Optional<CursorPages> pages;

    private final Map<String, Object> additionalProperties;

    private ConversationList(
            Optional<String> type,
            Optional<List<Conversation>> conversations,
            Optional<Integer> totalCount,
            Optional<CursorPages> pages,
            Map<String, Object> additionalProperties) {
        this.type = type;
        this.conversations = conversations;
        this.totalCount = totalCount;
        this.pages = pages;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Always conversation.list
     */
    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    /**
     * @return The list of conversation objects
     */
    @JsonProperty("conversations")
    public Optional<List<Conversation>> getConversations() {
        return conversations;
    }

    /**
     * @return A count of the total number of objects.
     */
    @JsonProperty("total_count")
    public Optional<Integer> getTotalCount() {
        return totalCount;
    }

    @JsonProperty("pages")
    public Optional<CursorPages> getPages() {
        return pages;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConversationList && equalTo((ConversationList) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ConversationList other) {
        return type.equals(other.type)
                && conversations.equals(other.conversations)
                && totalCount.equals(other.totalCount)
                && pages.equals(other.pages);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.type, this.conversations, this.totalCount, this.pages);
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

        private Optional<List<Conversation>> conversations = Optional.empty();

        private Optional<Integer> totalCount = Optional.empty();

        private Optional<CursorPages> pages = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ConversationList other) {
            type(other.getType());
            conversations(other.getConversations());
            totalCount(other.getTotalCount());
            pages(other.getPages());
            return this;
        }

        /**
         * <p>Always conversation.list</p>
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
         * <p>The list of conversation objects</p>
         */
        @JsonSetter(value = "conversations", nulls = Nulls.SKIP)
        public Builder conversations(Optional<List<Conversation>> conversations) {
            this.conversations = conversations;
            return this;
        }

        public Builder conversations(List<Conversation> conversations) {
            this.conversations = Optional.ofNullable(conversations);
            return this;
        }

        /**
         * <p>A count of the total number of objects.</p>
         */
        @JsonSetter(value = "total_count", nulls = Nulls.SKIP)
        public Builder totalCount(Optional<Integer> totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public Builder totalCount(Integer totalCount) {
            this.totalCount = Optional.ofNullable(totalCount);
            return this;
        }

        @JsonSetter(value = "pages", nulls = Nulls.SKIP)
        public Builder pages(Optional<CursorPages> pages) {
            this.pages = pages;
            return this;
        }

        public Builder pages(CursorPages pages) {
            this.pages = Optional.ofNullable(pages);
            return this;
        }

        public ConversationList build() {
            return new ConversationList(type, conversations, totalCount, pages, additionalProperties);
        }
    }
}
