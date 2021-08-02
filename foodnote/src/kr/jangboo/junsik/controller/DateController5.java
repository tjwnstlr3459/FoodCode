package kr.jangboo.junsik.controller;

import java.util.Calendar;
import java.util.TimeZone;

import kr.jangboo.junsik.model.service.DateService5;
import kr.jangboo.junsik.model.vo.Date;
public class DateController5 {
	public static void main(String[] args) {
		
		// 5. 뉴욕의 현재 시간을 구하는 자바 프로그램
		
		//캘린더 및 변수 선언
		Calendar calNewYork = Calendar.getInstance();
		DateService5 service = new DateService5();
		Date dateVo = new Date();
		String timeZone;
		String meridiem;
		
		//초기화 선언
		timeZone = "America/New_York";
		
		
		//뉴욕의 시간 저장
		calNewYork.setTimeZone(TimeZone.getTimeZone(timeZone));
		
		//초기화
		//(시, 분, 초, 오전/오후) 저장
		dateVo.setHour(calNewYork.get(Calendar.HOUR));
		dateVo.setMinute(calNewYork.get(Calendar.MINUTE));
		dateVo.setSecond(calNewYork.get(Calendar.SECOND));
		
		// am, pm 가져오기
		meridiem = service.amPm(calNewYork);
		
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
