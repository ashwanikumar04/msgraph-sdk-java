// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OrgContact;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Org Contact Request Builder.
 */
public interface IOrgContactRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IOrgContactRequest instance
     */
    IOrgContactRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IOrgContactRequest instance
     */
    IOrgContactRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IDirectoryObjectCollectionWithReferencesRequestBuilder directReports();

    IDirectoryObjectWithReferenceRequestBuilder directReports(final String id);

    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the IDirectoryObjectWithReferenceRequestBuilder instance
     */
    IDirectoryObjectWithReferenceRequestBuilder manager();

    IDirectoryObjectCollectionWithReferencesRequestBuilder memberOf();

    IDirectoryObjectWithReferenceRequestBuilder memberOf(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder transitiveMemberOf();

    IDirectoryObjectWithReferenceRequestBuilder transitiveMemberOf(final String id);

}