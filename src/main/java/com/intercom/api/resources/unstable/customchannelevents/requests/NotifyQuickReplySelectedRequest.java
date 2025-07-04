/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.unstable.customchannelevents.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.intercom.api.core.ObjectMappers;
import com.intercom.api.resources.unstable.types.CustomChannelContact;
import com.intercom.api.resources.unstable.types.ICustomChannelBaseEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = NotifyQuickReplySelectedRequest.Builder.class)
public final class NotifyQuickReplySelectedRequest implements ICustomChannelBaseEvent {
    private final String eventId;

    private final String externalConversationId;

    private final CustomChannelContact contact;

    private final String quickReplyOptionId;

    private final Map<String, Object> additionalProperties;

    private NotifyQuickReplySelectedRequest(
            String eventId,
            String externalConversationId,
            CustomChannelContact contact,
            String quickReplyOptionId,
            Map<String, Object> additionalProperties) {
        this.eventId = eventId;
        this.externalConversationId = externalConversationId;
        this.contact = contact;
        this.quickReplyOptionId = quickReplyOptionId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Unique identifier for the event.
     */
    @JsonProperty("event_id")
    public String getEventId() {
        return eventId;
    }

    /**
     * @return Identifier for the conversation in your application.
     */
    @JsonProperty("external_conversation_id")
    public String getExternalConversationId() {
        return externalConversationId;
    }

    @JsonProperty("contact")
    public CustomChannelContact getContact() {
        return contact;
    }

    /**
     * @return Id of the selected quick reply option.
     */
    @JsonProperty("quick_reply_option_id")
    public String getQuickReplyOptionId() {
        return quickReplyOptionId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NotifyQuickReplySelectedRequest && equalTo((NotifyQuickReplySelectedRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(NotifyQuickReplySelectedRequest other) {
        return eventId.equals(other.eventId)
                && externalConversationId.equals(other.externalConversationId)
                && contact.equals(other.contact)
                && quickReplyOptionId.equals(other.quickReplyOptionId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.eventId, this.externalConversationId, this.contact, this.quickReplyOptionId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static EventIdStage builder() {
        return new Builder();
    }

    public interface EventIdStage {
        /**
         * Unique identifier for the event.
         */
        ExternalConversationIdStage eventId(@NotNull String eventId);

        Builder from(NotifyQuickReplySelectedRequest other);
    }

    public interface ExternalConversationIdStage {
        /**
         * Identifier for the conversation in your application.
         */
        ContactStage externalConversationId(@NotNull String externalConversationId);
    }

    public interface ContactStage {
        QuickReplyOptionIdStage contact(@NotNull CustomChannelContact contact);
    }

    public interface QuickReplyOptionIdStage {
        /**
         * Id of the selected quick reply option.
         */
        _FinalStage quickReplyOptionId(@NotNull String quickReplyOptionId);
    }

    public interface _FinalStage {
        NotifyQuickReplySelectedRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements EventIdStage, ExternalConversationIdStage, ContactStage, QuickReplyOptionIdStage, _FinalStage {
        private String eventId;

        private String externalConversationId;

        private CustomChannelContact contact;

        private String quickReplyOptionId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(NotifyQuickReplySelectedRequest other) {
            eventId(other.getEventId());
            externalConversationId(other.getExternalConversationId());
            contact(other.getContact());
            quickReplyOptionId(other.getQuickReplyOptionId());
            return this;
        }

        /**
         * Unique identifier for the event.<p>Unique identifier for the event.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("event_id")
        public ExternalConversationIdStage eventId(@NotNull String eventId) {
            this.eventId = Objects.requireNonNull(eventId, "eventId must not be null");
            return this;
        }

        /**
         * Identifier for the conversation in your application.<p>Identifier for the conversation in your application.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("external_conversation_id")
        public ContactStage externalConversationId(@NotNull String externalConversationId) {
            this.externalConversationId =
                    Objects.requireNonNull(externalConversationId, "externalConversationId must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("contact")
        public QuickReplyOptionIdStage contact(@NotNull CustomChannelContact contact) {
            this.contact = Objects.requireNonNull(contact, "contact must not be null");
            return this;
        }

        /**
         * Id of the selected quick reply option.<p>Id of the selected quick reply option.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("quick_reply_option_id")
        public _FinalStage quickReplyOptionId(@NotNull String quickReplyOptionId) {
            this.quickReplyOptionId = Objects.requireNonNull(quickReplyOptionId, "quickReplyOptionId must not be null");
            return this;
        }

        @java.lang.Override
        public NotifyQuickReplySelectedRequest build() {
            return new NotifyQuickReplySelectedRequest(
                    eventId, externalConversationId, contact, quickReplyOptionId, additionalProperties);
        }
    }
}
