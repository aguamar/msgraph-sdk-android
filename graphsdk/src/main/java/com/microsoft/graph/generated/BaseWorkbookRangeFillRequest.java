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
 * The class for the Base Workbook Range Fill Request.
 */
public class BaseWorkbookRangeFillRequest extends BaseRequest implements IBaseWorkbookRangeFillRequest {

    /**
     * The request for the WorkbookRangeFill
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseWorkbookRangeFillRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the WorkbookRangeFill from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<WorkbookRangeFill> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookRangeFill from the service
     * @return The WorkbookRangeFill from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookRangeFill get() throws ClientException {
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
     * Patches this WorkbookRangeFill with a source
     * @param sourceWorkbookRangeFill The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final WorkbookRangeFill sourceWorkbookRangeFill, final ICallback<WorkbookRangeFill> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookRangeFill);
    }

    /**
     * Patches this WorkbookRangeFill with a source
     * @param sourceWorkbookRangeFill The source object with updates
     * @return The updated WorkbookRangeFill
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookRangeFill patch(final WorkbookRangeFill sourceWorkbookRangeFill) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookRangeFill);
    }

    /**
     * Creates a WorkbookRangeFill with a new object
     * @param newWorkbookRangeFill The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final WorkbookRangeFill newWorkbookRangeFill, final ICallback<WorkbookRangeFill> callback) {
        send(HttpMethod.POST, callback, newWorkbookRangeFill);
    }

    /**
     * Creates a WorkbookRangeFill with a new object
     * @param newWorkbookRangeFill The new object to create
     * @return The created WorkbookRangeFill
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public WorkbookRangeFill post(final WorkbookRangeFill newWorkbookRangeFill) throws ClientException {
        return send(HttpMethod.POST, newWorkbookRangeFill);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IWorkbookRangeFillRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WorkbookRangeFillRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IWorkbookRangeFillRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WorkbookRangeFillRequest)this;
     }

}

