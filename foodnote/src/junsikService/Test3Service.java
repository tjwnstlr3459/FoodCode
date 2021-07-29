package junsikService;

import java.util.ArrayList;

public class Test3Service {
	public int Check(String str) {
		
		//리턴값 선언
		int result;
		int sum;
		ArrayList<String> arr;
		
		//초기화
		result = -1;
		sum = 0;
		arr = new ArrayList<>();
		
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
	
	//질문1
	public void que1() {
		//변수 선언
		String que1;
		
		//초기화
		que1 = "1~1000 사이의 정수를 입력 : ";
		
		//로직
		System.out.print(que1);
		
	}
	
	//질문2
	public void que2() {
		//변수 선언
		String que2;
		
		//초기화
		que2 = "다시 입력해 주세요";
		
		//동작로직
		System.out.println(que2);
	}
}
