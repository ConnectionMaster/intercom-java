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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = ContactReplyTicketEmailRequest.Builder.class)
public final class ContactReplyTicketEmailRequest implements IContactReplyBaseRequest {
    private final String body;

    private final Optional<Integer> createdAt;

    private final Optional<List<String>> attachmentUrls;

    private final String email;

    private final Map<String, Object> additionalProperties;

    private ContactReplyTicketEmailRequest(
            String body,
            Optional<Integer> createdAt,
            Optional<List<String>> attachmentUrls,
            String email,
            Map<String, Object> additionalProperties) {
        this.body = body;
        this.createdAt = createdAt;
        this.attachmentUrls = attachmentUrls;
        this.email = email;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("message_type")
    public String getMessageType() {
        return "comment";
    }

    @JsonProperty("type")
    public String getType() {
        return "user";
    }

    /**
     * @return The text body of the comment.
     */
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    /**
     * @return The time the reply was created. If not provided, the current time will be used.
     */
    @JsonProperty("created_at")
    public Optional<Integer> getCreatedAt() {
        return createdAt;
    }

    /**
     * @return A list of image URLs that will be added as attachments. You can include up to 10 URLs.
     */
    @JsonProperty("attachment_urls")
    public Optional<List<String>> getAttachmentUrls() {
        return attachmentUrls;
    }

    /**
     * @return The email you have defined for the user.
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ContactReplyTicketEmailRequest && equalTo((ContactReplyTicketEmailRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ContactReplyTicketEmailRequest other) {
        return body.equals(other.body)
                && createdAt.equals(other.createdAt)
                && attachmentUrls.equals(other.attachmentUrls)
                && email.equals(other.email);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.body, this.createdAt, this.attachmentUrls, this.email);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static BodyStage builder() {
        return new Builder();
    }

    public interface BodyStage {
        /**
         * The text body of the comment.
         */
        EmailStage body(@NotNull String body);

        Builder from(ContactReplyTicketEmailRequest other);
    }

    public interface EmailStage {
        /**
         * The email you have defined for the user.
         */
        _FinalStage email(@NotNull String email);
    }

    public interface _FinalStage {
        ContactReplyTicketEmailRequest build();

        /**
         * <p>The time the reply was created. If not provided, the current time will be used.</p>
         */
        _FinalStage createdAt(Optional<Integer> createdAt);

        _FinalStage createdAt(Integer createdAt);

        /**
         * <p>A list of image URLs that will be added as attachments. You can include up to 10 URLs.</p>
         */
        _FinalStage attachmentUrls(Optional<List<String>> attachmentUrls);

        _FinalStage attachmentUrls(List<String> attachmentUrls);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements BodyStage, EmailStage, _FinalStage {
        private String body;

        private String email;

        private Optional<List<String>> attachmentUrls = Optional.empty();

        private Optional<Integer> createdAt = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ContactReplyTicketEmailRequest other) {
            body(other.getBody());
            createdAt(other.getCreatedAt());
            attachmentUrls(other.getAttachmentUrls());
            email(other.getEmail());
            return this;
        }

        /**
         * The text body of the comment.<p>The text body of the comment.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("body")
        public EmailStage body(@NotNull String body) {
            this.body = Objects.requireNonNull(body, "body must not be null");
            return this;
        }

        /**
         * The email you have defined for the user.<p>The email you have defined for the user.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("email")
        public _FinalStage email(@NotNull String email) {
            this.email = Objects.requireNonNull(email, "email must not be null");
            return this;
        }

        /**
         * <p>A list of image URLs that will be added as attachments. You can include up to 10 URLs.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage attachmentUrls(List<String> attachmentUrls) {
            this.attachmentUrls = Optional.ofNullable(attachmentUrls);
            return this;
        }

        /**
         * <p>A list of image URLs that will be added as attachments. You can include up to 10 URLs.</p>
         */
        @java.lang.Override
        @JsonSetter(value = "attachment_urls", nulls = Nulls.SKIP)
        public _FinalStage attachmentUrls(Optional<List<String>> attachmentUrls) {
            this.attachmentUrls = attachmentUrls;
            return this;
        }

        /**
         * <p>The time the reply was created. If not provided, the current time will be used.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage createdAt(Integer createdAt) {
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        /**
         * <p>The time the reply was created. If not provided, the current time will be used.</p>
         */
        @java.lang.Override
        @JsonSetter(value = "created_at", nulls = Nulls.SKIP)
        public _FinalStage createdAt(Optional<Integer> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @java.lang.Override
        public ContactReplyTicketEmailRequest build() {
            return new ContactReplyTicketEmailRequest(body, createdAt, attachmentUrls, email, additionalProperties);
        }
    }
}
