import ch.aplu.turtle.*;
class Vane {
	static void makeSwirlSquare(int size,int bigger,int turns,double degree){
		Turtle t1=new Turtle();
		for(int i=0;i<turns;i++){
		  if(i%2!=0){
		    size+=bigger;
		    }
		   t1.forward(size);
		   t1.right(degree);
		 }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5;
		int bigger=15;
		int turns=20;
		double degree=90.0;
		makeSwirlSquare(size, bigger, turns, degree);
	}
}