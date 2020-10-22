// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Windows10SecureAssessmentConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Secure Assessment Configuration Request.
 */
public class Windows10SecureAssessmentConfigurationRequest extends BaseRequest<Windows10SecureAssessmentConfiguration> {
	
    /**
     * The request for the Windows10SecureAssessmentConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10SecureAssessmentConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows10SecureAssessmentConfiguration.class);
    }

    /**
     * Gets the Windows10SecureAssessmentConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Windows10SecureAssessmentConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Windows10SecureAssessmentConfiguration from the service
     *
     * @return the Windows10SecureAssessmentConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10SecureAssessmentConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Windows10SecureAssessmentConfiguration> callback) {
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
     * Patches this Windows10SecureAssessmentConfiguration with a source
     *
     * @param sourceWindows10SecureAssessmentConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Windows10SecureAssessmentConfiguration sourceWindows10SecureAssessmentConfiguration, final ICallback<? super Windows10SecureAssessmentConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceWindows10SecureAssessmentConfiguration);
    }

    /**
     * Patches this Windows10SecureAssessmentConfiguration with a source
     *
     * @param sourceWindows10SecureAssessmentConfiguration the source object with updates
     * @return the updated Windows10SecureAssessmentConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10SecureAssessmentConfiguration patch(final Windows10SecureAssessmentConfiguration sourceWindows10SecureAssessmentConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows10SecureAssessmentConfiguration);
    }

    /**
     * Creates a Windows10SecureAssessmentConfiguration with a new object
     *
     * @param newWindows10SecureAssessmentConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Windows10SecureAssessmentConfiguration newWindows10SecureAssessmentConfiguration, final ICallback<? super Windows10SecureAssessmentConfiguration> callback) {
        send(HttpMethod.POST, callback, newWindows10SecureAssessmentConfiguration);
    }

    /**
     * Creates a Windows10SecureAssessmentConfiguration with a new object
     *
     * @param newWindows10SecureAssessmentConfiguration the new object to create
     * @return the created Windows10SecureAssessmentConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10SecureAssessmentConfiguration post(final Windows10SecureAssessmentConfiguration newWindows10SecureAssessmentConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindows10SecureAssessmentConfiguration);
    }

    /**
     * Creates a Windows10SecureAssessmentConfiguration with a new object
     *
     * @param newWindows10SecureAssessmentConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Windows10SecureAssessmentConfiguration newWindows10SecureAssessmentConfiguration, final ICallback<? super Windows10SecureAssessmentConfiguration> callback) {
        send(HttpMethod.PUT, callback, newWindows10SecureAssessmentConfiguration);
    }

    /**
     * Creates a Windows10SecureAssessmentConfiguration with a new object
     *
     * @param newWindows10SecureAssessmentConfiguration the object to create/update
     * @return the created Windows10SecureAssessmentConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows10SecureAssessmentConfiguration put(final Windows10SecureAssessmentConfiguration newWindows10SecureAssessmentConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindows10SecureAssessmentConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public Windows10SecureAssessmentConfigurationRequest select(final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public Windows10SecureAssessmentConfigurationRequest expand(final String value) {
         addExpandOption(value);
         return this;
     }

}

