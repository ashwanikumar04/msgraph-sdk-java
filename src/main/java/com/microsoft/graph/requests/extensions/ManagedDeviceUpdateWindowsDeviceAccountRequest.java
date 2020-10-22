// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedDeviceUpdateWindowsDeviceAccountBody;
import com.microsoft.graph.requests.extensions.ManagedDeviceUpdateWindowsDeviceAccountRequest;

import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Update Windows Device Account Request.
 */
public class ManagedDeviceUpdateWindowsDeviceAccountRequest extends BaseRequest<Void> {
    protected final ManagedDeviceUpdateWindowsDeviceAccountBody body;

    /**
     * The request for this ManagedDeviceUpdateWindowsDeviceAccount
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceUpdateWindowsDeviceAccountRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Void.class);
        body = new ManagedDeviceUpdateWindowsDeviceAccountBody();
    }

    public void post(final ICallback<? super Void> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public Void post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ManagedDeviceUpdateWindowsDeviceAccountRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ManagedDeviceUpdateWindowsDeviceAccountRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ManagedDeviceUpdateWindowsDeviceAccountRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

}
