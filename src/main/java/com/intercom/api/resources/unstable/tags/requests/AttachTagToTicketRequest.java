/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.unstable.tags.requests;

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
@JsonDeserialize(builder = AttachTagToTicketRequest.Builder.class)
public final class AttachTagToTicketRequest {
    private final String ticketId;

    private final String id;

    private final String adminId;

    private final Map<String, Object> additionalProperties;

    private AttachTagToTicketRequest(
            String ticketId, String id, String adminId, Map<String, Object> additionalProperties) {
        this.ticketId = ticketId;
        this.id = id;
        this.adminId = adminId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return ticket_id
     */
    @JsonProperty("ticket_id")
    public String getTicketId() {
        return ticketId;
    }

    /**
     * @return The unique identifier for the tag which is given by Intercom
     */
    @JsonProperty("id")
    public String getId() {
        return id;
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
        return other instanceof AttachTagToTicketRequest && equalTo((AttachTagToTicketRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AttachTagToTicketRequest other) {
        return ticketId.equals(other.ticketId) && id.equals(other.id) && adminId.equals(other.adminId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.ticketId, this.id, this.adminId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TicketIdStage builder() {
        return new Builder();
    }

    public interface TicketIdStage {
        /**
         * ticket_id
         */
        IdStage ticketId(@NotNull String ticketId);

        Builder from(AttachTagToTicketRequest other);
    }

    public interface IdStage {
        /**
         * The unique identifier for the tag which is given by Intercom
         */
        AdminIdStage id(@NotNull String id);
    }

    public interface AdminIdStage {
        /**
         * The unique identifier for the admin which is given by Intercom.
         */
        _FinalStage adminId(@NotNull String adminId);
    }

    public interface _FinalStage {
        AttachTagToTicketRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TicketIdStage, IdStage, AdminIdStage, _FinalStage {
        private String ticketId;

        private String id;

        private String adminId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AttachTagToTicketRequest other) {
            ticketId(other.getTicketId());
            id(other.getId());
            adminId(other.getAdminId());
            return this;
        }

        /**
         * ticket_id<p>ticket_id</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("ticket_id")
        public IdStage ticketId(@NotNull String ticketId) {
            this.ticketId = Objects.requireNonNull(ticketId, "ticketId must not be null");
            return this;
        }

        /**
         * The unique identifier for the tag which is given by Intercom<p>The unique identifier for the tag which is given by Intercom</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("id")
        public AdminIdStage id(@NotNull String id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
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
        public AttachTagToTicketRequest build() {
            return new AttachTagToTicketRequest(ticketId, id, adminId, additionalProperties);
        }
    }
}
