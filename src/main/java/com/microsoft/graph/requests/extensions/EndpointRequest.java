// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Endpoint;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Endpoint Request.
 */
public class EndpointRequest extends BaseRequest<Endpoint> {
	
    /**
     * The request for the Endpoint
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EndpointRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Endpoint.class);
    }

    /**
     * Gets the Endpoint from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Endpoint> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Endpoint from the service
     *
     * @return the Endpoint from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Endpoint get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Endpoint> callback) {
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
     * Patches this Endpoint with a source
     *
     * @param sourceEndpoint the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Endpoint sourceEndpoint, final ICallback<? super Endpoint> callback) {
        send(HttpMethod.PATCH, callback, sourceEndpoint);
    }

    /**
     * Patches this Endpoint with a source
     *
     * @param sourceEndpoint the source object with updates
     * @return the updated Endpoint
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Endpoint patch(final Endpoint sourceEndpoint) throws ClientException {
        return send(HttpMethod.PATCH, sourceEndpoint);
    }

    /**
     * Creates a Endpoint with a new object
     *
     * @param newEndpoint the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Endpoint newEndpoint, final ICallback<? super Endpoint> callback) {
        send(HttpMethod.POST, callback, newEndpoint);
    }

    /**
     * Creates a Endpoint with a new object
     *
     * @param newEndpoint the new object to create
     * @return the created Endpoint
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Endpoint post(final Endpoint newEndpoint) throws ClientException {
        return send(HttpMethod.POST, newEndpoint);
    }

    /**
     * Creates a Endpoint with a new object
     *
     * @param newEndpoint the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Endpoint newEndpoint, final ICallback<? super Endpoint> callback) {
        send(HttpMethod.PUT, callback, newEndpoint);
    }

    /**
     * Creates a Endpoint with a new object
     *
     * @param newEndpoint the object to create/update
     * @return the created Endpoint
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Endpoint put(final Endpoint newEndpoint) throws ClientException {
        return send(HttpMethod.PUT, newEndpoint);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public EndpointRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public EndpointRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return this;
     }

}

