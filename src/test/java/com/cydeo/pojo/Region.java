package com.cydeo.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Region {

    //region_id
    //if your jsonkey and variable name not matching, you can map it with jsonProperty
    @JsonProperty("region_id")
    private int rId;
    @JsonProperty("region_name")
    private String region_name;
    @JsonProperty("links")
    private List<Link> links;

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    @Override
    public String toString() {
        return "Region{" +
                "rId=" + rId +
                ", region_name='" + region_name + '\'' +
                ", links=" + links +
                '}';
    }
}
