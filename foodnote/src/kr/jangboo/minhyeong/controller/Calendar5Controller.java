package kr.jangboo.minhyeong.controller;

import kr.jangboo.minhyeong.model.service.Calendar5Service;
import kr.jangboo.minhyeong.model.vo.Calendar5;
import kr.jangboo.minhyeong.util.PrintUtils;

public class Calendar5Controller {
	
	public Calendar5 valueNullCheck(Calendar5 cld5) {
		
		Calendar5Service srvc;

		srvc = new Calendar5Service();
		
		cld5 = srvc.valueNullCheck(cld5);
		return cld5;
	}

	public Calendar5 insertNowTime(Calendar5 cld5) {

		Calendar5Service srvc;
		
		srvc = new Calendar5Service();
		
		cld5 = srvc.insertAreaTime(cld5);
		return cld5;
	}
}
