// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsAveDevRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Ave Dev Request Builder.
 */
public class WorkbookFunctionsAveDevRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsAveDev
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param values the values
     */
    public WorkbookFunctionsAveDevRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("values", values);
    }

    /**
     * Creates the WorkbookFunctionsAveDevRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsAveDevRequest instance
     */
    public WorkbookFunctionsAveDevRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsAveDevRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsAveDevRequest instance
     */
    public WorkbookFunctionsAveDevRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsAveDevRequest request = new WorkbookFunctionsAveDevRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("values")) {
            request.body.values = getParameter("values");
        }

        return request;
    }
}
