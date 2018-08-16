package com.example.a18996.weixin;

public class history {
    private int imageId;
    public int getImageId(){
        return imageId;
    }
    private String name;

    public String getName() {
        return name;
    }
    private int bellId;
    public int getBellId() {
        return bellId;
    }
    private String time;
    public String getTime() {
        return time;
    }
    private String dialog;

    public String getDialog() {
        return dialog;
    }

    public history(int imageId, String name, int bellId, String time,String dialog){
        this.imageId=imageId;
        this.bellId=bellId;
        this.name=name;
        this.time=time;
        this.dialog=dialog;
    }

}
