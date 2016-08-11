package com.zecovery.android.dev.asp.main;

/**
 * Created by fran on 03-08-16.
 */

public class Area {

    private int areaId;
    private String areaName;
    private String areaDescription;
    private String areaShortDescription;
    private String areaInfo;
    private float areaLat;
    private float areaLng;

    public Area() {
    }

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAreaDescription() {
        return areaDescription;
    }

    public void setAreaDescription(String areaDescription) {
        this.areaDescription = areaDescription;
    }

    public String getAreaShortDescription() {
        return areaShortDescription;
    }

    public void setAreaShortDescription(String areaShortDescription) {
        this.areaShortDescription = areaShortDescription;
    }

    public String getAreaInfo() {
        return areaInfo;
    }

    public void setAreaInfo(String areaInfo) {
        this.areaInfo = areaInfo;
    }

    public float getAreaLat() {
        return areaLat;
    }

    public void setAreaLat(float areaLat) {
        this.areaLat = areaLat;
    }

    public float getAreaLng() {
        return areaLng;
    }

    public void setAreaLng(float areaLng) {
        this.areaLng = areaLng;
    }
}
