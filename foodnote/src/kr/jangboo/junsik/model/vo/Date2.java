package kr.jangboo.junsik.model.vo;

import java.util.Calendar;

public class Date2 {
	public static void main(String[] args) {
		
		// 2. 기본 달력의 정보(년, 월, 일, 시, 분)를 가져와 표시
		
		//캘린더 및 변수 선언
		Calendar cal = Calendar.getInstance();
		Date dateVo = new Date();
		
		//초기화
		//현재 (년, 월, 일, 시, 분) 저장
		dateVo.setYear(Calendar.YEAR);
		dateVo.setMonth(Calendar.MONTH);
		dateVo.setDay(Calendar.DATE);
		dateVo.setHour(Calendar.HOUR);
		dateVo.setMinute(Calendar.MINUTE);
	
		//기본 달력 정보 출력
		System.out.printf("년도 : %d년\n",cal.get(dateVo.getYear()));
		System.out.printf("월 :  %d월\n",cal.get(dateVo.getMonth()));
		System.out.printf("일 :  %d일\n",cal.get(dateVo.getDay()));
		System.out.printf("시간 : %d시\n",cal.get(dateVo.getHour()));
		System.out.printf("분 :  %d분\n",cal.get(dateVo.getMinute()));
		
	}
}
