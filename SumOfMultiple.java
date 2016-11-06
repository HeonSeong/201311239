class SumOfMultiple {
   static private int number1=0;
   static private int number2=0;
   
   SumOfMultiple(int number1,int number2){
        this.number1=number1;
        this.number2=number2;
   }
   static void Sum(){
   int sum = 0;
   for(int i=1;i<=1000;i++){
      if(i%number1 ==0 || i% number2 ==0){
        sum += i;
      }
   }
   System.out.println("sum: "+sum);
   }
   public static void main(String[] args) {
       SumOfMultiple t1=new SumOfMultiple(3,5);
      t1.Sum();
   }
}