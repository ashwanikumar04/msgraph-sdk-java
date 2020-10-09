// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.NotebookCopyNotebookRequest;
import com.microsoft.graph.models.extensions.Notebook;
import com.microsoft.graph.models.extensions.OnenoteOperation;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notebook Copy Notebook Request Builder.
 */
public class NotebookCopyNotebookRequestBuilder extends BaseActionRequestBuilder<OnenoteOperation> {

    /**
     * The request builder for this NotebookCopyNotebook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param groupId the groupId
     * @param renameAs the renameAs
     * @param notebookFolder the notebookFolder
     * @param siteCollectionId the siteCollectionId
     * @param siteId the siteId
     */
    public NotebookCopyNotebookRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String groupId, final String renameAs, final String notebookFolder, final String siteCollectionId, final String siteId) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("groupId", groupId);
        bodyParams.put("renameAs", renameAs);
        bodyParams.put("notebookFolder", notebookFolder);
        bodyParams.put("siteCollectionId", siteCollectionId);
        bodyParams.put("siteId", siteId);
    }

    /**
     * Creates the NotebookCopyNotebookRequest
     *
     * @param requestOptions the options for the request
     * @return the NotebookCopyNotebookRequest instance
     */
    public NotebookCopyNotebookRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the NotebookCopyNotebookRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the NotebookCopyNotebookRequest instance
     */
    public NotebookCopyNotebookRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        NotebookCopyNotebookRequest request = new NotebookCopyNotebookRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("groupId")) {
            request.body.groupId = getParameter("groupId");
        }

        if (hasParameter("renameAs")) {
            request.body.renameAs = getParameter("renameAs");
        }

        if (hasParameter("notebookFolder")) {
            request.body.notebookFolder = getParameter("notebookFolder");
        }

        if (hasParameter("siteCollectionId")) {
            request.body.siteCollectionId = getParameter("siteCollectionId");
        }

        if (hasParameter("siteId")) {
            request.body.siteId = getParameter("siteId");
        }

        return request;
    }
}
