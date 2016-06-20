import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUtility {
	private static int[] maxdays = {31,28,31,30,31,30,31,31,30,31,30,31};
	private static String days[] = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
	private static String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	
	public static boolean isLeapYear(int year){
		if(year%4 != 0)return false;
		if(year%100 == 0 && year%400 != 0)return false;
		return true;
	}
	
	public static int getDaysInMonth(int month, int year){
		if(month == 2 && isLeapYear(year))return 29;
		return maxdays[month-1];
	}
	
	public static String toString(int month, int day , int year, char delimiter){
		return ("" + month + delimiter + day + delimiter + year);
	}
	
	public static String displayCalendar(int month, int year){
		GregorianCalendar gc = new GregorianCalendar(year,month,1);
		 
		String output = ("\t\t\t" + months[month]+ " " + year + "\n");
		 for(int i = 0; i < 7; i++){
			 output = output+(days[i] + "\t");
		 }
		 
		 output=output+"\n";
		 
		 int start = gc.get(Calendar.DAY_OF_WEEK);
		 
		 for(int i = 0; i < start; i++){
			 output = output+("\t");
		 }
		 int day = 1;
		 
		 for(int i = 0; i < 6; i++){
			 for(int j = start; j < 7; j++){
				 output = output+(day + "\t");
				 day++;
				 if(day==maxdays[month]+1)break;
			 }
			 output = output + "\n";
			 start=0;
		 }
		 
		 return output;
	}
}
