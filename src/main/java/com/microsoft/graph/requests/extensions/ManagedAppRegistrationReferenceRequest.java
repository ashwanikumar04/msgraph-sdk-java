// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedAppRegistration;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppOperationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Registration Reference Request.
 */
public class ManagedAppRegistrationReferenceRequest extends BaseReferenceRequest<ManagedAppRegistration> {

    /**
     * The request for the ManagedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppRegistrationReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppRegistration.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ManagedAppRegistrationReferenceRequest select(final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ManagedAppRegistrationReferenceRequest expand(final String value) {
        addExpandOption(value);
        return this;
    }
    /**
     * Puts the ManagedAppRegistration
     *
     * @param srcManagedAppRegistration the ManagedAppRegistration reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ManagedAppRegistration srcManagedAppRegistration, final ICallback<? super ManagedAppRegistration> callback) {
        send(HttpMethod.PUT, callback, srcManagedAppRegistration);
    }

    /**
     * Puts the ManagedAppRegistration
     *
     * @param srcManagedAppRegistration the ManagedAppRegistration reference to PUT
     * @return the ManagedAppRegistration
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ManagedAppRegistration put(ManagedAppRegistration srcManagedAppRegistration) throws ClientException {
        return send(HttpMethod.PUT, srcManagedAppRegistration);
    }
}
