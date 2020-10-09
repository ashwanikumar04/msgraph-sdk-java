// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.OrganizationSetMobileDeviceManagementAuthorityRequest;
import com.microsoft.graph.models.extensions.Organization;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Organization Set Mobile Device Management Authority Request Builder.
 */
public class OrganizationSetMobileDeviceManagementAuthorityRequestBuilder extends BaseActionRequestBuilder<Int32> {

    /**
     * The request builder for this OrganizationSetMobileDeviceManagementAuthority
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OrganizationSetMobileDeviceManagementAuthorityRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the OrganizationSetMobileDeviceManagementAuthorityRequest
     *
     * @param requestOptions the options for the request
     * @return the OrganizationSetMobileDeviceManagementAuthorityRequest instance
     */
    public OrganizationSetMobileDeviceManagementAuthorityRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the OrganizationSetMobileDeviceManagementAuthorityRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the OrganizationSetMobileDeviceManagementAuthorityRequest instance
     */
    public OrganizationSetMobileDeviceManagementAuthorityRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        OrganizationSetMobileDeviceManagementAuthorityRequest request = new OrganizationSetMobileDeviceManagementAuthorityRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
