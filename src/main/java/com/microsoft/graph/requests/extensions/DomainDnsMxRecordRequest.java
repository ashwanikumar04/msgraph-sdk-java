// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DomainDnsMxRecord;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Dns Mx Record Request.
 */
public class DomainDnsMxRecordRequest extends BaseRequest<DomainDnsMxRecord> {
	
    /**
     * The request for the DomainDnsMxRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DomainDnsMxRecordRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DomainDnsMxRecord.class);
    }

    /**
     * Gets the DomainDnsMxRecord from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DomainDnsMxRecord> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DomainDnsMxRecord from the service
     *
     * @return the DomainDnsMxRecord from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DomainDnsMxRecord get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DomainDnsMxRecord> callback) {
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
     * Patches this DomainDnsMxRecord with a source
     *
     * @param sourceDomainDnsMxRecord the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DomainDnsMxRecord sourceDomainDnsMxRecord, final ICallback<? super DomainDnsMxRecord> callback) {
        send(HttpMethod.PATCH, callback, sourceDomainDnsMxRecord);
    }

    /**
     * Patches this DomainDnsMxRecord with a source
     *
     * @param sourceDomainDnsMxRecord the source object with updates
     * @return the updated DomainDnsMxRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DomainDnsMxRecord patch(final DomainDnsMxRecord sourceDomainDnsMxRecord) throws ClientException {
        return send(HttpMethod.PATCH, sourceDomainDnsMxRecord);
    }

    /**
     * Creates a DomainDnsMxRecord with a new object
     *
     * @param newDomainDnsMxRecord the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DomainDnsMxRecord newDomainDnsMxRecord, final ICallback<? super DomainDnsMxRecord> callback) {
        send(HttpMethod.POST, callback, newDomainDnsMxRecord);
    }

    /**
     * Creates a DomainDnsMxRecord with a new object
     *
     * @param newDomainDnsMxRecord the new object to create
     * @return the created DomainDnsMxRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DomainDnsMxRecord post(final DomainDnsMxRecord newDomainDnsMxRecord) throws ClientException {
        return send(HttpMethod.POST, newDomainDnsMxRecord);
    }

    /**
     * Creates a DomainDnsMxRecord with a new object
     *
     * @param newDomainDnsMxRecord the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DomainDnsMxRecord newDomainDnsMxRecord, final ICallback<? super DomainDnsMxRecord> callback) {
        send(HttpMethod.PUT, callback, newDomainDnsMxRecord);
    }

    /**
     * Creates a DomainDnsMxRecord with a new object
     *
     * @param newDomainDnsMxRecord the object to create/update
     * @return the created DomainDnsMxRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DomainDnsMxRecord put(final DomainDnsMxRecord newDomainDnsMxRecord) throws ClientException {
        return send(HttpMethod.PUT, newDomainDnsMxRecord);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public DomainDnsMxRecordRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public DomainDnsMxRecordRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return this;
     }

}

