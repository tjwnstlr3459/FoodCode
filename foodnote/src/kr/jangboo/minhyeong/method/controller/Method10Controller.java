package kr.jangboo.minhyeong.method.controller;

import kr.jangboo.minhyeong.method.model.service.Method10Service;

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
