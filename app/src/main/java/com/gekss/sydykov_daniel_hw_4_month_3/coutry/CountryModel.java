package com.gekss.sydykov_daniel_hw_4_month_3.coutry;

public class CountryModel {

    private String name;
    private String image;

    public CountryModel(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
