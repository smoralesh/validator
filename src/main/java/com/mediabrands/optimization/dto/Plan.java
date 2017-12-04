package com.mediabrands.optimization.dto;

import javax.validation.constraints.NotBlank;

public class Plan {

    @NotBlank(message = "Region:Must not be empty")
    private String region;
    @NotBlank(message = "Country:Must not be empty")
    private String country;
    @NotBlank(message = "SalesCategory:Must not be empty")
    private String salesCategory;
    @NotBlank(message = "Media Category:Must not be empty")
    private String mediaCategory;

    public Plan() {
    }

    public Plan(String region, String country, String salesCategory, String mediaCategory) {
        this.region = region;
        this.country = country;
        this.salesCategory = salesCategory;
        this.mediaCategory = mediaCategory;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSalesCategory() {
        return salesCategory;
    }

    public void setSalesCategory(String salesCategory) {
        this.salesCategory = salesCategory;
    }

    public String getMediaCategory() {
        return mediaCategory;
    }

    public void setMediaCategory(String mediaCategory) {
        this.mediaCategory = mediaCategory;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", salesCategory='" + salesCategory + '\'' +
                ", mediaCategory='" + mediaCategory + '\'' +
                '}';
    }
}
