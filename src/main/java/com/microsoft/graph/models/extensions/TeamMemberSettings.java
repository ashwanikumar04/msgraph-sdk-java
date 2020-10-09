// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team Member Settings.
 */
public class TeamMemberSettings implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Allow Add Remove Apps.
     * If set to true, members can add and remove apps.
     */
    @SerializedName(value = "allowAddRemoveApps", alternate = {"AllowAddRemoveApps"})
    @Expose
    public Boolean allowAddRemoveApps;

    /**
     * The Allow Create Private Channels.
     * If set to true, members can add and update private channels.
     */
    @SerializedName(value = "allowCreatePrivateChannels", alternate = {"AllowCreatePrivateChannels"})
    @Expose
    public Boolean allowCreatePrivateChannels;

    /**
     * The Allow Create Update Channels.
     * If set to true, members can add and update channels.
     */
    @SerializedName(value = "allowCreateUpdateChannels", alternate = {"AllowCreateUpdateChannels"})
    @Expose
    public Boolean allowCreateUpdateChannels;

    /**
     * The Allow Create Update Remove Connectors.
     * If set to true, members can add, update, and remove connectors.
     */
    @SerializedName(value = "allowCreateUpdateRemoveConnectors", alternate = {"AllowCreateUpdateRemoveConnectors"})
    @Expose
    public Boolean allowCreateUpdateRemoveConnectors;

    /**
     * The Allow Create Update Remove Tabs.
     * If set to true, members can add, update, and remove tabs.
     */
    @SerializedName(value = "allowCreateUpdateRemoveTabs", alternate = {"AllowCreateUpdateRemoveTabs"})
    @Expose
    public Boolean allowCreateUpdateRemoveTabs;

    /**
     * The Allow Delete Channels.
     * If set to true, members can delete channels.
     */
    @SerializedName(value = "allowDeleteChannels", alternate = {"AllowDeleteChannels"})
    @Expose
    public Boolean allowDeleteChannels;


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
