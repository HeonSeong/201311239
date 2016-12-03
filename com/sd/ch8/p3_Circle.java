package com.sd.ch8;

public class p3_Circle extends p3_Point{
    private double radius;
    public p3_Circle(){}
    public p3_Circle(int xnew, int ynew, double rnew){
        super(xnew,ynew);
        this.radius=rnew;
    }
    public double getRadius(){
        return radius;
    }
    public double getCircumference(){
        return 2*Math.PI*getRadius();
    }
    public double getArea(){
        return Math.PI*getRadius()*getRadius();
    }
 }