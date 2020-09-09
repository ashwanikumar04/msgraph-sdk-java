// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.CallOptions;
import com.microsoft.graph.models.extensions.CallRoute;
import com.microsoft.graph.models.extensions.ChatInfo;
import com.microsoft.graph.models.generated.CallDirection;
import com.microsoft.graph.models.extensions.IncomingContext;
import com.microsoft.graph.models.extensions.MediaConfig;
import com.microsoft.graph.models.extensions.CallMediaState;
import com.microsoft.graph.models.extensions.MeetingInfo;
import com.microsoft.graph.models.generated.Modality;
import com.microsoft.graph.models.extensions.ResultInfo;
import com.microsoft.graph.models.extensions.ParticipantInfo;
import com.microsoft.graph.models.generated.CallState;
import com.microsoft.graph.models.extensions.InvitationParticipantInfo;
import com.microsoft.graph.models.extensions.ToneInfo;
import com.microsoft.graph.models.extensions.CallTranscriptionInfo;
import com.microsoft.graph.models.extensions.CommsOperation;
import com.microsoft.graph.models.extensions.Participant;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.CommsOperationCollectionResponse;
import com.microsoft.graph.requests.extensions.CommsOperationCollectionPage;
import com.microsoft.graph.requests.extensions.ParticipantCollectionResponse;
import com.microsoft.graph.requests.extensions.ParticipantCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call.
 */
public class Call extends Entity implements IJsonBackedObject {


    /**
     * The Callback Uri.
     * The callback URL on which callbacks will be delivered. Must be https.
     */
    @SerializedName("callbackUri")
    @Expose
    public String callbackUri;

    /**
     * The Call Chain Id.
     * A unique identifier for all the participant calls in a conference or a unique identifier for two participant calls in a P2P call.  This needs to be copied over from Microsoft.Graph.Call.CallChainId.
     */
    @SerializedName("callChainId")
    @Expose
    public String callChainId;

    /**
     * The Call Options.
     * 
     */
    @SerializedName("callOptions")
    @Expose
    public CallOptions callOptions;

    /**
     * The Call Routes.
     * The routing information on how the call was retargeted. Read-only.
     */
    @SerializedName("callRoutes")
    @Expose
    public java.util.List<CallRoute> callRoutes;

    /**
     * The Chat Info.
     * The chat information. Required information for joining a meeting.
     */
    @SerializedName("chatInfo")
    @Expose
    public ChatInfo chatInfo;

    /**
     * The Direction.
     * The direction of the call. The possible value are incoming or outgoing. Read-only.
     */
    @SerializedName("direction")
    @Expose
    public CallDirection direction;

    /**
     * The Incoming Context.
     * 
     */
    @SerializedName("incomingContext")
    @Expose
    public IncomingContext incomingContext;

    /**
     * The Media Config.
     * The media configuration. Required.
     */
    @SerializedName("mediaConfig")
    @Expose
    public MediaConfig mediaConfig;

    /**
     * The Media State.
     * Read-only. The call media state.
     */
    @SerializedName("mediaState")
    @Expose
    public CallMediaState mediaState;

    /**
     * The Meeting Info.
     * The meeting information that's required for joining a meeting.
     */
    @SerializedName("meetingInfo")
    @Expose
    public MeetingInfo meetingInfo;

    /**
     * The My Participant Id.
     * 
     */
    @SerializedName("myParticipantId")
    @Expose
    public String myParticipantId;

    /**
     * The Requested Modalities.
     * 
     */
    @SerializedName("requestedModalities")
    @Expose
    public java.util.List<Modality> requestedModalities;

    /**
     * The Result Info.
     * 
     */
    @SerializedName("resultInfo")
    @Expose
    public ResultInfo resultInfo;

    /**
     * The Source.
     * 
     */
    @SerializedName("source")
    @Expose
    public ParticipantInfo source;

    /**
     * The State.
     * 
     */
    @SerializedName("state")
    @Expose
    public CallState state;

    /**
     * The Subject.
     * 
     */
    @SerializedName("subject")
    @Expose
    public String subject;

    /**
     * The Targets.
     * 
     */
    @SerializedName("targets")
    @Expose
    public java.util.List<InvitationParticipantInfo> targets;

    /**
     * The Tenant Id.
     * 
     */
    @SerializedName("tenantId")
    @Expose
    public String tenantId;

    /**
     * The Tone Info.
     * 
     */
    @SerializedName("toneInfo")
    @Expose
    public ToneInfo toneInfo;

    /**
     * The Transcription.
     * 
     */
    @SerializedName("transcription")
    @Expose
    public CallTranscriptionInfo transcription;

    /**
     * The Operations.
     * Read-only. Nullable.
     */
    @SerializedName("operations")
    @Expose
    public CommsOperationCollectionPage operations;

    /**
     * The Participants.
     * Read-only. Nullable.
     */
    @SerializedName("participants")
    @Expose
    public ParticipantCollectionPage participants;


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


        if (json.has("operations")) {
            final CommsOperationCollectionResponse response = new CommsOperationCollectionResponse();
            if (json.has("operations@odata.nextLink")) {
                response.nextLink = json.get("operations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("operations").toString(), JsonObject[].class);
            final CommsOperation[] array = new CommsOperation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), CommsOperation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            operations = new CommsOperationCollectionPage(response, null);
        }

        if (json.has("participants")) {
            final ParticipantCollectionResponse response = new ParticipantCollectionResponse();
            if (json.has("participants@odata.nextLink")) {
                response.nextLink = json.get("participants@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("participants").toString(), JsonObject[].class);
            final Participant[] array = new Participant[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Participant.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            participants = new ParticipantCollectionPage(response, null);
        }
    }
}
