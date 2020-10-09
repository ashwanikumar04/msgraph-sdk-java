// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.WorkbookCommentReply;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Comment.
 */
public class WorkbookComment extends Entity implements IJsonBackedObject {


    /**
     * The Content.
     * The content of comment.
     */
    @SerializedName(value = "content", alternate = {"Content"})
    @Expose
    public String content;

    /**
     * The Content Type.
     * Indicates the type for the comment.
     */
    @SerializedName(value = "contentType", alternate = {"ContentType"})
    @Expose
    public String contentType;

    /**
     * The Replies.
     * Read-only. Nullable.
     */
    @SerializedName(value = "replies", alternate = {"Replies"})
    @Expose
    public BaseCollectionPage<WorkbookCommentReply> replies;


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


        if (json.has("replies")) {
            replies = serializer.deserializeObject(json.get("replies").toString(), new BaseCollectionPage<WorkbookCommentReply>(new java.util.ArrayList<WorkbookCommentReply>(), null).getClass());
        }
    }
}
