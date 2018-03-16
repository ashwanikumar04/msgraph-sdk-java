// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed Device Overview With Reference Request Builder.
 */
public class BaseManagedDeviceOverviewWithReferenceRequestBuilder extends BaseRequestBuilder implements IBaseManagedDeviceOverviewWithReferenceRequestBuilder {

    /**
     * The request builder for the ManagedDeviceOverview
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseManagedDeviceOverviewWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IManagedDeviceOverviewWithReferenceRequest instance
     */
    public IManagedDeviceOverviewWithReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IManagedDeviceOverviewWithReferenceRequest instance
     */
    public IManagedDeviceOverviewWithReferenceRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ManagedDeviceOverviewWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IManagedDeviceOverviewReferenceRequestBuilder reference(){
        return new ManagedDeviceOverviewReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
