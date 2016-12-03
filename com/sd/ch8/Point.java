package com.sd.ch8;

public class p3_Point{
  private int x;
  private int y;
  public p3_Point(){}
  public p3_Point(int xnew,int ynew){
    this.x=xnew;
    this.y=ynew;
  }
  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }
  public String toString(){
      String msg="("+x+","+y+")";
      return msg;
  }
}