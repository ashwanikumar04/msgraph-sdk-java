// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ListItem;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import com.microsoft.graph.requests.extensions.ListItemVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ListItemVersionRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemAnalyticsRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.FieldValueSetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List Item Request.
 */
public class ListItemRequest extends BaseRequest<ListItem> {
	
    /**
     * The request for the ListItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ListItemRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ListItem.class);
    }

    /**
     * Gets the ListItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ListItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ListItem from the service
     *
     * @return the ListItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ListItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ListItem> callback) {
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
     * Patches this ListItem with a source
     *
     * @param sourceListItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ListItem sourceListItem, final ICallback<? super ListItem> callback) {
        send(HttpMethod.PATCH, callback, sourceListItem);
    }

    /**
     * Patches this ListItem with a source
     *
     * @param sourceListItem the source object with updates
     * @return the updated ListItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ListItem patch(final ListItem sourceListItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceListItem);
    }

    /**
     * Creates a ListItem with a new object
     *
     * @param newListItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ListItem newListItem, final ICallback<? super ListItem> callback) {
        send(HttpMethod.POST, callback, newListItem);
    }

    /**
     * Creates a ListItem with a new object
     *
     * @param newListItem the new object to create
     * @return the created ListItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ListItem post(final ListItem newListItem) throws ClientException {
        return send(HttpMethod.POST, newListItem);
    }

    /**
     * Creates a ListItem with a new object
     *
     * @param newListItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ListItem newListItem, final ICallback<? super ListItem> callback) {
        send(HttpMethod.PUT, callback, newListItem);
    }

    /**
     * Creates a ListItem with a new object
     *
     * @param newListItem the object to create/update
     * @return the created ListItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ListItem put(final ListItem newListItem) throws ClientException {
        return send(HttpMethod.PUT, newListItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ListItemRequest select(final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ListItemRequest expand(final String value) {
         addExpandOption(value);
         return this;
     }

}

