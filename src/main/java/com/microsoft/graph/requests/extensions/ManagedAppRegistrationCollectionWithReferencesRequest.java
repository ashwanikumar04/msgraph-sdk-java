// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.ManagedAppRegistration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ManagedAppRegistration;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationWithReferenceRequest;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Registration Collection With References Request.
 */
public class ManagedAppRegistrationCollectionWithReferencesRequest extends BaseCollectionWithReferencesRequest<ManagedAppRegistration, ManagedAppRegistrationWithReferenceRequest, ManagedAppRegistrationReferenceRequestBuilder, ManagedAppRegistrationWithReferenceRequestBuilder, ManagedAppRegistrationCollectionResponse, ManagedAppRegistrationCollectionPage, ManagedAppRegistrationCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of ManagedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppRegistrationCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppRegistrationCollectionResponse.class, ManagedAppRegistrationCollectionPage.class, ManagedAppRegistrationCollectionWithReferencesRequestBuilder.class);
    }

    public ManagedAppRegistrationCollectionWithReferencesRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

    public ManagedAppRegistrationCollectionWithReferencesRequest filter(final String value) {
        addFilterOption(value);
        return this;
    }

    public ManagedAppRegistrationCollectionWithReferencesRequest orderBy(final String value) {
        addOrderByOption(value);
        return this;
    }

    public ManagedAppRegistrationCollectionWithReferencesRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    public ManagedAppRegistrationCollectionWithReferencesRequest top(final int value) {
        addTopOption(value);
        return this;
    }

}
