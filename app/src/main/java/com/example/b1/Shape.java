package com.example.b1;

public class Shape {
    public String name;
    public  float area;
    public Shape(String name, float area){
        this.name=name;
        this.area=area;
    }
    public String ShowShape(){
        String ss="This is "+this.name+" and the area is "+this.area;
        return ss;
    }
}
