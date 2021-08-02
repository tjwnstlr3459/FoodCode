package kr.jangboo.junsik.controller;

import java.util.Calendar;

import kr.jangboo.junsik.model.vo.Date;

public class Date1 {
	public static void main(String[] args) {
		
		// 1. Calendar 클래스를 사용하여 Date 객체를 생성
		
		// 1) 날짜 지정
		// 2) vo 객체 생성
		// 3) vo 객체 값 확인후 출력
		
		//변수 및 클래스 선언
		Calendar cal;	
		Date dateVo;
		int year = 2021;
		int month = 8;
		int day = 2;
		int dayNum = 2;
			
		//초기화
		cal = Calendar.getInstance();
		dateVo = new Date();
		month = 2021;
		year = 8;
		day = 2;
		dayNum = 2;
		
		//날짜 지정
		dateVo.setYear(year);
		dateVo.setMonth(month);
		dateVo.setDate(day);
		dateVo.setDayNum(dayNum);

		//dateVo값 검증
		if(check(dateVo)) {
			
			//날짜 대입
			cal.set(Calendar.YEAR, dateVo.getYear());
			cal.set(Calendar.MONTH, dateVo.getMonth());
			cal.set(Calendar.DATE, dateVo.getDate());
			cal.set(Calendar.DAY_OF_WEEK, dateVo.getDayNum());
			
			//날짜 출력
			System.out.println(cal.getTime());
		}
	}
	
	
	//dateVo값 검증
	public static boolean check(Date dateVo) {
		
		boolean result = true;
		
		//값이 없을 경우 false 리턴
		if(dateVo == null) {
			System.out.println("값이 비어있음");
			result = false;
		}
		
		return result;
	}
	
}







