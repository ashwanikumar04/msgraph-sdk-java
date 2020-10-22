// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserActivity;
import com.microsoft.graph.requests.extensions.ActivityHistoryItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ActivityHistoryItemRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Activity Reference Request.
 */
public class UserActivityReferenceRequest extends BaseReferenceRequest<UserActivity> {

    /**
     * The request for the UserActivity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserActivityReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserActivity.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public UserActivityReferenceRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public UserActivityReferenceRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }
    /**
     * Puts the UserActivity
     *
     * @param srcUserActivity the UserActivity reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(UserActivity srcUserActivity, final ICallback<? super UserActivity> callback) {
        send(HttpMethod.PUT, callback, srcUserActivity);
    }

    /**
     * Puts the UserActivity
     *
     * @param srcUserActivity the UserActivity reference to PUT
     * @return the UserActivity
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public UserActivity put(UserActivity srcUserActivity) throws ClientException {
        return send(HttpMethod.PUT, srcUserActivity);
    }
}
