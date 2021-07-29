package junsikService;

public class Condition25Service {

	public int check(String str) {

		// 변수 선언
		int height,result,count;

		// 초기화
		height = 1;
		result = -1;
		count = 0;
		
		
		//검증
		try {
			
			height = Integer.parseInt(str);
			
			if(height <= 0) {
				System.out.println("1 이상의 정수를 입력해 주세요");
			}else {
				
				//피라미드, 행
				for (int i = 0; i < height; i++) {
					
					//공백 여부
		            for (int j = 0; j < height-i-1; j++) {
		                System.out.printf("  ");
		            }
		            count = i + 1;
		            
		            
		            //숫자여부
		            //i의 초기값에서 -- 카운트 진행
		            for (int j = 0; j < i; j++) {
		            	
		                System.out.print(" "+count--);
		            }
		            count = 1;
		            
		            //++ 카운트 진행
		            for (int j = 0; j < i+1; j++) {
		            	
		                System.out.print(" "+count++);
		            }
		            System.out.println();
				}
				
				//역피라미드, 행
				for (int i = height-2; i >= 0; i--) {
					
					//좌측 공백 여부
		            for (int j = 0; j < height-i-1; j++) {
		                System.out.printf("  ");
		            }
		            count = i + 1;
		            
		            
		            //숫자여부
		            //i의 초기값에서 -- 카운트 진행
		            for (int j = 0; j < i; j++) {
		            	
		                System.out.print(" "+count--);
		            }
		            count = 1;
		            
		            //++ 카운트 진행
		            for (int j = 0; j < i+1; j++) {
		            	
		                System.out.print(" "+count++);
		            }
		            System.out.println();
				}

				// 로직 성공시 전달할 리턴값 저장
				result = 1;
			}

		} catch (NumberFormatException e) {

			System.out.println("입력을 잘못 하셨습니다");
		} catch (Exception e) {

			System.out.println("에러발생");
		}

		return result;
	}
	
	public void que1() {
		//변수 선언
		String que1;
		
		//초기화
		que1 = "피라미드 높이 정수 입력 : ";
		
		//로직
		System.out.print(que1);
		
	}
	
	public void que2() {
		//변수 선언
		String que2;
		
		//초기화
		que2 = "높이를 정수로 입력해주세요.";
		
		//동작로직
		System.out.println(que2);
	}
}


