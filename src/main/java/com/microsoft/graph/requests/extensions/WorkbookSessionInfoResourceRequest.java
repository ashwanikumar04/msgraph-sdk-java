// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookSessionInfo;
import com.microsoft.graph.models.extensions.Workbook;
import com.microsoft.graph.requests.extensions.WorkbookSessionInfoResourceRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Session Info Resource Request.
 */
public class WorkbookSessionInfoResourceRequest extends BaseRequest<WorkbookSessionInfo> {

    /**
     * The request for this WorkbookSessionInfoResource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookSessionInfoResourceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookSessionInfo.class);
    }

    /**
     * Gets the WorkbookSessionInfo
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookSessionInfo> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookSessionInfo
     *
     * @return the WorkbookSessionInfo
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public WorkbookSessionInfo get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public WorkbookSessionInfoResourceRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public WorkbookSessionInfoResourceRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public WorkbookSessionInfoResourceRequest filter(final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public WorkbookSessionInfoResourceRequest orderBy(final String value) {
        addOrderByOption(value);
        return this;
    }

}
