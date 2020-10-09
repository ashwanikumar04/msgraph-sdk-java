// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.AssignedLabel;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.models.extensions.LicenseProcessingState;
import com.microsoft.graph.models.extensions.OnPremisesProvisioningError;
import com.microsoft.graph.models.extensions.AppRoleAssignment;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.GroupSetting;
import com.microsoft.graph.models.extensions.Calendar;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.Conversation;
import com.microsoft.graph.models.extensions.ProfilePhoto;
import com.microsoft.graph.models.extensions.ConversationThread;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.models.extensions.GroupLifecyclePolicy;
import com.microsoft.graph.models.extensions.PlannerGroup;
import com.microsoft.graph.models.extensions.Onenote;
import com.microsoft.graph.models.extensions.Team;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group.
 */
public class Group extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Assigned Labels.
     * The list of sensitivity label pairs (label ID, label name) associated with an Microsoft 365 group. Returned only on $select. Read-only.
     */
    @SerializedName(value = "assignedLabels", alternate = {"AssignedLabels"})
    @Expose
    public java.util.List<AssignedLabel> assignedLabels;

    /**
     * The Assigned Licenses.
     * The licenses that are assigned to the group. Returned only on $select. Read-only.
     */
    @SerializedName(value = "assignedLicenses", alternate = {"AssignedLicenses"})
    @Expose
    public java.util.List<AssignedLicense> assignedLicenses;

    /**
     * The Classification.
     * Describes a classification for the group (such as low, medium or high business impact). Valid values for this property are defined by creating a ClassificationList setting value, based on the template definition.Returned by default.
     */
    @SerializedName(value = "classification", alternate = {"Classification"})
    @Expose
    public String classification;

    /**
     * The Created Date Time.
     * Timestamp of when the group was created. The value cannot be modified and is automatically populated when the group is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * An optional description for the group. Returned by default.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Display Name.
     * The display name for the group. This property is required when a group is created and cannot be cleared during updates. Returned by default. Supports $filter and $orderby.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Expiration Date Time.
     * Timestamp of when the group is set to expire. The value cannot be modified and is automatically populated when the group is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only.
     */
    @SerializedName(value = "expirationDateTime", alternate = {"ExpirationDateTime"})
    @Expose
    public java.util.Calendar expirationDateTime;

    /**
     * The Group Types.
     * Specifies the group type and its membership.  If the collection contains Unified, the group is a Microsoft 365 group; otherwise, it's either a security group or distribution group. For details, see groups overview.If the collection includes DynamicMembership, the group has dynamic membership; otherwise, membership is static.  Returned by default. Supports $filter.
     */
    @SerializedName(value = "groupTypes", alternate = {"GroupTypes"})
    @Expose
    public java.util.List<String> groupTypes;

    /**
     * The Has Members With License Errors.
     * Indicates whether there are members in this group that have license errors from its group-based license assignment. This property is never returned on a GET operation. You can use it as a $filter argument to get groups that have members with license errors (that is, filter for this property being true). See an example.
     */
    @SerializedName(value = "hasMembersWithLicenseErrors", alternate = {"HasMembersWithLicenseErrors"})
    @Expose
    public Boolean hasMembersWithLicenseErrors;

    /**
     * The License Processing State.
     * Indicates status of the group license assignment to all members of the group. Default value is false. Read-only. Possible values: QueuedForProcessing, ProcessingInProgress, and ProcessingComplete.Returned only on $select. Read-only.
     */
    @SerializedName(value = "licenseProcessingState", alternate = {"LicenseProcessingState"})
    @Expose
    public LicenseProcessingState licenseProcessingState;

    /**
     * The Mail.
     * The SMTP address for the group, for example, 'serviceadmins@contoso.onmicrosoft.com'. Returned by default. Read-only. Supports $filter.
     */
    @SerializedName(value = "mail", alternate = {"Mail"})
    @Expose
    public String mail;

    /**
     * The Mail Enabled.
     * Specifies whether the group is mail-enabled. Returned by default.
     */
    @SerializedName(value = "mailEnabled", alternate = {"MailEnabled"})
    @Expose
    public Boolean mailEnabled;

    /**
     * The Mail Nickname.
     * The mail alias for the group, unique in the organization. This property must be specified when a group is created. These characters cannot be used in the mailNickName: @()/[]';:.&amp;lt;&amp;gt;,SPACE. Returned by default. Supports $filter.
     */
    @SerializedName(value = "mailNickname", alternate = {"MailNickname"})
    @Expose
    public String mailNickname;

    /**
     * The Membership Rule.
     * The rule that determines members for this group if the group is a dynamic group (groupTypes contains DynamicMembership). For more information about the syntax of the membership rule, see Membership Rules syntax. Returned by default.
     */
    @SerializedName(value = "membershipRule", alternate = {"MembershipRule"})
    @Expose
    public String membershipRule;

    /**
     * The Membership Rule Processing State.
     * Indicates whether the dynamic membership processing is on or paused. Possible values are 'On' or 'Paused'. Returned by default.
     */
    @SerializedName(value = "membershipRuleProcessingState", alternate = {"MembershipRuleProcessingState"})
    @Expose
    public String membershipRuleProcessingState;

    /**
     * The On Premises Domain Name.
     * Contains the on-premises domain FQDN, also called dnsDomainName synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.Returned by default. Read-only.
     */
    @SerializedName(value = "onPremisesDomainName", alternate = {"OnPremisesDomainName"})
    @Expose
    public String onPremisesDomainName;

    /**
     * The On Premises Last Sync Date Time.
     * Indicates the last time at which the group was synced with the on-premises directory.The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only. Supports $filter.
     */
    @SerializedName(value = "onPremisesLastSyncDateTime", alternate = {"OnPremisesLastSyncDateTime"})
    @Expose
    public java.util.Calendar onPremisesLastSyncDateTime;

    /**
     * The On Premises Net Bios Name.
     * Contains the on-premises netBios name synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.Returned by default. Read-only.
     */
    @SerializedName(value = "onPremisesNetBiosName", alternate = {"OnPremisesNetBiosName"})
    @Expose
    public String onPremisesNetBiosName;

    /**
     * The On Premises Provisioning Errors.
     * Errors when using Microsoft synchronization product during provisioning. Returned by default.
     */
    @SerializedName(value = "onPremisesProvisioningErrors", alternate = {"OnPremisesProvisioningErrors"})
    @Expose
    public java.util.List<OnPremisesProvisioningError> onPremisesProvisioningErrors;

    /**
     * The On Premises Sam Account Name.
     * Contains the on-premises SAM account name synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.Returned by default. Read-only.
     */
    @SerializedName(value = "onPremisesSamAccountName", alternate = {"OnPremisesSamAccountName"})
    @Expose
    public String onPremisesSamAccountName;

    /**
     * The On Premises Security Identifier.
     * Contains the on-premises security identifier (SID) for the group that was synchronized from on-premises to the cloud. Returned by default. Read-only.
     */
    @SerializedName(value = "onPremisesSecurityIdentifier", alternate = {"OnPremisesSecurityIdentifier"})
    @Expose
    public String onPremisesSecurityIdentifier;

    /**
     * The On Premises Sync Enabled.
     * true if this group is synced from an on-premises directory; false if this group was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default). Returned by default. Read-only. Supports $filter.
     */
    @SerializedName(value = "onPremisesSyncEnabled", alternate = {"OnPremisesSyncEnabled"})
    @Expose
    public Boolean onPremisesSyncEnabled;

    /**
     * The Preferred Data Location.
     * The preferred data location for the group. For more information, see  OneDrive Online Multi-Geo. Returned by default.
     */
    @SerializedName(value = "preferredDataLocation", alternate = {"PreferredDataLocation"})
    @Expose
    public String preferredDataLocation;

    /**
     * The Preferred Language.
     * The preferred language for an Microsoft 365 group. Should follow ISO 639-1 Code; for example 'en-US'. Returned by default.
     */
    @SerializedName(value = "preferredLanguage", alternate = {"PreferredLanguage"})
    @Expose
    public String preferredLanguage;

    /**
     * The Proxy Addresses.
     * Email addresses for the group that direct to the same group mailbox. For example: ['SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com']. The any operator is required to filter expressions on multi-valued properties. Returned by default. Read-only. Not nullable. Supports $filter.
     */
    @SerializedName(value = "proxyAddresses", alternate = {"ProxyAddresses"})
    @Expose
    public java.util.List<String> proxyAddresses;

    /**
     * The Renewed Date Time.
     * Timestamp of when the group was last renewed. This cannot be modified directly and is only updated via the renew service action. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only.
     */
    @SerializedName(value = "renewedDateTime", alternate = {"RenewedDateTime"})
    @Expose
    public java.util.Calendar renewedDateTime;

    /**
     * The Security Enabled.
     * Specifies whether the group is a security group. Returned by default. Supports $filter.
     */
    @SerializedName(value = "securityEnabled", alternate = {"SecurityEnabled"})
    @Expose
    public Boolean securityEnabled;

    /**
     * The Security Identifier.
     * Security identifier of the group, used in Windows scenarios. Returned by default.
     */
    @SerializedName(value = "securityIdentifier", alternate = {"SecurityIdentifier"})
    @Expose
    public String securityIdentifier;

    /**
     * The Theme.
     * Specifies an Microsoft 365 group's color theme. Possible values are Teal, Purple, Green, Blue, Pink, Orange or Red. Returned by default.
     */
    @SerializedName(value = "theme", alternate = {"Theme"})
    @Expose
    public String theme;

    /**
     * The Visibility.
     * Specifies the visibility of a Microsoft 365 group. Possible values are: Private, Public, or Hiddenmembership; blank values are treated as public.  See group visibility options to learn more.Visibility can be set only when a group is created; it is not editable.Visibility is supported only for unified groups; it is not supported for security groups. Returned by default.
     */
    @SerializedName(value = "visibility", alternate = {"Visibility"})
    @Expose
    public String visibility;

    /**
     * The Allow External Senders.
     * Indicates if people external to the organization can send messages to the group. Default value is false. Returned only on $select.
     */
    @SerializedName(value = "allowExternalSenders", alternate = {"AllowExternalSenders"})
    @Expose
    public Boolean allowExternalSenders;

    /**
     * The Auto Subscribe New Members.
     * Indicates if new members added to the group will be auto-subscribed to receive email notifications. You can set this property in a PATCH request for the group; do not set it in the initial POST request that creates the group. Default value is false. Returned only on $select.
     */
    @SerializedName(value = "autoSubscribeNewMembers", alternate = {"AutoSubscribeNewMembers"})
    @Expose
    public Boolean autoSubscribeNewMembers;

    /**
     * The Hide From Address Lists.
     * True if the group is not displayed in certain parts of the Outlook UI: the Address Book, address lists for selecting message recipients, and the Browse Groups dialog for searching groups; otherwise, false. Default value is false. Returned only on $select.
     */
    @SerializedName(value = "hideFromAddressLists", alternate = {"HideFromAddressLists"})
    @Expose
    public Boolean hideFromAddressLists;

    /**
     * The Hide From Outlook Clients.
     * True if the group is not displayed in Outlook clients, such as Outlook for Windows and Outlook on the web; otherwise, false. Default value is false. Returned only on $select.
     */
    @SerializedName(value = "hideFromOutlookClients", alternate = {"HideFromOutlookClients"})
    @Expose
    public Boolean hideFromOutlookClients;

    /**
     * The Is Subscribed By Mail.
     * Indicates whether the signed-in user is subscribed to receive email conversations. Default value is true. Returned only on $select.
     */
    @SerializedName(value = "isSubscribedByMail", alternate = {"IsSubscribedByMail"})
    @Expose
    public Boolean isSubscribedByMail;

    /**
     * The Unseen Count.
     * Count of conversations that have received new posts since the signed-in user last visited the group. Returned only on $select.
     */
    @SerializedName(value = "unseenCount", alternate = {"UnseenCount"})
    @Expose
    public Integer unseenCount;

    /**
     * The Is Archived.
     * 
     */
    @SerializedName(value = "isArchived", alternate = {"IsArchived"})
    @Expose
    public Boolean isArchived;

    /**
     * The App Role Assignments.
     * 
     */
    @SerializedName(value = "appRoleAssignments", alternate = {"AppRoleAssignments"})
    @Expose
    public BaseCollectionPage<AppRoleAssignment> appRoleAssignments;

    /**
     * The Created On Behalf Of.
     * The user (or application) that created the group. NOTE: This is not set if the user is an administrator. Read-only.
     */
    @SerializedName(value = "createdOnBehalfOf", alternate = {"CreatedOnBehalfOf"})
    @Expose
    public DirectoryObject createdOnBehalfOf;

    /**
     * The Member Of.
     * Groups that this group is a member of. HTTP Methods: GET (supported for all groups). Read-only. Nullable.
     */
    public BaseCollectionPage<DirectoryObject> memberOf;

    /**
     * The Members.
     * Users and groups that are members of this group. HTTP Methods: GET (supported for all groups), POST (supported for Microsoft 365 groups, security groups and mail-enabled security groups), DELETE (supported for Microsoft 365 groups and security groups) Nullable.
     */
    public BaseCollectionPage<DirectoryObject> members;

    /**
     * The Members With License Errors.
     * A list of group members with license errors from this group-based license assignment. Read-only.
     */
    public BaseCollectionPage<DirectoryObject> membersWithLicenseErrors;

    /**
     * The Owners.
     * The owners of the group. The owners are a set of non-admin users who are allowed to modify this object. Limited to 100 owners. HTTP Methods: GET (supported for all groups), POST (supported for Microsoft 365 groups, security groups and mail-enabled security groups), DELETE (supported for Microsoft 365 groups and security groups). Nullable.
     */
    public BaseCollectionPage<DirectoryObject> owners;

    /**
     * The Settings.
     * Read-only. Nullable.
     */
    @SerializedName(value = "settings", alternate = {"Settings"})
    @Expose
    public BaseCollectionPage<GroupSetting> settings;

    /**
     * The Transitive Member Of.
     * 
     */
    public BaseCollectionPage<DirectoryObject> transitiveMemberOf;

    /**
     * The Transitive Members.
     * 
     */
    public BaseCollectionPage<DirectoryObject> transitiveMembers;

    /**
     * The Accepted Senders.
     * The list of users or groups that are allowed to create post's or calendar events in this group. If this list is non-empty then only users or groups listed here are allowed to post.
     */
    @SerializedName(value = "acceptedSenders", alternate = {"AcceptedSenders"})
    @Expose
    public BaseCollectionPage<DirectoryObject> acceptedSenders;

    /**
     * The Calendar.
     * The group's calendar. Read-only.
     */
    @SerializedName(value = "calendar", alternate = {"Calendar"})
    @Expose
    public Calendar calendar;

    /**
     * The Calendar View.
     * The calendar view for the calendar. Read-only.
     */
    @SerializedName(value = "calendarView", alternate = {"CalendarView"})
    @Expose
    public BaseCollectionPage<Event> calendarView;

    /**
     * The Conversations.
     * The group's conversations.
     */
    @SerializedName(value = "conversations", alternate = {"Conversations"})
    @Expose
    public BaseCollectionPage<Conversation> conversations;

    /**
     * The Events.
     * The group's calendar events.
     */
    @SerializedName(value = "events", alternate = {"Events"})
    @Expose
    public BaseCollectionPage<Event> events;

    /**
     * The Photo.
     * The group's profile photo
     */
    @SerializedName(value = "photo", alternate = {"Photo"})
    @Expose
    public ProfilePhoto photo;

    /**
     * The Photos.
     * The profile photos owned by the group. Read-only. Nullable.
     */
    @SerializedName(value = "photos", alternate = {"Photos"})
    @Expose
    public BaseCollectionPage<ProfilePhoto> photos;

    /**
     * The Rejected Senders.
     * The list of users or groups that are not allowed to create posts or calendar events in this group. Nullable
     */
    @SerializedName(value = "rejectedSenders", alternate = {"RejectedSenders"})
    @Expose
    public BaseCollectionPage<DirectoryObject> rejectedSenders;

    /**
     * The Threads.
     * The group's conversation threads. Nullable.
     */
    @SerializedName(value = "threads", alternate = {"Threads"})
    @Expose
    public BaseCollectionPage<ConversationThread> threads;

    /**
     * The Drive.
     * The group's default drive. Read-only.
     */
    @SerializedName(value = "drive", alternate = {"Drive"})
    @Expose
    public Drive drive;

    /**
     * The Drives.
     * The group's drives. Read-only.
     */
    @SerializedName(value = "drives", alternate = {"Drives"})
    @Expose
    public BaseCollectionPage<Drive> drives;

    /**
     * The Sites.
     * The list of SharePoint sites in this group. Access the default site with /sites/root.
     */
    @SerializedName(value = "sites", alternate = {"Sites"})
    @Expose
    public BaseCollectionPage<Site> sites;

    /**
     * The Extensions.
     * The collection of open extensions defined for the group. Read-only. Nullable.
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
    public BaseCollectionPage<Extension> extensions;

    /**
     * The Group Lifecycle Policies.
     * The collection of lifecycle policies for this group. Read-only. Nullable.
     */
    @SerializedName(value = "groupLifecyclePolicies", alternate = {"GroupLifecyclePolicies"})
    @Expose
    public BaseCollectionPage<GroupLifecyclePolicy> groupLifecyclePolicies;

    /**
     * The Planner.
     * Entry-point to Planner resource that might exist for a Unified Group.
     */
    @SerializedName(value = "planner", alternate = {"Planner"})
    @Expose
    public PlannerGroup planner;

    /**
     * The Onenote.
     * Read-only.
     */
    @SerializedName(value = "onenote", alternate = {"Onenote"})
    @Expose
    public Onenote onenote;

    /**
     * The Team.
     * 
     */
    @SerializedName(value = "team", alternate = {"Team"})
    @Expose
    public Team team;


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


        if (json.has("appRoleAssignments")) {
            appRoleAssignments = serializer.deserializeObject(json.get("appRoleAssignments").toString(), new BaseCollectionPage<AppRoleAssignment>(new java.util.ArrayList<AppRoleAssignment>(), null).getClass());
        }

        if (json.has("memberOf")) {
            memberOf = serializer.deserializeObject(json.get("memberOf").toString(), new BaseCollectionPage<DirectoryObject>(new java.util.ArrayList<DirectoryObject>(), null).getClass());
        }

        if (json.has("members")) {
            members = serializer.deserializeObject(json.get("members").toString(), new BaseCollectionPage<DirectoryObject>(new java.util.ArrayList<DirectoryObject>(), null).getClass());
        }

        if (json.has("membersWithLicenseErrors")) {
            membersWithLicenseErrors = serializer.deserializeObject(json.get("membersWithLicenseErrors").toString(), new BaseCollectionPage<DirectoryObject>(new java.util.ArrayList<DirectoryObject>(), null).getClass());
        }

        if (json.has("owners")) {
            owners = serializer.deserializeObject(json.get("owners").toString(), new BaseCollectionPage<DirectoryObject>(new java.util.ArrayList<DirectoryObject>(), null).getClass());
        }

        if (json.has("settings")) {
            settings = serializer.deserializeObject(json.get("settings").toString(), new BaseCollectionPage<GroupSetting>(new java.util.ArrayList<GroupSetting>(), null).getClass());
        }

        if (json.has("transitiveMemberOf")) {
            transitiveMemberOf = serializer.deserializeObject(json.get("transitiveMemberOf").toString(), new BaseCollectionPage<DirectoryObject>(new java.util.ArrayList<DirectoryObject>(), null).getClass());
        }

        if (json.has("transitiveMembers")) {
            transitiveMembers = serializer.deserializeObject(json.get("transitiveMembers").toString(), new BaseCollectionPage<DirectoryObject>(new java.util.ArrayList<DirectoryObject>(), null).getClass());
        }

        if (json.has("acceptedSenders")) {
            acceptedSenders = serializer.deserializeObject(json.get("acceptedSenders").toString(), new BaseCollectionPage<DirectoryObject>(new java.util.ArrayList<DirectoryObject>(), null).getClass());
        }

        if (json.has("calendarView")) {
            calendarView = serializer.deserializeObject(json.get("calendarView").toString(), new BaseCollectionPage<Event>(new java.util.ArrayList<Event>(), null).getClass());
        }

        if (json.has("conversations")) {
            conversations = serializer.deserializeObject(json.get("conversations").toString(), new BaseCollectionPage<Conversation>(new java.util.ArrayList<Conversation>(), null).getClass());
        }

        if (json.has("events")) {
            events = serializer.deserializeObject(json.get("events").toString(), new BaseCollectionPage<Event>(new java.util.ArrayList<Event>(), null).getClass());
        }

        if (json.has("photos")) {
            photos = serializer.deserializeObject(json.get("photos").toString(), new BaseCollectionPage<ProfilePhoto>(new java.util.ArrayList<ProfilePhoto>(), null).getClass());
        }

        if (json.has("rejectedSenders")) {
            rejectedSenders = serializer.deserializeObject(json.get("rejectedSenders").toString(), new BaseCollectionPage<DirectoryObject>(new java.util.ArrayList<DirectoryObject>(), null).getClass());
        }

        if (json.has("threads")) {
            threads = serializer.deserializeObject(json.get("threads").toString(), new BaseCollectionPage<ConversationThread>(new java.util.ArrayList<ConversationThread>(), null).getClass());
        }

        if (json.has("drives")) {
            drives = serializer.deserializeObject(json.get("drives").toString(), new BaseCollectionPage<Drive>(new java.util.ArrayList<Drive>(), null).getClass());
        }

        if (json.has("sites")) {
            sites = serializer.deserializeObject(json.get("sites").toString(), new BaseCollectionPage<Site>(new java.util.ArrayList<Site>(), null).getClass());
        }

        if (json.has("extensions")) {
            extensions = serializer.deserializeObject(json.get("extensions").toString(), new BaseCollectionPage<Extension>(new java.util.ArrayList<Extension>(), null).getClass());
        }

        if (json.has("groupLifecyclePolicies")) {
            groupLifecyclePolicies = serializer.deserializeObject(json.get("groupLifecyclePolicies").toString(), new BaseCollectionPage<GroupLifecyclePolicy>(new java.util.ArrayList<GroupLifecyclePolicy>(), null).getClass());
        }
    }
}
