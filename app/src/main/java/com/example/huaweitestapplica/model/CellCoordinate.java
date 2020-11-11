package com.example.huaweitestapplica.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CellCoordinate {
    @SerializedName("topLeft_x")
    @Expose
    private Double topLeftX;
    @SerializedName("topLeft_y")
    @Expose
    private Double topLeftY;
    @SerializedName("topRight_x")
    @Expose
    private Double topRightX;
    @SerializedName("topRight_y")
    @Expose
    private Double topRightY;
    @SerializedName("bottomLeft_x")
    @Expose
    private Double bottomLeftX;
    @SerializedName("bottomLeft_y")
    @Expose
    private Double bottomLeftY;
    @SerializedName("bottomRight_x")
    @Expose
    private Double bottomRightX;
    @SerializedName("bottomRight_y")
    @Expose
    private Double bottomRightY;

    public Double getTopLeftX() {
        return topLeftX;
    }

    public void setTopLeftX(Double topLeftX) {
        this.topLeftX = topLeftX;
    }

    public Double getTopLeftY() {
        return topLeftY;
    }

    public void setTopLeftY(Double topLeftY) {
        this.topLeftY = topLeftY;
    }

    public Double getTopRightX() {
        return topRightX;
    }

    public void setTopRightX(Double topRightX) {
        this.topRightX = topRightX;
    }

    public Double getTopRightY() {
        return topRightY;
    }

    public void setTopRightY(Double topRightY) {
        this.topRightY = topRightY;
    }

    public Double getBottomLeftX() {
        return bottomLeftX;
    }

    public void setBottomLeftX(Double bottomLeftX) {
        this.bottomLeftX = bottomLeftX;
    }

    public Double getBottomLeftY() {
        return bottomLeftY;
    }

    public void setBottomLeftY(Double bottomLeftY) {
        this.bottomLeftY = bottomLeftY;
    }

    public Double getBottomRightX() {
        return bottomRightX;
    }

    public void setBottomRightX(Double bottomRightX) {
        this.bottomRightX = bottomRightX;
    }

    public Double getBottomRightY() {
        return bottomRightY;
    }

    public void setBottomRightY(Double bottomRightY) {
        this.bottomRightY = bottomRightY;
    }
}
