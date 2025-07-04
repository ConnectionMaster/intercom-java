/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.unstable.aicontent.types;

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
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ExternalPage.Builder.class)
public final class ExternalPage {
    private final String id;

    private final String title;

    private final String html;

    private final Optional<String> url;

    private final boolean aiAgentAvailability;

    private final boolean aiCopilotAvailability;

    private final Optional<Boolean> finAvailability;

    private final int sourceId;

    private final String externalId;

    private final int createdAt;

    private final int updatedAt;

    private final int lastIngestedAt;

    private final Map<String, Object> additionalProperties;

    private ExternalPage(
            String id,
            String title,
            String html,
            Optional<String> url,
            boolean aiAgentAvailability,
            boolean aiCopilotAvailability,
            Optional<Boolean> finAvailability,
            int sourceId,
            String externalId,
            int createdAt,
            int updatedAt,
            int lastIngestedAt,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.title = title;
        this.html = html;
        this.url = url;
        this.aiAgentAvailability = aiAgentAvailability;
        this.aiCopilotAvailability = aiCopilotAvailability;
        this.finAvailability = finAvailability;
        this.sourceId = sourceId;
        this.externalId = externalId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.lastIngestedAt = lastIngestedAt;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Always external_page
     */
    @JsonProperty("type")
    public String getType() {
        return "external_page";
    }

    /**
     * @return The unique identifier for the external page which is given by Intercom.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return The title of the external page.
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * @return The body of the external page in HTML.
     */
    @JsonProperty("html")
    public String getHtml() {
        return html;
    }

    /**
     * @return The URL of the external page. This will be used by Fin to link end users to the page it based its answer on.
     */
    @JsonProperty("url")
    public Optional<String> getUrl() {
        return url;
    }

    /**
     * @return Whether the external page should be used to answer questions by AI Agent.
     */
    @JsonProperty("ai_agent_availability")
    public boolean getAiAgentAvailability() {
        return aiAgentAvailability;
    }

    /**
     * @return Whether the external page should be used to answer questions by AI Copilot.
     */
    @JsonProperty("ai_copilot_availability")
    public boolean getAiCopilotAvailability() {
        return aiCopilotAvailability;
    }

    /**
     * @return Deprecated. Use ai_agent_availability and ai_copilot_availability instead.
     */
    @JsonProperty("fin_availability")
    public Optional<Boolean> getFinAvailability() {
        return finAvailability;
    }

    /**
     * @return Always en
     */
    @JsonProperty("locale")
    public String getLocale() {
        return "en";
    }

    /**
     * @return The unique identifier for the source of the external page which was given by Intercom. Every external page must be associated with a Content Import Source which represents the place it comes from and from which it inherits a default audience (configured in the UI). For a new source, make a POST request to the Content Import Source endpoint and an ID for the source will be returned in the response.
     */
    @JsonProperty("source_id")
    public int getSourceId() {
        return sourceId;
    }

    /**
     * @return The identifier for the external page which was given by the source. Must be unique for the source.
     */
    @JsonProperty("external_id")
    public String getExternalId() {
        return externalId;
    }

    /**
     * @return The time when the external page was created.
     */
    @JsonProperty("created_at")
    public int getCreatedAt() {
        return createdAt;
    }

    /**
     * @return The time when the external page was last updated.
     */
    @JsonProperty("updated_at")
    public int getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @return The time when the external page was last ingested.
     */
    @JsonProperty("last_ingested_at")
    public int getLastIngestedAt() {
        return lastIngestedAt;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ExternalPage && equalTo((ExternalPage) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ExternalPage other) {
        return id.equals(other.id)
                && title.equals(other.title)
                && html.equals(other.html)
                && url.equals(other.url)
                && aiAgentAvailability == other.aiAgentAvailability
                && aiCopilotAvailability == other.aiCopilotAvailability
                && finAvailability.equals(other.finAvailability)
                && sourceId == other.sourceId
                && externalId.equals(other.externalId)
                && createdAt == other.createdAt
                && updatedAt == other.updatedAt
                && lastIngestedAt == other.lastIngestedAt;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.title,
                this.html,
                this.url,
                this.aiAgentAvailability,
                this.aiCopilotAvailability,
                this.finAvailability,
                this.sourceId,
                this.externalId,
                this.createdAt,
                this.updatedAt,
                this.lastIngestedAt);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        /**
         * The unique identifier for the external page which is given by Intercom.
         */
        TitleStage id(@NotNull String id);

        Builder from(ExternalPage other);
    }

    public interface TitleStage {
        /**
         * The title of the external page.
         */
        HtmlStage title(@NotNull String title);
    }

    public interface HtmlStage {
        /**
         * The body of the external page in HTML.
         */
        AiAgentAvailabilityStage html(@NotNull String html);
    }

    public interface AiAgentAvailabilityStage {
        /**
         * Whether the external page should be used to answer questions by AI Agent.
         */
        AiCopilotAvailabilityStage aiAgentAvailability(boolean aiAgentAvailability);
    }

    public interface AiCopilotAvailabilityStage {
        /**
         * Whether the external page should be used to answer questions by AI Copilot.
         */
        SourceIdStage aiCopilotAvailability(boolean aiCopilotAvailability);
    }

    public interface SourceIdStage {
        /**
         * The unique identifier for the source of the external page which was given by Intercom. Every external page must be associated with a Content Import Source which represents the place it comes from and from which it inherits a default audience (configured in the UI). For a new source, make a POST request to the Content Import Source endpoint and an ID for the source will be returned in the response.
         */
        ExternalIdStage sourceId(int sourceId);
    }

    public interface ExternalIdStage {
        /**
         * The identifier for the external page which was given by the source. Must be unique for the source.
         */
        CreatedAtStage externalId(@NotNull String externalId);
    }

    public interface CreatedAtStage {
        /**
         * The time when the external page was created.
         */
        UpdatedAtStage createdAt(int createdAt);
    }

    public interface UpdatedAtStage {
        /**
         * The time when the external page was last updated.
         */
        LastIngestedAtStage updatedAt(int updatedAt);
    }

    public interface LastIngestedAtStage {
        /**
         * The time when the external page was last ingested.
         */
        _FinalStage lastIngestedAt(int lastIngestedAt);
    }

    public interface _FinalStage {
        ExternalPage build();

        /**
         * <p>The URL of the external page. This will be used by Fin to link end users to the page it based its answer on.</p>
         */
        _FinalStage url(Optional<String> url);

        _FinalStage url(String url);

        /**
         * <p>Deprecated. Use ai_agent_availability and ai_copilot_availability instead.</p>
         */
        _FinalStage finAvailability(Optional<Boolean> finAvailability);

        _FinalStage finAvailability(Boolean finAvailability);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements IdStage,
                    TitleStage,
                    HtmlStage,
                    AiAgentAvailabilityStage,
                    AiCopilotAvailabilityStage,
                    SourceIdStage,
                    ExternalIdStage,
                    CreatedAtStage,
                    UpdatedAtStage,
                    LastIngestedAtStage,
                    _FinalStage {
        private String id;

        private String title;

        private String html;

        private boolean aiAgentAvailability;

        private boolean aiCopilotAvailability;

        private int sourceId;

        private String externalId;

        private int createdAt;

        private int updatedAt;

        private int lastIngestedAt;

        private Optional<Boolean> finAvailability = Optional.empty();

        private Optional<String> url = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ExternalPage other) {
            id(other.getId());
            title(other.getTitle());
            html(other.getHtml());
            url(other.getUrl());
            aiAgentAvailability(other.getAiAgentAvailability());
            aiCopilotAvailability(other.getAiCopilotAvailability());
            finAvailability(other.getFinAvailability());
            sourceId(other.getSourceId());
            externalId(other.getExternalId());
            createdAt(other.getCreatedAt());
            updatedAt(other.getUpdatedAt());
            lastIngestedAt(other.getLastIngestedAt());
            return this;
        }

        /**
         * The unique identifier for the external page which is given by Intercom.<p>The unique identifier for the external page which is given by Intercom.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("id")
        public TitleStage id(@NotNull String id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        /**
         * The title of the external page.<p>The title of the external page.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("title")
        public HtmlStage title(@NotNull String title) {
            this.title = Objects.requireNonNull(title, "title must not be null");
            return this;
        }

        /**
         * The body of the external page in HTML.<p>The body of the external page in HTML.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("html")
        public AiAgentAvailabilityStage html(@NotNull String html) {
            this.html = Objects.requireNonNull(html, "html must not be null");
            return this;
        }

        /**
         * Whether the external page should be used to answer questions by AI Agent.<p>Whether the external page should be used to answer questions by AI Agent.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("ai_agent_availability")
        public AiCopilotAvailabilityStage aiAgentAvailability(boolean aiAgentAvailability) {
            this.aiAgentAvailability = aiAgentAvailability;
            return this;
        }

        /**
         * Whether the external page should be used to answer questions by AI Copilot.<p>Whether the external page should be used to answer questions by AI Copilot.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("ai_copilot_availability")
        public SourceIdStage aiCopilotAvailability(boolean aiCopilotAvailability) {
            this.aiCopilotAvailability = aiCopilotAvailability;
            return this;
        }

        /**
         * The unique identifier for the source of the external page which was given by Intercom. Every external page must be associated with a Content Import Source which represents the place it comes from and from which it inherits a default audience (configured in the UI). For a new source, make a POST request to the Content Import Source endpoint and an ID for the source will be returned in the response.<p>The unique identifier for the source of the external page which was given by Intercom. Every external page must be associated with a Content Import Source which represents the place it comes from and from which it inherits a default audience (configured in the UI). For a new source, make a POST request to the Content Import Source endpoint and an ID for the source will be returned in the response.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("source_id")
        public ExternalIdStage sourceId(int sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * The identifier for the external page which was given by the source. Must be unique for the source.<p>The identifier for the external page which was given by the source. Must be unique for the source.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("external_id")
        public CreatedAtStage externalId(@NotNull String externalId) {
            this.externalId = Objects.requireNonNull(externalId, "externalId must not be null");
            return this;
        }

        /**
         * The time when the external page was created.<p>The time when the external page was created.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("created_at")
        public UpdatedAtStage createdAt(int createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * The time when the external page was last updated.<p>The time when the external page was last updated.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("updated_at")
        public LastIngestedAtStage updatedAt(int updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * The time when the external page was last ingested.<p>The time when the external page was last ingested.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("last_ingested_at")
        public _FinalStage lastIngestedAt(int lastIngestedAt) {
            this.lastIngestedAt = lastIngestedAt;
            return this;
        }

        /**
         * <p>Deprecated. Use ai_agent_availability and ai_copilot_availability instead.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage finAvailability(Boolean finAvailability) {
            this.finAvailability = Optional.ofNullable(finAvailability);
            return this;
        }

        /**
         * <p>Deprecated. Use ai_agent_availability and ai_copilot_availability instead.</p>
         */
        @java.lang.Override
        @JsonSetter(value = "fin_availability", nulls = Nulls.SKIP)
        public _FinalStage finAvailability(Optional<Boolean> finAvailability) {
            this.finAvailability = finAvailability;
            return this;
        }

        /**
         * <p>The URL of the external page. This will be used by Fin to link end users to the page it based its answer on.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage url(String url) {
            this.url = Optional.ofNullable(url);
            return this;
        }

        /**
         * <p>The URL of the external page. This will be used by Fin to link end users to the page it based its answer on.</p>
         */
        @java.lang.Override
        @JsonSetter(value = "url", nulls = Nulls.SKIP)
        public _FinalStage url(Optional<String> url) {
            this.url = url;
            return this;
        }

        @java.lang.Override
        public ExternalPage build() {
            return new ExternalPage(
                    id,
                    title,
                    html,
                    url,
                    aiAgentAvailability,
                    aiCopilotAvailability,
                    finAvailability,
                    sourceId,
                    externalId,
                    createdAt,
                    updatedAt,
                    lastIngestedAt,
                    additionalProperties);
        }
    }
}
