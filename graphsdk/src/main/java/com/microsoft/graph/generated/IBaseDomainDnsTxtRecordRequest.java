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
 * The interface for the Base Domain Dns Txt Record Request.
 */
public interface IBaseDomainDnsTxtRecordRequest extends IHttpRequest {

    /**
     * Gets the DomainDnsTxtRecord from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<DomainDnsTxtRecord> callback);

    /**
     * Gets the DomainDnsTxtRecord from the service
     * @return The DomainDnsTxtRecord from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    DomainDnsTxtRecord get() throws ClientException;

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
     * Patches this DomainDnsTxtRecord with a source
     * @param sourceDomainDnsTxtRecord The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final DomainDnsTxtRecord sourceDomainDnsTxtRecord, final ICallback<DomainDnsTxtRecord> callback);

    /**
     * Patches this DomainDnsTxtRecord with a source
     * @param sourceDomainDnsTxtRecord The source object with updates
     * @return The updated DomainDnsTxtRecord
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    DomainDnsTxtRecord patch(final DomainDnsTxtRecord sourceDomainDnsTxtRecord) throws ClientException;

    /**
     * Posts a DomainDnsTxtRecord with a new object
     * @param newDomainDnsTxtRecord The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final DomainDnsTxtRecord newDomainDnsTxtRecord, final ICallback<DomainDnsTxtRecord> callback);

    /**
     * Posts a DomainDnsTxtRecord with a new object
     * @param newDomainDnsTxtRecord The new object to create
     * @return The created DomainDnsTxtRecord
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    DomainDnsTxtRecord post(final DomainDnsTxtRecord newDomainDnsTxtRecord) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseDomainDnsTxtRecordRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseDomainDnsTxtRecordRequest expand(final String value);

}

