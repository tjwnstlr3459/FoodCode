package kr.jangboo.junsik.controller;

import java.util.Calendar;
import java.util.TimeZone;

import kr.jangboo.junsik.model.service.DateService5;
import kr.jangboo.junsik.model.vo.Date;
public class DateController5 {
	public static void main(String[] args) {
		
		// 5. 뉴욕의 현재 시간을 구하는 자바 프로그램
		
		//클래스 및 변수 선언
		Calendar calNewYork;
		DateService5 service;
		Date dateVo;
		String timeZone;
		String meridiem;
		
		//초기화 선언
		calNewYork = Calendar.getInstance();
		service = new DateService5();
		dateVo = new Date();
		timeZone = "America/New_York";
		
		//뉴욕의 시간 저장
		calNewYork.setTimeZone(TimeZone.getTimeZone(timeZone));
		
		//초기화
		//(시, 분, 초, 오전/오후) 저장
		dateVo.setHour(calNewYork.get(Calendar.HOUR));
		dateVo.setMinute(calNewYork.get(Calendar.MINUTE));
		dateVo.setSecond(calNewYork.get(Calendar.SECOND));
		
		//service를 통해 오전 오후값 알아내기
		meridiem = service.amPm(calNewYork);
		
		//오전 오후의 값이 들어있다면 시간 출력
		if(meridiem != null) {
			
			System.out.println("뉴욕의 현재 시간 : " + 
					dateVo.getHour()+ "시  "+ 
					dateVo.getMinute() + "분 " + 
					dateVo.getSecond()+"초 "+
					meridiem);
		}else {
			
			service.msg();
		}
		

	}
}
