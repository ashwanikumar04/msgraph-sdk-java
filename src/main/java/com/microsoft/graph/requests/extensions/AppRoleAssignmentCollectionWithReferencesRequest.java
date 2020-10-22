// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.AppRoleAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.AppRoleAssignment;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentWithReferenceRequest;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Role Assignment Collection With References Request.
 */
public class AppRoleAssignmentCollectionWithReferencesRequest extends BaseCollectionWithReferencesRequest<AppRoleAssignment, AppRoleAssignmentWithReferenceRequest, AppRoleAssignmentReferenceRequestBuilder, AppRoleAssignmentWithReferenceRequestBuilder, AppRoleAssignmentCollectionResponse, AppRoleAssignmentCollectionPage, AppRoleAssignmentCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of AppRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppRoleAssignmentCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AppRoleAssignmentCollectionResponse.class, AppRoleAssignmentCollectionPage.class, AppRoleAssignmentCollectionWithReferencesRequestBuilder.class);
    }

    public AppRoleAssignmentCollectionWithReferencesRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

    public AppRoleAssignmentCollectionWithReferencesRequest filter(final String value) {
        addFilterOption(value);
        return this;
    }

    public AppRoleAssignmentCollectionWithReferencesRequest orderBy(final String value) {
        addOrderByOption(value);
        return this;
    }

    public AppRoleAssignmentCollectionWithReferencesRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    public AppRoleAssignmentCollectionWithReferencesRequest top(final int value) {
        addTopOption(value);
        return this;
    }

}
