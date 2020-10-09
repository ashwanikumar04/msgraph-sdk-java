// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Invitation;
import com.microsoft.graph.requests.extensions.UserRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Invitation Request.
 */
public class InvitationRequest extends BaseRequest<Invitation> {
	
    /**
     * The request for the Invitation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public InvitationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Invitation.class);
    }

    /**
     * Gets the Invitation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Invitation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Invitation from the service
     *
     * @return the Invitation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Invitation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Invitation> callback) {
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
     * Patches this Invitation with a source
     *
     * @param sourceInvitation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Invitation sourceInvitation, final ICallback<? super Invitation> callback) {
        send(HttpMethod.PATCH, callback, sourceInvitation);
    }

    /**
     * Patches this Invitation with a source
     *
     * @param sourceInvitation the source object with updates
     * @return the updated Invitation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Invitation patch(final Invitation sourceInvitation) throws ClientException {
        return send(HttpMethod.PATCH, sourceInvitation);
    }

    /**
     * Creates a Invitation with a new object
     *
     * @param newInvitation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Invitation newInvitation, final ICallback<? super Invitation> callback) {
        send(HttpMethod.POST, callback, newInvitation);
    }

    /**
     * Creates a Invitation with a new object
     *
     * @param newInvitation the new object to create
     * @return the created Invitation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Invitation post(final Invitation newInvitation) throws ClientException {
        return send(HttpMethod.POST, newInvitation);
    }

    /**
     * Creates a Invitation with a new object
     *
     * @param newInvitation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Invitation newInvitation, final ICallback<? super Invitation> callback) {
        send(HttpMethod.PUT, callback, newInvitation);
    }

    /**
     * Creates a Invitation with a new object
     *
     * @param newInvitation the object to create/update
     * @return the created Invitation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Invitation put(final Invitation newInvitation) throws ClientException {
        return send(HttpMethod.PUT, newInvitation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public InvitationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public InvitationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return this;
     }

}

