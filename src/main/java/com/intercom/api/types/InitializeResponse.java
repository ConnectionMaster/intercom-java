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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.intercom.api.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = InitializeResponse.Builder.class)
public final class InitializeResponse {
    private final CanvasObject canvas;

    private final Map<String, Object> additionalProperties;

    private InitializeResponse(CanvasObject canvas, Map<String, Object> additionalProperties) {
        this.canvas = canvas;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The canvas object that defines the UI to be shown for the app.
     */
    @JsonProperty("canvas")
    public CanvasObject getCanvas() {
        return canvas;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof InitializeResponse && equalTo((InitializeResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(InitializeResponse other) {
        return canvas.equals(other.canvas);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.canvas);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CanvasStage builder() {
        return new Builder();
    }

    public interface CanvasStage {
        /**
         * The canvas object that defines the UI to be shown for the app.
         */
        _FinalStage canvas(@NotNull CanvasObject canvas);

        Builder from(InitializeResponse other);
    }

    public interface _FinalStage {
        InitializeResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements CanvasStage, _FinalStage {
        private CanvasObject canvas;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(InitializeResponse other) {
            canvas(other.getCanvas());
            return this;
        }

        /**
         * The canvas object that defines the UI to be shown for the app.<p>The canvas object that defines the UI to be shown for the app.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("canvas")
        public _FinalStage canvas(@NotNull CanvasObject canvas) {
            this.canvas = Objects.requireNonNull(canvas, "canvas must not be null");
            return this;
        }

        @java.lang.Override
        public InitializeResponse build() {
            return new InitializeResponse(canvas, additionalProperties);
        }
    }
}
