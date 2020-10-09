// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.generated.ChannelMembershipType;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.ConversationMember;
import com.microsoft.graph.models.extensions.ChatMessage;
import com.microsoft.graph.models.extensions.TeamsTab;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Channel.
 */
public class Channel extends Entity implements IJsonBackedObject {


    /**
     * The Description.
     * Optional textual description for the channel.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Display Name.
     * Channel name as it will appear to the user in Microsoft Teams.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Email.
     * The email address for sending messages to the channel. Read-only.
     */
    @SerializedName(value = "email", alternate = {"Email"})
    @Expose
    public String email;

    /**
     * The Membership Type.
     * 
     */
    @SerializedName(value = "membershipType", alternate = {"MembershipType"})
    @Expose
    public ChannelMembershipType membershipType;

    /**
     * The Web Url.
     * A hyperlink that will go to the channel in Microsoft Teams. This is the URL that you get when you right-click a channel in Microsoft Teams and select Get link to channel. This URL should be treated as an opaque blob, and not parsed. Read-only.
     */
    @SerializedName(value = "webUrl", alternate = {"WebUrl"})
    @Expose
    public String webUrl;

    /**
     * The Files Folder.
     * Metadata for the location where the channel's files are stored.
     */
    @SerializedName(value = "filesFolder", alternate = {"FilesFolder"})
    @Expose
    public DriveItem filesFolder;

    /**
     * The Members.
     * 
     */
    @SerializedName(value = "members", alternate = {"Members"})
    @Expose
    public BaseCollectionPage<ConversationMember> members;

    /**
     * The Messages.
     * A collection of all the messages in the channel. A navigation property. Nullable.
     */
    @SerializedName(value = "messages", alternate = {"Messages"})
    @Expose
    public BaseCollectionPage<ChatMessage> messages;

    /**
     * The Tabs.
     * A collection of all the tabs in the channel. A navigation property.
     */
    @SerializedName(value = "tabs", alternate = {"Tabs"})
    @Expose
    public BaseCollectionPage<TeamsTab> tabs;


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


        if (json.has("members")) {
            members = serializer.deserializeObject(json.get("members").toString(), new BaseCollectionPage<ConversationMember>(new java.util.ArrayList<ConversationMember>(), null).getClass());
        }

        if (json.has("messages")) {
            messages = serializer.deserializeObject(json.get("messages").toString(), new BaseCollectionPage<ChatMessage>(new java.util.ArrayList<ChatMessage>(), null).getClass());
        }

        if (json.has("tabs")) {
            tabs = serializer.deserializeObject(json.get("tabs").toString(), new BaseCollectionPage<TeamsTab>(new java.util.ArrayList<TeamsTab>(), null).getClass());
        }
    }
}
