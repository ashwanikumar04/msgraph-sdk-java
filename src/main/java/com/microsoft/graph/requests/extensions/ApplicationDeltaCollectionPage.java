// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Application;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.DeltaCollectionPage;
import com.microsoft.graph.requests.extensions.ApplicationDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationDeltaCollectionPage;
import com.microsoft.graph.requests.extensions.ApplicationDeltaCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Delta Collection Page.
 */
public class ApplicationDeltaCollectionPage extends DeltaCollectionPage<Application> {

    /**
     * A collection page for Application.
     *
     * @param response The serialized ApplicationDeltaCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ApplicationDeltaCollectionPage(final ApplicationDeltaCollectionResponse response, final ApplicationDeltaCollectionRequestBuilder builder) {
       super(response, builder);
    }
}