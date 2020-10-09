// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Contract;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Contract Request.
 */
public class ContractRequest extends BaseRequest<Contract> {
	
    /**
     * The request for the Contract
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ContractRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Contract.class);
    }

    /**
     * Gets the Contract from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Contract> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Contract from the service
     *
     * @return the Contract from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Contract get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Contract> callback) {
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
     * Patches this Contract with a source
     *
     * @param sourceContract the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Contract sourceContract, final ICallback<? super Contract> callback) {
        send(HttpMethod.PATCH, callback, sourceContract);
    }

    /**
     * Patches this Contract with a source
     *
     * @param sourceContract the source object with updates
     * @return the updated Contract
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Contract patch(final Contract sourceContract) throws ClientException {
        return send(HttpMethod.PATCH, sourceContract);
    }

    /**
     * Creates a Contract with a new object
     *
     * @param newContract the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Contract newContract, final ICallback<? super Contract> callback) {
        send(HttpMethod.POST, callback, newContract);
    }

    /**
     * Creates a Contract with a new object
     *
     * @param newContract the new object to create
     * @return the created Contract
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Contract post(final Contract newContract) throws ClientException {
        return send(HttpMethod.POST, newContract);
    }

    /**
     * Creates a Contract with a new object
     *
     * @param newContract the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Contract newContract, final ICallback<? super Contract> callback) {
        send(HttpMethod.PUT, callback, newContract);
    }

    /**
     * Creates a Contract with a new object
     *
     * @param newContract the object to create/update
     * @return the created Contract
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Contract put(final Contract newContract) throws ClientException {
        return send(HttpMethod.PUT, newContract);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ContractRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ContractRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return this;
     }

}

