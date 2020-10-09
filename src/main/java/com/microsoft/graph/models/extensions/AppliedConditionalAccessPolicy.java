// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.generated.AppliedConditionalAccessPolicyResult;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Applied Conditional Access Policy.
 */
public class AppliedConditionalAccessPolicy implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Display Name.
     * Refers to the Name of the conditional access policy (example: 'Require MFA for Salesforce').
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Enforced Grant Controls.
     * Refers to the grant controls enforced by the conditional access policy (example: 'Require multi-factor authentication').
     */
    @SerializedName(value = "enforcedGrantControls", alternate = {"EnforcedGrantControls"})
    @Expose
    public java.util.List<String> enforcedGrantControls;

    /**
     * The Enforced Session Controls.
     * Refers to the session controls enforced by the conditional access policy (example: 'Require app enforced controls').
     */
    @SerializedName(value = "enforcedSessionControls", alternate = {"EnforcedSessionControls"})
    @Expose
    public java.util.List<String> enforcedSessionControls;

    /**
     * The Id.
     * Unique GUID of the conditional access policy.
     */
    @SerializedName(value = "id", alternate = {"Id"})
    @Expose
    public String id;

    /**
     * The Result.
     * Indicates the result of the CA policy that was triggered. Possible values are:successfailurenotApplied - Policy isn't applied because policy conditions were not met.notEnabled - This is due to the policy in disabled state.
     */
    @SerializedName(value = "result", alternate = {"Result"})
    @Expose
    public AppliedConditionalAccessPolicyResult result;


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
