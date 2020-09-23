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
 * The class for the Sharepoint Ids.
 */
public class SharepointIds implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The List Id.
     * The unique identifier (guid) for the item's list in SharePoint.
     */
    @SerializedName("listId")
    @Expose
    public String listId;

    /**
     * The List Item Id.
     * An integer identifier for the item within the containing list.
     */
    @SerializedName("listItemId")
    @Expose
    public String listItemId;

    /**
     * The List Item Unique Id.
     * The unique identifier (guid) for the item within OneDrive for Business or a SharePoint site.
     */
    @SerializedName("listItemUniqueId")
    @Expose
    public String listItemUniqueId;

    /**
     * The Site Id.
     * The unique identifier (guid) for the item's site collection (SPSite).
     */
    @SerializedName("siteId")
    @Expose
    public String siteId;

    /**
     * The Site Url.
     * The SharePoint URL for the site that contains the item.
     */
    @SerializedName("siteUrl")
    @Expose
    public String siteUrl;

    /**
     * The Tenant Id.
     * The unique identifier (guid) for the tenancy.
     */
    @SerializedName("tenantId")
    @Expose
    public String tenantId;

    /**
     * The Web Id.
     * The unique identifier (guid) for the item's site (SPWeb).
     */
    @SerializedName("webId")
    @Expose
    public String webId;


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
