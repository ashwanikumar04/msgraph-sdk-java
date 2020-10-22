// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.models.extensions.DeviceConfigurationDeviceStatus;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceStatusCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceStatusCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Device Status Collection Request.
 */
public class DeviceConfigurationDeviceStatusCollectionRequest extends BaseCollectionRequest<DeviceConfigurationDeviceStatus, DeviceConfigurationDeviceStatusCollectionResponse, DeviceConfigurationDeviceStatusCollectionPage> {

    /**
     * The request builder for this collection of DeviceConfigurationDeviceStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationDeviceStatusCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationDeviceStatusCollectionResponse.class, DeviceConfigurationDeviceStatusCollectionPage.class, DeviceConfigurationDeviceStatusCollectionRequestBuilder.class);
    }

    public void post(final DeviceConfigurationDeviceStatus newDeviceConfigurationDeviceStatus, final ICallback<? super DeviceConfigurationDeviceStatus> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceConfigurationDeviceStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceConfigurationDeviceStatus, callback);
    }

    public DeviceConfigurationDeviceStatus post(final DeviceConfigurationDeviceStatus newDeviceConfigurationDeviceStatus) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceConfigurationDeviceStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceConfigurationDeviceStatus);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public DeviceConfigurationDeviceStatusCollectionRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public DeviceConfigurationDeviceStatusCollectionRequest filter(final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public DeviceConfigurationDeviceStatusCollectionRequest orderBy(final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public DeviceConfigurationDeviceStatusCollectionRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public DeviceConfigurationDeviceStatusCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public DeviceConfigurationDeviceStatusCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public DeviceConfigurationDeviceStatusCollectionRequest skipToken(final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}
