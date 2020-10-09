// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RecordOperation;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Record Operation Request.
 */
public class RecordOperationRequest extends BaseRequest<RecordOperation> {
	
    /**
     * The request for the RecordOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RecordOperationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RecordOperation.class);
    }

    /**
     * Gets the RecordOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super RecordOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the RecordOperation from the service
     *
     * @return the RecordOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RecordOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super RecordOperation> callback) {
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
     * Patches this RecordOperation with a source
     *
     * @param sourceRecordOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final RecordOperation sourceRecordOperation, final ICallback<? super RecordOperation> callback) {
        send(HttpMethod.PATCH, callback, sourceRecordOperation);
    }

    /**
     * Patches this RecordOperation with a source
     *
     * @param sourceRecordOperation the source object with updates
     * @return the updated RecordOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RecordOperation patch(final RecordOperation sourceRecordOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceRecordOperation);
    }

    /**
     * Creates a RecordOperation with a new object
     *
     * @param newRecordOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final RecordOperation newRecordOperation, final ICallback<? super RecordOperation> callback) {
        send(HttpMethod.POST, callback, newRecordOperation);
    }

    /**
     * Creates a RecordOperation with a new object
     *
     * @param newRecordOperation the new object to create
     * @return the created RecordOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RecordOperation post(final RecordOperation newRecordOperation) throws ClientException {
        return send(HttpMethod.POST, newRecordOperation);
    }

    /**
     * Creates a RecordOperation with a new object
     *
     * @param newRecordOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final RecordOperation newRecordOperation, final ICallback<? super RecordOperation> callback) {
        send(HttpMethod.PUT, callback, newRecordOperation);
    }

    /**
     * Creates a RecordOperation with a new object
     *
     * @param newRecordOperation the object to create/update
     * @return the created RecordOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RecordOperation put(final RecordOperation newRecordOperation) throws ClientException {
        return send(HttpMethod.PUT, newRecordOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public RecordOperationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public RecordOperationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return this;
     }

}

