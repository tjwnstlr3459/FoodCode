package kr.jangboo.junsik.controller;

import java.util.Scanner;

import kr.jangboo.junsik.model.vo.Test4Service4;

public class Test4 {

	public static void main(String args[]) {

		// 4. 분을 년과 일로 변환하는 Java 프로그램을 작성하십시오

		// 변수 선언
		Scanner sc;
		String str;
		Test4Service4 service;

		// 초기화
		sc = new Scanner(System.in);
		service = new Test4Service4();

		// 동작 로직
		while (true) {
			
			//분 입력 :
			service.que1();
			str = sc.nextLine();

			if (str.equals("")) {

				// 공백입력시
				service.que2();
			} else {

				// 검증 로직
				int result = service.Check(str);

				// 검증 성공시 반복문 종료
				if (result > 0) {
					break;
				}
			}
		}
		sc.close();
	}
}
