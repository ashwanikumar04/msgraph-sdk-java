// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CallCancelMediaProcessingBody;
import com.microsoft.graph.models.extensions.CancelMediaProcessingOperation;
import com.microsoft.graph.requests.extensions.CallCancelMediaProcessingRequest;

import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Cancel Media Processing Request.
 */
public class CallCancelMediaProcessingRequest extends BaseRequest<CancelMediaProcessingOperation> {
    protected final CallCancelMediaProcessingBody body;

    /**
     * The request for this CallCancelMediaProcessing
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallCancelMediaProcessingRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CancelMediaProcessingOperation.class);
        body = new CallCancelMediaProcessingBody();
    }

    public void post(final ICallback<? super CancelMediaProcessingOperation> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public CancelMediaProcessingOperation post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public CallCancelMediaProcessingRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public CallCancelMediaProcessingRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public CallCancelMediaProcessingRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

}
