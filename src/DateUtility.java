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
		GregorianCalendar gc = new GregorianCalendar(year,month-1,1);
		 
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
				 if(day==maxdays[month-1]+1)break;
			 }
			 output = output + "\n";
			 start=0;
		 }
		 
		 return output;
	}
	
	public static int daysBetween(int day, int month, int year, int day2, int month2, int year2){
		GregorianCalendar gc1 = new GregorianCalendar(year,month-1,day);
		GregorianCalendar gc2 = new GregorianCalendar(year2,month2-1,day2);
		
		long DateInMS1 = gc1.getTimeInMillis();
		long DateInMS2 = gc2.getTimeInMillis();
		
		long diff = DateInMS2 - DateInMS1;
		
		diff = diff / (24*60*60*1000);
		
		int output = (int)diff;
		
		return output;
	}
	
	public static int daysBetween(int day, int month, int year){
		
		GregorianCalendar gc =new GregorianCalendar();            
		int tmonth=gc.get(GregorianCalendar.MONTH);            
		int tday=gc.get(GregorianCalendar.DAY_OF_MONTH);
		int tyear=gc.get(GregorianCalendar.YEAR);
		
		return daysBetween(day, month, year, tday, tmonth, tyear);
	}
	
	public static int daysBetween(String day, String month, String year, String day2, String month2, String year2){
		
		int parseD1 = Integer.parseInt(day);
		int parseM1 = Integer.parseInt(month);
		int parseY1 = Integer.parseInt(year);
		int parseD2 = Integer.parseInt(day2);
		int parseM2 = Integer.parseInt(month2);
		int parseY2 = Integer.parseInt(year2);
		
		return daysBetween(parseD1, parseM1, parseY1, parseD2, parseM2, parseY2);
	}
	
	public static int getDayOfWeek(int month, int day, int year){
		GregorianCalendar gc = new GregorianCalendar(year,month-1,day);
		return gc.get(Calendar.DAY_OF_WEEK);
	}
}
