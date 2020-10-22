// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookRangeFormat;
import com.microsoft.graph.requests.extensions.WorkbookRangeBorderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeBorderRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeFillRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRangeFontRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookFormatProtectionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Format Request.
 */
public class WorkbookRangeFormatRequest extends BaseRequest<WorkbookRangeFormat> {
	
    /**
     * The request for the WorkbookRangeFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRangeFormatRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookRangeFormat.class);
    }

    /**
     * Gets the WorkbookRangeFormat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WorkbookRangeFormat> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookRangeFormat from the service
     *
     * @return the WorkbookRangeFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookRangeFormat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WorkbookRangeFormat> callback) {
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
     * Patches this WorkbookRangeFormat with a source
     *
     * @param sourceWorkbookRangeFormat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WorkbookRangeFormat sourceWorkbookRangeFormat, final ICallback<? super WorkbookRangeFormat> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookRangeFormat);
    }

    /**
     * Patches this WorkbookRangeFormat with a source
     *
     * @param sourceWorkbookRangeFormat the source object with updates
     * @return the updated WorkbookRangeFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookRangeFormat patch(final WorkbookRangeFormat sourceWorkbookRangeFormat) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookRangeFormat);
    }

    /**
     * Creates a WorkbookRangeFormat with a new object
     *
     * @param newWorkbookRangeFormat the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WorkbookRangeFormat newWorkbookRangeFormat, final ICallback<? super WorkbookRangeFormat> callback) {
        send(HttpMethod.POST, callback, newWorkbookRangeFormat);
    }

    /**
     * Creates a WorkbookRangeFormat with a new object
     *
     * @param newWorkbookRangeFormat the new object to create
     * @return the created WorkbookRangeFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookRangeFormat post(final WorkbookRangeFormat newWorkbookRangeFormat) throws ClientException {
        return send(HttpMethod.POST, newWorkbookRangeFormat);
    }

    /**
     * Creates a WorkbookRangeFormat with a new object
     *
     * @param newWorkbookRangeFormat the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WorkbookRangeFormat newWorkbookRangeFormat, final ICallback<? super WorkbookRangeFormat> callback) {
        send(HttpMethod.PUT, callback, newWorkbookRangeFormat);
    }

    /**
     * Creates a WorkbookRangeFormat with a new object
     *
     * @param newWorkbookRangeFormat the object to create/update
     * @return the created WorkbookRangeFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WorkbookRangeFormat put(final WorkbookRangeFormat newWorkbookRangeFormat) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookRangeFormat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public WorkbookRangeFormatRequest select(final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public WorkbookRangeFormatRequest expand(final String value) {
         addExpandOption(value);
         return this;
     }

}

