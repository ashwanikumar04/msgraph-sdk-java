// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.ContentTypeInfo;
import com.microsoft.graph.models.extensions.SharepointIds;
import com.microsoft.graph.models.extensions.ItemAnalytics;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.FieldValueSet;
import com.microsoft.graph.models.extensions.ListItemVersion;
import com.microsoft.graph.models.extensions.BaseItem;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List Item.
 */
public class ListItem extends BaseItem implements IJsonBackedObject {


    /**
     * The Content Type.
     * The content type of this list item
     */
    @SerializedName(value = "contentType", alternate = {"ContentType"})
    @Expose
    public ContentTypeInfo contentType;

    /**
     * The Sharepoint Ids.
     * Returns identifiers useful for SharePoint REST compatibility. Read-only.
     */
    @SerializedName(value = "sharepointIds", alternate = {"SharepointIds"})
    @Expose
    public SharepointIds sharepointIds;

    /**
     * The Analytics.
     * Analytics about the view activities that took place on this item.
     */
    @SerializedName(value = "analytics", alternate = {"Analytics"})
    @Expose
    public ItemAnalytics analytics;

    /**
     * The Drive Item.
     * For document libraries, the driveItem relationship exposes the listItem as a [driveItem][]
     */
    @SerializedName(value = "driveItem", alternate = {"DriveItem"})
    @Expose
    public DriveItem driveItem;

    /**
     * The Fields.
     * The values of the columns set on this list item.
     */
    @SerializedName(value = "fields", alternate = {"Fields"})
    @Expose
    public FieldValueSet fields;

    /**
     * The Versions.
     * The list of previous versions of the list item.
     */
    @SerializedName(value = "versions", alternate = {"Versions"})
    @Expose
    public BaseCollectionPage<ListItemVersion> versions;


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


        if (json.has("versions")) {
            versions = serializer.deserializeObject(json.get("versions").toString(), new BaseCollectionPage<ListItemVersion>(new java.util.ArrayList<ListItemVersion>(), null).getClass());
        }
    }
}
