package kr.jangboo.junsik.model.vo;

import java.util.Calendar;

public class Date4 {
	public static void main(String[] args) {
		
		// 4. 기본 달력의 현재 날짜에서 년, 월, 주, 날짜의 최소값
		
		//캘린더 및 변수 선언
		Calendar cal = Calendar.getInstance();
		Date dateVo = new Date();
		
		//초기화
		//최소치 (년, 월, 일, 시, 분) 저장
		dateVo.setYear(cal.getActualMinimum(Calendar.YEAR));
		dateVo.setMonth(cal.getActualMinimum(Calendar.MONTH)+1);
		dateVo.setDay(cal.getActualMinimum(Calendar.DATE));
		dateVo.setWeek(cal.getActualMinimum(Calendar.WEEK_OF_YEAR));
		dateVo.setHour(cal.getActualMinimum(Calendar.HOUR));
		dateVo.setMinute(cal.getActualMinimum(Calendar.MINUTE));
		
		//최소치 (년, 월, 일, 시 , 분) 출력
		System.out.printf("년도 : %d년\n",dateVo.getYear());
		System.out.printf("월 :  %d월\n",dateVo.getMonth());
		System.out.printf("일 :  %d일\n",dateVo.getDay());
		System.out.printf("주 : %d주\n",dateVo.getWeek());
		System.out.printf("시간 : %d시\n",dateVo.getHour());
		System.out.printf("분 :  %d분\n",dateVo.getMinute());
		
	}
}
