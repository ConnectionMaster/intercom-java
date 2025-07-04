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
import com.intercom.api.resources.notes.types.Note;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = NoteList.Builder.class)
public final class NoteList {
    private final List<Note> data;

    private final int totalCount;

    private final Optional<OffsetPages> pages;

    private final Map<String, Object> additionalProperties;

    private NoteList(
            List<Note> data, int totalCount, Optional<OffsetPages> pages, Map<String, Object> additionalProperties) {
        this.data = data;
        this.totalCount = totalCount;
        this.pages = pages;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return String representing the object's type. Always has the value <code>list</code>.
     */
    @JsonProperty("type")
    public String getType() {
        return "list";
    }

    /**
     * @return An array of notes.
     */
    @JsonProperty("data")
    public List<Note> getData() {
        return data;
    }

    /**
     * @return A count of the total number of notes.
     */
    @JsonProperty("total_count")
    public int getTotalCount() {
        return totalCount;
    }

    @JsonProperty("pages")
    public Optional<OffsetPages> getPages() {
        return pages;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof NoteList && equalTo((NoteList) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(NoteList other) {
        return data.equals(other.data) && totalCount == other.totalCount && pages.equals(other.pages);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.data, this.totalCount, this.pages);
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
         * A count of the total number of notes.
         */
        _FinalStage totalCount(int totalCount);

        Builder from(NoteList other);
    }

    public interface _FinalStage {
        NoteList build();

        /**
         * <p>An array of notes.</p>
         */
        _FinalStage data(List<Note> data);

        _FinalStage addData(Note data);

        _FinalStage addAllData(List<Note> data);

        _FinalStage pages(Optional<OffsetPages> pages);

        _FinalStage pages(OffsetPages pages);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TotalCountStage, _FinalStage {
        private int totalCount;

        private Optional<OffsetPages> pages = Optional.empty();

        private List<Note> data = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(NoteList other) {
            data(other.getData());
            totalCount(other.getTotalCount());
            pages(other.getPages());
            return this;
        }

        /**
         * A count of the total number of notes.<p>A count of the total number of notes.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("total_count")
        public _FinalStage totalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        @java.lang.Override
        public _FinalStage pages(OffsetPages pages) {
            this.pages = Optional.ofNullable(pages);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "pages", nulls = Nulls.SKIP)
        public _FinalStage pages(Optional<OffsetPages> pages) {
            this.pages = pages;
            return this;
        }

        /**
         * <p>An array of notes.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllData(List<Note> data) {
            this.data.addAll(data);
            return this;
        }

        /**
         * <p>An array of notes.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addData(Note data) {
            this.data.add(data);
            return this;
        }

        /**
         * <p>An array of notes.</p>
         */
        @java.lang.Override
        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public _FinalStage data(List<Note> data) {
            this.data.clear();
            this.data.addAll(data);
            return this;
        }

        @java.lang.Override
        public NoteList build() {
            return new NoteList(data, totalCount, pages, additionalProperties);
        }
    }
}
