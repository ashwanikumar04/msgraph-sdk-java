// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsZ_TestRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Z_Test Request Builder.
 */
public class WorkbookFunctionsZ_TestRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsZ_Test
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param array the array
     * @param x the x
     * @param sigma the sigma
     */
    public WorkbookFunctionsZ_TestRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement array, final com.google.gson.JsonElement x, final com.google.gson.JsonElement sigma) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("array", array);
        bodyParams.put("x", x);
        bodyParams.put("sigma", sigma);
    }

    /**
     * Creates the WorkbookFunctionsZ_TestRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsZ_TestRequest instance
     */
    public WorkbookFunctionsZ_TestRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsZ_TestRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsZ_TestRequest instance
     */
    public WorkbookFunctionsZ_TestRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsZ_TestRequest request = new WorkbookFunctionsZ_TestRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("array")) {
            request.body.array = getParameter("array");
        }

        if (hasParameter("x")) {
            request.body.x = getParameter("x");
        }

        if (hasParameter("sigma")) {
            request.body.sigma = getParameter("sigma");
        }

        return request;
    }
}
