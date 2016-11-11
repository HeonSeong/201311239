import java.util.ArrayList;
import java.util.List;

class ListExam {
	List<Integer>mylist=new ArrayList<Integer>();
	
	void setNumber(){
	int i=1;
	while(i<=1000){
		if(i%4==0&&i%5!=0){
			mylist.add(i);
		}
		i++;
	}
	System.out.println(mylist);
	}
	
	int sumList(){
		int sum=0;
		for(int i=0;i<mylist.size();i++){
			sum+=mylist.get(i);
			}
		System.out.println("гу╟Х:"+sum);
		return sum;
	}
	public static void main(String[] args) {
		ListExam test1=new ListExam();
		test1.setNumber();
		test1.sumList();
	}
}