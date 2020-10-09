// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerBucket;
import com.microsoft.graph.requests.extensions.PlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Bucket Request.
 */
public class PlannerBucketRequest extends BaseRequest<PlannerBucket> {
	
    /**
     * The request for the PlannerBucket
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerBucketRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlannerBucket.class);
    }

    /**
     * Gets the PlannerBucket from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PlannerBucket> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlannerBucket from the service
     *
     * @return the PlannerBucket from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerBucket get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PlannerBucket> callback) {
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
     * Patches this PlannerBucket with a source
     *
     * @param sourcePlannerBucket the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PlannerBucket sourcePlannerBucket, final ICallback<? super PlannerBucket> callback) {
        send(HttpMethod.PATCH, callback, sourcePlannerBucket);
    }

    /**
     * Patches this PlannerBucket with a source
     *
     * @param sourcePlannerBucket the source object with updates
     * @return the updated PlannerBucket
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerBucket patch(final PlannerBucket sourcePlannerBucket) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerBucket);
    }

    /**
     * Creates a PlannerBucket with a new object
     *
     * @param newPlannerBucket the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PlannerBucket newPlannerBucket, final ICallback<? super PlannerBucket> callback) {
        send(HttpMethod.POST, callback, newPlannerBucket);
    }

    /**
     * Creates a PlannerBucket with a new object
     *
     * @param newPlannerBucket the new object to create
     * @return the created PlannerBucket
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerBucket post(final PlannerBucket newPlannerBucket) throws ClientException {
        return send(HttpMethod.POST, newPlannerBucket);
    }

    /**
     * Creates a PlannerBucket with a new object
     *
     * @param newPlannerBucket the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PlannerBucket newPlannerBucket, final ICallback<? super PlannerBucket> callback) {
        send(HttpMethod.PUT, callback, newPlannerBucket);
    }

    /**
     * Creates a PlannerBucket with a new object
     *
     * @param newPlannerBucket the object to create/update
     * @return the created PlannerBucket
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerBucket put(final PlannerBucket newPlannerBucket) throws ClientException {
        return send(HttpMethod.PUT, newPlannerBucket);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public PlannerBucketRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public PlannerBucketRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return this;
     }

}

