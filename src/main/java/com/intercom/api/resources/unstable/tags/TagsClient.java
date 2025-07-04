/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.intercom.api.resources.unstable.tags;

import com.intercom.api.core.ClientOptions;
import com.intercom.api.core.RequestOptions;
import com.intercom.api.resources.unstable.tags.requests.AttachTagToContactRequest;
import com.intercom.api.resources.unstable.tags.requests.AttachTagToConversationRequest;
import com.intercom.api.resources.unstable.tags.requests.AttachTagToTicketRequest;
import com.intercom.api.resources.unstable.tags.requests.DeleteTagRequest;
import com.intercom.api.resources.unstable.tags.requests.DetachTagFromContactRequest;
import com.intercom.api.resources.unstable.tags.requests.DetachTagFromConversationRequest;
import com.intercom.api.resources.unstable.tags.requests.DetachTagFromTicketRequest;
import com.intercom.api.resources.unstable.tags.requests.FindTagRequest;
import com.intercom.api.resources.unstable.tags.types.CreateTagRequestBody;
import com.intercom.api.resources.unstable.tags.types.Tag;
import com.intercom.api.resources.unstable.types.TagList;

public class TagsClient {
    protected final ClientOptions clientOptions;

    private final RawTagsClient rawClient;

    public TagsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new RawTagsClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public RawTagsClient withRawResponse() {
        return this.rawClient;
    }

    /**
     * You can tag a specific contact. This will return a tag object for the tag that was added to the contact.
     */
    public Tag attachTagToContact(AttachTagToContactRequest request) {
        return this.rawClient.attachTagToContact(request).body();
    }

    /**
     * You can tag a specific contact. This will return a tag object for the tag that was added to the contact.
     */
    public Tag attachTagToContact(AttachTagToContactRequest request, RequestOptions requestOptions) {
        return this.rawClient.attachTagToContact(request, requestOptions).body();
    }

    /**
     * You can remove tag from a specific contact. This will return a tag object for the tag that was removed from the contact.
     */
    public Tag detachTagFromContact(DetachTagFromContactRequest request) {
        return this.rawClient.detachTagFromContact(request).body();
    }

    /**
     * You can remove tag from a specific contact. This will return a tag object for the tag that was removed from the contact.
     */
    public Tag detachTagFromContact(DetachTagFromContactRequest request, RequestOptions requestOptions) {
        return this.rawClient.detachTagFromContact(request, requestOptions).body();
    }

    /**
     * You can tag a specific conversation. This will return a tag object for the tag that was added to the conversation.
     */
    public Tag attachTagToConversation(AttachTagToConversationRequest request) {
        return this.rawClient.attachTagToConversation(request).body();
    }

    /**
     * You can tag a specific conversation. This will return a tag object for the tag that was added to the conversation.
     */
    public Tag attachTagToConversation(AttachTagToConversationRequest request, RequestOptions requestOptions) {
        return this.rawClient.attachTagToConversation(request, requestOptions).body();
    }

    /**
     * You can remove tag from a specific conversation. This will return a tag object for the tag that was removed from the conversation.
     */
    public Tag detachTagFromConversation(DetachTagFromConversationRequest request) {
        return this.rawClient.detachTagFromConversation(request).body();
    }

    /**
     * You can remove tag from a specific conversation. This will return a tag object for the tag that was removed from the conversation.
     */
    public Tag detachTagFromConversation(DetachTagFromConversationRequest request, RequestOptions requestOptions) {
        return this.rawClient.detachTagFromConversation(request, requestOptions).body();
    }

    /**
     * You can fetch a list of all tags for a given workspace.
     */
    public TagList listTags() {
        return this.rawClient.listTags().body();
    }

    /**
     * You can fetch a list of all tags for a given workspace.
     */
    public TagList listTags(RequestOptions requestOptions) {
        return this.rawClient.listTags(requestOptions).body();
    }

