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
 * The interface for the Base Base Item Request.
 */
public interface IBaseBaseItemRequest extends IHttpRequest {

    /**
     * Gets the BaseItem from the service
     * @param callback The callback to be called after success or failure.
     */
    void getBaseItem(final ICallback<BaseItem> callback);

    /**
     * Gets the BaseItem from the service
     * @return The BaseItem from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    BaseItem getBaseItem() throws ClientException;

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
     * Patches this BaseItem with a source
     * @param sourceBaseItem The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final BaseItem sourceBaseItem, final ICallback<BaseItem> callback);

    /**
     * Patches this BaseItem with a source
     * @param sourceBaseItem The source object with updates
     * @return The updated BaseItem
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    BaseItem patch(final BaseItem sourceBaseItem) throws ClientException;

    /**
     * Posts a BaseItem with a new object
     * @param newBaseItem The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final BaseItem newBaseItem, final ICallback<BaseItem> callback);

    /**
     * Posts a BaseItem with a new object
     * @param newBaseItem The new object to create
     * @return The created BaseItem
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    BaseItem post(final BaseItem newBaseItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseBaseItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseBaseItemRequest expand(final String value);

}

