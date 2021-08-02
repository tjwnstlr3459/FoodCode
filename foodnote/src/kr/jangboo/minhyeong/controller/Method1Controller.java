package kr.jangboo.minhyeong.controller;

import kr.jangboo.minhyeong.model.service.Method1Service;
import kr.jangboo.minhyeong.model.vo.Method1;

public class Method1Controller {

	public int smallestNumber(int firstNum, int secondNum, int thirdNum) {
		
		
		int resultNum;
		Method1 mt1;
		Method1Service srvc;
		
		resultNum = 0;
		srvc = new Method1Service();
		mt1 = new Method1();
		mt1.setFirstNum(firstNum);
		mt1.setSecondNum(secondNum);
		mt1.setThirdNum(thirdNum);
		
		resultNum = srvc.smallestNumber(mt1);
		return resultNum;
	}
}
