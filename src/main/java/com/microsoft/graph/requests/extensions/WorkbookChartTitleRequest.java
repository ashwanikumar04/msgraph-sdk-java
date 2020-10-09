// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartTitle;
import com.microsoft.graph.requests.extensions.WorkbookChartTitleFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Title Request.
 */
public class WorkbookChartTitleRequest extends BaseRequest<WorkbookChartTitle> {
	
    /**
     * The request for the WorkbookChartTitle
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartTitleRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartTitle.class);
    }

    /**
     * Gets the WorkbookChartTitle from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookChartTitle> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartTitle from the service
     *
     * @return the WorkbookChartTitle from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartTitle get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookChartTitle> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookChartTitle with a source
     *
     * @param sourceWorkbookChartTitle the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookChartTitle sourceWorkbookChartTitle, final ICallback<? super WorkbookChartTitle> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartTitle);
    }

    /**
     * Patches this WorkbookChartTitle with a source
     *
     * @param sourceWorkbookChartTitle the source object with updates
     * @return the updated WorkbookChartTitle
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartTitle patch(final WorkbookChartTitle sourceWorkbookChartTitle) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartTitle);
    }

    /**
     * Creates a WorkbookChartTitle with a new object
     *
     * @param newWorkbookChartTitle the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookChartTitle newWorkbookChartTitle, final ICallback<? super WorkbookChartTitle> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartTitle);
    }

    /**
     * Creates a WorkbookChartTitle with a new object
     *
     * @param newWorkbookChartTitle the new object to create
     * @return the created WorkbookChartTitle
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartTitle post(final WorkbookChartTitle newWorkbookChartTitle) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartTitle);
    }

    /**
     * Creates a WorkbookChartTitle with a new object
     *
     * @param newWorkbookChartTitle the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookChartTitle newWorkbookChartTitle, final ICallback<? super WorkbookChartTitle> callback) {
        send(HttpMethod.PUT, callback, newWorkbookChartTitle);
    }

    /**
     * Creates a WorkbookChartTitle with a new object
     *
     * @param newWorkbookChartTitle the object to create/update
     * @return the created WorkbookChartTitle
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartTitle put(final WorkbookChartTitle newWorkbookChartTitle) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartTitle);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public WorkbookChartTitleRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public WorkbookChartTitleRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return this;
     }

}

