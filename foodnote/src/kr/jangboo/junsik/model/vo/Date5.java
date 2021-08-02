package kr.jangboo.junsik.model.vo;

import java.util.Calendar;
import java.util.TimeZone;

public class Date5 {
	public static void main(String[] args) {
		
		// 5. 뉴욕의 현재 시간을 구하는 자바 프로그램
		
		//캘린더 및 변수 선언
		Calendar calNewYork = Calendar.getInstance();
		Date dateVo = new Date();
		
		//뉴욕의 시간 저장
		calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		int amPm;
		String meridiem;
		
		//초기화
		//(시, 분, 초, 오전/오후) 저장
		dateVo.setHour(calNewYork.get(Calendar.HOUR));
		dateVo.setMinute(calNewYork.get(Calendar.MINUTE));
		dateVo.setSecond(calNewYork.get(Calendar.SECOND));
		
		amPm = calNewYork.get(Calendar.AM_PM);
		meridiem = "오전/오후";
		
	
		//오전, 오후 구별
		switch (amPm) {
		case 0:
			meridiem = "오전";
			break;
		case 1:
			meridiem = "오후";
			break;
		}

		System.out.println("뉴욕의 현재 시간 : " + 
							dateVo.getHour()+ "시  "+ 
							dateVo.getMinute() + "분 " + 
							dateVo.getSecond()+"초 "+
							meridiem);
	}
}
