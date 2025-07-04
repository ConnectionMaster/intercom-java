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
import com.intercom.api.resources.segments.types.Segment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = SegmentList.Builder.class)
public final class SegmentList {
    private final List<Segment> segments;

    private final Optional<Map<String, Object>> pages;

    private final Map<String, Object> additionalProperties;

    private SegmentList(
            List<Segment> segments, Optional<Map<String, Object>> pages, Map<String, Object> additionalProperties) {
        this.segments = segments;
        this.pages = pages;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The type of the object
     */
    @JsonProperty("type")
    public String getType() {
        return "segment.list";
    }

    /**
     * @return A list of Segment objects
     */
    @JsonProperty("segments")
    public List<Segment> getSegments() {
        return segments;
    }

    /**
     * @return A pagination object, which may be empty, indicating no further pages to fetch.
     */
    @JsonProperty("pages")
    public Optional<Map<String, Object>> getPages() {
        return pages;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SegmentList && equalTo((SegmentList) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SegmentList other) {
        return segments.equals(other.segments) && pages.equals(other.pages);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.segments, this.pages);
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
        private List<Segment> segments = new ArrayList<>();

        private Optional<Map<String, Object>> pages = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(SegmentList other) {
            segments(other.getSegments());
            pages(other.getPages());
            return this;
        }

        /**
         * <p>A list of Segment objects</p>
         */
        @JsonSetter(value = "segments", nulls = Nulls.SKIP)
        public Builder segments(List<Segment> segments) {
            this.segments.clear();
            this.segments.addAll(segments);
            return this;
        }

        public Builder addSegments(Segment segments) {
            this.segments.add(segments);
            return this;
        }

        public Builder addAllSegments(List<Segment> segments) {
            this.segments.addAll(segments);
            return this;
        }

        /**
         * <p>A pagination object, which may be empty, indicating no further pages to fetch.</p>
         */
        @JsonSetter(value = "pages", nulls = Nulls.SKIP)
        public Builder pages(Optional<Map<String, Object>> pages) {
            this.pages = pages;
            return this;
        }

        public Builder pages(Map<String, Object> pages) {
            this.pages = Optional.ofNullable(pages);
            return this;
        }

        public SegmentList build() {
            return new SegmentList(segments, pages, additionalProperties);
        }
    }
}
