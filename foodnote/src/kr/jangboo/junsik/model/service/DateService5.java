package kr.jangboo.junsik.model.service;

import java.util.Calendar;

public class DateService5 {

	public String amPm(Calendar calNewYork) {
		String meridiem;
		int amPm;
		
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
		return meridiem;
	}
	
	public void msg() {
		System.out.println("시간이 정확하지 않습니다.");
	}
}
