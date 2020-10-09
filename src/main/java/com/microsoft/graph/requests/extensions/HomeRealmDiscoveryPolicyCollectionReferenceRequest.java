// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.HomeRealmDiscoveryPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyWithReferenceRequest;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionWithReferencesRequest;
import com.microsoft.graph.models.extensions.HomeRealmDiscoveryPolicy;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Home Realm Discovery Policy Collection Reference Request.
 */
public class HomeRealmDiscoveryPolicyCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<HomeRealmDiscoveryPolicy, HomeRealmDiscoveryPolicyWithReferenceRequest, HomeRealmDiscoveryPolicyReferenceRequestBuilder, HomeRealmDiscoveryPolicyWithReferenceRequestBuilder, HomeRealmDiscoveryPolicyCollectionResponse, HomeRealmDiscoveryPolicyCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of HomeRealmDiscoveryPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    @SuppressWarnings("unchecked")
    public HomeRealmDiscoveryPolicyCollectionReferenceRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, HomeRealmDiscoveryPolicy.class, HomeRealmDiscoveryPolicyCollectionResponse.class, (Class<BaseCollectionPage<HomeRealmDiscoveryPolicy>>) (new BaseCollectionPage<HomeRealmDiscoveryPolicy>(new java.util.ArrayList<HomeRealmDiscoveryPolicy>(), null).getClass()), HomeRealmDiscoveryPolicyCollectionWithReferencesRequestBuilder.class);
    }

    public void post(final HomeRealmDiscoveryPolicy newHomeRealmDiscoveryPolicy, final ICallback<? super HomeRealmDiscoveryPolicy> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/policies/homeRealmDiscoveryPolicies/" + newHomeRealmDiscoveryPolicy.id);
        new HomeRealmDiscoveryPolicyWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newHomeRealmDiscoveryPolicy, body, callback);
    }

    public HomeRealmDiscoveryPolicy post(final HomeRealmDiscoveryPolicy newHomeRealmDiscoveryPolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/policies/homeRealmDiscoveryPolicies/" + newHomeRealmDiscoveryPolicy.id);
        return new HomeRealmDiscoveryPolicyWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newHomeRealmDiscoveryPolicy, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public HomeRealmDiscoveryPolicyCollectionReferenceRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public HomeRealmDiscoveryPolicyCollectionReferenceRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the sort clause
     * @return the updated request
     */
    public HomeRealmDiscoveryPolicyCollectionReferenceRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public HomeRealmDiscoveryPolicyCollectionReferenceRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public HomeRealmDiscoveryPolicyCollectionReferenceRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }
}
