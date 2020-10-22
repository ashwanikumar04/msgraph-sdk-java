// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupLifecyclePolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupLifecyclePolicyCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Lifecycle Policy Collection Request.
 */
public class GroupLifecyclePolicyCollectionRequest extends BaseCollectionRequest<GroupLifecyclePolicy, GroupLifecyclePolicyCollectionResponse, GroupLifecyclePolicyCollectionPage> {

    /**
     * The request builder for this collection of GroupLifecyclePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupLifecyclePolicyCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupLifecyclePolicyCollectionResponse.class, GroupLifecyclePolicyCollectionPage.class, GroupLifecyclePolicyCollectionRequestBuilder.class);
    }

    public void post(final GroupLifecyclePolicy newGroupLifecyclePolicy, final ICallback<? super GroupLifecyclePolicy> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new GroupLifecyclePolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newGroupLifecyclePolicy, callback);
    }

    public GroupLifecyclePolicy post(final GroupLifecyclePolicy newGroupLifecyclePolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new GroupLifecyclePolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newGroupLifecyclePolicy);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public GroupLifecyclePolicyCollectionRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public GroupLifecyclePolicyCollectionRequest filter(final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public GroupLifecyclePolicyCollectionRequest orderBy(final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public GroupLifecyclePolicyCollectionRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public GroupLifecyclePolicyCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public GroupLifecyclePolicyCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public GroupLifecyclePolicyCollectionRequest skipToken(final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}
