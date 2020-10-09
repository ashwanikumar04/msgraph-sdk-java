// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemAnalytics;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ItemActivityStatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemActivityStatRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemActivityStatCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Activity Stat Collection Request Builder.
 */
public class ItemActivityStatCollectionRequestBuilder extends BaseRequestBuilder<ItemActivityStat> {

    /**
     * The request builder for this collection of ItemAnalytics
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemActivityStatCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ItemActivityStatCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ItemActivityStatCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ItemActivityStatCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ItemActivityStatRequestBuilder byId(final String id) {
        return new ItemActivityStatRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
