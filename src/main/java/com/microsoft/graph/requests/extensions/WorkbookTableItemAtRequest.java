// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookTable;
import com.microsoft.graph.requests.extensions.WorkbookTableItemAtRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Item At Request.
 */
public class WorkbookTableItemAtRequest extends BaseRequest<WorkbookTable> {

    /**
     * The request for this WorkbookTableItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableItemAtRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookTable.class);
    }

    /**
     * Patches the WorkbookTableItemAt
     * @param srcWorkbookTable the WorkbookTable with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    public void patch(WorkbookTable srcWorkbookTable, final ICallback<? super WorkbookTable> callback) {
        send(HttpMethod.PATCH, callback, srcWorkbookTable);
    }

    /**
     * Patches the WorkbookTableItemAt
     *
     * @param srcWorkbookTable the WorkbookTable with which to PATCH
     * @return the WorkbookTable
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public WorkbookTable patch(WorkbookTable srcWorkbookTable) throws ClientException {
        return this.send(HttpMethod.PATCH, srcWorkbookTable);
    }

    /**
     * Puts the WorkbookTableItemAt
     *
     * @param srcWorkbookTable the WorkbookTable to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(WorkbookTable srcWorkbookTable, final ICallback<? super WorkbookTable> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookTable);
    }

    /**
     * Puts the WorkbookTableItemAt
     *
     * @param srcWorkbookTable the WorkbookTable to PUT
     * @return the WorkbookTable
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public WorkbookTable put(WorkbookTable srcWorkbookTable) throws ClientException {
        return this.send(HttpMethod.PUT, srcWorkbookTable);
    }
    /**
     * Gets the WorkbookTable
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookTable> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookTable
     *
     * @return the WorkbookTable
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public WorkbookTable get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public WorkbookTableItemAtRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public WorkbookTableItemAtRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public WorkbookTableItemAtRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public WorkbookTableItemAtRequest orderBy(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

}
