// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedAppPolicyDeploymentSummary;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Policy Deployment Summary Request.
 */
public class ManagedAppPolicyDeploymentSummaryRequest extends BaseRequest implements IManagedAppPolicyDeploymentSummaryRequest {
	
    /**
     * The request for the ManagedAppPolicyDeploymentSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppPolicyDeploymentSummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppPolicyDeploymentSummary.class);
    }

    /**
     * Gets the ManagedAppPolicyDeploymentSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ManagedAppPolicyDeploymentSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedAppPolicyDeploymentSummary from the service
     *
     * @return the ManagedAppPolicyDeploymentSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAppPolicyDeploymentSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ManagedAppPolicyDeploymentSummary> callback) {
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
     * Patches this ManagedAppPolicyDeploymentSummary with a source
     *
     * @param sourceManagedAppPolicyDeploymentSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ManagedAppPolicyDeploymentSummary sourceManagedAppPolicyDeploymentSummary, final ICallback<? super ManagedAppPolicyDeploymentSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedAppPolicyDeploymentSummary);
    }

    /**
     * Patches this ManagedAppPolicyDeploymentSummary with a source
     *
     * @param sourceManagedAppPolicyDeploymentSummary the source object with updates
     * @return the updated ManagedAppPolicyDeploymentSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAppPolicyDeploymentSummary patch(final ManagedAppPolicyDeploymentSummary sourceManagedAppPolicyDeploymentSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedAppPolicyDeploymentSummary);
    }

    /**
     * Creates a ManagedAppPolicyDeploymentSummary with a new object
     *
     * @param newManagedAppPolicyDeploymentSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ManagedAppPolicyDeploymentSummary newManagedAppPolicyDeploymentSummary, final ICallback<? super ManagedAppPolicyDeploymentSummary> callback) {
        send(HttpMethod.POST, callback, newManagedAppPolicyDeploymentSummary);
    }

    /**
     * Creates a ManagedAppPolicyDeploymentSummary with a new object
     *
     * @param newManagedAppPolicyDeploymentSummary the new object to create
     * @return the created ManagedAppPolicyDeploymentSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAppPolicyDeploymentSummary post(final ManagedAppPolicyDeploymentSummary newManagedAppPolicyDeploymentSummary) throws ClientException {
        return send(HttpMethod.POST, newManagedAppPolicyDeploymentSummary);
    }

    /**
     * Creates a ManagedAppPolicyDeploymentSummary with a new object
     *
     * @param newManagedAppPolicyDeploymentSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ManagedAppPolicyDeploymentSummary newManagedAppPolicyDeploymentSummary, final ICallback<? super ManagedAppPolicyDeploymentSummary> callback) {
        send(HttpMethod.PUT, callback, newManagedAppPolicyDeploymentSummary);
    }

    /**
     * Creates a ManagedAppPolicyDeploymentSummary with a new object
     *
     * @param newManagedAppPolicyDeploymentSummary the object to create/update
     * @return the created ManagedAppPolicyDeploymentSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedAppPolicyDeploymentSummary put(final ManagedAppPolicyDeploymentSummary newManagedAppPolicyDeploymentSummary) throws ClientException {
        return send(HttpMethod.PUT, newManagedAppPolicyDeploymentSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IManagedAppPolicyDeploymentSummaryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ManagedAppPolicyDeploymentSummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IManagedAppPolicyDeploymentSummaryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ManagedAppPolicyDeploymentSummaryRequest)this;
     }

}

