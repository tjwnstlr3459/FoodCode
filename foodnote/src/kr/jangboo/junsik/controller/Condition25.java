package kr.jangboo.junsik.controller;

import java.util.Scanner;

import kr.jangboo.junsik.model.vo.ConditionService19;
import kr.jangboo.junsik.model.vo.ConditionService25;

public class Condition25 {
	public static void main(String args[]) {
		
		//25. 설정한 높이 값을 이용한 숫자로 형성 된 다이아몬드 
		
		//변수 선언
		Scanner sc;
		String str;
		ConditionService25 service;
		
		//초기화
		sc = new Scanner(System.in);
		service = new ConditionService25();
		
		//동작로직
		while(true) {
			
			//피라미드 높이 정수 입력
			service.que1();
			str = sc.nextLine();
			
			if(str.equals("")) {
				
				//미 입력시
				service.que2();
			}else {
				
				//입력시 로직검사 메소드 연결
				int result = service.check(str);
				
				//로직검증 됬을시
				if(result>0){
					break;	
				}
				
			}
		}
		sc.close();
	}
}
