// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.TeleconferenceDeviceMediaQuality;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teleconference Device Quality.
 */
public class TeleconferenceDeviceQuality implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Call Chain Id.
     * A unique identifier for all  the participant calls in a conference or a unique identifier for two participant calls in P2P call. This needs to be copied over from Microsoft.Graph.Call.CallChainId.
     */
    @SerializedName(value = "callChainId", alternate = {"CallChainId"})
    @Expose
    public java.util.UUID callChainId;

    /**
     * The Cloud Service Deployment Environment.
     * A geo-region where the service is deployed, such as ProdNoam.
     */
    @SerializedName(value = "cloudServiceDeploymentEnvironment", alternate = {"CloudServiceDeploymentEnvironment"})
    @Expose
    public String cloudServiceDeploymentEnvironment;

    /**
     * The Cloud Service Deployment Id.
     * A unique deployment identifier assigned by Azure.
     */
    @SerializedName(value = "cloudServiceDeploymentId", alternate = {"CloudServiceDeploymentId"})
    @Expose
    public String cloudServiceDeploymentId;

    /**
     * The Cloud Service Instance Name.
     * The Azure deployed cloud service instance name, such as FrontEnd_IN_3.
     */
    @SerializedName(value = "cloudServiceInstanceName", alternate = {"CloudServiceInstanceName"})
    @Expose
    public String cloudServiceInstanceName;

    /**
     * The Cloud Service Name.
     * The Azure deployed cloud service name, such as contoso.cloudapp.net.
     */
    @SerializedName(value = "cloudServiceName", alternate = {"CloudServiceName"})
    @Expose
    public String cloudServiceName;

    /**
     * The Device Description.
     * Any additional description, such as VTC Bldg 30/21.
     */
    @SerializedName(value = "deviceDescription", alternate = {"DeviceDescription"})
    @Expose
    public String deviceDescription;

    /**
     * The Device Name.
     * The user media agent name, such as Cisco SX80.
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
    public String deviceName;

    /**
     * The Media Leg Id.
     * A unique identifier for a specific media leg of a participant in a conference.  One participant can have multiple media leg identifiers if retargeting happens. CVI partner assigns this value.
     */
    @SerializedName(value = "mediaLegId", alternate = {"MediaLegId"})
    @Expose
    public java.util.UUID mediaLegId;

    /**
     * The Media Quality List.
     * The list of media qualities in a media session (call), such as audio quality, video quality, and/or screen sharing quality.
     */
    @SerializedName(value = "mediaQualityList", alternate = {"MediaQualityList"})
    @Expose
    public java.util.List<TeleconferenceDeviceMediaQuality> mediaQualityList;

    /**
     * The Participant Id.
     * A unique identifier for a specific participant in a conference. The CVI partner needs to copy over Call.MyParticipantId to this property.
     */
    @SerializedName(value = "participantId", alternate = {"ParticipantId"})
    @Expose
    public java.util.UUID participantId;


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
