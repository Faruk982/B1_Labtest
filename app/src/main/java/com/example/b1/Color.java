package com.example.b1;

public class Color {
   public String color;
   public Color(String name){
       this.color=name;
   }
   public String showColor(){
       String ss="The Color is "+this.color;
       return ss;
   }
}
