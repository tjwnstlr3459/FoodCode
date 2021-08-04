package kr.jangboo.minhyeong.method.view;

import kr.jangboo.minhyeong.method.controller.Method10Controller;
import kr.jangboo.minhyeong.util.PrintUtils;

public class Method10View {

	public static void main(String args[]) {
		
		// 문제 > 입력한 년도가 윤년인지 아닌지 판별하는 자바프로그램을 작성
		
		//1. 변수 , 클래스 정의
		int inputYear;
		Method10Controller cntrl;
		String resultMsg;
		//2. 변수, 클래스 초기화
		inputYear = 2016;
		resultMsg = "";
		cntrl = new Method10Controller();
		//3. 검증
		
		//4. 비지니스 로직
		resultMsg = cntrl.checkLeapYear(inputYear);
		//결과 출력
		PrintUtils.messageToPrint(inputYear + " : " + resultMsg);
	}
}
