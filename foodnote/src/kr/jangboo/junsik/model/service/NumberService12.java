package kr.jangboo.junsik.model.service;

import java.util.ArrayList;

import kr.jangboo.junsik.model.util.PrintMessage;

public class NumberService12 {

	//사용자에게 받은값 [하샤드 숫자]인지 [참/거짓]으로 확인하는 메소드
	public boolean isHarshadNumberCheck(int inputNum, String inputStr) {
		
		//클래스 및 변수 선언
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int sum;
		int size;
		boolean result;
		
		//초기화
		sum = 0;
		size = 0;
		result = false;
		
		
		//사용자에게 입력받은 값 길이 확인
		size = inputStr.length();
		
		//입력받은 길이만큼 반복
		for (int i = 0; i < size; i++) {
			
			//입력받은 값을 하나씩 잘라서 배열에 저장
			arrList.add(i, Integer.parseInt(inputStr.substring(i, i+1)));
			
			//하나씩 자른 숫자들의 합
			sum += arrList.get(i);
		}
		
		//초기값 % 하나씩 자른 숫자들의 합 == 0 이면 하샤드 숫자
		if(inputNum%sum==0) {
			
			result = true;
		}
		return result;
	}
	
	
	
	//하샤드 숫자가 [참/거짓]에 따른 출력
	public void HarshadNumberValuePrint(boolean harshadNumberValue) {
		
		//하샤드 숫자인지 출력을 위한 [출력메소드]
		PrintMessage printMessage = new PrintMessage();
		String message;
		
		
		//하샤드 숫자[참]
		if(harshadNumberValue) {
			message = "하샤드 숫자입니다.";
			
		//하샤드 숫자[거짓]
		}else {
			message = "하샤드 숫자가 아닙니다.";
		}
	}
}
