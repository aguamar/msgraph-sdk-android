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
import java.util.List;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Xirr Request Builder.
 */
public class BaseWorkbookFunctionsXirrRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsXirr
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsXirrRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement values, final com.google.gson.JsonElement dates, final com.google.gson.JsonElement guess) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("values", values);
        mBodyParams.put("dates", dates);
        mBodyParams.put("guess", guess);
    }

    /**
     * Creates the IWorkbookFunctionsXirrRequest
     *
     * @return The IWorkbookFunctionsXirrRequest instance
     */
    public IWorkbookFunctionsXirrRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsXirrRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsXirrRequest instance
     */
    public IWorkbookFunctionsXirrRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsXirrRequest request = new WorkbookFunctionsXirrRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("values")) {
            request.mBody.values = getParameter("values");
        }
        if (hasParameter("dates")) {
            request.mBody.dates = getParameter("dates");
        }
        if (hasParameter("guess")) {
            request.mBody.guess = getParameter("guess");
        }
  
        return request;
    }
}