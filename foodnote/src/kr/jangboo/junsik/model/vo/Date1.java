package kr.jangboo.junsik.model.vo;

import java.util.Calendar;

public class Date1 {
	public static void main(String[] args) {
		
		// 1. Calendar 클래스를 사용하여 Date 객체를 생성
		
		//캘린더 및 클래스 선언
		Calendar cal = Calendar.getInstance();	
		Date dateVo = new Date();

		//날짜 지정
		dateVo.setYear(2021);
		dateVo.setMonth(8);
		dateVo.setDate(2);
		dateVo.setDayNum(2);

		
		//날짜 대입
		cal.set(Calendar.YEAR, dateVo.getYear());
		cal.set(Calendar.MONTH, dateVo.getMonth());
		cal.set(Calendar.DATE, dateVo.getDate());
		cal.set(Calendar.DAY_OF_WEEK, dateVo.getDayNum());
		
		//날짜 출력
		System.out.println(cal.getTime());
		
	}
}
