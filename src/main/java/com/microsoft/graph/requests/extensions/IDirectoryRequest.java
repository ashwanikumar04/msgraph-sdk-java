// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Directory;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Directory Request.
 */
public interface IDirectoryRequest extends IHttpRequest {

    /**
     * Gets the Directory from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Directory> callback);

    /**
     * Gets the Directory from the service
     *
     * @return the Directory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Directory get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Directory> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Directory with a source
     *
     * @param sourceDirectory the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Directory sourceDirectory, final ICallback<? super Directory> callback);

    /**
     * Patches this Directory with a source
     *
     * @param sourceDirectory the source object with updates
     * @return the updated Directory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Directory patch(final Directory sourceDirectory) throws ClientException;

    /**
     * Posts a Directory with a new object
     *
     * @param newDirectory the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Directory newDirectory, final ICallback<? super Directory> callback);

    /**
     * Posts a Directory with a new object
     *
     * @param newDirectory the new object to create
     * @return the created Directory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Directory post(final Directory newDirectory) throws ClientException;

    /**
     * Posts a Directory with a new object
     *
     * @param newDirectory the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Directory newDirectory, final ICallback<? super Directory> callback);

    /**
     * Posts a Directory with a new object
     *
     * @param newDirectory the object to create/update
     * @return the created Directory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Directory put(final Directory newDirectory) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDirectoryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDirectoryRequest expand(final String value);

}
