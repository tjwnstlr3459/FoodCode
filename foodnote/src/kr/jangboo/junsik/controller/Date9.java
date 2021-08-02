package kr.jangboo.junsik.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date9 {
	public static void main(String[] args) {

		// 9. 각 주의 첫째 날과 마지막 날을 출력
		
		//캘린더 및 클래스 선언
		String firstDate;
		String finalDate;
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd E");
		
		//일중일중에 월요일을 선정
		cal.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
		
		//첫 월요일 날짜 출력
		firstDate = sdf.format(cal.getTime());
		System.out.println(firstDate);
		
		for (int i = 0; i < 6; i++) {
			
			cal.add(Calendar.DATE, 1);
		}
		
		//마지막 요일 날짜 출력
		finalDate = sdf.format(cal.getTime());
		
		System.out.println(finalDate);
	}
}
