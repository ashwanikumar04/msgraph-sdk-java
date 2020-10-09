// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.CallRecordResponseRequest;
import com.microsoft.graph.models.extensions.Call;
import com.microsoft.graph.models.extensions.Prompt;
import com.microsoft.graph.models.extensions.RecordOperation;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Record Response Request Builder.
 */
public class CallRecordResponseRequestBuilder extends BaseActionRequestBuilder<RecordOperation> {

    /**
     * The request builder for this CallRecordResponse
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param prompts the prompts
     * @param bargeInAllowed the bargeInAllowed
     * @param initialSilenceTimeoutInSeconds the initialSilenceTimeoutInSeconds
     * @param maxSilenceTimeoutInSeconds the maxSilenceTimeoutInSeconds
     * @param maxRecordDurationInSeconds the maxRecordDurationInSeconds
     * @param playBeep the playBeep
     * @param stopTones the stopTones
     * @param clientContext the clientContext
     */
    public CallRecordResponseRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<Prompt> prompts, final Boolean bargeInAllowed, final Integer initialSilenceTimeoutInSeconds, final Integer maxSilenceTimeoutInSeconds, final Integer maxRecordDurationInSeconds, final Boolean playBeep, final java.util.List<String> stopTones, final String clientContext) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("prompts", prompts);
        bodyParams.put("bargeInAllowed", bargeInAllowed);
        bodyParams.put("initialSilenceTimeoutInSeconds", initialSilenceTimeoutInSeconds);
        bodyParams.put("maxSilenceTimeoutInSeconds", maxSilenceTimeoutInSeconds);
        bodyParams.put("maxRecordDurationInSeconds", maxRecordDurationInSeconds);
        bodyParams.put("playBeep", playBeep);
        bodyParams.put("stopTones", stopTones);
        bodyParams.put("clientContext", clientContext);
    }

    /**
     * Creates the CallRecordResponseRequest
     *
     * @param requestOptions the options for the request
     * @return the CallRecordResponseRequest instance
     */
    public CallRecordResponseRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the CallRecordResponseRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the CallRecordResponseRequest instance
     */
    public CallRecordResponseRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        CallRecordResponseRequest request = new CallRecordResponseRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("prompts")) {
            request.body.prompts = getParameter("prompts");
        }

        if (hasParameter("bargeInAllowed")) {
            request.body.bargeInAllowed = getParameter("bargeInAllowed");
        }

        if (hasParameter("initialSilenceTimeoutInSeconds")) {
            request.body.initialSilenceTimeoutInSeconds = getParameter("initialSilenceTimeoutInSeconds");
        }

        if (hasParameter("maxSilenceTimeoutInSeconds")) {
            request.body.maxSilenceTimeoutInSeconds = getParameter("maxSilenceTimeoutInSeconds");
        }

        if (hasParameter("maxRecordDurationInSeconds")) {
            request.body.maxRecordDurationInSeconds = getParameter("maxRecordDurationInSeconds");
        }

        if (hasParameter("playBeep")) {
            request.body.playBeep = getParameter("playBeep");
        }

        if (hasParameter("stopTones")) {
            request.body.stopTones = getParameter("stopTones");
        }

        if (hasParameter("clientContext")) {
            request.body.clientContext = getParameter("clientContext");
        }

        return request;
    }
}
