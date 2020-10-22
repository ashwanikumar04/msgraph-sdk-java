// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartSeriesFormat;
import com.microsoft.graph.requests.extensions.WorkbookChartFillRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartLineFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Series Format Request.
 */
public class WorkbookChartSeriesFormatRequest extends BaseRequest<WorkbookChartSeriesFormat> {
	
    /**
     * The request for the WorkbookChartSeriesFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartSeriesFormatRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartSeriesFormat.class);
    }

    /**
     * Gets the WorkbookChartSeriesFormat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookChartSeriesFormat> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartSeriesFormat from the service
     *
     * @return the WorkbookChartSeriesFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartSeriesFormat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookChartSeriesFormat> callback) {
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
     * Patches this WorkbookChartSeriesFormat with a source
     *
     * @param sourceWorkbookChartSeriesFormat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookChartSeriesFormat sourceWorkbookChartSeriesFormat, final ICallback<? super WorkbookChartSeriesFormat> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartSeriesFormat);
    }

    /**
     * Patches this WorkbookChartSeriesFormat with a source
     *
     * @param sourceWorkbookChartSeriesFormat the source object with updates
     * @return the updated WorkbookChartSeriesFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartSeriesFormat patch(final WorkbookChartSeriesFormat sourceWorkbookChartSeriesFormat) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartSeriesFormat);
    }

    /**
     * Creates a WorkbookChartSeriesFormat with a new object
     *
     * @param newWorkbookChartSeriesFormat the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookChartSeriesFormat newWorkbookChartSeriesFormat, final ICallback<? super WorkbookChartSeriesFormat> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartSeriesFormat);
    }

    /**
     * Creates a WorkbookChartSeriesFormat with a new object
     *
     * @param newWorkbookChartSeriesFormat the new object to create
     * @return the created WorkbookChartSeriesFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartSeriesFormat post(final WorkbookChartSeriesFormat newWorkbookChartSeriesFormat) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartSeriesFormat);
    }

    /**
     * Creates a WorkbookChartSeriesFormat with a new object
     *
     * @param newWorkbookChartSeriesFormat the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookChartSeriesFormat newWorkbookChartSeriesFormat, final ICallback<? super WorkbookChartSeriesFormat> callback) {
        send(HttpMethod.PUT, callback, newWorkbookChartSeriesFormat);
    }

    /**
     * Creates a WorkbookChartSeriesFormat with a new object
     *
     * @param newWorkbookChartSeriesFormat the object to create/update
     * @return the created WorkbookChartSeriesFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartSeriesFormat put(final WorkbookChartSeriesFormat newWorkbookChartSeriesFormat) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartSeriesFormat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public WorkbookChartSeriesFormatRequest select(final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public WorkbookChartSeriesFormatRequest expand(final String value) {
         addExpandOption(value);
         return this;
     }

}

