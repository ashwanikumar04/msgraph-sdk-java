// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.UserChangePasswordRequest;
import com.microsoft.graph.models.extensions.User;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Change Password Request Builder.
 */
public class UserChangePasswordRequestBuilder extends BaseActionRequestBuilder<User> {

    /**
     * The request builder for this UserChangePassword
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param currentPassword the currentPassword
     * @param newPassword the newPassword
     */
    public UserChangePasswordRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String currentPassword, final String newPassword) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("currentPassword", currentPassword);
        bodyParams.put("newPassword", newPassword);
    }

    /**
     * Creates the UserChangePasswordRequest
     *
     * @param requestOptions the options for the request
     * @return the UserChangePasswordRequest instance
     */
    public UserChangePasswordRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the UserChangePasswordRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the UserChangePasswordRequest instance
     */
    public UserChangePasswordRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        UserChangePasswordRequest request = new UserChangePasswordRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("currentPassword")) {
            request.body.currentPassword = getParameter("currentPassword");
        }

        if (hasParameter("newPassword")) {
            request.body.newPassword = getParameter("newPassword");
        }

        return request;
    }
}
