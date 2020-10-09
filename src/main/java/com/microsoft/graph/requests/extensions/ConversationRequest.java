// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Conversation;
import com.microsoft.graph.requests.extensions.ConversationThreadCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationThreadRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conversation Request.
 */
public class ConversationRequest extends BaseRequest<Conversation> {
	
    /**
     * The request for the Conversation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConversationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Conversation.class);
    }

    /**
     * Gets the Conversation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Conversation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Conversation from the service
     *
     * @return the Conversation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Conversation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Conversation> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Conversation with a source
     *
     * @param sourceConversation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Conversation sourceConversation, final ICallback<? super Conversation> callback) {
        send(HttpMethod.PATCH, callback, sourceConversation);
    }

    /**
     * Patches this Conversation with a source
     *
     * @param sourceConversation the source object with updates
     * @return the updated Conversation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Conversation patch(final Conversation sourceConversation) throws ClientException {
        return send(HttpMethod.PATCH, sourceConversation);
    }

    /**
     * Creates a Conversation with a new object
     *
     * @param newConversation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Conversation newConversation, final ICallback<? super Conversation> callback) {
        send(HttpMethod.POST, callback, newConversation);
    }

    /**
     * Creates a Conversation with a new object
     *
     * @param newConversation the new object to create
     * @return the created Conversation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Conversation post(final Conversation newConversation) throws ClientException {
        return send(HttpMethod.POST, newConversation);
    }

    /**
     * Creates a Conversation with a new object
     *
     * @param newConversation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Conversation newConversation, final ICallback<? super Conversation> callback) {
        send(HttpMethod.PUT, callback, newConversation);
    }

    /**
     * Creates a Conversation with a new object
     *
     * @param newConversation the object to create/update
     * @return the created Conversation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Conversation put(final Conversation newConversation) throws ClientException {
        return send(HttpMethod.PUT, newConversation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ConversationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ConversationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return this;
     }

}

