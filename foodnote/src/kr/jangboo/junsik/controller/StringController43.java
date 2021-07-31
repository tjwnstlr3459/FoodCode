package kr.jangboo.junsik.controller;

import java.util.ArrayList;

import kr.jangboo.junsik.model.vo.StringService43;

public class StringController43 {
	public static void main(String[] args) {

		// 43. 문자열에서 최대 발생 문자를 찾는 Java 프로그램을 작성

		// 1) 문자열 입력
		// 2) 문자열을 하나씩 검사
		// 3) 동일한 최대 글자 출력

		// 변수 및 클래스 선언
		String maxStr;
		StringService43 service;

		// 초기화
		service = new StringService43();

		// 문자열 입력
		String str = service.strInput();

		// 문자열 최대 갯수 검증
		maxStr = service.arrayPrint(str);

		// 최대 문자 출력
		if (maxStr != null) {
			
			service.maxStrPirnt(maxStr);
		// 모든 문자열이 동일할때
		} else {
			
			service.beanStrPirnt();
		}

	}
}
