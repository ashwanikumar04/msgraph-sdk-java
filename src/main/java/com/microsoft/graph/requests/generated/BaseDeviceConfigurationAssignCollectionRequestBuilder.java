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
 * The class for the Base Device Configuration Assign Collection Request Builder.
 */
public class BaseDeviceConfigurationAssignCollectionRequestBuilder extends BaseActionRequestBuilder implements IBaseDeviceConfigurationAssignCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param assignments the assignments
     */
    public BaseDeviceConfigurationAssignCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<DeviceConfigurationAssignment> assignments) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("assignments", assignments);
      }

    public IDeviceConfigurationAssignCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDeviceConfigurationAssignCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        DeviceConfigurationAssignCollectionRequest request = new DeviceConfigurationAssignCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("assignments")) {
            request.body.assignments = getParameter("assignments");
        }
  
        return request;
    }
}
