package kr.jangboo.junsik.controller;


import kr.jangboo.junsik.model.service.NumberService12;
import kr.jangboo.junsik.model.util.InputNumber;
import kr.jangboo.junsik.model.util.PrintMessage;

public class NumberController12 {
	public static void main(String[] args) {
		
		// 12. 숫자가 하샤드 숫자인지 아닌지를 확인하는 자바 프로그램을 작성
		
		// 1) 하샤드 숫자란? :
		//	ex) 200 -> 2, 0, 0 으로 분리
		//		2 + 0 + 0 = 2
		//		200 / 2 == 0
		//		[0] 으로 나눠져야지 하샤드 숫자
		
		//클래스 및 변수 선언
		InputNumber inputNumber;		//숫자 및 정규식을 하기위한 util 클래스
		NumberService12 service;		//12번에 대한 기능로직
		PrintMessage printErrerMessage;
		boolean HarshadNumberValue;
		String inputStr;
		int inputNum;
		
		//초기화
		inputNumber = new InputNumber();
		service = new NumberService12();
		printErrerMessage = new PrintMessage();
		
		
		//사용자에게 제대로 된 값을 받기 위한 while문
		while(true) {
			
			//사용자에게 입력값 받기
			inputStr = inputNumber.inputStr();
			
			//입력값이 정규표현식에 맞는 지 확인
			if(inputNumber.isReqularExpNum(inputStr)) {
				
				//정규표현식에 적합하면 inputNum에 대입
				inputNum = Integer.parseInt(inputStr);
				break;
			
			//정규표현식 부적합 하면 while문 반복
			}else {
				
				//부적합한 정규표현식일 경우
				String message = "정수로 입력하여 주세요";
				printErrerMessage.printMessage(message);
			}
		}
		//사용자에게 받은값 [하샤드 숫자]인지 [참/거짓]으로 확인하는 메소드
		HarshadNumberValue = service.isHarshadNumberCheck(inputNum,inputStr);
		
		//확인된값 출력문으로 이동
		service.HarshadNumberValuePrint(HarshadNumberValue);

	}
}
