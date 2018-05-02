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
 * The class for the Base List Item Version Request.
 */
public class BaseListItemVersionRequest extends BaseRequest implements IBaseListItemVersionRequest {

    /**
     * The request for the ListItemVersion
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseListItemVersionRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the ListItemVersion from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<ListItemVersion> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ListItemVersion from the service
     * @return The ListItemVersion from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public ListItemVersion get() throws ClientException {
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
     * Patches this ListItemVersion with a source
     * @param sourceListItemVersion The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final ListItemVersion sourceListItemVersion, final ICallback<ListItemVersion> callback) {
        send(HttpMethod.PATCH, callback, sourceListItemVersion);
    }

    /**
     * Patches this ListItemVersion with a source
     * @param sourceListItemVersion The source object with updates
     * @return The updated ListItemVersion
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public ListItemVersion patch(final ListItemVersion sourceListItemVersion) throws ClientException {
        return send(HttpMethod.PATCH, sourceListItemVersion);
    }

    /**
     * Creates a ListItemVersion with a new object
     * @param newListItemVersion The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final ListItemVersion newListItemVersion, final ICallback<ListItemVersion> callback) {
        send(HttpMethod.POST, callback, newListItemVersion);
    }

    /**
     * Creates a ListItemVersion with a new object
     * @param newListItemVersion The new object to create
     * @return The created ListItemVersion
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public ListItemVersion post(final ListItemVersion newListItemVersion) throws ClientException {
        return send(HttpMethod.POST, newListItemVersion);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IListItemVersionRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ListItemVersionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IListItemVersionRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ListItemVersionRequest)this;
     }

}
