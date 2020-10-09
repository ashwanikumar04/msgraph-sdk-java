// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.callrecords.models.extensions.Session;
import com.microsoft.graph.callrecords.models.extensions.Segment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.callrecords.requests.extensions.SegmentCollectionRequestBuilder;
import com.microsoft.graph.callrecords.requests.extensions.SegmentRequestBuilder;
import com.microsoft.graph.callrecords.requests.extensions.SegmentCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Segment Collection Request Builder.
 */
public class SegmentCollectionRequestBuilder extends BaseRequestBuilder<Segment> {

    /**
     * The request builder for this collection of Session
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SegmentCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public SegmentCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public SegmentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new SegmentCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public SegmentRequestBuilder byId(final String id) {
        return new SegmentRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
