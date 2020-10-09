// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IdentityProvider;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IdentityProviderCollectionResponse;
import com.microsoft.graph.requests.extensions.IdentityProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityProviderCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Provider Collection Request.
 */
public class IdentityProviderCollectionRequest extends BaseCollectionRequest<IdentityProvider, IdentityProviderCollectionResponse> {

    /**
     * The request builder for this collection of IdentityProvider
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    @SuppressWarnings("unchecked")
    public IdentityProviderCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IdentityProvider.class, IdentityProviderCollectionResponse.class,(Class<BaseCollectionPage<IdentityProvider>>) (new BaseCollectionPage<IdentityProvider>(new java.util.ArrayList<IdentityProvider>(), null).getClass()));
    }

    public void get(final ICallback<? super BaseCollectionPage<IdentityProvider>> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public BaseCollectionPage<IdentityProvider> get() throws ClientException {
        final IdentityProviderCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final IdentityProvider newIdentityProvider, final ICallback<? super IdentityProvider> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new IdentityProviderRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newIdentityProvider, callback);
    }

    public IdentityProvider post(final IdentityProvider newIdentityProvider) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new IdentityProviderRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newIdentityProvider);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IdentityProviderCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IdentityProviderCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IdentityProviderCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IdentityProviderCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IdentityProviderCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IdentityProviderCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IdentityProviderCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return this;
    }
    public BaseCollectionPage<IdentityProvider> buildFromResponse(final IdentityProviderCollectionResponse response) {
        final IdentityProviderCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new IdentityProviderCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final BaseCollectionPage<IdentityProvider> page = new BaseCollectionPage<IdentityProvider>(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
