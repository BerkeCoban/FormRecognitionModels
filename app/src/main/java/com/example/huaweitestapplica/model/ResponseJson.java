package com.example.huaweitestapplica.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseJson {
    @SerializedName("retCode")
    @Expose
    private Integer retCode;
    @SerializedName("tableContent")
    @Expose
    private TableContent tableContent;

    public Integer getRetCode() {
        return retCode;
    }

    public void setRetCode(Integer retCode) {
        this.retCode = retCode;
    }

    public TableContent getTableContent() {
        return tableContent;
    }

    public void setTableContent(TableContent tableContent) {
        this.tableContent = tableContent;
    }
}
