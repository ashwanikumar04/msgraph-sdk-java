// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.DriveItemRestoreRequest;
import com.microsoft.graph.models.extensions.ItemReference;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Restore Request Builder.
 */
public class DriveItemRestoreRequestBuilder extends BaseActionRequestBuilder<DriveItem> {

    /**
     * The request builder for this DriveItemRestore
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parentReference the parentReference
     * @param name the name
     */
    public DriveItemRestoreRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final ItemReference parentReference, final String name) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("parentReference", parentReference);
        bodyParams.put("name", name);
    }

    /**
     * Creates the DriveItemRestoreRequest
     *
     * @param requestOptions the options for the request
     * @return the DriveItemRestoreRequest instance
     */
    public DriveItemRestoreRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DriveItemRestoreRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DriveItemRestoreRequest instance
     */
    public DriveItemRestoreRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DriveItemRestoreRequest request = new DriveItemRestoreRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("parentReference")) {
            request.body.parentReference = getParameter("parentReference");
        }

        if (hasParameter("name")) {
            request.body.name = getParameter("name");
        }

        return request;
    }
}
