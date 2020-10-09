// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidCompliancePolicy;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Compliance Policy Request.
 */
public class AndroidCompliancePolicyRequest extends BaseRequest<AndroidCompliancePolicy> {
	
    /**
     * The request for the AndroidCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidCompliancePolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidCompliancePolicy.class);
    }

    /**
     * Gets the AndroidCompliancePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AndroidCompliancePolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidCompliancePolicy from the service
     *
     * @return the AndroidCompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidCompliancePolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AndroidCompliancePolicy> callback) {
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
     * Patches this AndroidCompliancePolicy with a source
     *
     * @param sourceAndroidCompliancePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidCompliancePolicy sourceAndroidCompliancePolicy, final ICallback<? super AndroidCompliancePolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidCompliancePolicy);
    }

    /**
     * Patches this AndroidCompliancePolicy with a source
     *
     * @param sourceAndroidCompliancePolicy the source object with updates
     * @return the updated AndroidCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidCompliancePolicy patch(final AndroidCompliancePolicy sourceAndroidCompliancePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidCompliancePolicy);
    }

    /**
     * Creates a AndroidCompliancePolicy with a new object
     *
     * @param newAndroidCompliancePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidCompliancePolicy newAndroidCompliancePolicy, final ICallback<? super AndroidCompliancePolicy> callback) {
        send(HttpMethod.POST, callback, newAndroidCompliancePolicy);
    }

    /**
     * Creates a AndroidCompliancePolicy with a new object
     *
     * @param newAndroidCompliancePolicy the new object to create
     * @return the created AndroidCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidCompliancePolicy post(final AndroidCompliancePolicy newAndroidCompliancePolicy) throws ClientException {
        return send(HttpMethod.POST, newAndroidCompliancePolicy);
    }

    /**
     * Creates a AndroidCompliancePolicy with a new object
     *
     * @param newAndroidCompliancePolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AndroidCompliancePolicy newAndroidCompliancePolicy, final ICallback<? super AndroidCompliancePolicy> callback) {
        send(HttpMethod.PUT, callback, newAndroidCompliancePolicy);
    }

    /**
     * Creates a AndroidCompliancePolicy with a new object
     *
     * @param newAndroidCompliancePolicy the object to create/update
     * @return the created AndroidCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidCompliancePolicy put(final AndroidCompliancePolicy newAndroidCompliancePolicy) throws ClientException {
        return send(HttpMethod.PUT, newAndroidCompliancePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public AndroidCompliancePolicyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public AndroidCompliancePolicyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return this;
     }

}

