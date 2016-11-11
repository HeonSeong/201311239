import java.util.ArrayList;
import java.util.List;

class ListExam {

	void setNumber(ArrayList<Integer> aList){
	int i=1;
	while(i<=1000){
		if(i%4==0&&i%5!=0){
			aList.add(i);
		}
		i++;
	}
	System.out.println(aList);
	}
	
	int sumList(ArrayList<Integer> aList){
		int sum=0;	
		int maxiter=aList.size();
		for(int i=0;i<maxiter;i++){
			sum+=aList.get(i);
			}
		System.out.println("합계:"+sum);
		return sum;
	}
	public static void main(String[] args) {
    ArrayList<Integer>mylist=new ArrayList<Integer>();
		ListExam test1=new ListExam();
		test1.setNumber(mylist);
		test1.sumList(mylist);
	}
}
