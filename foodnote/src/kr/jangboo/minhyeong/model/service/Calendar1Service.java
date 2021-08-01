package kr.jangboo.minhyeong.model.service;

import java.util.Calendar;

import kr.jangboo.minhyeong.model.vo.Calendar1;

public class Calendar1Service {

	public Calendar insertMyCal(Calendar cld, Calendar1 myCal) {
		
		cld.set(Calendar.YEAR, myCal.getYear());
		cld.set(Calendar.MONTH, myCal.getMonth());
		cld.set(Calendar.DATE, myCal.getDate());
		return cld;
	}

	

	
}
