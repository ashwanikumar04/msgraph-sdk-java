// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemAnalytics;
import com.microsoft.graph.requests.extensions.ItemActivityStatCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemActivityStatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseWithReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Analytics With Reference Request.
 */
public class ItemAnalyticsWithReferenceRequest extends BaseWithReferenceRequest<ItemAnalytics> {

    /**
     * The request for the ItemAnalytics
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemAnalyticsWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemAnalytics.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ItemAnalyticsWithReferenceRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ItemAnalyticsWithReferenceRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }
}
