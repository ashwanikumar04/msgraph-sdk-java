// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartPointFormat;
import com.microsoft.graph.requests.extensions.WorkbookChartFillRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Point Format Request.
 */
public class WorkbookChartPointFormatRequest extends BaseRequest<WorkbookChartPointFormat> {
	
    /**
     * The request for the WorkbookChartPointFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartPointFormatRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartPointFormat.class);
    }

    /**
     * Gets the WorkbookChartPointFormat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookChartPointFormat> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartPointFormat from the service
     *
     * @return the WorkbookChartPointFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartPointFormat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookChartPointFormat> callback) {
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
     * Patches this WorkbookChartPointFormat with a source
     *
     * @param sourceWorkbookChartPointFormat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookChartPointFormat sourceWorkbookChartPointFormat, final ICallback<? super WorkbookChartPointFormat> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartPointFormat);
    }

    /**
     * Patches this WorkbookChartPointFormat with a source
     *
     * @param sourceWorkbookChartPointFormat the source object with updates
     * @return the updated WorkbookChartPointFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartPointFormat patch(final WorkbookChartPointFormat sourceWorkbookChartPointFormat) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartPointFormat);
    }

    /**
     * Creates a WorkbookChartPointFormat with a new object
     *
     * @param newWorkbookChartPointFormat the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookChartPointFormat newWorkbookChartPointFormat, final ICallback<? super WorkbookChartPointFormat> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartPointFormat);
    }

    /**
     * Creates a WorkbookChartPointFormat with a new object
     *
     * @param newWorkbookChartPointFormat the new object to create
     * @return the created WorkbookChartPointFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartPointFormat post(final WorkbookChartPointFormat newWorkbookChartPointFormat) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartPointFormat);
    }

    /**
     * Creates a WorkbookChartPointFormat with a new object
     *
     * @param newWorkbookChartPointFormat the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookChartPointFormat newWorkbookChartPointFormat, final ICallback<? super WorkbookChartPointFormat> callback) {
        send(HttpMethod.PUT, callback, newWorkbookChartPointFormat);
    }

    /**
     * Creates a WorkbookChartPointFormat with a new object
     *
     * @param newWorkbookChartPointFormat the object to create/update
     * @return the created WorkbookChartPointFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartPointFormat put(final WorkbookChartPointFormat newWorkbookChartPointFormat) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartPointFormat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public WorkbookChartPointFormatRequest select(final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public WorkbookChartPointFormatRequest expand(final String value) {
         addExpandOption(value);
         return this;
     }

}

