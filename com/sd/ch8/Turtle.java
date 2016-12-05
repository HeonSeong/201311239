package com.sd.ch8;

public class Turtle {
  protected int nLimbs=4;
  protected String food;
  public void setFood(String f){
    this.food=f;
   }
   public void eat(){
      System.out.println("Turtle eats "+food);
   }

   public void setLimbs(int number){
    this.nLimbs=number;
 
   }

   public void getLimbs(){
	System.out.println("Turtle nLimbs : "+ nLimbs); 
 
   }
   public static void main(String args[]){
	Turtle t1=new Turtle();
	SeaTurtle st1=new SeaTurtle();
	LandTurtle lt1=new LandTurtle();

	st1.setFood("seaweeds");
	lt1.setFood("plants");

	t1.eat();
	st1.eat();
	lt1.eat();

	st1.setLimbs(4);
	lt1.setLimbs(6);
	
	st1.getLimbs();
	lt1.getLimbs();
	
	}
}