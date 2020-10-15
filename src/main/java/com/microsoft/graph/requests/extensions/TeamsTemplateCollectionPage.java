// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TeamsTemplate;
import com.microsoft.graph.requests.extensions.TeamsTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsTemplateCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams Template Collection Page.
 */
public class TeamsTemplateCollectionPage extends BaseCollectionPage<TeamsTemplate> {

    /**
     * A collection page for TeamsTemplate
     *
     * @param response the serialized TeamsTemplateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TeamsTemplateCollectionPage(final TeamsTemplateCollectionResponse response, final TeamsTemplateCollectionRequestBuilder builder) {
        super(response, builder);
    }
}