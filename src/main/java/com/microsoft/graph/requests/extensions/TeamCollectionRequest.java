// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Team;
import com.microsoft.graph.models.generated.TeamVisibilityType;
import com.microsoft.graph.models.generated.ClonableTeamParts;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ChatMessage;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.TeamCollectionResponse;
import com.microsoft.graph.requests.extensions.TeamCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team Collection Request.
 */
public class TeamCollectionRequest extends BaseCollectionRequest<Team, TeamCollectionResponse, TeamCollectionPage> {

    /**
     * The request builder for this collection of Team
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamCollectionResponse.class, TeamCollectionPage.class, TeamCollectionRequestBuilder.class);
    }

    public void post(final Team newTeam, final ICallback<? super Team> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new TeamRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTeam, callback);
    }

    public Team post(final Team newTeam) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TeamRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTeam);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public TeamCollectionRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public TeamCollectionRequest filter(final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public TeamCollectionRequest orderBy(final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public TeamCollectionRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public TeamCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public TeamCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public TeamCollectionRequest skipToken(final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}
