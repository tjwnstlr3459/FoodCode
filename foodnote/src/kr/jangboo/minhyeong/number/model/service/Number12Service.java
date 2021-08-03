package kr.jangboo.minhyeong.number.model.service;

public class Number12Service {

	public boolean resultToHarshad(String inputValue) {

		//1. 변수, 클래스 정의
		boolean result;
		int sum, inputNum;
		String digit;
		//2. 변수, 클래스 초기화
		result = false;		//분석 후 하샤드 숫자인 지 아닌 지 결과를 갖는 논리형 변수
		sum = 0;			//inputValue의 자릿수를 모두 더한 변수
		inputNum = 0;		//inputValue를 정수로 변환후 대입할 변수
		digit = "";			//inputValue의 자릿수를 대입하는 변수
		//3. 검증, 예외 상황
		
		//4. 비지니스 로직
		
		// sum 변수에 입력값의 자릿수를 +=한다
		for(int i = 0; i < inputValue.length(); i++) {
			
			//char로 변환하는 과정이 아닌 subString을 사용한 과정
			//1. 입력값에서 반복마다 진행되는 자릿수를 추출
			digit = inputValue.substring(i, i+1);
			//2. 추출된 String타입의 숫자를 정수형으로 변환하며 기존 sum변수에 있던 값과 +=한다.
			sum += Integer.parseInt(digit);
		}
		
		// inputNum % sum == 0 이라면 하샤드 숫자이다.
		// String타입의 숫자 inputValue를 정수형으로 변환한다.
		inputNum = Integer.parseInt(inputValue);
		
		//결과 반환 > inputNum % sum == 0 인경우 > true(Harshad 숫자이다)
		if(inputNum % sum == 0) {
			
			return true;
		//inputNum % sum != 0 인 경우 > false(Harshad 숫자가 아니다)
		}else {
			
			return false;
		}
	}

}
