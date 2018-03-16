// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Mobile Threat Defense Connector Request.
 */
public interface IBaseMobileThreatDefenseConnectorRequest extends IHttpRequest {

    /**
     * Gets the MobileThreatDefenseConnector from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<MobileThreatDefenseConnector> callback);

    /**
     * Gets the MobileThreatDefenseConnector from the service
     *
     * @return the MobileThreatDefenseConnector from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileThreatDefenseConnector get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MobileThreatDefenseConnector with a source
     *
     * @param sourceMobileThreatDefenseConnector the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MobileThreatDefenseConnector sourceMobileThreatDefenseConnector, final ICallback<MobileThreatDefenseConnector> callback);

    /**
     * Patches this MobileThreatDefenseConnector with a source
     *
     * @param sourceMobileThreatDefenseConnector the source object with updates
     * @return the updated MobileThreatDefenseConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileThreatDefenseConnector patch(final MobileThreatDefenseConnector sourceMobileThreatDefenseConnector) throws ClientException;

    /**
     * Posts a MobileThreatDefenseConnector with a new object
     *
     * @param newMobileThreatDefenseConnector the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MobileThreatDefenseConnector newMobileThreatDefenseConnector, final ICallback<MobileThreatDefenseConnector> callback);

    /**
     * Posts a MobileThreatDefenseConnector with a new object
     *
     * @param newMobileThreatDefenseConnector the new object to create
     * @return the created MobileThreatDefenseConnector
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileThreatDefenseConnector post(final MobileThreatDefenseConnector newMobileThreatDefenseConnector) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseMobileThreatDefenseConnectorRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseMobileThreatDefenseConnectorRequest expand(final String value);

}

