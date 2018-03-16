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
 * The class for the Base Education School Request Builder.
 */
public class BaseEducationSchoolRequestBuilder extends BaseRequestBuilder implements IBaseEducationSchoolRequestBuilder {

    /**
     * The request builder for the EducationSchool
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseEducationSchoolRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IEducationSchoolRequest instance
     */
    public IEducationSchoolRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IEducationSchoolRequest instance
     */
    public IEducationSchoolRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new EducationSchoolRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IEducationClassCollectionWithReferencesRequestBuilder classes() {
        return new EducationClassCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("classes"), getClient(), null);
    }

    public IEducationClassWithReferenceRequestBuilder classes(final String id) {
        return new EducationClassWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("classes") + "/" + id, getClient(), null);
    }
    public IEducationUserCollectionWithReferencesRequestBuilder users() {
        return new EducationUserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("users"), getClient(), null);
    }

    public IEducationUserWithReferenceRequestBuilder users(final String id) {
        return new EducationUserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("users") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for AdministrativeUnit
     *
     * @return the IAdministrativeUnitWithReferenceRequestBuilder instance
     */
    public IAdministrativeUnitWithReferenceRequestBuilder administrativeUnit() {
        return new AdministrativeUnitWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("administrativeUnit"), getClient(), null);
    }
}
