// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Chat;
import com.microsoft.graph.models.extensions.ChatMessage;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat With Reference Request.
 */
public class ChatWithReferenceRequest extends BaseRequest implements IChatWithReferenceRequest {

    /**
     * The request for the Chat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChatWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Chat.class);
    }

    public void post(final Chat newChat, final IJsonBackedObject payload, final ICallback<? super Chat> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public Chat post(final Chat newChat, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newChat;
        }
        return null;
    }

    public void get(final ICallback<? super Chat> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public Chat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super Chat> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final Chat sourceChat, final ICallback<? super Chat> callback) {
		send(HttpMethod.PATCH, callback, sourceChat);
	}

	public Chat patch(final Chat sourceChat) throws ClientException {
		return send(HttpMethod.PATCH, sourceChat);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IChatWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IChatWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IChatWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ChatWithReferenceRequest)this;
    }
}
