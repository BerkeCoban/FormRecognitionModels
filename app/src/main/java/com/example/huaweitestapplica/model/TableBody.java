package com.example.huaweitestapplica.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TableBody {
    @SerializedName("startRow")
    @Expose
    private Integer startRow;
    @SerializedName("endRow")
    @Expose
    private Integer endRow;
    @SerializedName("startCol")
    @Expose
    private Integer startCol;
    @SerializedName("endCol")
    @Expose
    private Integer endCol;
    @SerializedName("cellCoordinate")
    @Expose
    private CellCoordinate cellCoordinate;
    @SerializedName("textInfo")
    @Expose
    private String textInfo;

    public Integer getStartRow() {
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public Integer getEndRow() {
        return endRow;
    }

    public void setEndRow(Integer endRow) {
        this.endRow = endRow;
    }

    public Integer getStartCol() {
        return startCol;
    }

    public void setStartCol(Integer startCol) {
        this.startCol = startCol;
    }

    public Integer getEndCol() {
        return endCol;
    }

    public void setEndCol(Integer endCol) {
        this.endCol = endCol;
    }

    public CellCoordinate getCellCoordinate() {
        return cellCoordinate;
    }

    public void setCellCoordinate(CellCoordinate cellCoordinate) {
        this.cellCoordinate = cellCoordinate;
    }

    public String getTextInfo() {
        return textInfo;
    }

    public void setTextInfo(String textInfo) {
        this.textInfo = textInfo;
    }
}
