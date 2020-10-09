// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Person;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Request.
 */
public class PersonRequest extends BaseRequest<Person> {
	
    /**
     * The request for the Person
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PersonRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Person.class);
    }

    /**
     * Gets the Person from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Person> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Person from the service
     *
     * @return the Person from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Person get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Person> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Person with a source
     *
     * @param sourcePerson the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Person sourcePerson, final ICallback<? super Person> callback) {
        send(HttpMethod.PATCH, callback, sourcePerson);
    }

    /**
     * Patches this Person with a source
     *
     * @param sourcePerson the source object with updates
     * @return the updated Person
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Person patch(final Person sourcePerson) throws ClientException {
        return send(HttpMethod.PATCH, sourcePerson);
    }

    /**
     * Creates a Person with a new object
     *
     * @param newPerson the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Person newPerson, final ICallback<? super Person> callback) {
        send(HttpMethod.POST, callback, newPerson);
    }

    /**
     * Creates a Person with a new object
     *
     * @param newPerson the new object to create
     * @return the created Person
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Person post(final Person newPerson) throws ClientException {
        return send(HttpMethod.POST, newPerson);
    }

    /**
     * Creates a Person with a new object
     *
     * @param newPerson the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Person newPerson, final ICallback<? super Person> callback) {
        send(HttpMethod.PUT, callback, newPerson);
    }

    /**
     * Creates a Person with a new object
     *
     * @param newPerson the object to create/update
     * @return the created Person
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Person put(final Person newPerson) throws ClientException {
        return send(HttpMethod.PUT, newPerson);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public PersonRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public PersonRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return this;
     }

}

