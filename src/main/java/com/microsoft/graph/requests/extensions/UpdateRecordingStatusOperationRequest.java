// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UpdateRecordingStatusOperation;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Update Recording Status Operation Request.
 */
public class UpdateRecordingStatusOperationRequest extends BaseRequest<UpdateRecordingStatusOperation> {
	
    /**
     * The request for the UpdateRecordingStatusOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UpdateRecordingStatusOperationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UpdateRecordingStatusOperation.class);
    }

    /**
     * Gets the UpdateRecordingStatusOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UpdateRecordingStatusOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UpdateRecordingStatusOperation from the service
     *
     * @return the UpdateRecordingStatusOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UpdateRecordingStatusOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UpdateRecordingStatusOperation> callback) {
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
     * Patches this UpdateRecordingStatusOperation with a source
     *
     * @param sourceUpdateRecordingStatusOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UpdateRecordingStatusOperation sourceUpdateRecordingStatusOperation, final ICallback<? super UpdateRecordingStatusOperation> callback) {
        send(HttpMethod.PATCH, callback, sourceUpdateRecordingStatusOperation);
    }

    /**
     * Patches this UpdateRecordingStatusOperation with a source
     *
     * @param sourceUpdateRecordingStatusOperation the source object with updates
     * @return the updated UpdateRecordingStatusOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UpdateRecordingStatusOperation patch(final UpdateRecordingStatusOperation sourceUpdateRecordingStatusOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceUpdateRecordingStatusOperation);
    }

    /**
     * Creates a UpdateRecordingStatusOperation with a new object
     *
     * @param newUpdateRecordingStatusOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UpdateRecordingStatusOperation newUpdateRecordingStatusOperation, final ICallback<? super UpdateRecordingStatusOperation> callback) {
        send(HttpMethod.POST, callback, newUpdateRecordingStatusOperation);
    }

    /**
     * Creates a UpdateRecordingStatusOperation with a new object
     *
     * @param newUpdateRecordingStatusOperation the new object to create
     * @return the created UpdateRecordingStatusOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UpdateRecordingStatusOperation post(final UpdateRecordingStatusOperation newUpdateRecordingStatusOperation) throws ClientException {
        return send(HttpMethod.POST, newUpdateRecordingStatusOperation);
    }

    /**
     * Creates a UpdateRecordingStatusOperation with a new object
     *
     * @param newUpdateRecordingStatusOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UpdateRecordingStatusOperation newUpdateRecordingStatusOperation, final ICallback<? super UpdateRecordingStatusOperation> callback) {
        send(HttpMethod.PUT, callback, newUpdateRecordingStatusOperation);
    }

    /**
     * Creates a UpdateRecordingStatusOperation with a new object
     *
     * @param newUpdateRecordingStatusOperation the object to create/update
     * @return the created UpdateRecordingStatusOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UpdateRecordingStatusOperation put(final UpdateRecordingStatusOperation newUpdateRecordingStatusOperation) throws ClientException {
        return send(HttpMethod.PUT, newUpdateRecordingStatusOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public UpdateRecordingStatusOperationRequest select(final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public UpdateRecordingStatusOperationRequest expand(final String value) {
         addExpandOption(value);
         return this;
     }

}

