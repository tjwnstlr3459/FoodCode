package kr.jangboo.minhyeong.method.controller;

import kr.jangboo.minhyeong.method.model.service.Method11Service;

public class Method11Controller {

	public boolean verification(String inputValue) {

		//변수, 클래스 정의
		Method11Service srvc;
		boolean verification;
		//변수, 클래스 초기화
		srvc = new Method11Service();
		verification = false;
		//검증
		verification= srvc.verification(inputValue);
		//비지니스 로직
		//결과 처리
		return verification;
	}

	public String validatePassword(String inputValue) {
		
		//변수, 클래스 정의
		Method11Service srvc;
		String msg;
		//변수, 클래스 초기화
		srvc = new Method11Service();
		msg = "";
		//검증
		//비지니스 로직
		msg = srvc.validatePassword(inputValue);
		//결과 처리
		return msg;
	}

}
