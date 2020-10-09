// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CertificateBasedAuthConfiguration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationCollectionResponse;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CertificateBasedAuthConfigurationCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Certificate Based Auth Configuration Collection Request.
 */
public class CertificateBasedAuthConfigurationCollectionRequest extends BaseCollectionRequest<CertificateBasedAuthConfiguration, CertificateBasedAuthConfigurationCollectionResponse> {

    /**
     * The request builder for this collection of CertificateBasedAuthConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    @SuppressWarnings("unchecked")
    public CertificateBasedAuthConfigurationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CertificateBasedAuthConfiguration.class, CertificateBasedAuthConfigurationCollectionResponse.class,(Class<BaseCollectionPage<CertificateBasedAuthConfiguration>>) (new BaseCollectionPage<CertificateBasedAuthConfiguration>(new java.util.ArrayList<CertificateBasedAuthConfiguration>(), null).getClass()));
    }

    public void get(final ICallback<? super BaseCollectionPage<CertificateBasedAuthConfiguration>> callback) {
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

    public BaseCollectionPage<CertificateBasedAuthConfiguration> get() throws ClientException {
        final CertificateBasedAuthConfigurationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final CertificateBasedAuthConfiguration newCertificateBasedAuthConfiguration, final ICallback<? super CertificateBasedAuthConfiguration> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new CertificateBasedAuthConfigurationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newCertificateBasedAuthConfiguration, callback);
    }

    public CertificateBasedAuthConfiguration post(final CertificateBasedAuthConfiguration newCertificateBasedAuthConfiguration) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CertificateBasedAuthConfigurationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newCertificateBasedAuthConfiguration);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public CertificateBasedAuthConfigurationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public CertificateBasedAuthConfigurationCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public CertificateBasedAuthConfigurationCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public CertificateBasedAuthConfigurationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public CertificateBasedAuthConfigurationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public CertificateBasedAuthConfigurationCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public CertificateBasedAuthConfigurationCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return this;
    }
    public BaseCollectionPage<CertificateBasedAuthConfiguration> buildFromResponse(final CertificateBasedAuthConfigurationCollectionResponse response) {
        final CertificateBasedAuthConfigurationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new CertificateBasedAuthConfigurationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final BaseCollectionPage<CertificateBasedAuthConfiguration> page = new BaseCollectionPage<CertificateBasedAuthConfiguration>(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
