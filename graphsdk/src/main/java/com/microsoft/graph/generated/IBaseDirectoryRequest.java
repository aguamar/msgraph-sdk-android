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
 * The interface for the Base Directory Request.
 */
public interface IBaseDirectoryRequest extends IHttpRequest {

    /**
     * Gets the Directory from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<Directory> callback);

    /**
     * Gets the Directory from the service
     * @return The Directory from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Directory get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Directory with a source
     * @param sourceDirectory The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final Directory sourceDirectory, final ICallback<Directory> callback);

    /**
     * Patches this Directory with a source
     * @param sourceDirectory The source object with updates
     * @return The updated Directory
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Directory patch(final Directory sourceDirectory) throws ClientException;

    /**
     * Posts a Directory with a new object
     * @param newDirectory The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final Directory newDirectory, final ICallback<Directory> callback);

    /**
     * Posts a Directory with a new object
     * @param newDirectory The new object to create
     * @return The created Directory
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Directory post(final Directory newDirectory) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseDirectoryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseDirectoryRequest expand(final String value);

}

