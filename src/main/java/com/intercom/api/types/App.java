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
@JsonDeserialize(builder = App.Builder.class)
public final class App {
    private final String type;

    private final String idCode;

    private final String name;

    private final String region;

    private final String timezone;

    private final int createdAt;

    private final boolean identityVerification;

    private final Map<String, Object> additionalProperties;

    private App(
            String type,
            String idCode,
            String name,
            String region,
            String timezone,
            int createdAt,
            boolean identityVerification,
            Map<String, Object> additionalProperties) {
        this.type = type;
        this.idCode = idCode;
        this.name = name;
        this.region = region;
        this.timezone = timezone;
        this.createdAt = createdAt;
        this.identityVerification = identityVerification;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * @return The id of the app.
     */
    @JsonProperty("id_code")
    public String getIdCode() {
        return idCode;
    }

    /**
     * @return The name of the app.
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return The Intercom region the app is located in.
     */
    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    /**
     * @return The timezone of the region where the app is located.
     */
    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    /**
     * @return When the app was created.
     */
    @JsonProperty("created_at")
    public int getCreatedAt() {
        return createdAt;
    }

    /**
     * @return Whether or not the app uses identity verification.
     */
    @JsonProperty("identity_verification")
    public boolean getIdentityVerification() {
        return identityVerification;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof App && equalTo((App) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(App other) {
        return type.equals(other.type)
                && idCode.equals(other.idCode)
                && name.equals(other.name)
                && region.equals(other.region)
                && timezone.equals(other.timezone)
                && createdAt == other.createdAt
                && identityVerification == other.identityVerification;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.type,
                this.idCode,
                this.name,
                this.region,
                this.timezone,
                this.createdAt,
                this.identityVerification);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TypeStage builder() {
        return new Builder();
    }

    public interface TypeStage {
        IdCodeStage type(@NotNull String type);

        Builder from(App other);
    }

    public interface IdCodeStage {
        /**
         * The id of the app.
         */
        NameStage idCode(@NotNull String idCode);
    }

    public interface NameStage {
        /**
         * The name of the app.
         */
        RegionStage name(@NotNull String name);
    }

    public interface RegionStage {
        /**
         * The Intercom region the app is located in.
         */
        TimezoneStage region(@NotNull String region);
    }

    public interface TimezoneStage {
        /**
         * The timezone of the region where the app is located.
         */
        CreatedAtStage timezone(@NotNull String timezone);
    }

    public interface CreatedAtStage {
        /**
         * When the app was created.
         */
        IdentityVerificationStage createdAt(int createdAt);
    }

    public interface IdentityVerificationStage {
        /**
         * Whether or not the app uses identity verification.
         */
        _FinalStage identityVerification(boolean identityVerification);
    }

    public interface _FinalStage {
        App build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements TypeStage,
                    IdCodeStage,
                    NameStage,
                    RegionStage,
                    TimezoneStage,
                    CreatedAtStage,
                    IdentityVerificationStage,
                    _FinalStage {
        private String type;

        private String idCode;

        private String name;

        private String region;

        private String timezone;

        private int createdAt;

        private boolean identityVerification;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(App other) {
            type(other.getType());
            idCode(other.getIdCode());
            name(other.getName());
            region(other.getRegion());
            timezone(other.getTimezone());
            createdAt(other.getCreatedAt());
            identityVerification(other.getIdentityVerification());
            return this;
        }

        /**
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("type")
        public IdCodeStage type(@NotNull String type) {
            this.type = Objects.requireNonNull(type, "type must not be null");
            return this;
        }

        /**
         * The id of the app.<p>The id of the app.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("id_code")
        public NameStage idCode(@NotNull String idCode) {
            this.idCode = Objects.requireNonNull(idCode, "idCode must not be null");
            return this;
        }

        /**
         * The name of the app.<p>The name of the app.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("name")
        public RegionStage name(@NotNull String name) {
            this.name = Objects.requireNonNull(name, "name must not be null");
            return this;
        }

        /**
         * The Intercom region the app is located in.<p>The Intercom region the app is located in.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("region")
        public TimezoneStage region(@NotNull String region) {
            this.region = Objects.requireNonNull(region, "region must not be null");
            return this;
        }

        /**
         * The timezone of the region where the app is located.<p>The timezone of the region where the app is located.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("timezone")
        public CreatedAtStage timezone(@NotNull String timezone) {
            this.timezone = Objects.requireNonNull(timezone, "timezone must not be null");
            return this;
        }

        /**
         * When the app was created.<p>When the app was created.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("created_at")
        public IdentityVerificationStage createdAt(int createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Whether or not the app uses identity verification.<p>Whether or not the app uses identity verification.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("identity_verification")
        public _FinalStage identityVerification(boolean identityVerification) {
            this.identityVerification = identityVerification;
            return this;
        }

        @java.lang.Override
        public App build() {
            return new App(type, idCode, name, region, timezone, createdAt, identityVerification, additionalProperties);
        }
    }
}
