package kr.jangboo.junsik.controller;

import java.util.Calendar;

import kr.jangboo.junsik.model.service.DateService9;


public class DateController9 {
	public static void main(String[] args) {

		// 9. 각 주의 첫째 날과 마지막 날을 출력
		
		//클래스 및 변수 선언
		Calendar cal = Calendar.getInstance();
		DateService9 service = new DateService9();
		int week;
		int weekNum;
		
		//초기화
		week = Calendar.DAY_OF_WEEK;
		weekNum = Calendar.MONDAY;
		
		//week와 weekNum의 값 검사
		int result = service.check(week,weekNum);
		
		//검사한 결과값 리턴하여 출력( 1: 적합, 0: 부적합)
		if(result>0) {
			
			//월과 요일값을 캘린더에 저장
			cal.set(week,weekNum);
			
			service.calDate(cal);
		}else {
			
			service.msg();
		}
	}
}














