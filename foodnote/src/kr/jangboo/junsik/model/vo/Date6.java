package kr.jangboo.junsik.model.vo;

import java.util.Calendar;
import java.util.TimeZone;

public class Date6 {
	public static void main(String[] args) {
		
		// 6. 전체적인 날짜와 시간을 가져오는 Java 프로그램
		
		//캘린더 및 변수 선언
		Calendar cal = Calendar.getInstance();
		Date dateVo = new Date();
		
		//초기화
		dateVo.setYear(cal.get(Calendar.YEAR));
		dateVo.setMonth(cal.get(Calendar.MONTH)+1);
		dateVo.setDay(cal.get(Calendar.DATE));
		dateVo.setWeek(cal.get(Calendar.WEEK_OF_YEAR));
		dateVo.setHour(cal.get(Calendar.HOUR));
		dateVo.setMinute(cal.get(Calendar.MINUTE));
		dateVo.setSecond(cal.get(Calendar.SECOND));
		dateVo.setMillisecond(cal.get(Calendar.MILLISECOND));
		
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
}
