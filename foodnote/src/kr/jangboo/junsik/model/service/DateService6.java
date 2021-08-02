package kr.jangboo.junsik.model.service;

import java.util.Calendar;

import kr.jangboo.junsik.model.vo.Date;

public class DateService6 {

	public void calDate(Calendar cal) {
		
		Date dateVo = new Date();
		int year;
		int month;
		int date;
		int week;
		int hour;
		int minute;
		int second;
		int millisecond;
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH)+1;
		date = cal.get(Calendar.DATE);
		week = cal.get(Calendar.WEEK_OF_YEAR);
		hour = cal.get(Calendar.HOUR);
		minute = cal.get(Calendar.MINUTE);
		second = cal.get(Calendar.SECOND);
		millisecond = cal.get(Calendar.MILLISECOND);
		
		//초기화
		dateVo.setYear(year);
		dateVo.setMonth(month);
		dateVo.setDay(date);
		dateVo.setWeek(week);
		dateVo.setHour(hour);
		dateVo.setMinute(minute);
		dateVo.setSecond(second);
		dateVo.setMillisecond(millisecond);
		
		//날짜 출력
		System.out.print("현재 전체적인 날짜 및 시간 : ");
		System.out.print(
		dateVo.getYear() + "년 "
		+ dateVo.getMonth() + "월 "
		+ dateVo.getDay() + "일 "
		+ dateVo.getHour() + "시 " 
		+ dateVo.getMinute() + "분 "
		+ dateVo.getSecond() + "초 " 
		+ dateVo.getMillisecond() + "밀리초" 
		);
	}
	
	public void msg() {
		
		System.out.println("cal의 값이 비어있습니다.");
	}
}










