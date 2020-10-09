// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedEBook;
import com.microsoft.graph.models.extensions.UserInstallStateSummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.UserInstallStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserInstallStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.UserInstallStateSummaryCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Install State Summary Collection Request Builder.
 */
public class UserInstallStateSummaryCollectionRequestBuilder extends BaseRequestBuilder<UserInstallStateSummary> {

    /**
     * The request builder for this collection of ManagedEBook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserInstallStateSummaryCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public UserInstallStateSummaryCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public UserInstallStateSummaryCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new UserInstallStateSummaryCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public UserInstallStateSummaryRequestBuilder byId(final String id) {
        return new UserInstallStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
