package com.sd.ch8;
import java.util.ArrayList;

public class Selection{
    static ArrayList<Rectangle> sArr=new ArrayList<Rectangle>();
    Selection(){}
    public void select(Rectangle r){
        r.setSelected(true);
        sArr.add(r);
        System.out.println("selected:"+r.isSelected);
     }
     public void print(){
        for(Rectangle r:sArr)
            System.out.println(r.toString());
     }
     
    public static void main(String[]args){
        Rectangle re1=new Rectangle(10.0,20.0);
        Rectangle re2=new Rectangle(15.0,30.0);
        Cube ce1=new Cube(10.0,20.0,30.0);
        Cube ce2=new Cube(40.0,50.0,60.0);
      
        Selection s=new Selection();
        
        s.select(re1);
        s.select(re2);
        s.select(ce1);
        s.select(ce2);
        
        s.print();
        }
   }
  