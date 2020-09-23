// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DeviceComplianceActionType;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Action Item.
 */
public class DeviceComplianceActionItem extends Entity implements IJsonBackedObject {


    /**
     * The Action Type.
     * What action to take. Possible values are: noAction, notification, block, retire, wipe, removeResourceAccessProfiles, pushNotification.
     */
    @SerializedName("actionType")
    @Expose
    public DeviceComplianceActionType actionType;

    /**
     * The Grace Period Hours.
     * Number of hours to wait till the action will be enforced. Valid values 0 to 8760
     */
    @SerializedName("gracePeriodHours")
    @Expose
    public Integer gracePeriodHours;

    /**
     * The Notification Message CCList.
     * A list of group IDs to speicify who to CC this notification message to.
     */
    @SerializedName("notificationMessageCCList")
    @Expose
    public java.util.List<String> notificationMessageCCList;

    /**
     * The Notification Template Id.
     * What notification Message template to use
     */
    @SerializedName("notificationTemplateId")
    @Expose
    public String notificationTemplateId;


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
    protected ISerializer getSerializer() {
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
