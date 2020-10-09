// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.Phone;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Online Meeting Info.
 */
public class OnlineMeetingInfo implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Conference Id.
     * The ID of the conference.
     */
    @SerializedName(value = "conferenceId", alternate = {"ConferenceId"})
    @Expose
    public String conferenceId;

    /**
     * The Join Url.
     * The external link that launches the online meeting. This is a URL that clients will launch into a browser and will redirect the user to join the meeting.
     */
    @SerializedName(value = "joinUrl", alternate = {"JoinUrl"})
    @Expose
    public String joinUrl;

    /**
     * The Phones.
     * All of the phone numbers associated with this conference.
     */
    @SerializedName(value = "phones", alternate = {"Phones"})
    @Expose
    public java.util.List<Phone> phones;

    /**
     * The Quick Dial.
     * The pre-formatted quickdial for this call.
     */
    @SerializedName(value = "quickDial", alternate = {"QuickDial"})
    @Expose
    public String quickDial;

    /**
     * The Toll Free Numbers.
     * The toll free numbers that can be used to join the conference.
     */
    @SerializedName(value = "tollFreeNumbers", alternate = {"TollFreeNumbers"})
    @Expose
    public java.util.List<String> tollFreeNumbers;

    /**
     * The Toll Number.
     * The toll number that can be used to join the conference.
     */
    @SerializedName(value = "tollNumber", alternate = {"TollNumber"})
    @Expose
    public String tollNumber;


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
