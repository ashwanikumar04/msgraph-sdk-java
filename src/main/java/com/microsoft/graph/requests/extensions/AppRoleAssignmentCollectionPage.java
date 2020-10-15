// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AppRoleAssignment;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Role Assignment Collection Page.
 */
public class AppRoleAssignmentCollectionPage extends BaseCollectionPage<AppRoleAssignment> {

    /**
     * A collection page for AppRoleAssignment
     *
     * @param response the serialized AppRoleAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AppRoleAssignmentCollectionPage(final AppRoleAssignmentCollectionResponse response, final AppRoleAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }
}