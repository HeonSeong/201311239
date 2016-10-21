public class EnumDay {
  enum Day{SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
   

public static void main(String[] args){
int day=Day.TUESDAY.ordinal();
System.out.println(day);
String msg=null;
switch (day) {
    case 0: 
    case 1: 
    case 2: 
    case 3:
    case 4: msg="schooling"; break;
    case 5:
    case 6:  msg="off"; break;
    default: msg="what is today?"; break;
	}
	System.out.println(msg);

	}
}