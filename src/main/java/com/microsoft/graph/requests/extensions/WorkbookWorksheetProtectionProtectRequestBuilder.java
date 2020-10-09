// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetProtectionProtectRequest;
import com.microsoft.graph.models.extensions.WorkbookWorksheetProtection;
import com.microsoft.graph.models.extensions.WorkbookWorksheetProtectionOptions;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Worksheet Protection Protect Request Builder.
 */
public class WorkbookWorksheetProtectionProtectRequestBuilder extends BaseActionRequestBuilder<WorkbookWorksheetProtection> {

    /**
     * The request builder for this WorkbookWorksheetProtectionProtect
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param options the options
     */
    public WorkbookWorksheetProtectionProtectRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final WorkbookWorksheetProtectionOptions options) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("options", options);
    }

    /**
     * Creates the WorkbookWorksheetProtectionProtectRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookWorksheetProtectionProtectRequest instance
     */
    public WorkbookWorksheetProtectionProtectRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookWorksheetProtectionProtectRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookWorksheetProtectionProtectRequest instance
     */
    public WorkbookWorksheetProtectionProtectRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookWorksheetProtectionProtectRequest request = new WorkbookWorksheetProtectionProtectRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("options")) {
            request.body.options = getParameter("options");
        }

        return request;
    }
}
