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
 * The class for the Base Message Request.
 */
public class BaseMessageRequest extends BaseRequest implements IBaseMessageRequest {

    /**
     * The request for the Message
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseMessageRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the Message from the service
     * @param callback The callback to be called after success or failure.
     */
    public void getMessage(final ICallback<Message> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Message from the service
     * @return The Message from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Message getMessage() throws ClientException {
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
     * Patches this Message with a source
     * @param sourceMessage The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final Message sourceMessage, final ICallback<Message> callback) {
        send(HttpMethod.PATCH, callback, sourceMessage);
    }

    /**
     * Patches this Message with a source
     * @param sourceMessage The source object with updates
     * @return The updated Message
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Message patch(final Message sourceMessage) throws ClientException {
        return send(HttpMethod.PATCH, sourceMessage);
    }

    /**
     * Creates a Message with a new object
     * @param newMessage The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final Message newMessage, final ICallback<Message> callback) {
        send(HttpMethod.POST, callback, newMessage);
    }

    /**
     * Creates a Message with a new object
     * @param newMessage The new object to create
     * @return The created Message
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public Message post(final Message newMessage) throws ClientException {
        return send(HttpMethod.POST, newMessage);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IMessageRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (MessageRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IMessageRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (MessageRequest)this;
     }

}

