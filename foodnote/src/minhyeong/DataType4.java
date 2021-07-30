package minhyeong;

import java.util.HashMap;

import minhyeong.util.InputUtils;
import minhyeong.util.PrintUtils;

public class DataType4 {
	
	public static void main(String args[]) {
		
		//문제 4 > 분을 정수로 받아 년과 일로 변환해 출력하는 프로그램을 작성하라
		
		//1. 변수,클래스 정의
		HashMap<String, Integer> dateMap;
		InputUtils iO;
		String inputMessage, inputValue, errorMsg;
		boolean inputCheck;
		int year, day;
		long minutes;
		
		//2. 변수, 클래스 초기화
		dateMap = new HashMap<String, Integer>();
		iO = new InputUtils();
		inputMessage = "input Minutes : ";
		inputValue = "";
		inputCheck = false;
		errorMsg = "Please input Integer...";
		year = 0;
		day = 0; 
		minutes = 0;
		
		//3. 검증, 예외 처리 단계
		//메세지를 전달해서 입력을 받아오는 메소드 호출
		inputValue = InputUtils.inputMessageToPrint(inputMessage);
		//공백이 존재할 수도 있기 때문에 제거하는 메소드 호출
		inputValue = InputUtils.replaceInput(inputValue);
		//공백제거 후 정수만 존재하는 지 판별하는 메소드 호출
		inputCheck = iO.inputWhoIntegerCheck(inputValue);
		
		//판별 후 프로그램이 실행되기에 적합한 값인 경우
		if(inputCheck) {
			
			minutes = CastDataType.stringToInteger(inputValue);
		//적합하지 않은 경우
		}else {
			
			PrintUtils.messageToPrint(errorMsg);
			return;
		}
		
		//4. 비지니스 로직 및 결과 처리
		//분 > 시 > 일 > 월 > 년
		dateMap = CastDate(minutes);
		year = dateMap.get("year");
		day = dateMap.get("day");
		PrintUtils.messageToPrint(inputValue+"분을 년,월로 계산하면 "+year+"년 "+day+"일 입니다.");
	}
	
	//분을 월 , 년으로 변환하는 메소드
	public static HashMap<String, Integer> CastDate(long minutes){
		
		HashMap<String, Integer> dateMap;
		long year, day;
		
		dateMap = new HashMap<String, Integer>();
		year = 0;
		day = 0;
		
		year = (minutes/60/24) / 365; 
		day = (minutes/60/24) % 365;
		
		dateMap.put("year",(int) year);
		dateMap.put("day", (int)day);
		
		return dateMap;
	}
}
