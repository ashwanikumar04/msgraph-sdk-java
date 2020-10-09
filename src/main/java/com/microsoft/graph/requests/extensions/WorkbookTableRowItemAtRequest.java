// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookTableRow;
import com.microsoft.graph.requests.extensions.WorkbookTableRowItemAtRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Row Item At Request.
 */
public class WorkbookTableRowItemAtRequest extends BaseRequest<WorkbookTableRow> {

    /**
     * The request for this WorkbookTableRowItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableRowItemAtRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookTableRow.class);
    }

    /**
     * Patches the WorkbookTableRowItemAt
     * @param srcWorkbookTableRow the WorkbookTableRow with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    public void patch(WorkbookTableRow srcWorkbookTableRow, final ICallback<? super WorkbookTableRow> callback) {
        send(HttpMethod.PATCH, callback, srcWorkbookTableRow);
    }

    /**
     * Patches the WorkbookTableRowItemAt
     *
     * @param srcWorkbookTableRow the WorkbookTableRow with which to PATCH
     * @return the WorkbookTableRow
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public WorkbookTableRow patch(WorkbookTableRow srcWorkbookTableRow) throws ClientException {
        return this.send(HttpMethod.PATCH, srcWorkbookTableRow);
    }

    /**
     * Puts the WorkbookTableRowItemAt
     *
     * @param srcWorkbookTableRow the WorkbookTableRow to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(WorkbookTableRow srcWorkbookTableRow, final ICallback<? super WorkbookTableRow> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookTableRow);
    }

    /**
     * Puts the WorkbookTableRowItemAt
     *
     * @param srcWorkbookTableRow the WorkbookTableRow to PUT
     * @return the WorkbookTableRow
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     public WorkbookTableRow put(WorkbookTableRow srcWorkbookTableRow) throws ClientException {
        return this.send(HttpMethod.PUT, srcWorkbookTableRow);
    }
    /**
     * Gets the WorkbookTableRow
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookTableRow> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookTableRow
     *
     * @return the WorkbookTableRow
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public WorkbookTableRow get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public WorkbookTableRowItemAtRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public WorkbookTableRowItemAtRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public WorkbookTableRowItemAtRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public WorkbookTableRowItemAtRequest orderBy(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

}
