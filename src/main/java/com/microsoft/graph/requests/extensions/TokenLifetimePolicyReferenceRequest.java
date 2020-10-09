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

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Token Lifetime Policy Reference Request.
 */
public class TokenLifetimePolicyReferenceRequest extends BaseReferenceRequest<TokenLifetimePolicy> {

    /**
     * The request for the TokenLifetimePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TokenLifetimePolicyReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TokenLifetimePolicy.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public TokenLifetimePolicyReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public TokenLifetimePolicyReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }
    /**
     * Puts the TokenLifetimePolicy
     *
     * @param srcTokenLifetimePolicy the TokenLifetimePolicy reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(TokenLifetimePolicy srcTokenLifetimePolicy, final ICallback<? super TokenLifetimePolicy> callback) {
        send(HttpMethod.PUT, callback, srcTokenLifetimePolicy);
    }

    /**
     * Puts the TokenLifetimePolicy
     *
     * @param srcTokenLifetimePolicy the TokenLifetimePolicy reference to PUT
     * @return the TokenLifetimePolicy
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public TokenLifetimePolicy put(TokenLifetimePolicy srcTokenLifetimePolicy) throws ClientException {
        return send(HttpMethod.PUT, srcTokenLifetimePolicy);
    }
}
