package com.sd.ch8;
import java.util.ArrayList;

public class Selection{
    static ArrayList<p1_Rectangle> sArr=new ArrayList<p1_Rectangle>();
    Selection(){}
    
    public void select(p1_Rectangle r){
        r.setSelected(true);
        sArr.add(r);
        System.out.println("selected:"+r.isSelected);
     }

     public void print(){
        for(p1_Rectangle r:sArr)
            System.out.println(r.toString());
     }
     
    public static void main(String[]args){
	Selection s=new Selection();
        
	p1_Rectangle re1=new p1_Rectangle(10.0,20.0);
        p1_Rectangle re2=new p1_Rectangle(15.0,30.0);
        p1_Cube ce1=new p1_Cube(10.0,20.0,30.0);
        p1_Cube ce2=new p1_Cube(40.0,50.0,60.0);
      
        s.select(re1);
        s.select(re2);
        s.select(ce1);
        s.select(ce2);
        
        s.print();
        }
   }
  