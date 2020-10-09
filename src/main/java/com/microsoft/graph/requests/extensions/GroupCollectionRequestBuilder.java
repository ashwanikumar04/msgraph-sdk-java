// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Group;
import com.microsoft.graph.models.extensions.AssignedLicense;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.GroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupCollectionRequest;
import com.microsoft.graph.requests.extensions.GroupDeltaCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Collection Request Builder.
 */
public class GroupCollectionRequestBuilder extends BaseRequestBuilder<Group> {

    /**
     * The request builder for this collection of Group
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public GroupCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public GroupCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new GroupCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public GroupRequestBuilder byId(final String id) {
        return new GroupRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public GroupDeltaCollectionRequestBuilder delta() {
        return new GroupDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null);
    }

	public GroupDeltaCollectionRequestBuilder delta(final String deltaLink) {
        return new GroupDeltaCollectionRequestBuilder(deltaLink, getClient(), null);
    }
}
