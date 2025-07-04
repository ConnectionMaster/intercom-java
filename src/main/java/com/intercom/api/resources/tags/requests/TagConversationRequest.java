/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.tags.requests;

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
@JsonDeserialize(builder = TagConversationRequest.Builder.class)
public final class TagConversationRequest {
    private final String conversationId;

    private final String tagId;

    private final String adminId;

    private final Map<String, Object> additionalProperties;

    private TagConversationRequest(
            String conversationId, String tagId, String adminId, Map<String, Object> additionalProperties) {
        this.conversationId = conversationId;
        this.tagId = tagId;
        this.adminId = adminId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return conversation_id
     */
    @JsonProperty("conversation_id")
    public String getConversationId() {
        return conversationId;
    }

    /**
     * @return The unique identifier for the tag which is given by Intercom
     */
    @JsonProperty("id")
    public String getTagId() {
        return tagId;
    }

    /**
     * @return The unique identifier for the admin which is given by Intercom.
     */
    @JsonProperty("admin_id")
    public String getAdminId() {
        return adminId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TagConversationRequest && equalTo((TagConversationRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TagConversationRequest other) {
        return conversationId.equals(other.conversationId)
                && tagId.equals(other.tagId)
                && adminId.equals(other.adminId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.conversationId, this.tagId, this.adminId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ConversationIdStage builder() {
        return new Builder();
    }

    public interface ConversationIdStage {
        /**
         * conversation_id
         */
        TagIdStage conversationId(@NotNull String conversationId);

        Builder from(TagConversationRequest other);
    }

    public interface TagIdStage {
        /**
         * The unique identifier for the tag which is given by Intercom
         */
        AdminIdStage tagId(@NotNull String tagId);
    }

    public interface AdminIdStage {
        /**
         * The unique identifier for the admin which is given by Intercom.
         */
        _FinalStage adminId(@NotNull String adminId);
    }

    public interface _FinalStage {
        TagConversationRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ConversationIdStage, TagIdStage, AdminIdStage, _FinalStage {
        private String conversationId;

        private String tagId;

        private String adminId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TagConversationRequest other) {
            conversationId(other.getConversationId());
            tagId(other.getTagId());
            adminId(other.getAdminId());
            return this;
        }

        /**
         * conversation_id<p>conversation_id</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("conversation_id")
        public TagIdStage conversationId(@NotNull String conversationId) {
            this.conversationId = Objects.requireNonNull(conversationId, "conversationId must not be null");
            return this;
        }

        /**
         * The unique identifier for the tag which is given by Intercom<p>The unique identifier for the tag which is given by Intercom</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("id")
        public AdminIdStage tagId(@NotNull String tagId) {
            this.tagId = Objects.requireNonNull(tagId, "tagId must not be null");
            return this;
        }

        /**
         * The unique identifier for the admin which is given by Intercom.<p>The unique identifier for the admin which is given by Intercom.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("admin_id")
        public _FinalStage adminId(@NotNull String adminId) {
            this.adminId = Objects.requireNonNull(adminId, "adminId must not be null");
            return this;
        }

        @java.lang.Override
        public TagConversationRequest build() {
            return new TagConversationRequest(conversationId, tagId, adminId, additionalProperties);
        }
    }
}
