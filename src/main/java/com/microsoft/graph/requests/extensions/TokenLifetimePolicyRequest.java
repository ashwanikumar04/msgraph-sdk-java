// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TokenLifetimePolicy;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Token Lifetime Policy Request.
 */
public class TokenLifetimePolicyRequest extends BaseRequest<TokenLifetimePolicy> {
	
    /**
     * The request for the TokenLifetimePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TokenLifetimePolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TokenLifetimePolicy.class);
    }

    /**
     * Gets the TokenLifetimePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super TokenLifetimePolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TokenLifetimePolicy from the service
     *
     * @return the TokenLifetimePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TokenLifetimePolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super TokenLifetimePolicy> callback) {
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
     * Patches this TokenLifetimePolicy with a source
     *
     * @param sourceTokenLifetimePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TokenLifetimePolicy sourceTokenLifetimePolicy, final ICallback<? super TokenLifetimePolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceTokenLifetimePolicy);
    }

    /**
     * Patches this TokenLifetimePolicy with a source
     *
     * @param sourceTokenLifetimePolicy the source object with updates
     * @return the updated TokenLifetimePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TokenLifetimePolicy patch(final TokenLifetimePolicy sourceTokenLifetimePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceTokenLifetimePolicy);
    }

    /**
     * Creates a TokenLifetimePolicy with a new object
     *
     * @param newTokenLifetimePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TokenLifetimePolicy newTokenLifetimePolicy, final ICallback<? super TokenLifetimePolicy> callback) {
        send(HttpMethod.POST, callback, newTokenLifetimePolicy);
    }

    /**
     * Creates a TokenLifetimePolicy with a new object
     *
     * @param newTokenLifetimePolicy the new object to create
     * @return the created TokenLifetimePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TokenLifetimePolicy post(final TokenLifetimePolicy newTokenLifetimePolicy) throws ClientException {
        return send(HttpMethod.POST, newTokenLifetimePolicy);
    }

    /**
     * Creates a TokenLifetimePolicy with a new object
     *
     * @param newTokenLifetimePolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final TokenLifetimePolicy newTokenLifetimePolicy, final ICallback<? super TokenLifetimePolicy> callback) {
        send(HttpMethod.PUT, callback, newTokenLifetimePolicy);
    }

    /**
     * Creates a TokenLifetimePolicy with a new object
     *
     * @param newTokenLifetimePolicy the object to create/update
     * @return the created TokenLifetimePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TokenLifetimePolicy put(final TokenLifetimePolicy newTokenLifetimePolicy) throws ClientException {
        return send(HttpMethod.PUT, newTokenLifetimePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public TokenLifetimePolicyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public TokenLifetimePolicyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return this;
     }

}

