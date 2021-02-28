package com.rku_18fotca11002.mycustomlistview;

public class Item {
    private  String name;
    private  String date;
    private  String number;
    private  String time;
    private int image;

    public  Item(String Name, String Date, String Number, String Time, int Image)
    {
        this.name = Name;
        this.date = Date;
        this.number = Number;
        this.time = Time;
        this.image = Image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
