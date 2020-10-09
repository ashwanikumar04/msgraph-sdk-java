// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.ConversationThread;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conversation.
 */
public class Conversation extends Entity implements IJsonBackedObject {


    /**
     * The Has Attachments.
     * Indicates whether any of the posts within this Conversation has at least one attachment.
     */
    @SerializedName(value = "hasAttachments", alternate = {"HasAttachments"})
    @Expose
    public Boolean hasAttachments;

    /**
     * The Last Delivered Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "lastDeliveredDateTime", alternate = {"LastDeliveredDateTime"})
    @Expose
    public java.util.Calendar lastDeliveredDateTime;

    /**
     * The Preview.
     * A short summary from the body of the latest post in this converstaion.
     */
    @SerializedName(value = "preview", alternate = {"Preview"})
    @Expose
    public String preview;

    /**
     * The Topic.
     * The topic of the conversation. This property can be set when the conversation is created, but it cannot be updated.
     */
    @SerializedName(value = "topic", alternate = {"Topic"})
    @Expose
    public String topic;

    /**
     * The Unique Senders.
     * All the users that sent a message to this Conversation.
     */
    @SerializedName(value = "uniqueSenders", alternate = {"UniqueSenders"})
    @Expose
    public java.util.List<String> uniqueSenders;

    /**
     * The Threads.
     * A collection of all the conversation threads in the conversation. A navigation property. Read-only. Nullable.
     */
    @SerializedName(value = "threads", alternate = {"Threads"})
    @Expose
    public BaseCollectionPage<ConversationThread> threads;


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


        if (json.has("threads")) {
            threads = serializer.deserializeObject(json.get("threads").toString(), new BaseCollectionPage<ConversationThread>(new java.util.ArrayList<ConversationThread>(), null).getClass());
        }
    }
}
