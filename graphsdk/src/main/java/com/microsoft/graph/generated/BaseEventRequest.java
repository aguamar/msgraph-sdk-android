// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Event Request.
 */
public class BaseEventRequest extends BaseRequest implements IBaseEventRequest {

    /**
     * The request for the Event
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseEventRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the Event from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<Event> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Event from the service
     * @return The Event from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Event get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this Event with a source
     * @param sourceEvent The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final Event sourceEvent, final ICallback<Event> callback) {
        send(HttpMethod.PATCH, callback, sourceEvent);
    }

    /**
     * Patches this Event with a source
     * @param sourceEvent The source object with updates
     * @return The updated Event
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Event patch(final Event sourceEvent) throws ClientException {
        return send(HttpMethod.PATCH, sourceEvent);
    }

    /**
     * Creates a Event with a new object
     * @param newEvent The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final Event newEvent, final ICallback<Event> callback) {
        send(HttpMethod.POST, callback, newEvent);
    }

    /**
     * Creates a Event with a new object
     * @param newEvent The new object to create
     * @return The created Event
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Event post(final Event newEvent) throws ClientException {
        return send(HttpMethod.POST, newEvent);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IEventRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (EventRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IEventRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (EventRequest)this;
     }

}

