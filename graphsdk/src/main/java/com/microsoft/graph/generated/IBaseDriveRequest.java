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
 * The interface for the Base Drive Request.
 */
public interface IBaseDriveRequest extends IHttpRequest {

    /**
     * Gets the Drive from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<Drive> callback);

    /**
     * Gets the Drive from the service
     * @return The Drive from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Drive get() throws ClientException;

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
     * Patches this Drive with a source
     * @param sourceDrive The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final Drive sourceDrive, final ICallback<Drive> callback);

    /**
     * Patches this Drive with a source
     * @param sourceDrive The source object with updates
     * @return The updated Drive
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Drive patch(final Drive sourceDrive) throws ClientException;

    /**
     * Posts a Drive with a new object
     * @param newDrive The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final Drive newDrive, final ICallback<Drive> callback);

    /**
     * Posts a Drive with a new object
     * @param newDrive The new object to create
     * @return The created Drive
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    Drive post(final Drive newDrive) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseDriveRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseDriveRequest expand(final String value);

}

