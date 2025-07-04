/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.companies.requests;

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
@JsonDeserialize(builder = DetachContactFromCompanyRequest.Builder.class)
public final class DetachContactFromCompanyRequest {
    private final String contactId;

    private final String companyId;

    private final Map<String, Object> additionalProperties;

    private DetachContactFromCompanyRequest(
            String contactId, String companyId, Map<String, Object> additionalProperties) {
        this.contactId = contactId;
        this.companyId = companyId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The unique identifier for the contact which is given by Intercom
     */
    @JsonProperty("contact_id")
    public String getContactId() {
        return contactId;
    }

    /**
     * @return The unique identifier for the company which is given by Intercom
     */
    @JsonProperty("company_id")
    public String getCompanyId() {
        return companyId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof DetachContactFromCompanyRequest && equalTo((DetachContactFromCompanyRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(DetachContactFromCompanyRequest other) {
        return contactId.equals(other.contactId) && companyId.equals(other.companyId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.contactId, this.companyId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ContactIdStage builder() {
        return new Builder();
    }

    public interface ContactIdStage {
        /**
         * The unique identifier for the contact which is given by Intercom
         */
        CompanyIdStage contactId(@NotNull String contactId);

        Builder from(DetachContactFromCompanyRequest other);
    }

    public interface CompanyIdStage {
        /**
         * The unique identifier for the company which is given by Intercom
         */
        _FinalStage companyId(@NotNull String companyId);
    }

    public interface _FinalStage {
        DetachContactFromCompanyRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ContactIdStage, CompanyIdStage, _FinalStage {
        private String contactId;

        private String companyId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(DetachContactFromCompanyRequest other) {
            contactId(other.getContactId());
            companyId(other.getCompanyId());
            return this;
        }

        /**
         * The unique identifier for the contact which is given by Intercom<p>The unique identifier for the contact which is given by Intercom</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("contact_id")
        public CompanyIdStage contactId(@NotNull String contactId) {
            this.contactId = Objects.requireNonNull(contactId, "contactId must not be null");
            return this;
        }

        /**
         * The unique identifier for the company which is given by Intercom<p>The unique identifier for the company which is given by Intercom</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("company_id")
        public _FinalStage companyId(@NotNull String companyId) {
            this.companyId = Objects.requireNonNull(companyId, "companyId must not be null");
            return this;
        }

        @java.lang.Override
        public DetachContactFromCompanyRequest build() {
            return new DetachContactFromCompanyRequest(contactId, companyId, additionalProperties);
        }
    }
}
