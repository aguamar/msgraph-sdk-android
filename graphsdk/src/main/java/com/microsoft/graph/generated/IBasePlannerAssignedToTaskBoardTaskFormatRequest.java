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
 * The interface for the Base Planner Assigned To Task Board Task Format Request.
 */
public interface IBasePlannerAssignedToTaskBoardTaskFormatRequest extends IHttpRequest {

    /**
     * Gets the PlannerAssignedToTaskBoardTaskFormat from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<PlannerAssignedToTaskBoardTaskFormat> callback);

    /**
     * Gets the PlannerAssignedToTaskBoardTaskFormat from the service
     * @return The PlannerAssignedToTaskBoardTaskFormat from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    PlannerAssignedToTaskBoardTaskFormat get() throws ClientException;

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
     * Patches this PlannerAssignedToTaskBoardTaskFormat with a source
     * @param sourcePlannerAssignedToTaskBoardTaskFormat The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final PlannerAssignedToTaskBoardTaskFormat sourcePlannerAssignedToTaskBoardTaskFormat, final ICallback<PlannerAssignedToTaskBoardTaskFormat> callback);

    /**
     * Patches this PlannerAssignedToTaskBoardTaskFormat with a source
     * @param sourcePlannerAssignedToTaskBoardTaskFormat The source object with updates
     * @return The updated PlannerAssignedToTaskBoardTaskFormat
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    PlannerAssignedToTaskBoardTaskFormat patch(final PlannerAssignedToTaskBoardTaskFormat sourcePlannerAssignedToTaskBoardTaskFormat) throws ClientException;

    /**
     * Posts a PlannerAssignedToTaskBoardTaskFormat with a new object
     * @param newPlannerAssignedToTaskBoardTaskFormat The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final PlannerAssignedToTaskBoardTaskFormat newPlannerAssignedToTaskBoardTaskFormat, final ICallback<PlannerAssignedToTaskBoardTaskFormat> callback);

    /**
     * Posts a PlannerAssignedToTaskBoardTaskFormat with a new object
     * @param newPlannerAssignedToTaskBoardTaskFormat The new object to create
     * @return The created PlannerAssignedToTaskBoardTaskFormat
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    PlannerAssignedToTaskBoardTaskFormat post(final PlannerAssignedToTaskBoardTaskFormat newPlannerAssignedToTaskBoardTaskFormat) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBasePlannerAssignedToTaskBoardTaskFormatRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBasePlannerAssignedToTaskBoardTaskFormatRequest expand(final String value);

}

