package com.sd.ch8;

public abstract class p6_Shape{
  public String name="Shape";
  public abstract double calcArea();
  public abstract double calcPerimeter();
  public String getName(){ return this.name;}
  public String toString(){
      return "Shape..."+super.toString();
     }


  public static void main(String args[]){
	
	p6_Shape r=new p6_Rectangle(4,5);
	p6_Shape c=new p6_Circle(3);
	System.out.println("Rectangle Area: "+r.calcArea());
	System.out.println("Circle Area: "+c.calcArea());
	
	
	System.out.println();
	if(r instanceof p6_Shape && r instanceof p6_Rectangle){
      System.out.println(r.toString());
  }

  if(c instanceof p6_Shape&& c instanceof p6_Circle){
      System.out.println(c.toString());
  }
    System.out.println();
  if(r.getClass()==p6_Rectangle.class)
    System.out.println("r.getClass==p6_Rectangle.class is true");
    
  if(r.getClass()==p6_Shape.class)
    System.out.println("r.getClass==p6_Shape.class is true");
    else 
    System.out.println("r.getclass==p6_Shape.class is false");
    
  
 
    System.out.println();
  p6_Shape[] s=new p6_Shape[2];
	s[0]=r;
	s[1]=c;
	 
	 for(p6_Shape my:s){
    if(my instanceof p6_Rectangle){
        System.out.println(my.toString());
    }else if(my instanceof p6_Circle){
        System.out.println(my.toString());
     }
  }
  
  for(p6_Shape my:s) 
    System.out.println(my.toString());
    
     
  
}
}