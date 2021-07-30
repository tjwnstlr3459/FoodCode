package kr.jangboo.minhyeong.model.vo;

import kr.jangboo.minhyeong.util.PrintUtils;

public class CastDataType {

	//문자열을 정수로 변환하는 메소드
	public static int stringToInteger(String inputValue) {

		int strToInteger;
		String msg;
		
		strToInteger = 0;
		msg = "";
		
		try {
			
			strToInteger = Integer.parseInt(inputValue);
		}catch(NumberFormatException e) {
			
			//NumberFormatException > 문자열을 정수로 변환하는 과정에서 생기는 Exception 발생!!!
			//이 경우 문자열로 입력한 정수를 변환하는 과정에서 integer 또는 long 타입에 stackover 현상 발생  
			msg = "[Warning] 아무것도 적지 않았거나 입력하신 번호가 너무 큰 값입니다. ( 9223372036854775807 까지만 입력 해주세요 )";
			PrintUtils.messageToPrint(msg);
			strToInteger = -1;
		}
		return strToInteger;
	}
}
