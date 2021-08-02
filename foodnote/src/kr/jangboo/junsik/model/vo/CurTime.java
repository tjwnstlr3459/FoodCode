package kr.jangboo.junsik.model.vo;

public class CurTime {

	long curSecond;
	long curMinutes;
	long curHour;
	long curYear;
	int WeekDay;
	
	String month;
	String day;
	public CurTime() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurTime(long curSecond, long curMinutes, long curHour, long curYear, int weekDay, String month, String day) {
		super();
		this.curSecond = curSecond;
		this.curMinutes = curMinutes;
		this.curHour = curHour;
		this.curYear = curYear;
		WeekDay = weekDay;
		this.month = month;
		this.day = day;
	}
	public long getCurSecond() {
		return curSecond;
	}
	public void setCurSecond(long curSecond) {
		this.curSecond = curSecond;
	}
	public long getCurMinutes() {
		return curMinutes;
	}
	public void setCurMinutes(long curMinutes) {
		this.curMinutes = curMinutes;
	}
	public long getCurHour() {
		return curHour;
	}
	public void setCurHour(long curHour) {
		this.curHour = curHour;
	}
	public long getCurYear() {
		return curYear;
	}
	public void setCurYear(long curYear) {
		this.curYear = curYear;
	}
	public int getWeekDay() {
		return WeekDay;
	}
	public void setWeekDay(int weekDay) {
		WeekDay = weekDay;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
}

