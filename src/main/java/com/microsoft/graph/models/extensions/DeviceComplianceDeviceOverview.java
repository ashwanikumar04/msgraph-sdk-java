// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Device Overview.
 */
public class DeviceComplianceDeviceOverview extends Entity implements IJsonBackedObject {


    /**
     * The Configuration Version.
     * Version of the policy for that overview
     */
    @SerializedName(value = "configurationVersion", alternate = {"ConfigurationVersion"})
    @Expose
    public Integer configurationVersion;

    /**
     * The Error Count.
     * Number of error devices
     */
    @SerializedName(value = "errorCount", alternate = {"ErrorCount"})
    @Expose
    public Integer errorCount;

    /**
     * The Failed Count.
     * Number of failed devices
     */
    @SerializedName(value = "failedCount", alternate = {"FailedCount"})
    @Expose
    public Integer failedCount;

    /**
     * The Last Update Date Time.
     * Last update time
     */
    @SerializedName(value = "lastUpdateDateTime", alternate = {"LastUpdateDateTime"})
    @Expose
    public java.util.Calendar lastUpdateDateTime;

    /**
     * The Not Applicable Count.
     * Number of not applicable devices
     */
    @SerializedName(value = "notApplicableCount", alternate = {"NotApplicableCount"})
    @Expose
    public Integer notApplicableCount;

    /**
     * The Pending Count.
     * Number of pending devices
     */
    @SerializedName(value = "pendingCount", alternate = {"PendingCount"})
    @Expose
    public Integer pendingCount;

    /**
     * The Success Count.
     * Number of succeeded devices
     */
    @SerializedName(value = "successCount", alternate = {"SuccessCount"})
    @Expose
    public Integer successCount;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
