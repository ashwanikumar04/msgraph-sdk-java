// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ManagedAppDataEncryptionType;
import com.microsoft.graph.models.extensions.KeyValuePair;
import com.microsoft.graph.models.extensions.ManagedMobileApp;
import com.microsoft.graph.models.extensions.ManagedAppPolicyDeploymentSummary;
import com.microsoft.graph.models.extensions.ManagedAppProtection;
import com.microsoft.graph.requests.extensions.ManagedMobileAppCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Default Managed App Protection.
 */
public class DefaultManagedAppProtection extends ManagedAppProtection implements IJsonBackedObject {


    /**
     * The App Data Encryption Type.
     * Type of encryption which should be used for data in a managed app. (iOS Only). Possible values are: useDeviceSettings, afterDeviceRestart, whenDeviceLockedExceptOpenFiles, whenDeviceLocked.
     */
    @SerializedName("appDataEncryptionType")
    @Expose
    public ManagedAppDataEncryptionType appDataEncryptionType;

    /**
     * The Custom Settings.
     * A set of string key and string value pairs to be sent to the affected users, unalterned by this service
     */
    @SerializedName("customSettings")
    @Expose
    public java.util.List<KeyValuePair> customSettings;

    /**
     * The Deployed App Count.
     * Count of apps to which the current policy is deployed.
     */
    @SerializedName("deployedAppCount")
    @Expose
    public Integer deployedAppCount;

    /**
     * The Disable App Encryption If Device Encryption Is Enabled.
     * When this setting is enabled, app level encryption is disabled if device level encryption is enabled. (Android only)
     */
    @SerializedName("disableAppEncryptionIfDeviceEncryptionIsEnabled")
    @Expose
    public Boolean disableAppEncryptionIfDeviceEncryptionIsEnabled;

    /**
     * The Encrypt App Data.
     * Indicates whether managed-app data should be encrypted. (Android only)
     */
    @SerializedName("encryptAppData")
    @Expose
    public Boolean encryptAppData;

    /**
     * The Face Id Blocked.
     * Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True. (iOS Only)
     */
    @SerializedName("faceIdBlocked")
    @Expose
    public Boolean faceIdBlocked;

    /**
     * The Minimum Required Patch Version.
     * Define the oldest required Android security patch level a user can have to gain secure access to the app. (Android only)
     */
    @SerializedName("minimumRequiredPatchVersion")
    @Expose
    public String minimumRequiredPatchVersion;

    /**
     * The Minimum Required Sdk Version.
     * Versions less than the specified version will block the managed app from accessing company data. (iOS Only)
     */
    @SerializedName("minimumRequiredSdkVersion")
    @Expose
    public String minimumRequiredSdkVersion;

    /**
     * The Minimum Warning Patch Version.
     * Define the oldest recommended Android security patch level a user can have for secure access to the app. (Android only)
     */
    @SerializedName("minimumWarningPatchVersion")
    @Expose
    public String minimumWarningPatchVersion;

    /**
     * The Screen Capture Blocked.
     * Indicates whether screen capture is blocked. (Android only)
     */
    @SerializedName("screenCaptureBlocked")
    @Expose
    public Boolean screenCaptureBlocked;

    /**
     * The Apps.
     * List of apps to which the policy is deployed.
     */
    @SerializedName("apps")
    @Expose
    public ManagedMobileAppCollectionPage apps;

    /**
     * The Deployment Summary.
     * Navigation property to deployment summary of the configuration.
     */
    @SerializedName("deploymentSummary")
    @Expose
    public ManagedAppPolicyDeploymentSummary deploymentSummary;


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


        if (json.has("apps")) {
            apps = serializer.deserializeObject(json.get("apps").toString(), ManagedMobileAppCollectionPage.class);
        }
    }
}
