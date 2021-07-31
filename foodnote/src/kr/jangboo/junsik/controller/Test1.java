package kr.jangboo.junsik.controller;

import java.util.Scanner;

import kr.jangboo.junsik.model.vo.TestService1;

public class Test1 {
	public static void main(String args[]) {
		
		//1. 온도를 화씨에서 섭씨로 변환하는 자바 프로그램을 작성하십시오
		//변수와 클래스 선언
		Scanner sc;
		String Temperature;
		TestService1 service;
		
		//초기화
		sc = new Scanner(System.in);
		service = new TestService1();
		
		
		while(true) {
			
			//로직처리
			service.que1();
			Temperature = sc.nextLine();
			
			if(Temperature.equals("")) {
				
				//미입력시
				service.que2();
			}else {
				
				//검증 로직
				int result = service.Check(Temperature);
				if(result>0) {
					break;
				}
			}
		}
		sc.close();
	}
}


