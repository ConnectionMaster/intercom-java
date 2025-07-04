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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CheckboxComponent.Builder.class)
public final class CheckboxComponent {
    private final String id;

    private final List<CheckboxOption> option;

    private final String label;

    private final Optional<List<String>> value;

    private final Optional<SaveState> saveState;

    private final Optional<Boolean> disabled;

    private final Map<String, Object> additionalProperties;

    private CheckboxComponent(
            String id,
            List<CheckboxOption> option,
            String label,
            Optional<List<String>> value,
            Optional<SaveState> saveState,
            Optional<Boolean> disabled,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.option = option;
        this.label = label;
        this.value = value;
        this.saveState = saveState;
        this.disabled = disabled;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return A unique identifier for the component.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * @return The list of options. Minimum of 1.
     */
    @JsonProperty("option")
    public List<CheckboxOption> getOption() {
        return option;
    }

    /**
     * @return The text shown above the options.
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * @return The option's that are selected by default.
     */
    @JsonProperty("value")
    public Optional<List<String>> getValue() {
        return value;
    }

    /**
     * @return Styles the input. Default is <code>unsaved</code>. Prevent action with <code>saved</code>.
     */
    @JsonProperty("save_state")
    public Optional<SaveState> getSaveState() {
        return saveState;
    }

    /**
     * @return Styles all options and prevents the action. Default is false. Will be overridden if save_state is saved.
     */
    @JsonProperty("disabled")
    public Optional<Boolean> getDisabled() {
        return disabled;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CheckboxComponent && equalTo((CheckboxComponent) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CheckboxComponent other) {
        return id.equals(other.id)
                && option.equals(other.option)
                && label.equals(other.label)
                && value.equals(other.value)
                && saveState.equals(other.saveState)
                && disabled.equals(other.disabled);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.option, this.label, this.value, this.saveState, this.disabled);
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
         * A unique identifier for the component.
         */
        LabelStage id(@NotNull String id);

        Builder from(CheckboxComponent other);
    }

    public interface LabelStage {
        /**
         * The text shown above the options.
         */
        _FinalStage label(@NotNull String label);
    }

    public interface _FinalStage {
        CheckboxComponent build();

        /**
         * <p>The list of options. Minimum of 1.</p>
         */
        _FinalStage option(List<CheckboxOption> option);

        _FinalStage addOption(CheckboxOption option);

        _FinalStage addAllOption(List<CheckboxOption> option);

        /**
         * <p>The option's that are selected by default.</p>
         */
        _FinalStage value(Optional<List<String>> value);

        _FinalStage value(List<String> value);

        /**
         * <p>Styles the input. Default is <code>unsaved</code>. Prevent action with <code>saved</code>.</p>
         */
        _FinalStage saveState(Optional<SaveState> saveState);

        _FinalStage saveState(SaveState saveState);

        /**
         * <p>Styles all options and prevents the action. Default is false. Will be overridden if save_state is saved.</p>
         */
        _FinalStage disabled(Optional<Boolean> disabled);

        _FinalStage disabled(Boolean disabled);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, LabelStage, _FinalStage {
        private String id;

        private String label;

        private Optional<Boolean> disabled = Optional.empty();

        private Optional<SaveState> saveState = Optional.empty();

        private Optional<List<String>> value = Optional.empty();

        private List<CheckboxOption> option = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CheckboxComponent other) {
            id(other.getId());
            option(other.getOption());
            label(other.getLabel());
            value(other.getValue());
            saveState(other.getSaveState());
            disabled(other.getDisabled());
            return this;
        }

        /**
         * A unique identifier for the component.<p>A unique identifier for the component.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("id")
        public LabelStage id(@NotNull String id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        /**
         * The text shown above the options.<p>The text shown above the options.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("label")
        public _FinalStage label(@NotNull String label) {
            this.label = Objects.requireNonNull(label, "label must not be null");
            return this;
        }

        /**
         * <p>Styles all options and prevents the action. Default is false. Will be overridden if save_state is saved.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage disabled(Boolean disabled) {
            this.disabled = Optional.ofNullable(disabled);
            return this;
        }

        /**
         * <p>Styles all options and prevents the action. Default is false. Will be overridden if save_state is saved.</p>
         */
        @java.lang.Override
        @JsonSetter(value = "disabled", nulls = Nulls.SKIP)
        public _FinalStage disabled(Optional<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        /**
         * <p>Styles the input. Default is <code>unsaved</code>. Prevent action with <code>saved</code>.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage saveState(SaveState saveState) {
            this.saveState = Optional.ofNullable(saveState);
            return this;
        }

        /**
         * <p>Styles the input. Default is <code>unsaved</code>. Prevent action with <code>saved</code>.</p>
         */
        @java.lang.Override
        @JsonSetter(value = "save_state", nulls = Nulls.SKIP)
        public _FinalStage saveState(Optional<SaveState> saveState) {
            this.saveState = saveState;
            return this;
        }

        /**
         * <p>The option's that are selected by default.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage value(List<String> value) {
            this.value = Optional.ofNullable(value);
            return this;
        }

        /**
         * <p>The option's that are selected by default.</p>
         */
        @java.lang.Override
        @JsonSetter(value = "value", nulls = Nulls.SKIP)
        public _FinalStage value(Optional<List<String>> value) {
            this.value = value;
            return this;
        }

        /**
         * <p>The list of options. Minimum of 1.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllOption(List<CheckboxOption> option) {
            this.option.addAll(option);
            return this;
        }

        /**
         * <p>The list of options. Minimum of 1.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addOption(CheckboxOption option) {
            this.option.add(option);
            return this;
        }

        /**
         * <p>The list of options. Minimum of 1.</p>
         */
        @java.lang.Override
        @JsonSetter(value = "option", nulls = Nulls.SKIP)
        public _FinalStage option(List<CheckboxOption> option) {
            this.option.clear();
            this.option.addAll(option);
            return this;
        }

        @java.lang.Override
        public CheckboxComponent build() {
            return new CheckboxComponent(id, option, label, value, saveState, disabled, additionalProperties);
        }
    }

    public static final class SaveState {
        public static final SaveState SAVED = new SaveState(Value.SAVED, "saved");

        public static final SaveState UNSAVED = new SaveState(Value.UNSAVED, "unsaved");

        public static final SaveState FAILED = new SaveState(Value.FAILED, "failed");

        private final Value value;

        private final String string;

        SaveState(Value value, String string) {
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
            return (this == other) || (other instanceof SaveState && this.string.equals(((SaveState) other).string));
        }

        @java.lang.Override
        public int hashCode() {
            return this.string.hashCode();
        }

        public <T> T visit(Visitor<T> visitor) {
            switch (value) {
                case SAVED:
                    return visitor.visitSaved();
                case UNSAVED:
                    return visitor.visitUnsaved();
                case FAILED:
                    return visitor.visitFailed();
                case UNKNOWN:
                default:
                    return visitor.visitUnknown(string);
            }
        }

        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        public static SaveState valueOf(String value) {
            switch (value) {
                case "saved":
                    return SAVED;
                case "unsaved":
                    return UNSAVED;
                case "failed":
                    return FAILED;
                default:
                    return new SaveState(Value.UNKNOWN, value);
            }
        }

        public enum Value {
            UNSAVED,

            SAVED,

            FAILED,

            UNKNOWN
        }

        public interface Visitor<T> {
            T visitUnsaved();

            T visitSaved();

            T visitFailed();

            T visitUnknown(String unknownType);
        }
    }
}
