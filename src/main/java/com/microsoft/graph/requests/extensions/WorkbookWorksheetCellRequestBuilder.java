// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetCellRequest;
import com.microsoft.graph.models.extensions.WorkbookWorksheet;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Worksheet Cell Request Builder.
 */
public class WorkbookWorksheetCellRequestBuilder extends BaseFunctionRequestBuilder<WorkbookRange> {

    /**
     * The request builder for this WorkbookWorksheetCell
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param row the row
     * @param column the column
     */
    public WorkbookWorksheetCellRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final Integer row, final Integer column) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("row", row));
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("column", column));
    }

    /**
     * Creates the WorkbookWorksheetCellRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookWorksheetCellRequest instance
     */
    public WorkbookWorksheetCellRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookWorksheetCellRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookWorksheetCellRequest instance
     */
    public WorkbookWorksheetCellRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookWorksheetCellRequest request = new WorkbookWorksheetCellRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }

    /**
     * Gets the request builder for WorkbookRangeFormat
     *
     * @return the WorkbookRangeFormatRequestBuilder instance
     */
    public WorkbookRangeFormatRequestBuilder format() {
        return new WorkbookRangeFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookRangeSort
     *
     * @return the WorkbookRangeSortRequestBuilder instance
     */
    public WorkbookRangeSortRequestBuilder sort() {
        return new WorkbookRangeSortRequestBuilder(getRequestUrlWithAdditionalSegment("sort"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookWorksheet
     *
     * @return the WorkbookWorksheetRequestBuilder instance
     */
    public WorkbookWorksheetRequestBuilder worksheet() {
        return new WorkbookWorksheetRequestBuilder(getRequestUrlWithAdditionalSegment("worksheet"), getClient(), null);
    }
}
