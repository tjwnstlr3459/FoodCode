package minhyeong;

public class CastDataType {

	//문자열을 정수로 변환하는 메소드
	public static int stringToInteger(String inputValue) {

		int strToInteger;
		String errorMsg;
		
		strToInteger = 0;
		errorMsg = "";
		
		try {
			
			strToInteger = Integer.parseInt(inputValue);
		}catch(NumberFormatException e) {
			
			//NumberFormatException > 문자열을 정수로 변환하는 과정에서 생기는 Exception 발생!!!
			//이 경우 문자열로 입력한 정수를 변환하는 과정에서 integer 또는 long 타입에 stackover 현상 발생  
			errorMsg = "[Warning] 입력하신 번호가 너무 큰 값입니다. ( 9223372036854775807 까지만 입력 해주세요)";
			PrintOption.messageToPrint(errorMsg);
		}
		return strToInteger;
	}
}
