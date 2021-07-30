package junsikCon;

import java.util.HashMap;

import junsikService.ArrayService1;

public class ArrayController1 {
	
	public static void main(String args[]) {

		//1. 숫자 배열, 문자 배열의 임의의 값들을 순서대로 정렬하라
		
		//  1) 선택사항에 따라 숫자별 문자별 배열을 선택
		//	2) 선택후 해당 배열에 임의에 값 넣기
		//  3) 해당 배열 값 출력후, 정렬 후 값 보여주기
		//  4) 다시 선택사항으로		
		
		//변수 선언
		ArrayService1 service;
		HashMap<String, Integer> map;
		
		//초기화
		service = new ArrayService1();
		map = new HashMap<String, Integer>();
		
		
		//동작 로직
		while(true) {
			
			//메뉴 선택문 [ 1.숫자    2.문자    3.종료 ] = menuNum
			//메뉴 선택시 배열 사이즈 정하기 	= size
			map = service.arrayChoice();
			
			//서비스에서 가져온 menuNum과 size를 HashMap에서 꺼내 변수에 넣어준다
			int menuNum = map.get("menuNum");
			int size = map.get("size");
					
			//메뉴 숫자,문자 배열 선택시
			if(0 < menuNum && menuNum < 3) {
				
				//배열에 값넣는 로직 이동
				service.arrInsert(size,menuNum);
			
			//메뉴종료 번호 리턴시 
			}else {
				break;
			}
		}
	}
}




