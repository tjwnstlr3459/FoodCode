package kr.jangboo.junsik.model.vo;

public class Date {

	int year;
	int month;
	int day;
	int week;
	int hour;
	int minute;
	int second;
	int millisecond;
	int date;
	int dayNum;
	
	
	public Date(int year, int month, int day, int week, int hour, int minute, int second, int millisecond, int date,
			int dayNum) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.week = week;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.millisecond = millisecond;
		this.date = date;
		this.dayNum = dayNum;
	}
	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public int getMillisecond() {
		return millisecond;
	}
	public void setMillisecond(int millisecond) {
		this.millisecond = millisecond;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getDayNum() {
		return dayNum;
	}
	public void setDayNum(int dayNum) {
		this.dayNum = dayNum;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
}
