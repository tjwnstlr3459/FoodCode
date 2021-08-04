package kr.jangboo.minhyeong.method.controller;

import kr.jangboo.minhyeong.method.model.service.Method1Service;
import kr.jangboo.minhyeong.method.model.vo.Method1;

public class Method1Controller {

	public int smallestNumber(Method1 mt1) {
		
		
		int resultNum;
		Method1Service srvc;
		
		resultNum = 0;
		srvc = new Method1Service();
		
		
		resultNum = srvc.smallestNumber(mt1);
		return resultNum;
	}
}
