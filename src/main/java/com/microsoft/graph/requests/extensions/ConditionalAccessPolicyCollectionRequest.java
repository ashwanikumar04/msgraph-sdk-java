// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PolicyRoot;
import com.microsoft.graph.models.extensions.ConditionalAccessPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conditional Access Policy Collection Request.
 */
public class ConditionalAccessPolicyCollectionRequest extends BaseCollectionRequest<ConditionalAccessPolicy, ConditionalAccessPolicyCollectionResponse> {

    /**
     * The request builder for this collection of ConditionalAccessPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    @SuppressWarnings("unchecked")
    public ConditionalAccessPolicyCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ConditionalAccessPolicy.class, ConditionalAccessPolicyCollectionResponse.class,(Class<BaseCollectionPage<ConditionalAccessPolicy>>) (new BaseCollectionPage<ConditionalAccessPolicy>(new java.util.ArrayList<ConditionalAccessPolicy>(), null).getClass()));
    }

    public void get(final ICallback<? super BaseCollectionPage<ConditionalAccessPolicy>> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public BaseCollectionPage<ConditionalAccessPolicy> get() throws ClientException {
        final ConditionalAccessPolicyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ConditionalAccessPolicy newConditionalAccessPolicy, final ICallback<? super ConditionalAccessPolicy> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ConditionalAccessPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newConditionalAccessPolicy, callback);
    }

    public ConditionalAccessPolicy post(final ConditionalAccessPolicy newConditionalAccessPolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ConditionalAccessPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newConditionalAccessPolicy);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ConditionalAccessPolicyCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ConditionalAccessPolicyCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public ConditionalAccessPolicyCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ConditionalAccessPolicyCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ConditionalAccessPolicyCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ConditionalAccessPolicyCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ConditionalAccessPolicyCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return this;
    }
    public BaseCollectionPage<ConditionalAccessPolicy> buildFromResponse(final ConditionalAccessPolicyCollectionResponse response) {
        final ConditionalAccessPolicyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ConditionalAccessPolicyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final BaseCollectionPage<ConditionalAccessPolicy> page = new BaseCollectionPage<ConditionalAccessPolicy>(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
