// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsErfRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Erf Request Builder.
 */
public class WorkbookFunctionsErfRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsErf
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param lowerLimit the lowerLimit
     * @param upperLimit the upperLimit
     */
    public WorkbookFunctionsErfRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement lowerLimit, final com.google.gson.JsonElement upperLimit) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("lowerLimit", lowerLimit);
        bodyParams.put("upperLimit", upperLimit);
    }

    /**
     * Creates the WorkbookFunctionsErfRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsErfRequest instance
     */
    public WorkbookFunctionsErfRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsErfRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsErfRequest instance
     */
    public WorkbookFunctionsErfRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsErfRequest request = new WorkbookFunctionsErfRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("lowerLimit")) {
            request.body.lowerLimit = getParameter("lowerLimit");
        }

        if (hasParameter("upperLimit")) {
            request.body.upperLimit = getParameter("upperLimit");
        }

        return request;
    }
}
