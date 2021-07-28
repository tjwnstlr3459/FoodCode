package junsikCon;

import java.util.ArrayList;
import java.util.Scanner;


import junsikService.Test3Service;

public class Test3 {
	
	public static void main(String args[]) {
		
		//3. 0에서 1000 사이의 정수를 읽고 정수의 모든 숫자를 더하는 Java 프로그램을 작성하십시오
		
		//변수 선언
		Scanner sc;
		String str;
		String que1 = "1~1000 사이의 정수를 입력 : ";
		String que2 = "다시 입력해 주세요";
		ArrayList<String> arr;
		int sum;
		Test3Service service;
		
		//초기화
		sum = 0;
		sc = new Scanner(System.in);
		arr = new ArrayList<>();
		service = new Test3Service();
		
		
		//동작 로직
		while(true) {
			
			System.out.print(que1);
			str = sc.nextLine();
			
			
			if(str.equals("")) {
						
				//공백입력시
				System.out.println(que2);
			}else {
				
				//검증 로직
				int result = service.Check(str,arr,sum);
				
				//검증 성공시 반복문 종료
				if(result>0) {
					break;
				}
			}
		}
		sc.close();
	}
}
