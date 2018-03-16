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
 * The class for the Base Device Compliance Device Status Request Builder.
 */
public class BaseDeviceComplianceDeviceStatusRequestBuilder extends BaseRequestBuilder implements IBaseDeviceComplianceDeviceStatusRequestBuilder {

    /**
     * The request builder for the DeviceComplianceDeviceStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDeviceComplianceDeviceStatusRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDeviceComplianceDeviceStatusRequest instance
     */
    public IDeviceComplianceDeviceStatusRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceComplianceDeviceStatusRequest instance
     */
    public IDeviceComplianceDeviceStatusRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new DeviceComplianceDeviceStatusRequest(getRequestUrl(), getClient(), requestOptions);
    }

}
