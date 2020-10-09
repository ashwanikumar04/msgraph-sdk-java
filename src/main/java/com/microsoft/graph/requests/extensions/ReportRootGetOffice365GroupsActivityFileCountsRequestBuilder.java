// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityFileCountsRequest;
import com.microsoft.graph.models.extensions.ReportRoot;
import com.microsoft.graph.models.extensions.Report;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Groups Activity File Counts Request Builder.
 */
public class ReportRootGetOffice365GroupsActivityFileCountsRequestBuilder extends BaseFunctionRequestBuilder<Report> {

    /**
     * The request builder for this ReportRootGetOffice365GroupsActivityFileCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetOffice365GroupsActivityFileCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("period", period));
    }

    /**
     * Creates the ReportRootGetOffice365GroupsActivityFileCountsRequest
     *
     * @param requestOptions the options for the request
     * @return the ReportRootGetOffice365GroupsActivityFileCountsRequest instance
     */
    public ReportRootGetOffice365GroupsActivityFileCountsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ReportRootGetOffice365GroupsActivityFileCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ReportRootGetOffice365GroupsActivityFileCountsRequest instance
     */
    public ReportRootGetOffice365GroupsActivityFileCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetOffice365GroupsActivityFileCountsRequest request = new ReportRootGetOffice365GroupsActivityFileCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
