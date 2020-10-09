// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyDynamicFilterRequest;
import com.microsoft.graph.models.extensions.WorkbookFilter;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Filter Apply Dynamic Filter Request Builder.
 */
public class WorkbookFilterApplyDynamicFilterRequestBuilder extends BaseActionRequestBuilder<WorkbookFilter> {

    /**
     * The request builder for this WorkbookFilterApplyDynamicFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param criteria the criteria
     */
    public WorkbookFilterApplyDynamicFilterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String criteria) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("criteria", criteria);
    }

    /**
     * Creates the WorkbookFilterApplyDynamicFilterRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFilterApplyDynamicFilterRequest instance
     */
    public WorkbookFilterApplyDynamicFilterRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFilterApplyDynamicFilterRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFilterApplyDynamicFilterRequest instance
     */
    public WorkbookFilterApplyDynamicFilterRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFilterApplyDynamicFilterRequest request = new WorkbookFilterApplyDynamicFilterRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("criteria")) {
            request.body.criteria = getParameter("criteria");
        }

        return request;
    }
}
