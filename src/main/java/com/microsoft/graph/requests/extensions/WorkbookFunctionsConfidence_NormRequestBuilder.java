// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsConfidence_NormRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Confidence_Norm Request Builder.
 */
public class WorkbookFunctionsConfidence_NormRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsConfidence_Norm
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param alpha the alpha
     * @param standardDev the standardDev
     * @param size the size
     */
    public WorkbookFunctionsConfidence_NormRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement alpha, final com.google.gson.JsonElement standardDev, final com.google.gson.JsonElement size) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("alpha", alpha);
        bodyParams.put("standardDev", standardDev);
        bodyParams.put("size", size);
    }

    /**
     * Creates the WorkbookFunctionsConfidence_NormRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsConfidence_NormRequest instance
     */
    public WorkbookFunctionsConfidence_NormRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsConfidence_NormRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsConfidence_NormRequest instance
     */
    public WorkbookFunctionsConfidence_NormRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsConfidence_NormRequest request = new WorkbookFunctionsConfidence_NormRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("alpha")) {
            request.body.alpha = getParameter("alpha");
        }

        if (hasParameter("standardDev")) {
            request.body.standardDev = getParameter("standardDev");
        }

        if (hasParameter("size")) {
            request.body.size = getParameter("size");
        }

        return request;
    }
}
