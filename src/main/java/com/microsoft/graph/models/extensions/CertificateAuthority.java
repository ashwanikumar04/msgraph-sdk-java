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
 * The class for the Certificate Authority.
 */
public class CertificateAuthority implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Certificate.
     * Required. The base64 encoded string representing the public certificate.
     */
    @SerializedName(value = "certificate", alternate = {"Certificate"})
    @Expose
    public byte[] certificate;

    /**
     * The Certificate Revocation List Url.
     * The URL of the certificate revocation list.
     */
    @SerializedName(value = "certificateRevocationListUrl", alternate = {"CertificateRevocationListUrl"})
    @Expose
    public String certificateRevocationListUrl;

    /**
     * The Delta Certificate Revocation List Url.
     * The URL contains the list of all revoked certificates since the last time a full certificate revocaton list was created.
     */
    @SerializedName(value = "deltaCertificateRevocationListUrl", alternate = {"DeltaCertificateRevocationListUrl"})
    @Expose
    public String deltaCertificateRevocationListUrl;

    /**
     * The Is Root Authority.
     * Required. true if the trusted certificate is a root authority, false if the trusted certificate is an intermediate authority.
     */
    @SerializedName(value = "isRootAuthority", alternate = {"IsRootAuthority"})
    @Expose
    public Boolean isRootAuthority;

    /**
     * The Issuer.
     * The issuer of the certificate, calculated from the certificate value. Read-only.
     */
    @SerializedName(value = "issuer", alternate = {"Issuer"})
    @Expose
    public String issuer;

    /**
     * The Issuer Ski.
     * The subject key identifier of the certificate, calculated from the certificate value. Read-only.
     */
    @SerializedName(value = "issuerSki", alternate = {"IssuerSki"})
    @Expose
    public String issuerSki;


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
