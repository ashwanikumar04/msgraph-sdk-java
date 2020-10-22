// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationRoot;
import com.microsoft.graph.requests.extensions.EducationClassCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationClassRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationUserRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Root Request.
 */
public class EducationRootRequest extends BaseRequest<EducationRoot> {
	
    /**
     * The request for the EducationRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationRootRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationRoot.class);
    }

    /**
     * Gets the EducationRoot from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super EducationRoot> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EducationRoot from the service
     *
     * @return the EducationRoot from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationRoot get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super EducationRoot> callback) {
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
     * Patches this EducationRoot with a source
     *
     * @param sourceEducationRoot the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EducationRoot sourceEducationRoot, final ICallback<? super EducationRoot> callback) {
        send(HttpMethod.PATCH, callback, sourceEducationRoot);
    }

    /**
     * Patches this EducationRoot with a source
     *
     * @param sourceEducationRoot the source object with updates
     * @return the updated EducationRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationRoot patch(final EducationRoot sourceEducationRoot) throws ClientException {
        return send(HttpMethod.PATCH, sourceEducationRoot);
    }

    /**
     * Creates a EducationRoot with a new object
     *
     * @param newEducationRoot the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EducationRoot newEducationRoot, final ICallback<? super EducationRoot> callback) {
        send(HttpMethod.POST, callback, newEducationRoot);
    }

    /**
     * Creates a EducationRoot with a new object
     *
     * @param newEducationRoot the new object to create
     * @return the created EducationRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationRoot post(final EducationRoot newEducationRoot) throws ClientException {
        return send(HttpMethod.POST, newEducationRoot);
    }

    /**
     * Creates a EducationRoot with a new object
     *
     * @param newEducationRoot the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final EducationRoot newEducationRoot, final ICallback<? super EducationRoot> callback) {
        send(HttpMethod.PUT, callback, newEducationRoot);
    }

    /**
     * Creates a EducationRoot with a new object
     *
     * @param newEducationRoot the object to create/update
     * @return the created EducationRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationRoot put(final EducationRoot newEducationRoot) throws ClientException {
        return send(HttpMethod.PUT, newEducationRoot);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public EducationRootRequest select(final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public EducationRootRequest expand(final String value) {
         addExpandOption(value);
         return this;
     }

}

