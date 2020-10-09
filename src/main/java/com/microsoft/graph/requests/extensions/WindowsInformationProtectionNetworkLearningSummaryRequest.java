// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionNetworkLearningSummary;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Network Learning Summary Request.
 */
public class WindowsInformationProtectionNetworkLearningSummaryRequest extends BaseRequest<WindowsInformationProtectionNetworkLearningSummary> {
	
    /**
     * The request for the WindowsInformationProtectionNetworkLearningSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsInformationProtectionNetworkLearningSummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsInformationProtectionNetworkLearningSummary.class);
    }

    /**
     * Gets the WindowsInformationProtectionNetworkLearningSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WindowsInformationProtectionNetworkLearningSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsInformationProtectionNetworkLearningSummary from the service
     *
     * @return the WindowsInformationProtectionNetworkLearningSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsInformationProtectionNetworkLearningSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WindowsInformationProtectionNetworkLearningSummary> callback) {
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
     * Patches this WindowsInformationProtectionNetworkLearningSummary with a source
     *
     * @param sourceWindowsInformationProtectionNetworkLearningSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsInformationProtectionNetworkLearningSummary sourceWindowsInformationProtectionNetworkLearningSummary, final ICallback<? super WindowsInformationProtectionNetworkLearningSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsInformationProtectionNetworkLearningSummary);
    }

    /**
     * Patches this WindowsInformationProtectionNetworkLearningSummary with a source
     *
     * @param sourceWindowsInformationProtectionNetworkLearningSummary the source object with updates
     * @return the updated WindowsInformationProtectionNetworkLearningSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsInformationProtectionNetworkLearningSummary patch(final WindowsInformationProtectionNetworkLearningSummary sourceWindowsInformationProtectionNetworkLearningSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsInformationProtectionNetworkLearningSummary);
    }

    /**
     * Creates a WindowsInformationProtectionNetworkLearningSummary with a new object
     *
     * @param newWindowsInformationProtectionNetworkLearningSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsInformationProtectionNetworkLearningSummary newWindowsInformationProtectionNetworkLearningSummary, final ICallback<? super WindowsInformationProtectionNetworkLearningSummary> callback) {
        send(HttpMethod.POST, callback, newWindowsInformationProtectionNetworkLearningSummary);
    }

    /**
     * Creates a WindowsInformationProtectionNetworkLearningSummary with a new object
     *
     * @param newWindowsInformationProtectionNetworkLearningSummary the new object to create
     * @return the created WindowsInformationProtectionNetworkLearningSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsInformationProtectionNetworkLearningSummary post(final WindowsInformationProtectionNetworkLearningSummary newWindowsInformationProtectionNetworkLearningSummary) throws ClientException {
        return send(HttpMethod.POST, newWindowsInformationProtectionNetworkLearningSummary);
    }

    /**
     * Creates a WindowsInformationProtectionNetworkLearningSummary with a new object
     *
     * @param newWindowsInformationProtectionNetworkLearningSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsInformationProtectionNetworkLearningSummary newWindowsInformationProtectionNetworkLearningSummary, final ICallback<? super WindowsInformationProtectionNetworkLearningSummary> callback) {
        send(HttpMethod.PUT, callback, newWindowsInformationProtectionNetworkLearningSummary);
    }

    /**
     * Creates a WindowsInformationProtectionNetworkLearningSummary with a new object
     *
     * @param newWindowsInformationProtectionNetworkLearningSummary the object to create/update
     * @return the created WindowsInformationProtectionNetworkLearningSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsInformationProtectionNetworkLearningSummary put(final WindowsInformationProtectionNetworkLearningSummary newWindowsInformationProtectionNetworkLearningSummary) throws ClientException {
        return send(HttpMethod.PUT, newWindowsInformationProtectionNetworkLearningSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public WindowsInformationProtectionNetworkLearningSummaryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public WindowsInformationProtectionNetworkLearningSummaryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return this;
     }

}

