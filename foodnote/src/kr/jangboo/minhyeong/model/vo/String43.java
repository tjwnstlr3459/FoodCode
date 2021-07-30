package kr.jangboo.minhyeong.model.vo;

import java.util.HashMap;

import kr.jangboo.minhyeong.util.InputUtils;
import kr.jangboo.minhyeong.util.PrintUtils;

public class String43 {

	public static void main(String args[]) {
		
		//문자열 문제 43 > 주어진 영문자에서 최대 발생한 문자의 갯수와 문자를 출력하는 프로그램 작성
		// 1) 문자열을 입력한다.
		// 2) 입력된 문자열에서 문자 하나하나 정수로 변환한다.
		// 3) 정수로 변환된 숫자가 최대를 배열의 길이(크기)로 잡는다.
		// 4) 문자열의 길이만큼 반복하여 문자 하나하나를 정수로 변환된 값을 배열자리로 지정하고 그 자리 값을 1++ 시켜준다. 카운트는 배열자리의 값을 불러오면 된다.
		// 5) 최대로 발생된 문자를 찾을 때에는 문자 하나하나 정수로 변환된 값의  배열자리의 count값을 불러와 변수에 저장해 그 보다 높은 count를 갱신하여 그 자리를 불러오면 된다.
		
		InputUtils iU;
		String inputValue, inputMessage;
		int[] charCastIntArray;
		int charToIntMaxValue, maxCount;
		char maxCountChar;
		HashMap<String, Object> maxMap;
		Object objTemp;
		
		iU = new InputUtils();
		inputValue = "";
		inputMessage = "input String : ";
		charToIntMaxValue = -1;
		maxMap = new HashMap<String, Object>();
		maxCount = 0;
		maxCountChar = ' ';
		objTemp = new Object();
		
		//질문 주고 문자열 받아오기
		inputValue = InputUtils.inputMessageToPrint(inputMessage);
		//문자열에서 문자로 추출해 정수로 변환한 최대 값
		charToIntMaxValue = castMaxValue(inputValue);
		//최대 값을 배열의 길이로 지정해 초기화
		charCastIntArray = new int[charToIntMaxValue + 1];
		//문자열의 문자 하나하나를 char > int로 바꾸어 존재하는 배열자리의 값+1
		maxMap = arraySpotPlus(charCastIntArray, inputValue);
		objTemp = maxMap.get("maxCount");
		maxCount = (int)objTemp;
		objTemp = maxMap.get("maxCountChar");
		maxCountChar = (char)objTemp;
		
		PrintUtils.messageToPrint("The given string is: "+inputValue);
		PrintUtils.messageToPrint("Max occurring character in the given string is : " + maxCountChar);
		PrintUtils.messageToPrint("maxCount : "+maxCount);
	}

	public static HashMap<String, Object> arraySpotPlus(int[] charCastIntArray, String inputValue) {
		
		int maxCount;
		char maxCountChar, charCasting;
		HashMap<String, Object> maxMap;
		
		maxCount = -1;			//최대 문자 카운트 변수
		charCasting = ' ';		//문자에서 정수로 변환하기 위한 변수
		maxCountChar = ' ';		//최대 문자를 대입하기 위한 변수
		maxMap = new HashMap<String, Object>();
		
		for(int i = 0; i < inputValue.length(); i++) {
			
			charCasting = inputValue.charAt(i);
			//정수로 변환된 문자 값을 배열의 자리 값으로 주어 그 자리의 값 증가
			charCastIntArray[charCasting]++;	//charCastIntArray[charCasting] += 1
			
			//문자열의 0자리에서 끝까지 문자 하나하나를 정수로 변환한 값의  배열자리에 존재하는 카운트가 -1보다 큰 경우 갱신 > 이후 최대 값을 계속 갱신함
			if(maxCount < charCastIntArray[charCasting]) {
				
				//배열 자리에 존재하는 값 대입
				maxCount = charCastIntArray[charCasting];
				//
				maxCountChar = inputValue.charAt(i);
			}
			//아닌 경우 스킵
		}
		maxMap.put("maxCount",maxCount);
		maxMap.put("maxCountChar", maxCountChar);
		return maxMap;
	}

	public static int castMaxValue(String inputValue) {
		
		int charToIntMaxValue;
		char charCasting;
		
		charToIntMaxValue = -1;
		charCasting = ' ';
		
		for(int i = 0; i < inputValue.length(); i++) {
			
			charCasting = inputValue.charAt(i);
			if(charToIntMaxValue < charCasting) {
				
				charToIntMaxValue = charCasting;
			}
		}
		return charToIntMaxValue;
	}
	
	
}
