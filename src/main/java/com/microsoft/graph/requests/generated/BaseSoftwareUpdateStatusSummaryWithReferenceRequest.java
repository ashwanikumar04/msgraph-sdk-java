// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Software Update Status Summary With Reference Request.
 */
public class BaseSoftwareUpdateStatusSummaryWithReferenceRequest extends BaseRequest implements IBaseSoftwareUpdateStatusSummaryWithReferenceRequest {

    /**
     * The request for the SoftwareUpdateStatusSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseSoftwareUpdateStatusSummaryWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, SoftwareUpdateStatusSummary.class);
    }

    public void post(final SoftwareUpdateStatusSummary newSoftwareUpdateStatusSummary, final IJsonBackedObject payload, final ICallback<SoftwareUpdateStatusSummary> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public SoftwareUpdateStatusSummary post(final SoftwareUpdateStatusSummary newSoftwareUpdateStatusSummary, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newSoftwareUpdateStatusSummary;
        }
        return null;
    }

    public void get(final ICallback<SoftwareUpdateStatusSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public SoftwareUpdateStatusSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISoftwareUpdateStatusSummaryWithReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (ISoftwareUpdateStatusSummaryWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISoftwareUpdateStatusSummaryWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (SoftwareUpdateStatusSummaryWithReferenceRequest)this;
    }
}
