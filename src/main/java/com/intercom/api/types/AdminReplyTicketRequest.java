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
@JsonDeserialize(builder = AdminReplyTicketRequest.Builder.class)
public final class AdminReplyTicketRequest {
    private final MessageType messageType;

    private final Optional<String> body;

    private final String adminId;

    private final Optional<Integer> createdAt;

    private final Optional<List<ReplyOptionsItem>> replyOptions;

    private final Optional<List<String>> attachmentUrls;

    private final Map<String, Object> additionalProperties;

    private AdminReplyTicketRequest(
            MessageType messageType,
            Optional<String> body,
            String adminId,
            Optional<Integer> createdAt,
            Optional<List<ReplyOptionsItem>> replyOptions,
            Optional<List<String>> attachmentUrls,
            Map<String, Object> additionalProperties) {
        this.messageType = messageType;
        this.body = body;
        this.adminId = adminId;
        this.createdAt = createdAt;
        this.replyOptions = replyOptions;
        this.attachmentUrls = attachmentUrls;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("message_type")
    public MessageType getMessageType() {
        return messageType;
    }

    @JsonProperty("type")
    public String getType() {
        return "admin";
    }

    /**
     * @return The text body of the reply. Notes accept some HTML formatting. Must be present for comment and note message types.
     */
    @JsonProperty("body")
    public Optional<String> getBody() {
        return body;
    }

    /**
     * @return The id of the admin who is authoring the comment.
     */
    @JsonProperty("admin_id")
    public String getAdminId() {
        return adminId;
    }

    /**
     * @return The time the reply was created. If not provided, the current time will be used.
     */
    @JsonProperty("created_at")
    public Optional<Integer> getCreatedAt() {
        return createdAt;
    }

    /**
     * @return The quick reply options to display. Must be present for quick_reply message types.
     */
    @JsonProperty("reply_options")
    public Optional<List<ReplyOptionsItem>> getReplyOptions() {
        return replyOptions;
    }

    /**
     * @return A list of image URLs that will be added as attachments. You can include up to 10 URLs.
     */
    @JsonProperty("attachment_urls")
    public Optional<List<String>> getAttachmentUrls() {
        return attachmentUrls;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AdminReplyTicketRequest && equalTo((AdminReplyTicketRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AdminReplyTicketRequest other) {
        return messageType.equals(other.messageType)
                && body.equals(other.body)
                && adminId.equals(other.adminId)
                && createdAt.equals(other.createdAt)
                && replyOptions.equals(other.replyOptions)
                && attachmentUrls.equals(other.attachmentUrls);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.messageType, this.body, this.adminId, this.createdAt, this.replyOptions, this.attachmentUrls);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static MessageTypeStage builder() {
        return new Builder();
    }

    public interface MessageTypeStage {
        AdminIdStage messageType(@NotNull MessageType messageType);

        Builder from(AdminReplyTicketRequest other);
    }

    public interface AdminIdStage {
        /**
         * The id of the admin who is authoring the comment.
         */
        _FinalStage adminId(@NotNull String adminId);
    }

    public interface _FinalStage {
        AdminReplyTicketRequest build();

        /**
         * <p>The text body of the reply. Notes accept some HTML formatting. Must be present for comment and note message types.</p>
         */
        _FinalStage body(Optional<String> body);

        _FinalStage body(String body);

        /**
         * <p>The time the reply was created. If not provided, the current time will be used.</p>
         */
        _FinalStage createdAt(Optional<Integer> createdAt);

        _FinalStage createdAt(Integer createdAt);

        /**
         * <p>The quick reply options to display. Must be present for quick_reply message types.</p>
         */
        _FinalStage replyOptions(Optional<List<ReplyOptionsItem>> replyOptions);

        _FinalStage replyOptions(List<ReplyOptionsItem> replyOptions);

        /**
         * <p>A list of image URLs that will be added as attachments. You can include up to 10 URLs.</p>
         */
        _FinalStage attachmentUrls(Optional<List<String>> attachmentUrls);

        _FinalStage attachmentUrls(List<String> attachmentUrls);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements MessageTypeStage, AdminIdStage, _FinalStage {
        private MessageType messageType;

        private String adminId;

        private Optional<List<String>> attachmentUrls = Optional.empty();

        private Optional<List<ReplyOptionsItem>> replyOptions = Optional.empty();

        private Optional<Integer> createdAt = Optional.empty();

        private Optional<String> body = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AdminReplyTicketRequest other) {
            messageType(other.getMessageType());
            body(other.getBody());
            adminId(other.getAdminId());
            createdAt(other.getCreatedAt());
            replyOptions(other.getReplyOptions());
            attachmentUrls(other.getAttachmentUrls());
            return this;
        }

        @java.lang.Override
        @JsonSetter("message_type")
        public AdminIdStage messageType(@NotNull MessageType messageType) {
            this.messageType = Objects.requireNonNull(messageType, "messageType must not be null");
            return this;
        }

        /**
         * The id of the admin who is authoring the comment.<p>The id of the admin who is authoring the comment.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("admin_id")
        public _FinalStage adminId(@NotNull String adminId) {
            this.adminId = Objects.requireNonNull(adminId, "adminId must not be null");
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
         * <p>The quick reply options to display. Must be present for quick_reply message types.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage replyOptions(List<ReplyOptionsItem> replyOptions) {
            this.replyOptions = Optional.ofNullable(replyOptions);
            return this;
        }

        /**
         * <p>The quick reply options to display. Must be present for quick_reply message types.</p>
         */
        @java.lang.Override
        @JsonSetter(value = "reply_options", nulls = Nulls.SKIP)
        public _FinalStage replyOptions(Optional<List<ReplyOptionsItem>> replyOptions) {
            this.replyOptions = replyOptions;
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

        /**
         * <p>The text body of the reply. Notes accept some HTML formatting. Must be present for comment and note message types.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage body(String body) {
            this.body = Optional.ofNullable(body);
            return this;
        }

        /**
         * <p>The text body of the reply. Notes accept some HTML formatting. Must be present for comment and note message types.</p>
         */
        @java.lang.Override
        @JsonSetter(value = "body", nulls = Nulls.SKIP)
        public _FinalStage body(Optional<String> body) {
            this.body = body;
            return this;
        }

        @java.lang.Override
        public AdminReplyTicketRequest build() {
            return new AdminReplyTicketRequest(
                    messageType, body, adminId, createdAt, replyOptions, attachmentUrls, additionalProperties);
        }
    }

    public static final class MessageType {
        public static final MessageType NOTE = new MessageType(Value.NOTE, "note");

        public static final MessageType QUICK_REPLY = new MessageType(Value.QUICK_REPLY, "quick_reply");

        public static final MessageType COMMENT = new MessageType(Value.COMMENT, "comment");

        private final Value value;

        private final String string;

        MessageType(Value value, String string) {
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
            return (this == other)
                    || (other instanceof MessageType && this.string.equals(((MessageType) other).string));
        }

        @java.lang.Override
        public int hashCode() {
            return this.string.hashCode();
        }

        public <T> T visit(Visitor<T> visitor) {
            switch (value) {
                case NOTE:
                    return visitor.visitNote();
                case QUICK_REPLY:
                    return visitor.visitQuickReply();
                case COMMENT:
                    return visitor.visitComment();
                case UNKNOWN:
                default:
                    return visitor.visitUnknown(string);
            }
        }

        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public static MessageType valueOf(String value) {
            switch (value) {
                case "note":
                    return NOTE;
                case "quick_reply":
                    return QUICK_REPLY;
                case "comment":
                    return COMMENT;
                default:
                    return new MessageType(Value.UNKNOWN, value);
            }
        }

        public enum Value {
            COMMENT,

            NOTE,

            QUICK_REPLY,

            UNKNOWN
        }

        public interface Visitor<T> {
            T visitComment();

            T visitNote();

            T visitQuickReply();

            T visitUnknown(String unknownType);
        }
    }

    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    @JsonDeserialize(builder = ReplyOptionsItem.Builder.class)
    public static final class ReplyOptionsItem {
        private final String text;

        private final String uuid;

        private final Map<String, Object> additionalProperties;

        private ReplyOptionsItem(String text, String uuid, Map<String, Object> additionalProperties) {
            this.text = text;
            this.uuid = uuid;
            this.additionalProperties = additionalProperties;
        }

        /**
         * @return The text to display in this quick reply option.
         */
        @JsonProperty("text")
        public String getText() {
            return text;
        }

        /**
         * @return A unique identifier for this quick reply option. This value will be available within the metadata of the comment ticket part that is created when a user clicks on this reply option.
         */
        @JsonProperty("uuid")
        public String getUuid() {
            return uuid;
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof ReplyOptionsItem && equalTo((ReplyOptionsItem) other);
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        private boolean equalTo(ReplyOptionsItem other) {
            return text.equals(other.text) && uuid.equals(other.uuid);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.text, this.uuid);
        }

        @java.lang.Override
        public String toString() {
            return ObjectMappers.stringify(this);
        }

        public static TextStage builder() {
            return new Builder();
        }

        public interface TextStage {
            /**
             * The text to display in this quick reply option.
             */
            UuidStage text(@NotNull String text);

            Builder from(ReplyOptionsItem other);
        }

        public interface UuidStage {
            /**
             * A unique identifier for this quick reply option. This value will be available within the metadata of the comment ticket part that is created when a user clicks on this reply option.
             */
            _FinalStage uuid(@NotNull String uuid);
        }

        public interface _FinalStage {
            ReplyOptionsItem build();
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static final class Builder implements TextStage, UuidStage, _FinalStage {
            private String text;

            private String uuid;

            @JsonAnySetter
            private Map<String, Object> additionalProperties = new HashMap<>();

            private Builder() {}

            @java.lang.Override
            public Builder from(ReplyOptionsItem other) {
                text(other.getText());
                uuid(other.getUuid());
                return this;
            }

            /**
             * The text to display in this quick reply option.<p>The text to display in this quick reply option.</p>
             * @return Reference to {@code this} so that method calls can be chained together.
             */
            @java.lang.Override
            @JsonSetter("text")
            public UuidStage text(@NotNull String text) {
                this.text = Objects.requireNonNull(text, "text must not be null");
                return this;
            }

            /**
             * A unique identifier for this quick reply option. This value will be available within the metadata of the comment ticket part that is created when a user clicks on this reply option.<p>A unique identifier for this quick reply option. This value will be available within the metadata of the comment ticket part that is created when a user clicks on this reply option.</p>
             * @return Reference to {@code this} so that method calls can be chained together.
             */
            @java.lang.Override
            @JsonSetter("uuid")
            public _FinalStage uuid(@NotNull String uuid) {
                this.uuid = Objects.requireNonNull(uuid, "uuid must not be null");
                return this;
            }

            @java.lang.Override
            public ReplyOptionsItem build() {
                return new ReplyOptionsItem(text, uuid, additionalProperties);
            }
        }
    }
}
