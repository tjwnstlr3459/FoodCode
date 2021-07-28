package junsikCon;

import java.util.Scanner;

import junsikService.Test1Service;

public class Test1 {
	public static void main(String args[]) {
		
		//1. 온도를 화씨에서 섭씨로 변환하는 자바 프로그램을 작성하십시오
		//변수와 클래스 선언
		Scanner sc;
		String que1;
		String que2;
		String Temperature;
		int f = 0;
		double ondo = 0;
		Test1Service service;
		
		//초기화
		sc = new Scanner(System.in);
		service = new Test1Service();
		que1 = "화씨 온도 입력 : ";
		que2 = "온도를 입력해주세요.";
		
		
		while(true) {
			
			//로직처리
			System.out.print(que1);
			Temperature = sc.nextLine();
			
			if(Temperature.equals("")) {
				
				System.out.println(que2);
			}else {
				
				//검증 로직
				int result = service.Check(Temperature,f,ondo);
				if(result>0) {
					break;
				}
			}
		}
		sc.close();
	}
}


