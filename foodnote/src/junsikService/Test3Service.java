package junsikService;

import java.util.ArrayList;
import java.util.Collections;

public class Test3Service {
	public int Check(String str, ArrayList<String> arr, int sum) {
		
		//리턴값 선언
		int result;
		
		//초기화
		result = -1;
			
		//검증
		try {
			
			//arrayList를 이용한 값넣기
			for (int i = 0; i < str.length(); i++) {
				arr.add(str.substring(0+i,1+i));
				sum += Integer.parseInt(arr.get(i));
				
			}
			
			//각각의 정수별 합산
			System.out.println(sum);
			
			//로직 성공시 전달할 리턴값 저장
			result = 1;
			
			//arrayList에 저장된 값들 삭제
			for (int i = 0; i < str.length()-1; i++) {
				arr.remove(i);
			}
		
		}catch(NumberFormatException e) {
			
			System.out.println("입력을 잘못 하셨습니다");
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("인덱스를 벗어났습니다");
		}catch(Exception e) {
			
			System.out.println("오류 발생");
		}
		
		return result;
	}
}
