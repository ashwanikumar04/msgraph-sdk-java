// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DetectedApp;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.UpdateWindowsDeviceAccountActionParameter;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ManagedDeviceWithReferenceRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Collection Reference Request.
 */
public class ManagedDeviceCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<ManagedDevice, ManagedDeviceWithReferenceRequest, ManagedDeviceReferenceRequestBuilder, ManagedDeviceWithReferenceRequestBuilder, ManagedDeviceCollectionResponse, ManagedDeviceCollectionPage, ManagedDeviceCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of ManagedDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceCollectionReferenceRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceCollectionResponse.class, ManagedDeviceCollectionPage.class, ManagedDeviceCollectionWithReferencesRequestBuilder.class);
    }

    public void post(final ManagedDevice newManagedDevice, final ICallback<? super ManagedDevice> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/me/managedDevices/" + newManagedDevice.id);
        new ManagedDeviceWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newManagedDevice, body, callback);
    }

    public ManagedDevice post(final ManagedDevice newManagedDevice) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/me/managedDevices/" + newManagedDevice.id);
        return new ManagedDeviceWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newManagedDevice, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ManagedDeviceCollectionReferenceRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ManagedDeviceCollectionReferenceRequest filter(final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the sort clause
     * @return the updated request
     */
    public ManagedDeviceCollectionReferenceRequest orderBy(final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ManagedDeviceCollectionReferenceRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ManagedDeviceCollectionReferenceRequest top(final int value) {
        addTopOption(value);
        return this;
    }
}
