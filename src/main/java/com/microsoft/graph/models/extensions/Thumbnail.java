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
 * The class for the Thumbnail.
 */
public class Thumbnail implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Height.
     * The height of the thumbnail, in pixels.
     */
    @SerializedName(value = "height", alternate = {"Height"})
    @Expose
    public Integer height;

    /**
     * The Source Item Id.
     * The unique identifier of the item that provided the thumbnail. This is only available when a folder thumbnail is requested.
     */
    @SerializedName(value = "sourceItemId", alternate = {"SourceItemId"})
    @Expose
    public String sourceItemId;

    /**
     * The Url.
     * The URL used to fetch the thumbnail content.
     */
    @SerializedName(value = "url", alternate = {"Url"})
    @Expose
    public String url;

    /**
     * The Width.
     * The width of the thumbnail, in pixels.
     */
    @SerializedName(value = "width", alternate = {"Width"})
    @Expose
    public Integer width;


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
