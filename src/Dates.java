
public class Dates {
	
	private int month = 0;
	private int day = 0;
	private int year = 0; 
	
	private String months[] = new String[12];
	
	public Dates(){
		//Constructor
		months[0] = "January";
		months[1] = "February";
		months[2] = "March";
		months[3] = "April";
		months[4] = "May";
		months[5] = "June";
		months[6] = "July";
		months[7] = "August";
		months[8] = "September";
		months[9] = "October";
		months[10] = "November";
		months[11] = "December";
 	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
	public String getMonthName(){
		return months[month-1];
	}
	
}
