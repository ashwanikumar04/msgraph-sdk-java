// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RoleDefinition;
import com.microsoft.graph.requests.extensions.IRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.RoleDefinition;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Role Definition Reference Request.
 */
public interface IRoleDefinitionReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super RoleDefinition> callback);

    RoleDefinition delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IRoleDefinitionReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IRoleDefinitionReferenceRequest expand(final String value);

    /**
     * Puts the RoleDefinition
     *
     * @param srcRoleDefinition the RoleDefinition to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(RoleDefinition srcRoleDefinition, final ICallback<? super RoleDefinition> callback);

    /**
     * Puts the RoleDefinition
     *
     * @param srcRoleDefinition the RoleDefinition to PUT
     * @return the RoleDefinition
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    RoleDefinition put(RoleDefinition srcRoleDefinition) throws ClientException;
}