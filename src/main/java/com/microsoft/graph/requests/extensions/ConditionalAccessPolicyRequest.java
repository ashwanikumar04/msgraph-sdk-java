// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ConditionalAccessPolicy;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conditional Access Policy Request.
 */
public class ConditionalAccessPolicyRequest extends BaseRequest<ConditionalAccessPolicy> {
	
    /**
     * The request for the ConditionalAccessPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConditionalAccessPolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ConditionalAccessPolicy.class);
    }

    /**
     * Gets the ConditionalAccessPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ConditionalAccessPolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ConditionalAccessPolicy from the service
     *
     * @return the ConditionalAccessPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ConditionalAccessPolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ConditionalAccessPolicy> callback) {
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
     * Patches this ConditionalAccessPolicy with a source
     *
     * @param sourceConditionalAccessPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ConditionalAccessPolicy sourceConditionalAccessPolicy, final ICallback<? super ConditionalAccessPolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceConditionalAccessPolicy);
    }

    /**
     * Patches this ConditionalAccessPolicy with a source
     *
     * @param sourceConditionalAccessPolicy the source object with updates
     * @return the updated ConditionalAccessPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ConditionalAccessPolicy patch(final ConditionalAccessPolicy sourceConditionalAccessPolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceConditionalAccessPolicy);
    }

    /**
     * Creates a ConditionalAccessPolicy with a new object
     *
     * @param newConditionalAccessPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ConditionalAccessPolicy newConditionalAccessPolicy, final ICallback<? super ConditionalAccessPolicy> callback) {
        send(HttpMethod.POST, callback, newConditionalAccessPolicy);
    }

    /**
     * Creates a ConditionalAccessPolicy with a new object
     *
     * @param newConditionalAccessPolicy the new object to create
     * @return the created ConditionalAccessPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ConditionalAccessPolicy post(final ConditionalAccessPolicy newConditionalAccessPolicy) throws ClientException {
        return send(HttpMethod.POST, newConditionalAccessPolicy);
    }

    /**
     * Creates a ConditionalAccessPolicy with a new object
     *
     * @param newConditionalAccessPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ConditionalAccessPolicy newConditionalAccessPolicy, final ICallback<? super ConditionalAccessPolicy> callback) {
        send(HttpMethod.PUT, callback, newConditionalAccessPolicy);
    }

    /**
     * Creates a ConditionalAccessPolicy with a new object
     *
     * @param newConditionalAccessPolicy the object to create/update
     * @return the created ConditionalAccessPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ConditionalAccessPolicy put(final ConditionalAccessPolicy newConditionalAccessPolicy) throws ClientException {
        return send(HttpMethod.PUT, newConditionalAccessPolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ConditionalAccessPolicyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ConditionalAccessPolicyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return this;
     }

}

