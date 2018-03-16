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
 * The interface for the Base Windows Defender Advanced Threat Protection Configuration Request.
 */
public interface IBaseWindowsDefenderAdvancedThreatProtectionConfigurationRequest extends IHttpRequest {

    /**
     * Gets the WindowsDefenderAdvancedThreatProtectionConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WindowsDefenderAdvancedThreatProtectionConfiguration> callback);

    /**
     * Gets the WindowsDefenderAdvancedThreatProtectionConfiguration from the service
     *
     * @return the WindowsDefenderAdvancedThreatProtectionConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsDefenderAdvancedThreatProtectionConfiguration get() throws ClientException;

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
     * Patches this WindowsDefenderAdvancedThreatProtectionConfiguration with a source
     *
     * @param sourceWindowsDefenderAdvancedThreatProtectionConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsDefenderAdvancedThreatProtectionConfiguration sourceWindowsDefenderAdvancedThreatProtectionConfiguration, final ICallback<WindowsDefenderAdvancedThreatProtectionConfiguration> callback);

    /**
     * Patches this WindowsDefenderAdvancedThreatProtectionConfiguration with a source
     *
     * @param sourceWindowsDefenderAdvancedThreatProtectionConfiguration the source object with updates
     * @return the updated WindowsDefenderAdvancedThreatProtectionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsDefenderAdvancedThreatProtectionConfiguration patch(final WindowsDefenderAdvancedThreatProtectionConfiguration sourceWindowsDefenderAdvancedThreatProtectionConfiguration) throws ClientException;

    /**
     * Posts a WindowsDefenderAdvancedThreatProtectionConfiguration with a new object
     *
     * @param newWindowsDefenderAdvancedThreatProtectionConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsDefenderAdvancedThreatProtectionConfiguration newWindowsDefenderAdvancedThreatProtectionConfiguration, final ICallback<WindowsDefenderAdvancedThreatProtectionConfiguration> callback);

    /**
     * Posts a WindowsDefenderAdvancedThreatProtectionConfiguration with a new object
     *
     * @param newWindowsDefenderAdvancedThreatProtectionConfiguration the new object to create
     * @return the created WindowsDefenderAdvancedThreatProtectionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsDefenderAdvancedThreatProtectionConfiguration post(final WindowsDefenderAdvancedThreatProtectionConfiguration newWindowsDefenderAdvancedThreatProtectionConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseWindowsDefenderAdvancedThreatProtectionConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseWindowsDefenderAdvancedThreatProtectionConfigurationRequest expand(final String value);

}

