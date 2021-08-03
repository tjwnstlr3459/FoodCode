package kr.jangboo.junsik.controller;


import kr.jangboo.junsik.model.service.NumberService10;
import kr.jangboo.junsik.model.util.InputNumber;
import kr.jangboo.junsik.model.util.PrintMessage;

public class NumberController10 {
	public static void main(String[] args) {
		
		// 10.주어진 숫자가 행복한 숫자인지 불행한 숫자인지 구별하는 자바프로그램

		// [행복한 숫자]란 :
		// ex)  19 숫자를 하나,하나 로 나눈다 ( 1, 9 )
		// 		1의 제곱 + 9의 제곱 = 82
		//		8의 제곱 + 2의 제곱 = 68
		//		6의 제곱 + 8의 제곱 = 100
		// 		1의 제곱 + 0의제곱 + 0의 제곱 = 1
		// 		위같이 무한루프에 빠지지 않고 1로 떨어지는 값이 [행복한 숫자]이다
		
		//클래스 및 변수 선언
		InputNumber inputNumber;	//숫자 및 정규식을 하기위한 util 클래스
		NumberService10 service;	//10번에 대한 기능로직
		boolean happyNumberBoolean;	//happyNuber인지에 대한 결과값
		int inputNum;				//사용자에게 받은 숫자
		PrintMessage printErrerMessage;	//에러 출력을 위한 클래스
		
		//초기화
		service = new NumberService10();
		inputNumber = new InputNumber();
		printErrerMessage = new PrintMessage();
		
		//사용자로부터 정수 받기 + 정규표현식
		String inputStr = inputNumber.inputStr();
		
		while(true) {
					
			//정규표현식에 적합한지
			if(inputNumber.isReqularExpNum(inputStr)) {
				
				//적합할 경우 inputNum에 타입변환하여 저장
				inputNum = Integer.parseInt(inputStr);
				break;
			}else {
				
				//부적합한 정규표현식일 경우
				String message = "정수를 입력하세요";
				printErrerMessage.printMessage(message);
			}
		}
		
		//사용자로부터 받은 값 happyNumber인지 확인하는 메소드
		happyNumberBoolean = service.isHappyNumberCheck(inputNum);
		
		//확인한 값이 happyNumber인지 [참/거짓]  출력
		service.isNumberValuePrint(happyNumberBoolean);	
	}
}
