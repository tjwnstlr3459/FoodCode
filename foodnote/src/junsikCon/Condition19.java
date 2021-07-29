package junsikCon;

import java.util.Scanner;

import junsikService.Condition19Service;

public class Condition19 {
	public static void main(String args[]) {
		//같은 행에서 숫자를 반복할 숫자가 있는 피라미드와 같은 패턴을 만드는 프로그램
		
		//변수 선언
		Scanner sc;
		String str;
		Condition19Service service;
		
		//초기화
		sc = new Scanner(System.in);
		service = new Condition19Service();
		
		//동작로직
		while(true) {
			
			service.que1();
			str = sc.next();
			
			if(str == null) {
				
				service.que2();
			}else {
				
				int result = service.check(str);
				if(result>0){
					break;	
				}
				
			}
		}
		
		sc.close();
	}
}
