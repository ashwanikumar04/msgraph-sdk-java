// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.models.extensions.AttendeeBase;
import com.microsoft.graph.models.extensions.LocationConstraint;
import com.microsoft.graph.models.extensions.TimeConstraint;
import com.microsoft.graph.models.extensions.MeetingTimeSuggestionsResult;
import com.microsoft.graph.models.generated.MailTipsType;
import com.microsoft.graph.models.extensions.MailTips;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.models.generated.ExchangeIdFormat;
import com.microsoft.graph.models.extensions.ConvertIdResult;
import com.microsoft.graph.models.extensions.Reminder;
import com.microsoft.graph.models.extensions.ManagedAppDiagnosticStatus;
import com.microsoft.graph.models.extensions.ManagedAppPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.requests.extensions.UserWithReferenceRequest;
import com.microsoft.graph.requests.extensions.UserReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.UserCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.UserCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Collection With References Request.
 */
public class UserCollectionWithReferencesRequest extends BaseCollectionWithReferencesRequest<User, UserWithReferenceRequest, UserReferenceRequestBuilder, UserWithReferenceRequestBuilder, UserCollectionResponse, UserCollectionPage, UserCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserCollectionResponse.class, UserCollectionPage.class, UserCollectionWithReferencesRequestBuilder.class);
    }

    public UserCollectionWithReferencesRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

    public UserCollectionWithReferencesRequest filter(final String value) {
        addFilterOption(value);
        return this;
    }

    public UserCollectionWithReferencesRequest orderBy(final String value) {
        addOrderByOption(value);
        return this;
    }

    public UserCollectionWithReferencesRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    public UserCollectionWithReferencesRequest top(final int value) {
        addTopOption(value);
        return this;
    }

}
