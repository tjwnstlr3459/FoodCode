package kr.jangboo.minhyeong.number.controller;

import java.util.ArrayList;
import java.util.List;

import kr.jangboo.minhyeong.number.model.service.Number25Service;
import kr.jangboo.minhyeong.number.view.Number25View;
import kr.jangboo.minhyeong.util.PrintUtils;

public class Number25Controller {

	public static void main(String args[]) {
		
		//문제 25 > Pell Series 의 first 15개 출력하는 자바 프로그램 작성
		
		//1. 변수, 클래스 정의
		long length, maxLength;
		String msg;
		Number25Service srvc;
		Number25View view;
		List<Integer> pellNumberList;
		//2. 변수, 클래스 초기화
		length = 15;
		maxLength = Long.MAX_VALUE;
		msg = "";
		srvc = new Number25Service();
		pellNumberList = new ArrayList<Integer>();
		//3. 검증, 예외상황
		if(length < 1 && length > maxLength) {
			
			msg = "입력 오류!\n1 ~ " + maxLength + "사이의 정수만 입력해주세요.";
			PrintUtils.messageToPrint(msg);
			return;
		}else if(pellNumberList == null) {
			
			msg = "[RuntimeException] ProgramError : NullPointerException";
			PrintUtils.messageToPrint(msg);
			return;
		}
		//4. 비지니스 로직
		pellNumberList = srvc.insertPellNumberToList(length);
		// 결과
		view = new Number25View();
		view.printPellNumber(pellNumberList);
		//프로그램 종료 return
		return;
	}
}
