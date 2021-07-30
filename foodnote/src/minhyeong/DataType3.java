package minhyeong;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import minhyeong.util.InputUtils;
import minhyeong.util.PrintUtils;

public class DataType3 {

	public static void main(String args[]) {
		
		//문제 3 > 0 ~ 1000 사이의 정수를 입력받아 모든 숫자를 더하는 자바프로그램을 작성하라 
		//ex) 555 > 5+5+5
		//
		
		//1. 변수, 클래스 정의
		InputUtils iO;
		String inputMessage, inputValue, errorMsg;		//입력받은 값을 대입할 변수, 에러 메세지 변수
		boolean inputCheck;								//입력값이 프로그램 로직에 정상인 값인지 아닌지 판별하는 변수
		int resultInteger;								//변환 공식까지 완료된 결과를 대입할 변수
		
		//2. 변수, 클래스 초기화
		iO = new InputUtils();
		inputMessage = "input Integer : ";
		inputValue = "";
		inputCheck = false;
		errorMsg = "";
		resultInteger = 0;
		
		//3. 검증, 예외처리 단계
		//입력 받기위한 문장을 전달하고 값 받아오는 메소드 호출
		inputValue = InputUtils.inputMessageToPrint(inputMessage);
		//입력값에서 공백을 제거 메소드 호출
		inputValue = InputUtils.replaceInput(inputValue);
		//입력값이 숫자만 존재하는지 아닌지 판별 메소드 호출
		inputCheck = iO.inputWhoIntegerCheck(inputValue);
		
		if(inputCheck) {
		
			inputCheck = false;
			//매개변수가 0 ~ 1000 사이의 숫자인지 판별 > 메소드 내에서 if문으로 조건을 주기 때문에 음수도 제외
			inputCheck = zeroBetweenThousand(inputValue);
			//0~1000사이인 경우
			if(inputCheck) {
				
			//0~1000을 벗어난 경우
			}else {
				
				errorMsg = "please 0 between 1000 integer!";
				PrintUtils.messageToPrint(errorMsg);
				return;
			}
		}else {
			
			errorMsg = "please input integer...";
			PrintUtils.messageToPrint(errorMsg);
			return;
		}
		
		//4. 비지니스 로직 및 결과 처리
		
		//입력된 정수 하나하나를 더하는 메소드 호출
		resultInteger = intPlusBetween(inputValue);
		//결과 처리
		PrintUtils.messageToPrint("The sum of all digits in "+inputValue+" is "+resultInteger);
		//return
	}
	
	

	//공백을 제거하고 숫자만 존재하는 문자열을 판별한 뒤 0 ~ 1000사이의 숫자인지 판별하는 메소드
	public static boolean zeroBetweenThousand(String inputValue) {
		
		int strToInteger;
		
		strToInteger = 0;
		
		//데이터 타입을 문자열에서 정수로 변환하는 static메소드 호출
		strToInteger = CastDataType.stringToInteger(inputValue);
		
		if(0 < strToInteger && strToInteger < 1000) {
			
			return true;
		}else {
			
			return false;
		}
	}
	
	//문자열에서 숫자로 변환하면서 더해주는 메소드
	public static int intPlusBetween(String inputValue) {
		
		int sumInteger;
		char strOneChar;
		String charToStr;
		
		sumInteger = 0;
		
		for(int i = 0; i < inputValue.length(); i++) {
			
			strOneChar = ' ';
			charToStr = "";
			
			strOneChar = inputValue.charAt(i);
			charToStr = String.valueOf(strOneChar);
			sumInteger += Integer.parseInt(charToStr);
		}
		return sumInteger;
	}
}
