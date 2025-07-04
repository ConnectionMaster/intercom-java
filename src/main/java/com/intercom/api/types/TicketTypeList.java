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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.intercom.api.core.ObjectMappers;
import com.intercom.api.resources.tickets.types.TicketType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = TicketTypeList.Builder.class)
public final class TicketTypeList {
    private final List<TicketType> ticketTypes;

    private final Map<String, Object> additionalProperties;

    private TicketTypeList(List<TicketType> ticketTypes, Map<String, Object> additionalProperties) {
        this.ticketTypes = ticketTypes;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return String representing the object's type. Always has the value <code>ticket_type.list</code>.
     */
    @JsonProperty("type")
    public String getType() {
        return "ticket_type_attributes.list";
    }

    /**
     * @return A list of ticket_types associated with a given workspace.
     */
    @JsonProperty("ticket_types")
    public List<TicketType> getTicketTypes() {
        return ticketTypes;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TicketTypeList && equalTo((TicketTypeList) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TicketTypeList other) {
        return ticketTypes.equals(other.ticketTypes);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.ticketTypes);
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
        private List<TicketType> ticketTypes = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(TicketTypeList other) {
            ticketTypes(other.getTicketTypes());
            return this;
        }

        /**
         * <p>A list of ticket_types associated with a given workspace.</p>
         */
        @JsonSetter(value = "ticket_types", nulls = Nulls.SKIP)
        public Builder ticketTypes(List<TicketType> ticketTypes) {
            this.ticketTypes.clear();
            this.ticketTypes.addAll(ticketTypes);
            return this;
        }

        public Builder addTicketTypes(TicketType ticketTypes) {
            this.ticketTypes.add(ticketTypes);
            return this;
        }

        public Builder addAllTicketTypes(List<TicketType> ticketTypes) {
            this.ticketTypes.addAll(ticketTypes);
            return this;
        }

        public TicketTypeList build() {
            return new TicketTypeList(ticketTypes, additionalProperties);
        }
    }
}
