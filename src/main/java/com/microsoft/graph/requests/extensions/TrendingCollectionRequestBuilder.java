// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OfficeGraphInsights;
import com.microsoft.graph.models.extensions.Trending;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.TrendingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TrendingRequestBuilder;
import com.microsoft.graph.requests.extensions.TrendingCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Trending Collection Request Builder.
 */
public class TrendingCollectionRequestBuilder extends BaseRequestBuilder<Trending> {

    /**
     * The request builder for this collection of OfficeGraphInsights
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TrendingCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public TrendingCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public TrendingCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new TrendingCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public TrendingRequestBuilder byId(final String id) {
        return new TrendingRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
