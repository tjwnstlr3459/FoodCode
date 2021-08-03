package kr.jangboo.minhyeong.calendar.controller;

import java.util.Calendar;

import kr.jangboo.minhyeong.calendar.model.service.Calendar1Service;
import kr.jangboo.minhyeong.calendar.model.vo.Calendar1;
import kr.jangboo.minhyeong.util.PrintUtils;

public class Calendar1Controller {

	public boolean nullCheck(Calendar1 myCld) {
		
		boolean nullCheck;
		Calendar1Service srvc;
		
		nullCheck = false;
		srvc = new Calendar1Service();
		
		nullCheck = srvc.nullCheck(myCld);
		return nullCheck;
	}



	public Calendar insertMyCal(Calendar1 myCld) {

		Calendar1Service srvc;
		Calendar cld;
		
		srvc = new Calendar1Service();
		cld = Calendar.getInstance();
		
		cld = srvc.insertCld(myCld);
		return cld;
	}
}
