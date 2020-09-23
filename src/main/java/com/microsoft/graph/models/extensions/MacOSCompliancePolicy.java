// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DeviceThreatProtectionLevel;
import com.microsoft.graph.models.generated.RequiredPasswordType;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSCompliance Policy.
 */
public class MacOSCompliancePolicy extends DeviceCompliancePolicy implements IJsonBackedObject {


    /**
     * The Device Threat Protection Enabled.
     * Require that devices have enabled device threat protection.
     */
    @SerializedName("deviceThreatProtectionEnabled")
    @Expose
    public Boolean deviceThreatProtectionEnabled;

    /**
     * The Device Threat Protection Required Security Level.
     * Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: unavailable, secured, low, medium, high, notSet.
     */
    @SerializedName("deviceThreatProtectionRequiredSecurityLevel")
    @Expose
    public DeviceThreatProtectionLevel deviceThreatProtectionRequiredSecurityLevel;

    /**
     * The Firewall Block All Incoming.
     * Corresponds to the 'Block all incoming connections' option.
     */
    @SerializedName("firewallBlockAllIncoming")
    @Expose
    public Boolean firewallBlockAllIncoming;

    /**
     * The Firewall Enabled.
     * Whether the firewall should be enabled or not.
     */
    @SerializedName("firewallEnabled")
    @Expose
    public Boolean firewallEnabled;

    /**
     * The Firewall Enable Stealth Mode.
     * Corresponds to 'Enable stealth mode.'
     */
    @SerializedName("firewallEnableStealthMode")
    @Expose
    public Boolean firewallEnableStealthMode;

    /**
     * The Os Maximum Version.
     * Maximum MacOS version.
     */
    @SerializedName("osMaximumVersion")
    @Expose
    public String osMaximumVersion;

    /**
     * The Os Minimum Version.
     * Minimum MacOS version.
     */
    @SerializedName("osMinimumVersion")
    @Expose
    public String osMinimumVersion;

    /**
     * The Password Block Simple.
     * Indicates whether or not to block simple passwords.
     */
    @SerializedName("passwordBlockSimple")
    @Expose
    public Boolean passwordBlockSimple;

    /**
     * The Password Expiration Days.
     * Number of days before the password expires. Valid values 1 to 65535
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
     * Minimum length of password. Valid values 4 to 14
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
     * Number of previous passwords to block. Valid values 1 to 24
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
     * Require encryption on Mac OS devices.
     */
    @SerializedName("storageRequireEncryption")
    @Expose
    public Boolean storageRequireEncryption;

    /**
     * The System Integrity Protection Enabled.
     * Require that devices have enabled system integrity protection.
     */
    @SerializedName("systemIntegrityProtectionEnabled")
    @Expose
    public Boolean systemIntegrityProtectionEnabled;


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
