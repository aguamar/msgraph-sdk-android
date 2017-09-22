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

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Chart Axis.
 */
public class BaseWorkbookChartAxis extends Entity implements IJsonBackedObject {


    public BaseWorkbookChartAxis() {
        oDataType = "microsoft.graph.workbookChartAxis";
    }

    /**
     * The Major Unit.
     * 
     */
    @SerializedName("majorUnit")
    @Expose
    public com.google.gson.JsonElement majorUnit;

    /**
     * The Maximum.
     * 
     */
    @SerializedName("maximum")
    @Expose
    public com.google.gson.JsonElement maximum;

    /**
     * The Minimum.
     * 
     */
    @SerializedName("minimum")
    @Expose
    public com.google.gson.JsonElement minimum;

    /**
     * The Minor Unit.
     * 
     */
    @SerializedName("minorUnit")
    @Expose
    public com.google.gson.JsonElement minorUnit;

    /**
     * The Format.
     * 
     */
    @SerializedName("format")
    @Expose
    public WorkbookChartAxisFormat format;

    /**
     * The Major Gridlines.
     * 
     */
    @SerializedName("majorGridlines")
    @Expose
    public WorkbookChartGridlines majorGridlines;

    /**
     * The Minor Gridlines.
     * 
     */
    @SerializedName("minorGridlines")
    @Expose
    public WorkbookChartGridlines minorGridlines;

    /**
     * The Title.
     * 
     */
    @SerializedName("title")
    @Expose
    public WorkbookChartAxisTitle title;


    /**
     * The raw representation of this class
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer
     */
    private transient ISerializer mSerializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;

    }
}
