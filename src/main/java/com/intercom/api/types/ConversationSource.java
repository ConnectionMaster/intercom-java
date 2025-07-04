/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonValue;
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
@JsonDeserialize(builder = ConversationSource.Builder.class)
public final class ConversationSource {
    private final Type type;

    private final String id;

    private final String deliveredAs;

    private final String subject;

    private final Optional<String> body;

    private final ConversationPartAuthor author;

    private final Optional<List<PartAttachment>> attachments;

    private final Optional<String> url;

    private final boolean redacted;

    private final Map<String, Object> additionalProperties;

    private ConversationSource(
            Type type,
            String id,
            String deliveredAs,
            String subject,
            Optional<String> body,
            ConversationPartAuthor author,
            Optional<List<PartAttachment>> attachments,
            Optional<String> url,
            boolean redacted,
            Map<String, Object> additionalProperties) {
        this.type = type;
        this.id = id;
        this.deliveredAs = deliveredAs;
        this.subject = subject;
        this.body = body;
        this.author = author;
        this.attachments = attachments;
        this.url = url;
        this.redacted = redacted;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return This includes conversation, email, facebook, instagram, phone_call, phone_switch, push, sms, twitter and whatsapp.
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     * @return The id representing the message.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return The conversation's initiation type. Possible values are customer_initiated, campaigns_initiated (legacy campaigns), operator_initiated (Custom bot), automated (Series and other outbounds with dynamic audience message) and admin_initiated (fixed audience message, ticket initiated by an admin, group email).
     */
    @JsonProperty("delivered_as")
    public String getDeliveredAs() {
        return deliveredAs;
    }

    /**
     * @return Optional. The message subject. For Twitter, this will show a generic message regarding why the subject is obscured.
     */
    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    /**
     * @return The message body, which may contain HTML. For Twitter, this will show a generic message regarding why the body is obscured.
     */
    @JsonProperty("body")
    public Optional<String> getBody() {
        return body;
    }

    @JsonProperty("author")
    public ConversationPartAuthor getAuthor() {
        return author;
    }

    /**
     * @return A list of attachments for the part.
     */
    @JsonProperty("attachments")
    public Optional<List<PartAttachment>> getAttachments() {
        return attachments;
    }

    /**
     * @return The URL where the conversation was started. For Twitter, Email, and Bots, this will be blank.
     */
    @JsonProperty("url")
    public Optional<String> getUrl() {
        return url;
    }

    /**
     * @return Whether or not the source message has been redacted. Only applicable for contact initiated messages.
     */
    @JsonProperty("redacted")
    public boolean getRedacted() {
        return redacted;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ConversationSource && equalTo((ConversationSource) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ConversationSource other) {
        return type.equals(other.type)
                && id.equals(other.id)
                && deliveredAs.equals(other.deliveredAs)
                && subject.equals(other.subject)
                && body.equals(other.body)
                && author.equals(other.author)
                && attachments.equals(other.attachments)
                && url.equals(other.url)
                && redacted == other.redacted;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.type,
                this.id,
                this.deliveredAs,
                this.subject,
                this.body,
                this.author,
                this.attachments,
                this.url,
                this.redacted);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TypeStage builder() {
        return new Builder();
    }

    public interface TypeStage {
        /**
         * This includes conversation, email, facebook, instagram, phone_call, phone_switch, push, sms, twitter and whatsapp.
         */
        IdStage type(@NotNull Type type);

        Builder from(ConversationSource other);
    }

    public interface IdStage {
        /**
         * The id representing the message.
         */
        DeliveredAsStage id(@NotNull String id);
    }

    public interface DeliveredAsStage {
        /**
         * The conversation's initiation type. Possible values are customer_initiated, campaigns_initiated (legacy campaigns), operator_initiated (Custom bot), automated (Series and other outbounds with dynamic audience message) and admin_initiated (fixed audience message, ticket initiated by an admin, group email).
         */
        SubjectStage deliveredAs(@NotNull String deliveredAs);
    }

    public interface SubjectStage {
        /**
         * Optional. The message subject. For Twitter, this will show a generic message regarding why the subject is obscured.
         */
        AuthorStage subject(@NotNull String subject);
    }

    public interface AuthorStage {
        RedactedStage author(@NotNull ConversationPartAuthor author);
    }

    public interface RedactedStage {
        /**
         * Whether or not the source message has been redacted. Only applicable for contact initiated messages.
         */
        _FinalStage redacted(boolean redacted);
    }

    public interface _FinalStage {
        ConversationSource build();

        /**
         * <p>The message body, which may contain HTML. For Twitter, this will show a generic message regarding why the body is obscured.</p>
         */
        _FinalStage body(Optional<String> body);

        _FinalStage body(String body);

        /**
         * <p>A list of attachments for the part.</p>
         */
        _FinalStage attachments(Optional<List<PartAttachment>> attachments);

        _FinalStage attachments(List<PartAttachment> attachments);

        /**
         * <p>The URL where the conversation was started. For Twitter, Email, and Bots, this will be blank.</p>
         */
        _FinalStage url(Optional<String> url);

        _FinalStage url(String url);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements TypeStage, IdStage, DeliveredAsStage, SubjectStage, AuthorStage, RedactedStage, _FinalStage {
        private Type type;

        private String id;

        private String deliveredAs;

        private String subject;

        private ConversationPartAuthor author;

        private boolean redacted;

        private Optional<String> url = Optional.empty();

        private Optional<List<PartAttachment>> attachments = Optional.empty();

        private Optional<String> body = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(ConversationSource other) {
            type(other.getType());
            id(other.getId());
            deliveredAs(other.getDeliveredAs());
            subject(other.getSubject());
            body(other.getBody());
            author(other.getAuthor());
            attachments(other.getAttachments());
            url(other.getUrl());
            redacted(other.getRedacted());
            return this;
        }

        /**
         * This includes conversation, email, facebook, instagram, phone_call, phone_switch, push, sms, twitter and whatsapp.<p>This includes conversation, email, facebook, instagram, phone_call, phone_switch, push, sms, twitter and whatsapp.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("type")
        public IdStage type(@NotNull Type type) {
            this.type = Objects.requireNonNull(type, "type must not be null");
            return this;
        }

        /**
         * The id representing the message.<p>The id representing the message.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("id")
        public DeliveredAsStage id(@NotNull String id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        /**
         * The conversation's initiation type. Possible values are customer_initiated, campaigns_initiated (legacy campaigns), operator_initiated (Custom bot), automated (Series and other outbounds with dynamic audience message) and admin_initiated (fixed audience message, ticket initiated by an admin, group email).<p>The conversation's initiation type. Possible values are customer_initiated, campaigns_initiated (legacy campaigns), operator_initiated (Custom bot), automated (Series and other outbounds with dynamic audience message) and admin_initiated (fixed audience message, ticket initiated by an admin, group email).</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("delivered_as")
        public SubjectStage deliveredAs(@NotNull String deliveredAs) {
            this.deliveredAs = Objects.requireNonNull(deliveredAs, "deliveredAs must not be null");
            return this;
        }

        /**
         * Optional. The message subject. For Twitter, this will show a generic message regarding why the subject is obscured.<p>Optional. The message subject. For Twitter, this will show a generic message regarding why the subject is obscured.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("subject")
        public AuthorStage subject(@NotNull String subject) {
            this.subject = Objects.requireNonNull(subject, "subject must not be null");
            return this;
        }

        @java.lang.Override
        @JsonSetter("author")
        public RedactedStage author(@NotNull ConversationPartAuthor author) {
            this.author = Objects.requireNonNull(author, "author must not be null");
            return this;
        }

        /**
         * Whether or not the source message has been redacted. Only applicable for contact initiated messages.<p>Whether or not the source message has been redacted. Only applicable for contact initiated messages.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("redacted")
        public _FinalStage redacted(boolean redacted) {
            this.redacted = redacted;
            return this;
        }

        /**
         * <p>The URL where the conversation was started. For Twitter, Email, and Bots, this will be blank.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage url(String url) {
            this.url = Optional.ofNullable(url);
            return this;
        }

        /**
         * <p>The URL where the conversation was started. For Twitter, Email, and Bots, this will be blank.</p>
         */
        @java.lang.Override
        @JsonSetter(value = "url", nulls = Nulls.SKIP)
        public _FinalStage url(Optional<String> url) {
            this.url = url;
            return this;
        }

        /**
         * <p>A list of attachments for the part.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage attachments(List<PartAttachment> attachments) {
            this.attachments = Optional.ofNullable(attachments);
            return this;
        }

        /**
         * <p>A list of attachments for the part.</p>
         */
        @java.lang.Override
        @JsonSetter(value = "attachments", nulls = Nulls.SKIP)
        public _FinalStage attachments(Optional<List<PartAttachment>> attachments) {
            this.attachments = attachments;
            return this;
        }

        /**
         * <p>The message body, which may contain HTML. For Twitter, this will show a generic message regarding why the body is obscured.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage body(String body) {
            this.body = Optional.ofNullable(body);
            return this;
        }

        /**
         * <p>The message body, which may contain HTML. For Twitter, this will show a generic message regarding why the body is obscured.</p>
         */
        @java.lang.Override
        @JsonSetter(value = "body", nulls = Nulls.SKIP)
        public _FinalStage body(Optional<String> body) {
            this.body = body;
            return this;
        }

        @java.lang.Override
        public ConversationSource build() {
            return new ConversationSource(
                    type, id, deliveredAs, subject, body, author, attachments, url, redacted, additionalProperties);
        }
    }

    public static final class Type {
        public static final Type EMAIL = new Type(Value.EMAIL, "email");

        public static final Type FACEBOOK = new Type(Value.FACEBOOK, "facebook");

        public static final Type INSTAGRAM = new Type(Value.INSTAGRAM, "instagram");

        public static final Type PHONE_CALL = new Type(Value.PHONE_CALL, "phone_call");

        public static final Type PUSH = new Type(Value.PUSH, "push");

        public static final Type WHATSAPP = new Type(Value.WHATSAPP, "whatsapp");

        public static final Type SMS = new Type(Value.SMS, "sms");

        public static final Type CONVERSATION = new Type(Value.CONVERSATION, "conversation");

        public static final Type TWITTER = new Type(Value.TWITTER, "twitter");

        public static final Type PHONE_SWITCH = new Type(Value.PHONE_SWITCH, "phone_switch");

        private final Value value;

        private final String string;

        Type(Value value, String string) {
            this.value = value;
            this.string = string;
        }

        public Value getEnumValue() {
            return value;
        }

        @java.lang.Override
        @JsonValue
        public String toString() {
            return this.string;
        }

        @java.lang.Override
        public boolean equals(Object other) {
            return (this == other) || (other instanceof Type && this.string.equals(((Type) other).string));
        }

        @java.lang.Override
        public int hashCode() {
            return this.string.hashCode();
        }

        public <T> T visit(Visitor<T> visitor) {
            switch (value) {
                case EMAIL:
                    return visitor.visitEmail();
                case FACEBOOK:
                    return visitor.visitFacebook();
                case INSTAGRAM:
                    return visitor.visitInstagram();
                case PHONE_CALL:
                    return visitor.visitPhoneCall();
                case PUSH:
                    return visitor.visitPush();
                case WHATSAPP:
                    return visitor.visitWhatsapp();
                case SMS:
                    return visitor.visitSms();
                case CONVERSATION:
                    return visitor.visitConversation();
                case TWITTER:
                    return visitor.visitTwitter();
                case PHONE_SWITCH:
                    return visitor.visitPhoneSwitch();
                case UNKNOWN:
                default:
                    return visitor.visitUnknown(string);
            }
        }

        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public static Type valueOf(String value) {
            switch (value) {
                case "email":
                    return EMAIL;
                case "facebook":
                    return FACEBOOK;
                case "instagram":
                    return INSTAGRAM;
                case "phone_call":
                    return PHONE_CALL;
                case "push":
                    return PUSH;
                case "whatsapp":
                    return WHATSAPP;
                case "sms":
                    return SMS;
                case "conversation":
                    return CONVERSATION;
                case "twitter":
                    return TWITTER;
                case "phone_switch":
                    return PHONE_SWITCH;
                default:
                    return new Type(Value.UNKNOWN, value);
            }
        }

        public enum Value {
            CONVERSATION,

            EMAIL,

            FACEBOOK,

            INSTAGRAM,

            PHONE_CALL,

            PHONE_SWITCH,

            PUSH,

            SMS,

            TWITTER,

            WHATSAPP,

            UNKNOWN
        }

        public interface Visitor<T> {
            T visitConversation();

            T visitEmail();

            T visitFacebook();

            T visitInstagram();

            T visitPhoneCall();

            T visitPhoneSwitch();

            T visitPush();

            T visitSms();

            T visitTwitter();

            T visitWhatsapp();

            T visitUnknown(String unknownType);
        }
    }
}
