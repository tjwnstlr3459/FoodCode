package junsikCon;

import java.util.Scanner;


import junsikService.Test3Service;

public class Test3 {
	
	public static void main(String args[]) {
		
		//3. 0에서 1000 사이의 정수를 읽고 정수의 모든 숫자를 더하는 Java 프로그램을 작성하십시오
		
		//변수 선언
		Scanner sc;
		String str;
		Test3Service service;
		
		//초기화
		sc = new Scanner(System.in);
		service = new Test3Service();
		
		
		//동작 로직
		while(true) {
			
			//1~1000 사이의 정수 입력
			service.que1();
			str = sc.nextLine();
			
			
			if(str.equals("")) {
						
				//공백입력시
				service.que2();
			}else {
				
				//검증 로직
				int result = service.Check(str);
				
				//검증 성공시 반복문 종료
				if(result>0) {
					break;
				}
			}
		}
		sc.close();
	}
}
