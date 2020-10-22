// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceEnrollmentLimitConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Limit Configuration Request.
 */
public class DeviceEnrollmentLimitConfigurationRequest extends BaseRequest<DeviceEnrollmentLimitConfiguration> {
	
    /**
     * The request for the DeviceEnrollmentLimitConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceEnrollmentLimitConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceEnrollmentLimitConfiguration.class);
    }

    /**
     * Gets the DeviceEnrollmentLimitConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceEnrollmentLimitConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceEnrollmentLimitConfiguration from the service
     *
     * @return the DeviceEnrollmentLimitConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceEnrollmentLimitConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceEnrollmentLimitConfiguration> callback) {
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
     * Patches this DeviceEnrollmentLimitConfiguration with a source
     *
     * @param sourceDeviceEnrollmentLimitConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceEnrollmentLimitConfiguration sourceDeviceEnrollmentLimitConfiguration, final ICallback<? super DeviceEnrollmentLimitConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceEnrollmentLimitConfiguration);
    }

    /**
     * Patches this DeviceEnrollmentLimitConfiguration with a source
     *
     * @param sourceDeviceEnrollmentLimitConfiguration the source object with updates
     * @return the updated DeviceEnrollmentLimitConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceEnrollmentLimitConfiguration patch(final DeviceEnrollmentLimitConfiguration sourceDeviceEnrollmentLimitConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceEnrollmentLimitConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentLimitConfiguration with a new object
     *
     * @param newDeviceEnrollmentLimitConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceEnrollmentLimitConfiguration newDeviceEnrollmentLimitConfiguration, final ICallback<? super DeviceEnrollmentLimitConfiguration> callback) {
        send(HttpMethod.POST, callback, newDeviceEnrollmentLimitConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentLimitConfiguration with a new object
     *
     * @param newDeviceEnrollmentLimitConfiguration the new object to create
     * @return the created DeviceEnrollmentLimitConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceEnrollmentLimitConfiguration post(final DeviceEnrollmentLimitConfiguration newDeviceEnrollmentLimitConfiguration) throws ClientException {
        return send(HttpMethod.POST, newDeviceEnrollmentLimitConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentLimitConfiguration with a new object
     *
     * @param newDeviceEnrollmentLimitConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceEnrollmentLimitConfiguration newDeviceEnrollmentLimitConfiguration, final ICallback<? super DeviceEnrollmentLimitConfiguration> callback) {
        send(HttpMethod.PUT, callback, newDeviceEnrollmentLimitConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentLimitConfiguration with a new object
     *
     * @param newDeviceEnrollmentLimitConfiguration the object to create/update
     * @return the created DeviceEnrollmentLimitConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceEnrollmentLimitConfiguration put(final DeviceEnrollmentLimitConfiguration newDeviceEnrollmentLimitConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newDeviceEnrollmentLimitConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public DeviceEnrollmentLimitConfigurationRequest select(final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public DeviceEnrollmentLimitConfigurationRequest expand(final String value) {
         addExpandOption(value);
         return this;
     }

}

