package com.example.huaweitestapplica.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TableContent {
    @SerializedName("tableCount")
    @Expose
    private Integer tableCount;
    @SerializedName("tables")
    @Expose
    private List<Table> tables = null;

    public Integer getTableCount() {
        return tableCount;
    }

    public void setTableCount(Integer tableCount) {
        this.tableCount = tableCount;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }
}
