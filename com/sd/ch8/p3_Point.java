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
  
  public static void main(String args[]){
      p3_Circle myCircle=new p3_Circle(10,10,5);
      Double myArea=myCircle.getArea();
      System.out.println("Circle Area:"+myArea);
  
  }
}