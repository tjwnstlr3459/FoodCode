package kr.jangboo.junsik.model.util;

import java.util.Scanner;

public class InputNumber {

	// 사용자에게 입력 값을 받는 메소드
	public String inputStr() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		String numStr = sc.nextLine();

		return numStr;
	}

	// 정규표현식 확인
	public boolean isReqularExpNum(String numStr) {
		
		// 변수 및 클래스 선언
		ReqularExpession reqExp;
		reqExp = new ReqularExpession();
		boolean result = false;
		
		// 정규표현식 적합한지 확인
		if (numStr.matches(reqExp.onlyNum2())) {

			// 정규표현 적합시 true 리턴
			result = true;
		}
		return result;
	}
}
