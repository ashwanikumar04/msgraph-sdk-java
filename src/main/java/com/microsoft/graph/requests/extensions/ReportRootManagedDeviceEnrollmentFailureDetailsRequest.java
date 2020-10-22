// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Report;
import com.microsoft.graph.models.extensions.ReportRoot;
import com.microsoft.graph.requests.extensions.ReportRootManagedDeviceEnrollmentFailureDetailsRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Managed Device Enrollment Failure Details Request.
 */
public class ReportRootManagedDeviceEnrollmentFailureDetailsRequest extends BaseRequest<Report> {

    /**
     * The request for this ReportRootManagedDeviceEnrollmentFailureDetails
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootManagedDeviceEnrollmentFailureDetailsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Report.class);
    }

    /**
     * Gets the Report
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Report> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Report
     *
     * @return the Report
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public Report get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ReportRootManagedDeviceEnrollmentFailureDetailsRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ReportRootManagedDeviceEnrollmentFailureDetailsRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ReportRootManagedDeviceEnrollmentFailureDetailsRequest filter(final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public ReportRootManagedDeviceEnrollmentFailureDetailsRequest orderBy(final String value) {
        addOrderByOption(value);
        return this;
    }

}
