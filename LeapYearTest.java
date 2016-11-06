class LeapYearTest{
  static void leapYear(int year){
  if(((year % 4 ==0) && (year % 100 !=0)) ||(year % 400 ==0)){
  System.out.println("Leap Year!");
  }
  else
  System.out.println("Not Leap Year!");
   }
   public static void main(String[] args) {
  leapYear(2016);
   }
}