public class EnumDay {
	  enum Day{SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
	   

	public static void main(String[] args){
	Day day=Day.TUESDAY;
	System.out.println(day);
	String msg=null;
	switch (day) {
	    case MONDAY: 
	    case TUESDAY: 
	    case WEDNESDAY:
	    case THURSDAY:
	    case FRIDAY: msg="schooling"; break;
	    case SATURDAY: 
	    case SUNDAY: msg="off"; break;
	    default: msg="what is today?"; break;
		}
		System.out.println(msg);

		}
	}