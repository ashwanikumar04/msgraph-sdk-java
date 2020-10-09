// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateSendTestMessageRequest;
import com.microsoft.graph.models.extensions.NotificationMessageTemplate;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notification Message Template Send Test Message Request Builder.
 */
public class NotificationMessageTemplateSendTestMessageRequestBuilder extends BaseActionRequestBuilder<NotificationMessageTemplate> {

    /**
     * The request builder for this NotificationMessageTemplateSendTestMessage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NotificationMessageTemplateSendTestMessageRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the NotificationMessageTemplateSendTestMessageRequest
     *
     * @param requestOptions the options for the request
     * @return the NotificationMessageTemplateSendTestMessageRequest instance
     */
    public NotificationMessageTemplateSendTestMessageRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the NotificationMessageTemplateSendTestMessageRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the NotificationMessageTemplateSendTestMessageRequest instance
     */
    public NotificationMessageTemplateSendTestMessageRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        NotificationMessageTemplateSendTestMessageRequest request = new NotificationMessageTemplateSendTestMessageRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
