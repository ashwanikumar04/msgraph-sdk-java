// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.PermissionGrantConditionSet;
import com.microsoft.graph.models.extensions.PolicyBase;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Grant Policy.
 */
public class PermissionGrantPolicy extends PolicyBase implements IJsonBackedObject {


    /**
     * The Excludes.
     * 
     */
    @SerializedName(value = "excludes", alternate = {"Excludes"})
    @Expose
    public BaseCollectionPage<PermissionGrantConditionSet> excludes;

    /**
     * The Includes.
     * 
     */
    @SerializedName(value = "includes", alternate = {"Includes"})
    @Expose
    public BaseCollectionPage<PermissionGrantConditionSet> includes;


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


        if (json.has("excludes")) {
            excludes = serializer.deserializeObject(json.get("excludes").toString(), new BaseCollectionPage<PermissionGrantConditionSet>(new java.util.ArrayList<PermissionGrantConditionSet>(), null).getClass());
        }

        if (json.has("includes")) {
            includes = serializer.deserializeObject(json.get("includes").toString(), new BaseCollectionPage<PermissionGrantConditionSet>(new java.util.ArrayList<PermissionGrantConditionSet>(), null).getClass());
        }
    }
}
