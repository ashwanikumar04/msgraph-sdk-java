// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EditionUpgradeConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Edition Upgrade Configuration Request.
 */
public class EditionUpgradeConfigurationRequest extends BaseRequest<EditionUpgradeConfiguration> {
	
    /**
     * The request for the EditionUpgradeConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EditionUpgradeConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EditionUpgradeConfiguration.class);
    }

    /**
     * Gets the EditionUpgradeConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super EditionUpgradeConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EditionUpgradeConfiguration from the service
     *
     * @return the EditionUpgradeConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EditionUpgradeConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super EditionUpgradeConfiguration> callback) {
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
     * Patches this EditionUpgradeConfiguration with a source
     *
     * @param sourceEditionUpgradeConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EditionUpgradeConfiguration sourceEditionUpgradeConfiguration, final ICallback<? super EditionUpgradeConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceEditionUpgradeConfiguration);
    }

    /**
     * Patches this EditionUpgradeConfiguration with a source
     *
     * @param sourceEditionUpgradeConfiguration the source object with updates
     * @return the updated EditionUpgradeConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EditionUpgradeConfiguration patch(final EditionUpgradeConfiguration sourceEditionUpgradeConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceEditionUpgradeConfiguration);
    }

    /**
     * Creates a EditionUpgradeConfiguration with a new object
     *
     * @param newEditionUpgradeConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EditionUpgradeConfiguration newEditionUpgradeConfiguration, final ICallback<? super EditionUpgradeConfiguration> callback) {
        send(HttpMethod.POST, callback, newEditionUpgradeConfiguration);
    }

    /**
     * Creates a EditionUpgradeConfiguration with a new object
     *
     * @param newEditionUpgradeConfiguration the new object to create
     * @return the created EditionUpgradeConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EditionUpgradeConfiguration post(final EditionUpgradeConfiguration newEditionUpgradeConfiguration) throws ClientException {
        return send(HttpMethod.POST, newEditionUpgradeConfiguration);
    }

    /**
     * Creates a EditionUpgradeConfiguration with a new object
     *
     * @param newEditionUpgradeConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final EditionUpgradeConfiguration newEditionUpgradeConfiguration, final ICallback<? super EditionUpgradeConfiguration> callback) {
        send(HttpMethod.PUT, callback, newEditionUpgradeConfiguration);
    }

    /**
     * Creates a EditionUpgradeConfiguration with a new object
     *
     * @param newEditionUpgradeConfiguration the object to create/update
     * @return the created EditionUpgradeConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EditionUpgradeConfiguration put(final EditionUpgradeConfiguration newEditionUpgradeConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newEditionUpgradeConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public EditionUpgradeConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public EditionUpgradeConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return this;
     }

}

