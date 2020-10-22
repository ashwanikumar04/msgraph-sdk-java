// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EnrollmentTroubleshootingEvent;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Enrollment Troubleshooting Event Request.
 */
public class EnrollmentTroubleshootingEventRequest extends BaseRequest<EnrollmentTroubleshootingEvent> {
	
    /**
     * The request for the EnrollmentTroubleshootingEvent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EnrollmentTroubleshootingEventRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EnrollmentTroubleshootingEvent.class);
    }

    /**
     * Gets the EnrollmentTroubleshootingEvent from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super EnrollmentTroubleshootingEvent> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EnrollmentTroubleshootingEvent from the service
     *
     * @return the EnrollmentTroubleshootingEvent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EnrollmentTroubleshootingEvent get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super EnrollmentTroubleshootingEvent> callback) {
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
     * Patches this EnrollmentTroubleshootingEvent with a source
     *
     * @param sourceEnrollmentTroubleshootingEvent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EnrollmentTroubleshootingEvent sourceEnrollmentTroubleshootingEvent, final ICallback<? super EnrollmentTroubleshootingEvent> callback) {
        send(HttpMethod.PATCH, callback, sourceEnrollmentTroubleshootingEvent);
    }

    /**
     * Patches this EnrollmentTroubleshootingEvent with a source
     *
     * @param sourceEnrollmentTroubleshootingEvent the source object with updates
     * @return the updated EnrollmentTroubleshootingEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EnrollmentTroubleshootingEvent patch(final EnrollmentTroubleshootingEvent sourceEnrollmentTroubleshootingEvent) throws ClientException {
        return send(HttpMethod.PATCH, sourceEnrollmentTroubleshootingEvent);
    }

    /**
     * Creates a EnrollmentTroubleshootingEvent with a new object
     *
     * @param newEnrollmentTroubleshootingEvent the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EnrollmentTroubleshootingEvent newEnrollmentTroubleshootingEvent, final ICallback<? super EnrollmentTroubleshootingEvent> callback) {
        send(HttpMethod.POST, callback, newEnrollmentTroubleshootingEvent);
    }

    /**
     * Creates a EnrollmentTroubleshootingEvent with a new object
     *
     * @param newEnrollmentTroubleshootingEvent the new object to create
     * @return the created EnrollmentTroubleshootingEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EnrollmentTroubleshootingEvent post(final EnrollmentTroubleshootingEvent newEnrollmentTroubleshootingEvent) throws ClientException {
        return send(HttpMethod.POST, newEnrollmentTroubleshootingEvent);
    }

    /**
     * Creates a EnrollmentTroubleshootingEvent with a new object
     *
     * @param newEnrollmentTroubleshootingEvent the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final EnrollmentTroubleshootingEvent newEnrollmentTroubleshootingEvent, final ICallback<? super EnrollmentTroubleshootingEvent> callback) {
        send(HttpMethod.PUT, callback, newEnrollmentTroubleshootingEvent);
    }

    /**
     * Creates a EnrollmentTroubleshootingEvent with a new object
     *
     * @param newEnrollmentTroubleshootingEvent the object to create/update
     * @return the created EnrollmentTroubleshootingEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EnrollmentTroubleshootingEvent put(final EnrollmentTroubleshootingEvent newEnrollmentTroubleshootingEvent) throws ClientException {
        return send(HttpMethod.PUT, newEnrollmentTroubleshootingEvent);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public EnrollmentTroubleshootingEventRequest select(final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public EnrollmentTroubleshootingEventRequest expand(final String value) {
         addExpandOption(value);
         return this;
     }

}

