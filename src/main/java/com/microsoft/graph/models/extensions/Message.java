// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.graph.models.generated.BaseMessage;
import com.microsoft.graph.requests.extensions.AttachmentCollectionPage;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Message.
 */
public class Message extends BaseMessage {
	@SerializedName("attachments")
	@Expose
    public AttachmentCollectionPage attachments;

}
