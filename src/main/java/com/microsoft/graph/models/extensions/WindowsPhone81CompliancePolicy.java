// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.RequiredPasswordType;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Phone81Compliance Policy.
 */
public class WindowsPhone81CompliancePolicy extends DeviceCompliancePolicy implements IJsonBackedObject {


    /**
     * The Os Maximum Version.
     * Maximum Windows Phone version.
     */
    @SerializedName("osMaximumVersion")
    @Expose
    public String osMaximumVersion;

    /**
     * The Os Minimum Version.
     * Minimum Windows Phone version.
     */
    @SerializedName("osMinimumVersion")
    @Expose
    public String osMinimumVersion;

    /**
     * The Password Block Simple.
     * Whether or not to block syncing the calendar.
     */
    @SerializedName("passwordBlockSimple")
    @Expose
    public Boolean passwordBlockSimple;

    /**
     * The Password Expiration Days.
     * Number of days before the password expires.
     */
    @SerializedName("passwordExpirationDays")
    @Expose
    public Integer passwordExpirationDays;

    /**
     * The Password Minimum Character Set Count.
     * The number of character sets required in the password.
     */
    @SerializedName("passwordMinimumCharacterSetCount")
    @Expose
    public Integer passwordMinimumCharacterSetCount;

    /**
     * The Password Minimum Length.
     * Minimum length of passwords.
     */
    @SerializedName("passwordMinimumLength")
    @Expose
    public Integer passwordMinimumLength;

    /**
     * The Password Minutes Of Inactivity Before Lock.
     * Minutes of inactivity before a password is required.
     */
    @SerializedName("passwordMinutesOfInactivityBeforeLock")
    @Expose
    public Integer passwordMinutesOfInactivityBeforeLock;

    /**
     * The Password Previous Password Block Count.
     * Number of previous passwords to block. Valid values 0 to 24
     */
    @SerializedName("passwordPreviousPasswordBlockCount")
    @Expose
    public Integer passwordPreviousPasswordBlockCount;

    /**
     * The Password Required.
     * Whether or not to require a password.
     */
    @SerializedName("passwordRequired")
    @Expose
    public Boolean passwordRequired;

    /**
     * The Password Required Type.
     * The required password type. Possible values are: deviceDefault, alphanumeric, numeric.
     */
    @SerializedName("passwordRequiredType")
    @Expose
    public RequiredPasswordType passwordRequiredType;

    /**
     * The Storage Require Encryption.
     * Require encryption on windows phone devices.
     */
    @SerializedName("storageRequireEncryption")
    @Expose
    public Boolean storageRequireEncryption;


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
