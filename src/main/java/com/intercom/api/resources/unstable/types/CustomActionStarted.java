/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.unstable.types;

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

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CustomActionStarted.Builder.class)
public final class CustomActionStarted {
    private final Optional<Action> action;

    private final Map<String, Object> additionalProperties;

    private CustomActionStarted(Optional<Action> action, Map<String, Object> additionalProperties) {
        this.action = action;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("action")
    public Optional<Action> getAction() {
        return action;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CustomActionStarted && equalTo((CustomActionStarted) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CustomActionStarted other) {
        return action.equals(other.action);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.action);
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
        private Optional<Action> action = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(CustomActionStarted other) {
            action(other.getAction());
            return this;
        }

        @JsonSetter(value = "action", nulls = Nulls.SKIP)
        public Builder action(Optional<Action> action) {
            this.action = action;
            return this;
        }

        public Builder action(Action action) {
            this.action = Optional.ofNullable(action);
            return this;
        }

        public CustomActionStarted build() {
            return new CustomActionStarted(action, additionalProperties);
        }
    }

    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    @JsonDeserialize(builder = Action.Builder.class)
    public static final class Action {
        private final Optional<String> name;

        private final Map<String, Object> additionalProperties;

        private Action(Optional<String> name, Map<String, Object> additionalProperties) {
            this.name = name;
            this.additionalProperties = additionalProperties;
        }

        /**
         * @return Name of the action
         */
        @JsonProperty("name")
        public Optional<String> getName() {
            return name;
        }

        @java.lang.Override
        public boolean equals(Object other) {
            if (this == other) return true;
            return other instanceof Action && equalTo((Action) other);
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        private boolean equalTo(Action other) {
            return name.equals(other.name);
        }

        @java.lang.Override
        public int hashCode() {
            return Objects.hash(this.name);
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
            private Optional<String> name = Optional.empty();

            @JsonAnySetter
            private Map<String, Object> additionalProperties = new HashMap<>();

            private Builder() {}

            public Builder from(Action other) {
                name(other.getName());
                return this;
            }

            /**
             * <p>Name of the action</p>
             */
            @JsonSetter(value = "name", nulls = Nulls.SKIP)
            public Builder name(Optional<String> name) {
                this.name = name;
                return this;
            }

            public Builder name(String name) {
                this.name = Optional.ofNullable(name);
                return this;
            }

            public Action build() {
                return new Action(name, additionalProperties);
            }
        }
    }
}
