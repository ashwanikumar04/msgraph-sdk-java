// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.models.extensions.ScheduleInformation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.CalendarGetScheduleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CalendarGetScheduleCollectionResponse;
import com.microsoft.graph.models.extensions.ScheduleInformation;
import com.microsoft.graph.models.extensions.CalendarGetScheduleBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Get Schedule Collection Request.
 */
public class CalendarGetScheduleCollectionRequest extends BaseCollectionRequest<ScheduleInformation, CalendarGetScheduleCollectionResponse> {


    protected final CalendarGetScheduleBody body;


    /**
     * The request for this CalendarGetSchedule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    @SuppressWarnings("unchecked")
    public CalendarGetScheduleCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ScheduleInformation.class, CalendarGetScheduleCollectionResponse.class, (Class<BaseCollectionPage<ScheduleInformation>>) (new BaseCollectionPage<ScheduleInformation>(new java.util.ArrayList<ScheduleInformation>(), null).getClass()));
        body = new CalendarGetScheduleBody();
    }


    public void post(final ICallback<? super BaseCollectionPage<ScheduleInformation>> callback) {
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

    public BaseCollectionPage<ScheduleInformation> post() throws ClientException {
        final CalendarGetScheduleCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public BaseCollectionPage<ScheduleInformation> buildFromResponse(final CalendarGetScheduleCollectionResponse response) {
        final CalendarGetScheduleCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new CalendarGetScheduleCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (java.util.List<String>) null, (DateTimeTimeZone) null, (DateTimeTimeZone) null, (Integer) null);
        } else {
            builder = null;
        }
        final BaseCollectionPage<ScheduleInformation> page = new BaseCollectionPage<ScheduleInformation>(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public CalendarGetScheduleCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public CalendarGetScheduleCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public CalendarGetScheduleCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public CalendarGetScheduleCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public CalendarGetScheduleCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return this;
    }

}
