// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChart;
import com.microsoft.graph.requests.extensions.WorkbookChartSeriesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartSeriesRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartAxesRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartDataLabelsRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartAreaFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartLegendRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartTitleRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Request.
 */
public class WorkbookChartRequest extends BaseRequest<WorkbookChart> {
	
    /**
     * The request for the WorkbookChart
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChart.class);
    }

    /**
     * Gets the WorkbookChart from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookChart> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChart from the service
     *
     * @return the WorkbookChart from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChart get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookChart> callback) {
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
     * Patches this WorkbookChart with a source
     *
     * @param sourceWorkbookChart the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookChart sourceWorkbookChart, final ICallback<? super WorkbookChart> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChart);
    }

    /**
     * Patches this WorkbookChart with a source
     *
     * @param sourceWorkbookChart the source object with updates
     * @return the updated WorkbookChart
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChart patch(final WorkbookChart sourceWorkbookChart) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChart);
    }

    /**
     * Creates a WorkbookChart with a new object
     *
     * @param newWorkbookChart the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookChart newWorkbookChart, final ICallback<? super WorkbookChart> callback) {
        send(HttpMethod.POST, callback, newWorkbookChart);
    }

    /**
     * Creates a WorkbookChart with a new object
     *
     * @param newWorkbookChart the new object to create
     * @return the created WorkbookChart
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChart post(final WorkbookChart newWorkbookChart) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChart);
    }

    /**
     * Creates a WorkbookChart with a new object
     *
     * @param newWorkbookChart the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookChart newWorkbookChart, final ICallback<? super WorkbookChart> callback) {
        send(HttpMethod.PUT, callback, newWorkbookChart);
    }

    /**
     * Creates a WorkbookChart with a new object
     *
     * @param newWorkbookChart the object to create/update
     * @return the created WorkbookChart
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChart put(final WorkbookChart newWorkbookChart) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChart);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public WorkbookChartRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public WorkbookChartRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return this;
     }

}

