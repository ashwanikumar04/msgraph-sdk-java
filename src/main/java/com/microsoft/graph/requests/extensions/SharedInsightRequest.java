// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SharedInsight;
import com.microsoft.graph.requests.extensions.IEntityRequestBuilder;
import com.microsoft.graph.requests.extensions.EntityRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Shared Insight Request.
 */
public class SharedInsightRequest extends BaseRequest implements ISharedInsightRequest {
	
    /**
     * The request for the SharedInsight
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SharedInsightRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SharedInsight.class);
    }

    /**
     * Gets the SharedInsight from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super SharedInsight> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SharedInsight from the service
     *
     * @return the SharedInsight from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharedInsight get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super SharedInsight> callback) {
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
     * Patches this SharedInsight with a source
     *
     * @param sourceSharedInsight the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SharedInsight sourceSharedInsight, final ICallback<? super SharedInsight> callback) {
        send(HttpMethod.PATCH, callback, sourceSharedInsight);
    }

    /**
     * Patches this SharedInsight with a source
     *
     * @param sourceSharedInsight the source object with updates
     * @return the updated SharedInsight
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharedInsight patch(final SharedInsight sourceSharedInsight) throws ClientException {
        return send(HttpMethod.PATCH, sourceSharedInsight);
    }

    /**
     * Creates a SharedInsight with a new object
     *
     * @param newSharedInsight the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SharedInsight newSharedInsight, final ICallback<? super SharedInsight> callback) {
        send(HttpMethod.POST, callback, newSharedInsight);
    }

    /**
     * Creates a SharedInsight with a new object
     *
     * @param newSharedInsight the new object to create
     * @return the created SharedInsight
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharedInsight post(final SharedInsight newSharedInsight) throws ClientException {
        return send(HttpMethod.POST, newSharedInsight);
    }

    /**
     * Creates a SharedInsight with a new object
     *
     * @param newSharedInsight the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SharedInsight newSharedInsight, final ICallback<? super SharedInsight> callback) {
        send(HttpMethod.PUT, callback, newSharedInsight);
    }

    /**
     * Creates a SharedInsight with a new object
     *
     * @param newSharedInsight the object to create/update
     * @return the created SharedInsight
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SharedInsight put(final SharedInsight newSharedInsight) throws ClientException {
        return send(HttpMethod.PUT, newSharedInsight);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISharedInsightRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SharedInsightRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISharedInsightRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SharedInsightRequest)this;
     }

}

