// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;

import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.DirectoryObjectGetMemberObjectsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectGetMemberObjectsCollectionResponse;
import com.microsoft.graph.models.extensions.DirectoryObjectGetMemberObjectsBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Get Member Objects Collection Request.
 */
public class DirectoryObjectGetMemberObjectsCollectionRequest extends BaseCollectionRequest<String, DirectoryObjectGetMemberObjectsCollectionResponse, DirectoryObjectGetMemberObjectsCollectionPage> {


    protected final DirectoryObjectGetMemberObjectsBody body;


    /**
     * The request for this DirectoryObjectGetMemberObjects
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryObjectGetMemberObjectsCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectoryObjectGetMemberObjectsCollectionResponse.class, DirectoryObjectGetMemberObjectsCollectionPage.class, DirectoryObjectGetMemberObjectsCollectionRequestBuilder.class);
        body = new DirectoryObjectGetMemberObjectsBody();
    }


    public void post(final ICallback<? super DirectoryObjectGetMemberObjectsCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(post(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public DirectoryObjectGetMemberObjectsCollectionPage post() throws ClientException {
        final DirectoryObjectGetMemberObjectsCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public DirectoryObjectGetMemberObjectsCollectionRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public DirectoryObjectGetMemberObjectsCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public DirectoryObjectGetMemberObjectsCollectionRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public DirectoryObjectGetMemberObjectsCollectionRequest filter(final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public DirectoryObjectGetMemberObjectsCollectionRequest orderBy(final String value) {
        addOrderByOption(value);
        return this;
    }

}
