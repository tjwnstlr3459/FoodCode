package kr.jangboo.minhyeong.controller;

import kr.jangboo.minhyeong.model.service.Method10Service;

public class Method10Controller {

	public String checkLeapYear(int inputYear) {
		
		Method10Service srvc;
		String resultMsg;
		
		srvc = new Method10Service();
		resultMsg = "";
		
		resultMsg = srvc.checkLeapYear(inputYear);
		return resultMsg;
	}

}
