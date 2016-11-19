import java.util.ArrayList;
import java.util.Collections;

public class Student {
	private String name;
	private int number;
	Student(String name, int number){
	this.name = name;
	this.number = number;
	}
	public String getName(){
	return name;
	}
	 static void studentSort() {
		 ArrayList<String> studentNameList = new ArrayList<String>();
		Student s1 = new Student("Student1",1);
		Student s2 = new Student("Student2",2);
		Student s3 = new Student("Student3",1);
		Student s4 = new Student("Student6",2);
		Student s5 = new Student("Student5",1);
		Student s6 = new Student("Student4",2);
		studentNameList.add(s1.getName());
		studentNameList.add(s2.getName());
		studentNameList.add(s3.getName());
		studentNameList.add(s4.getName());
		studentNameList.add(s5.getName());
		studentNameList.add(s6.getName());
		Collections.sort(studentNameList);
		System.out.println(studentNameList);
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 studentSort();
	}

}
