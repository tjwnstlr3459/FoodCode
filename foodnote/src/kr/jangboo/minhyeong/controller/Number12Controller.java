package kr.jangboo.minhyeong.controller;

import java.util.NoSuchElementException;

import kr.jangboo.minhyeong.model.service.Number12Service;
import kr.jangboo.minhyeong.util.InputUtils;
import kr.jangboo.minhyeong.util.PrintUtils;
import kr.jangboo.minhyeong.view.Number12View;

public class Number12Controller {

	public static void main(String args[]) {
		
		//문제 > 주어진 숫자가 하샤드 숫자인지 아닌지를 확인하는 자바프로그램을 작성하라.
		// 주어진 숫자 % 주어진 숫자의 자릿수 합 = 0 이면 하샤드 숫자이다.
		// ex) 234 > 2 + 3 + 4 = 9, 234 % 9 == 0 인 경우
		
		//1. 변수, 클래스 정의
		String inputValue, msg, exceptionMsg, regPattern;
		boolean resultPattern, resultHarshad;
		Number12Service srvc;
		Number12View view;
		//2. 변수, 클래스 초기화
		inputValue = "";
		msg = "";
		regPattern = "";
		resultPattern = false;
		srvc = new Number12Service();
		//3. 검증, 예외 상황
		try {
			
			//입력 값
			inputValue = "171";
			//숫자만 가능한 정규 표현식
			regPattern = "^[0-9]*$";
			//정규 표현식과 입력 값을 파라미터로 넘겨 패턴분석 후 결과 받아오기 (결과는 true / false를 반환한다.)
			resultPattern = InputUtils.inputValuePatternCheck(regPattern, inputValue);
			//패턴이 일치하는 경우 > 숫자만 포함된 값
			if(resultPattern) {
				
				
			//패턴이 불일치인 경우 > 숫자만 포함되지 않은 값
			}else {
				
				//오류 메세지를 출력 후 프로그램 종료
				msg = "숫자만 입력해주세요!";
				PrintUtils.messageToPrint(msg);
				return;
			}
		}catch(Exception e) {
			
			//exception 메세지 출력 후 프로그램 종료
			exceptionMsg = "[Warning] Program Error : " + e.toString();
			PrintUtils.messageToPrint(exceptionMsg);
			return;
		}
		//4. 비지니스 로직
		//하샤드 숫자인 지 아닌 지 service를 통해 결과를 받아온다.
		resultHarshad = false;
		resultHarshad = srvc.resultToHarshad(inputValue);
		// 결과 전달
		view = new Number12View();
		view.resultToPrint(resultHarshad, inputValue);
		//프로그램 종료
		return;
	}
}
