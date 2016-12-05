package com.sd.ch8;

public class p1_Rectangle{
   protected double length;
   protected double width;
   protected boolean isSelected;
   
   public p1_Rectangle(double l,double w){
        this.length=l;
        this.width=w;
   }
   public double getLenth(){
        return length;
   }
   public double getWidth(){
        return width;
   }
  
   public void setSelected(boolean b){
          System.out.print("Rectangle ");
          isSelected=b;
          
   }
   public boolean getSelected(){
      return isSelected;
   }

}