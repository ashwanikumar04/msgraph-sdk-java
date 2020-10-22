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

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Endpoint Reference Request.
 */
public class EndpointReferenceRequest extends BaseReferenceRequest<Endpoint> {

    /**
     * The request for the Endpoint
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EndpointReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Endpoint.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public EndpointReferenceRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public EndpointReferenceRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }
    /**
     * Puts the Endpoint
     *
     * @param srcEndpoint the Endpoint reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(Endpoint srcEndpoint, final ICallback<? super Endpoint> callback) {
        send(HttpMethod.PUT, callback, srcEndpoint);
    }

    /**
     * Puts the Endpoint
     *
     * @param srcEndpoint the Endpoint reference to PUT
     * @return the Endpoint
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public Endpoint put(Endpoint srcEndpoint) throws ClientException {
        return send(HttpMethod.PUT, srcEndpoint);
    }
}
