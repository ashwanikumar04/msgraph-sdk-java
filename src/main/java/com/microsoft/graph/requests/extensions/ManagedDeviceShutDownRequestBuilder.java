// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ManagedDeviceShutDownRequest;
import com.microsoft.graph.models.extensions.ManagedDevice;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Shut Down Request Builder.
 */
public class ManagedDeviceShutDownRequestBuilder extends BaseActionRequestBuilder<ManagedDevice> {

    /**
     * The request builder for this ManagedDeviceShutDown
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceShutDownRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the ManagedDeviceShutDownRequest
     *
     * @param requestOptions the options for the request
     * @return the ManagedDeviceShutDownRequest instance
     */
    public ManagedDeviceShutDownRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ManagedDeviceShutDownRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ManagedDeviceShutDownRequest instance
     */
    public ManagedDeviceShutDownRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ManagedDeviceShutDownRequest request = new ManagedDeviceShutDownRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
