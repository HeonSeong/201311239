import java.util.Calendar;
class CalendarTest {
	static int count;
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		for(int i=1901;i<=2000;i++){
			for(int j=0;j<=11;j++){
				c.set(i, ((Calendar.MONTH)+j), 1);	
				int day_of_week=c.get(Calendar.DAY_OF_WEEK);
				if(day_of_week==1){
					count++;
				}
			}
				
		}
		System.out.println(count);
	}
}