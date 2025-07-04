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
import com.intercom.api.resources.tickets.types.Ticket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = TicketList.Builder.class)
public final class TicketList {
    private final List<Ticket> tickets;

    private final int totalCount;

    private final Optional<CursorPages> pages;

    private final Map<String, Object> additionalProperties;

    private TicketList(
            List<Ticket> tickets,
            int totalCount,
            Optional<CursorPages> pages,
            Map<String, Object> additionalProperties) {
        this.tickets = tickets;
        this.totalCount = totalCount;
        this.pages = pages;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Always ticket.list
     */
    @JsonProperty("type")
    public String getType() {
        return "ticket.list";
    }

    /**
     * @return The list of ticket objects
     */
    @JsonProperty("tickets")
    public List<Ticket> getTickets() {
        return tickets;
    }

    /**
     * @return A count of the total number of objects.
     */
    @JsonProperty("total_count")
    public int getTotalCount() {
        return totalCount;
    }

    @JsonProperty("pages")
    public Optional<CursorPages> getPages() {
        return pages;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TicketList && equalTo((TicketList) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TicketList other) {
        return tickets.equals(other.tickets) && totalCount == other.totalCount && pages.equals(other.pages);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.tickets, this.totalCount, this.pages);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TotalCountStage builder() {
        return new Builder();
    }

    public interface TotalCountStage {
        /**
         * A count of the total number of objects.
         */
        _FinalStage totalCount(int totalCount);

        Builder from(TicketList other);
    }

    public interface _FinalStage {
        TicketList build();

        /**
         * <p>The list of ticket objects</p>
         */
        _FinalStage tickets(List<Ticket> tickets);

        _FinalStage addTickets(Ticket tickets);

        _FinalStage addAllTickets(List<Ticket> tickets);

        _FinalStage pages(Optional<CursorPages> pages);

        _FinalStage pages(CursorPages pages);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TotalCountStage, _FinalStage {
        private int totalCount;

        private Optional<CursorPages> pages = Optional.empty();

        private List<Ticket> tickets = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TicketList other) {
            tickets(other.getTickets());
            totalCount(other.getTotalCount());
            pages(other.getPages());
            return this;
        }

        /**
         * A count of the total number of objects.<p>A count of the total number of objects.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("total_count")
        public _FinalStage totalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        @java.lang.Override
        public _FinalStage pages(CursorPages pages) {
            this.pages = Optional.ofNullable(pages);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "pages", nulls = Nulls.SKIP)
        public _FinalStage pages(Optional<CursorPages> pages) {
            this.pages = pages;
            return this;
        }

        /**
         * <p>The list of ticket objects</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllTickets(List<Ticket> tickets) {
            this.tickets.addAll(tickets);
            return this;
        }

        /**
         * <p>The list of ticket objects</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addTickets(Ticket tickets) {
            this.tickets.add(tickets);
            return this;
        }

        /**
         * <p>The list of ticket objects</p>
         */
        @java.lang.Override
        @JsonSetter(value = "tickets", nulls = Nulls.SKIP)
        public _FinalStage tickets(List<Ticket> tickets) {
            this.tickets.clear();
            this.tickets.addAll(tickets);
            return this;
        }

        @java.lang.Override
        public TicketList build() {
            return new TicketList(tickets, totalCount, pages, additionalProperties);
        }
    }
}
