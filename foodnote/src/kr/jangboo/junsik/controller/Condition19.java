package kr.jangboo.junsik.controller;

import java.util.Scanner;

import kr.jangboo.junsik.model.vo.ConditionService19;

public class Condition19 {
	public static void main(String args[]) {
		//19. 같은 행에서 숫자를 반복할 숫자가 있는 피라미드와 같은 패턴을 만드는 프로그램
		
		//변수 선언
		Scanner sc;
		String str;
		ConditionService19 service;
		
		//초기화
		sc = new Scanner(System.in);
		service = new ConditionService19();
		
		//동작로직
		while(true) {
			
			//피라미드 높이 정수 입력
			service.que1();
			str = sc.nextLine();
			
			if(str == null) {
				
				//높이를 정수로 입력해주세요
				service.que2();
			}else {
				
				//검증 및 실행 로직
				int result = service.check(str);
				
				//검증 성공시 while문 종료
				if(result>0){
					break;	
				}
				
			}
		}
		sc.close();
	}
}
