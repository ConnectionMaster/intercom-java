/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.unstable.conversations.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.intercom.api.resources.unstable.types.AssignConversationRequest;
import com.intercom.api.resources.unstable.types.CloseConversationRequest;
import com.intercom.api.resources.unstable.types.OpenConversationRequest;
import com.intercom.api.resources.unstable.types.SnoozeConversationRequest;
import java.util.Objects;
import java.util.Optional;

public final class ManageConversationRequestBody {
    private final Value value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    private ManageConversationRequestBody(Value value) {
        this.value = value;
    }

    public <T> T visit(Visitor<T> visitor) {
        return value.visit(visitor);
    }

    public static ManageConversationRequestBody close(CloseConversationRequest value) {
        return new ManageConversationRequestBody(new CloseValue(value));
    }

    public static ManageConversationRequestBody snoozed(SnoozeConversationRequest value) {
        return new ManageConversationRequestBody(new SnoozedValue(value));
    }

    public static ManageConversationRequestBody open(OpenConversationRequest value) {
        return new ManageConversationRequestBody(new OpenValue(value));
    }

    public static ManageConversationRequestBody assignment(AssignConversationRequest value) {
        return new ManageConversationRequestBody(new AssignmentValue(value));
    }

    public boolean isClose() {
        return value instanceof CloseValue;
    }

    public boolean isSnoozed() {
        return value instanceof SnoozedValue;
    }

    public boolean isOpen() {
        return value instanceof OpenValue;
    }

    public boolean isAssignment() {
        return value instanceof AssignmentValue;
    }

    public boolean _isUnknown() {
        return value instanceof _UnknownValue;
    }

    public Optional<CloseConversationRequest> getClose() {
        if (isClose()) {
            return Optional.of(((CloseValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<SnoozeConversationRequest> getSnoozed() {
        if (isSnoozed()) {
            return Optional.of(((SnoozedValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<OpenConversationRequest> getOpen() {
        if (isOpen()) {
            return Optional.of(((OpenValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<AssignConversationRequest> getAssignment() {
        if (isAssignment()) {
            return Optional.of(((AssignmentValue) value).value);
        }
        return Optional.empty();
    }

    public Optional<Object> _getUnknown() {
        if (_isUnknown()) {
            return Optional.of(((_UnknownValue) value).value);
        }
        return Optional.empty();
    }

    @JsonValue
    private Value getValue() {
        return this.value;
    }

    public interface Visitor<T> {
        T visitClose(CloseConversationRequest close);

        T visitSnoozed(SnoozeConversationRequest snoozed);

        T visitOpen(OpenConversationRequest open);

        T visitAssignment(AssignConversationRequest assignment);

        T _visitUnknown(Object unknownType);
    }

    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            property = "message_type",
            visible = true,
            defaultImpl = _UnknownValue.class)
    @JsonSubTypes({
        @JsonSubTypes.Type(CloseValue.class),
        @JsonSubTypes.Type(SnoozedValue.class),
        @JsonSubTypes.Type(OpenValue.class),
        @JsonSubTypes.Type(AssignmentValue.class)
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    private interface Value {
        <T> T visit(Visitor<T> visitor);
    }

    @JsonTypeName("close")
    @JsonIgnoreProperties("message_type")
    private static final class CloseValue implements Value {
        @JsonUnwrapped
        private CloseConversationRequest value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private CloseValue() {}

        private CloseValue(CloseConversationRequest value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitClose(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof CloseValue && equalTo((CloseValue) other);
        }

        private boolean equalTo(CloseValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ManageConversationRequestBody{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("snoozed")
    @JsonIgnoreProperties("message_type")
    private static final class SnoozedValue implements Value {
        @JsonUnwrapped
        private SnoozeConversationRequest value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private SnoozedValue() {}

        private SnoozedValue(SnoozeConversationRequest value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitSnoozed(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof SnoozedValue && equalTo((SnoozedValue) other);
        }

        private boolean equalTo(SnoozedValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ManageConversationRequestBody{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("open")
    @JsonIgnoreProperties("message_type")
    private static final class OpenValue implements Value {
        @JsonUnwrapped
        private OpenConversationRequest value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private OpenValue() {}

        private OpenValue(OpenConversationRequest value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitOpen(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof OpenValue && equalTo((OpenValue) other);
        }

        private boolean equalTo(OpenValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ManageConversationRequestBody{" + "value: " + value + "}";
        }
    }

    @JsonTypeName("assignment")
    @JsonIgnoreProperties("message_type")
    private static final class AssignmentValue implements Value {
        @JsonUnwrapped
        private AssignConversationRequest value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private AssignmentValue() {}

        private AssignmentValue(AssignConversationRequest value) {
            this.value = value;
        }

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.visitAssignment(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof AssignmentValue && equalTo((AssignmentValue) other);
        }

        private boolean equalTo(AssignmentValue other) {
            return value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ManageConversationRequestBody{" + "value: " + value + "}";
        }
    }

    @JsonIgnoreProperties("message_type")
    private static final class _UnknownValue implements Value {
        private String type;

        @JsonValue
        private Object value;

        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        private _UnknownValue(@JsonProperty("value") Object value) {}

        @java.lang.Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor._visitUnknown(value);
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof _UnknownValue && equalTo((_UnknownValue) other);
        }

        private boolean equalTo(_UnknownValue other) {
            return type.equals(other.type) && value.equals(other.value);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.type, this.value);
        }

        @java.lang.Override
        public String toString() {
            return "ManageConversationRequestBody{" + "type: " + type + ", value: " + value + "}";
        }
    }
}
