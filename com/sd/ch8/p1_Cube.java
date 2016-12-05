package com.sd.ch8;
public class p1_Cube extends p1_Rectangle{
    protected double height;
    public p1_Cube(double l,double w,double h){
          super(l,w);
          this.height=height;
    }
    public double getHeight(){
          return height;
    }
    public void setSelected(boolean b){
          System.out.print("Cube ");
          isSelected=b;
    }
}