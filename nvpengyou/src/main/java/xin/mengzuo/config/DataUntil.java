package xin.mengzuo.config;

import java.util.Calendar;

public class DataUntil {

	private DataUntil(){
		
	}
	
	public static String getYearMonthDay() {
		 Calendar calendar = Calendar.getInstance();
			StringBuffer sDay = new StringBuffer();
			sDay.append(String.format("%04d", calendar.get(Calendar.YEAR)));
			sDay.append(String.format("%02d", calendar.get(Calendar.MONTH)+1));
			sDay.append(String.format("%02d", calendar.get(Calendar.DATE)));
            return sDay.toString();	
	}
	
	public static String getDataFormat(String yearMonthDay) {
		String year = yearMonthDay.substring(0, 4);
		String month = yearMonthDay.substring(4, 6);
		String day = yearMonthDay.substring(6);
		
		return year+"-"+month+"-"+day;
		
	}
	public static String getYearMonth(String yearMonthDay) {
		return yearMonthDay.substring(0, 6);
	}
	
	public static String getDataYear(String yearMonthDay) {
		String year = yearMonthDay.substring(0, 4);
		String month = yearMonthDay.substring(4, 6);
	
		
		return year+"-"+month;
		
	}
	public static String getYearMonth() {
		 Calendar calendar = Calendar.getInstance();
			StringBuffer sDay = new StringBuffer();
			sDay.append(String.format("%04d", calendar.get(Calendar.YEAR)));
			sDay.append(String.format("%02d", calendar.get(Calendar.MONTH)+1));
			
           return sDay.toString();	
	}
	
}
