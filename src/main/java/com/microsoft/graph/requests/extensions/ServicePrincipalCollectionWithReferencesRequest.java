// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.requests.extensions.ServicePrincipalWithReferenceRequest;
import com.microsoft.graph.requests.extensions.ServicePrincipalReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ServicePrincipalCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.ServicePrincipalCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.ServicePrincipalCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Collection With References Request.
 */
public class ServicePrincipalCollectionWithReferencesRequest extends BaseCollectionWithReferencesRequest<ServicePrincipal, ServicePrincipalWithReferenceRequest, ServicePrincipalReferenceRequestBuilder, ServicePrincipalWithReferenceRequestBuilder, ServicePrincipalCollectionResponse, ServicePrincipalCollectionPage, ServicePrincipalCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of ServicePrincipal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ServicePrincipalCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ServicePrincipalCollectionResponse.class, ServicePrincipalCollectionPage.class, ServicePrincipalCollectionWithReferencesRequestBuilder.class);
    }

    public ServicePrincipalCollectionWithReferencesRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

    public ServicePrincipalCollectionWithReferencesRequest filter(final String value) {
        addFilterOption(value);
        return this;
    }

    public ServicePrincipalCollectionWithReferencesRequest orderBy(final String value) {
        addOrderByOption(value);
        return this;
    }

    public ServicePrincipalCollectionWithReferencesRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    public ServicePrincipalCollectionWithReferencesRequest top(final int value) {
        addTopOption(value);
        return this;
    }

}
