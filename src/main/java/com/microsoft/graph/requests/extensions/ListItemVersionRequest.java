// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ListItemVersion;
import com.microsoft.graph.requests.extensions.FieldValueSetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List Item Version Request.
 */
public class ListItemVersionRequest extends BaseRequest<ListItemVersion> {
	
    /**
     * The request for the ListItemVersion
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ListItemVersionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ListItemVersion.class);
    }

    /**
     * Gets the ListItemVersion from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ListItemVersion> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ListItemVersion from the service
     *
     * @return the ListItemVersion from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ListItemVersion get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ListItemVersion> callback) {
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
     * Patches this ListItemVersion with a source
     *
     * @param sourceListItemVersion the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ListItemVersion sourceListItemVersion, final ICallback<? super ListItemVersion> callback) {
        send(HttpMethod.PATCH, callback, sourceListItemVersion);
    }

    /**
     * Patches this ListItemVersion with a source
     *
     * @param sourceListItemVersion the source object with updates
     * @return the updated ListItemVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ListItemVersion patch(final ListItemVersion sourceListItemVersion) throws ClientException {
        return send(HttpMethod.PATCH, sourceListItemVersion);
    }

    /**
     * Creates a ListItemVersion with a new object
     *
     * @param newListItemVersion the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ListItemVersion newListItemVersion, final ICallback<? super ListItemVersion> callback) {
        send(HttpMethod.POST, callback, newListItemVersion);
    }

    /**
     * Creates a ListItemVersion with a new object
     *
     * @param newListItemVersion the new object to create
     * @return the created ListItemVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ListItemVersion post(final ListItemVersion newListItemVersion) throws ClientException {
        return send(HttpMethod.POST, newListItemVersion);
    }

    /**
     * Creates a ListItemVersion with a new object
     *
     * @param newListItemVersion the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ListItemVersion newListItemVersion, final ICallback<? super ListItemVersion> callback) {
        send(HttpMethod.PUT, callback, newListItemVersion);
    }

    /**
     * Creates a ListItemVersion with a new object
     *
     * @param newListItemVersion the object to create/update
     * @return the created ListItemVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ListItemVersion put(final ListItemVersion newListItemVersion) throws ClientException {
        return send(HttpMethod.PUT, newListItemVersion);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ListItemVersionRequest select(final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ListItemVersionRequest expand(final String value) {
         addExpandOption(value);
         return this;
     }

}

