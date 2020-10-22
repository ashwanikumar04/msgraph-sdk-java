// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DriveItemPreviewBody;
import com.microsoft.graph.models.extensions.ItemPreviewInfo;
import com.microsoft.graph.requests.extensions.DriveItemPreviewRequest;

import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Preview Request.
 */
public class DriveItemPreviewRequest extends BaseRequest<ItemPreviewInfo> {
    protected final DriveItemPreviewBody body;

    /**
     * The request for this DriveItemPreview
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemPreviewRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemPreviewInfo.class);
        body = new DriveItemPreviewBody();
    }

    public void post(final ICallback<? super ItemPreviewInfo> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public ItemPreviewInfo post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public DriveItemPreviewRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public DriveItemPreviewRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public DriveItemPreviewRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

}
