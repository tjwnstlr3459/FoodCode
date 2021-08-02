package kr.jangboo.minhyeong.model.service;

import java.util.Calendar;

import kr.jangboo.minhyeong.model.vo.Calendar1;

public class Calendar1Service {

	public boolean nullCheck(Calendar1 myCld) {
		
		if(myCld == null) {
			
			return false;
		}else {
			
			return true;
		}
	}
	public Calendar insertCld(Calendar1 myCld) {
		
		Calendar cld;
		
		cld = Calendar.getInstance();
		
		cld.set(Calendar.YEAR, myCld.getYear());
		cld.set(Calendar.MONTH, myCld.getMonth());
		cld.set(Calendar.DATE, myCld.getDate());
		return cld;
	}


	

	
}
