package kr.jangboo.minhyeong.model.service;

import java.util.regex.Pattern;

import kr.jangboo.minhyeong.model.vo.Method11;
import kr.jangboo.minhyeong.util.InputUtils;

public class Method11Service {

	public boolean verification(String inputValue) {
		
		if(inputValue == null) {
			
			return false;
		}else {
			
			return true;
		}
	}

	public String validatePassword(String inputValue) {

		int numCount;
		String regPattern, msg;
		InputUtils iU;
		boolean resultMatch;
		
		regPattern = "^[a-zA-Z0-9]{8,16}$";
		iU = new InputUtils();
		resultMatch = false;
		numCount = 0;
		msg = "";
		
		resultMatch = InputUtils.inputValuePatternCheck(regPattern, inputValue);
		if(resultMatch) {
			
			for(int i = 0; i < inputValue.length();i++) {
				
				if(inputValue.charAt(i) >= 48 && inputValue.charAt(i) <= 57) {
					
					numCount++;
					if(numCount >= 2) {
						
						msg = "요구된 유효한 비밀번호 입니다.";
						return msg;
					}
				}
			}
			msg = "유효하지 못한 비밀번호 입니다."; 
		}else {
			
			msg = "유효하지 못한 비밀번호 입니다.";
		}
		return msg;
	}


}
