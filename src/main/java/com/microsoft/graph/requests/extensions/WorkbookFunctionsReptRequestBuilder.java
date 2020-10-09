// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsReptRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Rept Request Builder.
 */
public class WorkbookFunctionsReptRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsRept
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param text the text
     * @param numberTimes the numberTimes
     */
    public WorkbookFunctionsReptRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement text, final com.google.gson.JsonElement numberTimes) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("text", text);
        bodyParams.put("numberTimes", numberTimes);
    }

    /**
     * Creates the WorkbookFunctionsReptRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsReptRequest instance
     */
    public WorkbookFunctionsReptRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsReptRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsReptRequest instance
     */
    public WorkbookFunctionsReptRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsReptRequest request = new WorkbookFunctionsReptRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("text")) {
            request.body.text = getParameter("text");
        }

        if (hasParameter("numberTimes")) {
            request.body.numberTimes = getParameter("numberTimes");
        }

        return request;
    }
}
