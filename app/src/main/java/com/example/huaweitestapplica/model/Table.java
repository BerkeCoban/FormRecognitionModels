package com.example.huaweitestapplica.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Table {
    @SerializedName("tableID")
    @Expose
    private Integer tableID;
    @SerializedName("tableBody")
    @Expose
    private List<TableBody> tableBody = null;

    public Integer getTableID() {
        return tableID;
    }

    public void setTableID(Integer tableID) {
        this.tableID = tableID;
    }

    public List<TableBody> getTableBody() {
        return tableBody;
    }

    public void setTableBody(List<TableBody> tableBody) {
        this.tableBody = tableBody;
    }
}