    /**
     * You can use this endpoint to perform the following operations:
     * <p><strong>1. Create a new tag:</strong> You can create a new tag by passing in the tag name as specified in &quot;Create or Update Tag Request Payload&quot; described below.</p>
     * <p><strong>2. Update an existing tag:</strong> You can update an existing tag by passing the id of the tag as specified in &quot;Create or Update Tag Request Payload&quot; described below.</p>
     * <p><strong>3. Tag Companies:</strong> You can tag single company or a list of companies. You can tag a company by passing in the tag name and the company details as specified in &quot;Tag Company Request Payload&quot; described below. Also, if the tag doesn't exist then a new one will be created automatically.</p>
     * <p><strong>4. Untag Companies:</strong> You can untag a single company or a list of companies. You can untag a company by passing in the tag id and the company details as specified in &quot;Untag Company Request Payload&quot; described below.</p>
     * <p><strong>5. Tag Multiple Users:</strong> You can tag a list of users. You can tag the users by passing in the tag name and the user details as specified in &quot;Tag Users Request Payload&quot; described below.</p>
     * <p>Each operation will return a tag object.</p>
     */
    public Tag createTag(CreateTagRequestBody request) {
        return this.rawClient.createTag(request).body();
    }

    /**
     * You can use this endpoint to perform the following operations:
     * <p><strong>1. Create a new tag:</strong> You can create a new tag by passing in the tag name as specified in &quot;Create or Update Tag Request Payload&quot; described below.</p>
     * <p><strong>2. Update an existing tag:</strong> You can update an existing tag by passing the id of the tag as specified in &quot;Create or Update Tag Request Payload&quot; described below.</p>
     * <p><strong>3. Tag Companies:</strong> You can tag single company or a list of companies. You can tag a company by passing in the tag name and the company details as specified in &quot;Tag Company Request Payload&quot; described below. Also, if the tag doesn't exist then a new one will be created automatically.</p>
     * <p><strong>4. Untag Companies:</strong> You can untag a single company or a list of companies. You can untag a company by passing in the tag id and the company details as specified in &quot;Untag Company Request Payload&quot; described below.</p>
     * <p><strong>5. Tag Multiple Users:</strong> You can tag a list of users. You can tag the users by passing in the tag name and the user details as specified in &quot;Tag Users Request Payload&quot; described below.</p>
     * <p>Each operation will return a tag object.</p>
     */
    public Tag createTag(CreateTagRequestBody request, RequestOptions requestOptions) {
        return this.rawClient.createTag(request, requestOptions).body();
    }

    /**
     * You can fetch the details of tags that are on the workspace by their id.
     * This will return a tag object.
     */
    public Tag findTag(FindTagRequest request) {
        return this.rawClient.findTag(request).body();
    }

    /**
     * You can fetch the details of tags that are on the workspace by their id.
     * This will return a tag object.
     */
    public Tag findTag(FindTagRequest request, RequestOptions requestOptions) {
        return this.rawClient.findTag(request, requestOptions).body();
    }

    /**
     * You can delete the details of tags that are on the workspace by passing in the id.
     */
    public void deleteTag(DeleteTagRequest request) {
        this.rawClient.deleteTag(request).body();
    }

    /**
     * You can delete the details of tags that are on the workspace by passing in the id.
     */
    public void deleteTag(DeleteTagRequest request, RequestOptions requestOptions) {
        this.rawClient.deleteTag(request, requestOptions).body();
    }

    /**
     * You can tag a specific ticket. This will return a tag object for the tag that was added to the ticket.
     */
    public Tag attachTagToTicket(AttachTagToTicketRequest request) {
        return this.rawClient.attachTagToTicket(request).body();
    }

    /**
     * You can tag a specific ticket. This will return a tag object for the tag that was added to the ticket.
     */
    public Tag attachTagToTicket(AttachTagToTicketRequest request, RequestOptions requestOptions) {
        return this.rawClient.attachTagToTicket(request, requestOptions).body();
    }

    /**
     * You can remove tag from a specific ticket. This will return a tag object for the tag that was removed from the ticket.
     */
    public Tag detachTagFromTicket(DetachTagFromTicketRequest request) {
        return this.rawClient.detachTagFromTicket(request).body();
    }

    /**
     * You can remove tag from a specific ticket. This will return a tag object for the tag that was removed from the ticket.
     */
    public Tag detachTagFromTicket(DetachTagFromTicketRequest request, RequestOptions requestOptions) {
        return this.rawClient.detachTagFromTicket(request, requestOptions).body();
    }
}
