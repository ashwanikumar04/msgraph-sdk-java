// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.TeamFunSettings;
import com.microsoft.graph.models.extensions.TeamGuestSettings;
import com.microsoft.graph.models.extensions.TeamMemberSettings;
import com.microsoft.graph.models.extensions.TeamMessagingSettings;
import com.microsoft.graph.models.generated.TeamSpecialization;
import com.microsoft.graph.models.generated.TeamVisibilityType;
import com.microsoft.graph.models.extensions.Schedule;
import com.microsoft.graph.models.extensions.Channel;
import com.microsoft.graph.models.extensions.Group;
import com.microsoft.graph.models.extensions.TeamsAppInstallation;
import com.microsoft.graph.models.extensions.ConversationMember;
import com.microsoft.graph.models.extensions.TeamsAsyncOperation;
import com.microsoft.graph.models.extensions.TeamsTemplate;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team.
 */
public class Team extends Entity implements IJsonBackedObject {


    /**
     * The Classification.
     * An optional label. Typically describes the data or business sensitivity of the team. Must match one of a pre-configured set in the tenant's directory.
     */
    @SerializedName(value = "classification", alternate = {"Classification"})
    @Expose
    public String classification;

    /**
     * The Description.
     * An optional description for the team.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Display Name.
     * The name of the team.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Fun Settings.
     * Settings to configure use of Giphy, memes, and stickers in the team.
     */
    @SerializedName(value = "funSettings", alternate = {"FunSettings"})
    @Expose
    public TeamFunSettings funSettings;

    /**
     * The Guest Settings.
     * Settings to configure whether guests can create, update, or delete channels in the team.
     */
    @SerializedName(value = "guestSettings", alternate = {"GuestSettings"})
    @Expose
    public TeamGuestSettings guestSettings;

    /**
     * The Internal Id.
     * A unique ID for the team that has been used in a few places such as the audit log/Office 365 Management Activity API.
     */
    @SerializedName(value = "internalId", alternate = {"InternalId"})
    @Expose
    public String internalId;

    /**
     * The Is Archived.
     * Whether this team is in read-only mode.
     */
    @SerializedName(value = "isArchived", alternate = {"IsArchived"})
    @Expose
    public Boolean isArchived;

    /**
     * The Member Settings.
     * Settings to configure whether members can perform certain actions, for example, create channels and add bots, in the team.
     */
    @SerializedName(value = "memberSettings", alternate = {"MemberSettings"})
    @Expose
    public TeamMemberSettings memberSettings;

    /**
     * The Messaging Settings.
     * Settings to configure messaging and mentions in the team.
     */
    @SerializedName(value = "messagingSettings", alternate = {"MessagingSettings"})
    @Expose
    public TeamMessagingSettings messagingSettings;

    /**
     * The Specialization.
     * Optional. Indicates whether the team is intended for a particular use case.  Each team specialization has access to unique behaviors and experiences targeted to its use case.
     */
    @SerializedName(value = "specialization", alternate = {"Specialization"})
    @Expose
    public TeamSpecialization specialization;

    /**
     * The Visibility.
     * The visibility of the group and team. Defaults to Public.
     */
    @SerializedName(value = "visibility", alternate = {"Visibility"})
    @Expose
    public TeamVisibilityType visibility;

    /**
     * The Web Url.
     * A hyperlink that will go to the team in the Microsoft Teams client. This is the URL that you get when you right-click a team in the Microsoft Teams client and select Get link to team. This URL should be treated as an opaque blob, and not parsed.
     */
    @SerializedName(value = "webUrl", alternate = {"WebUrl"})
    @Expose
    public String webUrl;

    /**
     * The Schedule.
     * The schedule of shifts for this team.
     */
    @SerializedName(value = "schedule", alternate = {"Schedule"})
    @Expose
    public Schedule schedule;

    /**
     * The Channels.
     * The collection of channels &amp; messages associated with the team.
     */
    @SerializedName(value = "channels", alternate = {"Channels"})
    @Expose
    public BaseCollectionPage<Channel> channels;

    /**
     * The Group.
     * 
     */
    @SerializedName(value = "group", alternate = {"Group"})
    @Expose
    public Group group;

    /**
     * The Installed Apps.
     * The apps installed in this team.
     */
    @SerializedName(value = "installedApps", alternate = {"InstalledApps"})
    @Expose
    public BaseCollectionPage<TeamsAppInstallation> installedApps;

    /**
     * The Members.
     * Members and owners of the team.
     */
    @SerializedName(value = "members", alternate = {"Members"})
    @Expose
    public BaseCollectionPage<ConversationMember> members;

    /**
     * The Operations.
     * The async operations that ran or are running on this team.
     */
    @SerializedName(value = "operations", alternate = {"Operations"})
    @Expose
    public BaseCollectionPage<TeamsAsyncOperation> operations;

    /**
     * The Primary Channel.
     * The general channel for the team.
     */
    @SerializedName(value = "primaryChannel", alternate = {"PrimaryChannel"})
    @Expose
    public Channel primaryChannel;

    /**
     * The Template.
     * The template this team was created from. See available templates.
     */
    @SerializedName(value = "template", alternate = {"Template"})
    @Expose
    public TeamsTemplate template;


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


        if (json.has("channels")) {
            channels = serializer.deserializeObject(json.get("channels").toString(), new BaseCollectionPage<Channel>(new java.util.ArrayList<Channel>(), null).getClass());
        }

        if (json.has("installedApps")) {
            installedApps = serializer.deserializeObject(json.get("installedApps").toString(), new BaseCollectionPage<TeamsAppInstallation>(new java.util.ArrayList<TeamsAppInstallation>(), null).getClass());
        }

        if (json.has("members")) {
            members = serializer.deserializeObject(json.get("members").toString(), new BaseCollectionPage<ConversationMember>(new java.util.ArrayList<ConversationMember>(), null).getClass());
        }

        if (json.has("operations")) {
            operations = serializer.deserializeObject(json.get("operations").toString(), new BaseCollectionPage<TeamsAsyncOperation>(new java.util.ArrayList<TeamsAsyncOperation>(), null).getClass());
        }
    }
}
