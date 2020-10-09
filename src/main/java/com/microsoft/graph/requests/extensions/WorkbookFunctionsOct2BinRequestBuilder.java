// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsOct2BinRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Oct2Bin Request Builder.
 */
public class WorkbookFunctionsOct2BinRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsOct2Bin
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param places the places
     */
    public WorkbookFunctionsOct2BinRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement places) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("places", places);
    }

    /**
     * Creates the WorkbookFunctionsOct2BinRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsOct2BinRequest instance
     */
    public WorkbookFunctionsOct2BinRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsOct2BinRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsOct2BinRequest instance
     */
    public WorkbookFunctionsOct2BinRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsOct2BinRequest request = new WorkbookFunctionsOct2BinRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("places")) {
            request.body.places = getParameter("places");
        }

        return request;
    }
}
