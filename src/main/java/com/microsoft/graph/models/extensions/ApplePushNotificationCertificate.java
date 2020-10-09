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
 * The class for the Apple Push Notification Certificate.
 */
public class ApplePushNotificationCertificate extends Entity implements IJsonBackedObject {


    /**
     * The Apple Identifier.
     * Apple Id of the account used to create the MDM push certificate.
     */
    @SerializedName(value = "appleIdentifier", alternate = {"AppleIdentifier"})
    @Expose
    public String appleIdentifier;

    /**
     * The Certificate.
     * Not yet documented
     */
    @SerializedName(value = "certificate", alternate = {"Certificate"})
    @Expose
    public String certificate;

    /**
     * The Expiration Date Time.
     * The expiration date and time for Apple push notification certificate.
     */
    @SerializedName(value = "expirationDateTime", alternate = {"ExpirationDateTime"})
    @Expose
    public java.util.Calendar expirationDateTime;

    /**
     * The Last Modified Date Time.
     * Last modified date and time for Apple push notification certificate.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Topic Identifier.
     * Topic Id.
     */
    @SerializedName(value = "topicIdentifier", alternate = {"TopicIdentifier"})
    @Expose
    public String topicIdentifier;


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
