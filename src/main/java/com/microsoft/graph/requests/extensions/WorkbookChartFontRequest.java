// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartFont;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Font Request.
 */
public class WorkbookChartFontRequest extends BaseRequest<WorkbookChartFont> {
	
    /**
     * The request for the WorkbookChartFont
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartFontRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartFont.class);
    }

    /**
     * Gets the WorkbookChartFont from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookChartFont> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartFont from the service
     *
     * @return the WorkbookChartFont from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartFont get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookChartFont> callback) {
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
     * Patches this WorkbookChartFont with a source
     *
     * @param sourceWorkbookChartFont the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookChartFont sourceWorkbookChartFont, final ICallback<? super WorkbookChartFont> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartFont);
    }

    /**
     * Patches this WorkbookChartFont with a source
     *
     * @param sourceWorkbookChartFont the source object with updates
     * @return the updated WorkbookChartFont
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartFont patch(final WorkbookChartFont sourceWorkbookChartFont) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartFont);
    }

    /**
     * Creates a WorkbookChartFont with a new object
     *
     * @param newWorkbookChartFont the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookChartFont newWorkbookChartFont, final ICallback<? super WorkbookChartFont> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartFont);
    }

    /**
     * Creates a WorkbookChartFont with a new object
     *
     * @param newWorkbookChartFont the new object to create
     * @return the created WorkbookChartFont
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartFont post(final WorkbookChartFont newWorkbookChartFont) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartFont);
    }

    /**
     * Creates a WorkbookChartFont with a new object
     *
     * @param newWorkbookChartFont the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookChartFont newWorkbookChartFont, final ICallback<? super WorkbookChartFont> callback) {
        send(HttpMethod.PUT, callback, newWorkbookChartFont);
    }

    /**
     * Creates a WorkbookChartFont with a new object
     *
     * @param newWorkbookChartFont the object to create/update
     * @return the created WorkbookChartFont
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookChartFont put(final WorkbookChartFont newWorkbookChartFont) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartFont);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public WorkbookChartFontRequest select(final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public WorkbookChartFontRequest expand(final String value) {
         addExpandOption(value);
         return this;
     }

}

