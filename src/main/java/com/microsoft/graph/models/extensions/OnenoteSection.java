// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.SectionLinks;
import com.microsoft.graph.models.extensions.OnenotePage;
import com.microsoft.graph.models.extensions.Notebook;
import com.microsoft.graph.models.extensions.SectionGroup;
import com.microsoft.graph.models.extensions.OnenoteEntityHierarchyModel;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Section.
 */
public class OnenoteSection extends OnenoteEntityHierarchyModel implements IJsonBackedObject {


    /**
     * The Is Default.
     * Indicates whether this is the user's default section. Read-only.
     */
    @SerializedName(value = "isDefault", alternate = {"IsDefault"})
    @Expose
    public Boolean isDefault;

    /**
     * The Links.
     * Links for opening the section. The oneNoteClientURL link opens the section in the OneNote native client if it's installed. The oneNoteWebURL link opens the section in OneNote on the web.
     */
    @SerializedName(value = "links", alternate = {"Links"})
    @Expose
    public SectionLinks links;

    /**
     * The Pages Url.
     * The pages endpoint where you can get details for all the pages in the section. Read-only.
     */
    @SerializedName(value = "pagesUrl", alternate = {"PagesUrl"})
    @Expose
    public String pagesUrl;

    /**
     * The Pages.
     * The collection of pages in the section.  Read-only. Nullable.
     */
    @SerializedName(value = "pages", alternate = {"Pages"})
    @Expose
    public BaseCollectionPage<OnenotePage> pages;

    /**
     * The Parent Notebook.
     * The notebook that contains the section.  Read-only.
     */
    @SerializedName(value = "parentNotebook", alternate = {"ParentNotebook"})
    @Expose
    public Notebook parentNotebook;

    /**
     * The Parent Section Group.
     * The section group that contains the section.  Read-only.
     */
    @SerializedName(value = "parentSectionGroup", alternate = {"ParentSectionGroup"})
    @Expose
    public SectionGroup parentSectionGroup;


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


        if (json.has("pages")) {
            pages = serializer.deserializeObject(json.get("pages").toString(), new BaseCollectionPage<OnenotePage>(new java.util.ArrayList<OnenotePage>(), null).getClass());
        }
    }
}
