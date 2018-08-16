package com.example.a18996.weixin;

public class Connect {
    private int imageId;
    private String name;

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
    public  int getImageId() {
        return imageId;
    }

    public  String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Connect(int imageId,String name){
        this.imageId=imageId;
        this.name=name;
    }
}