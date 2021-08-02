package kr.jangboo.junsik.controller;

import java.util.Calendar;

import kr.jangboo.junsik.model.service.DateService6;
public class DateController6 {
	public static void main(String[] args) {
		
		// 6. 전체적인 날짜와 시간을 가져오는 Java 프로그램
		
		//캘린더 및 변수 선언
		Calendar cal = Calendar.getInstance();
		DateService6 service = new DateService6();
		
		if(cal != null) {
			
			service.calDate(cal);
		}else {
			
			service.msg();
		}
	}
}
