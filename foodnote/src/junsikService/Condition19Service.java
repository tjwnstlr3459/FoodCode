package junsikService;

public class Condition19Service {

	public int check(String str) {

		// 변수 선언
		int height;
		int result;
		int count;

		// 초기화
		height = 1;
		result = -1;
		count = 0;
		
		// 검증
		try {
			
			height = Integer.parseInt(str);

			for (int i = 0; i <= height*2-1; i += 2) {
				for (int j = i; j < height*2; j += 2) {
					System.out.print("  ");
				}
				for (int j = 0; j <= i; j++) {
					if(count<9) {
						System.out.print(" "+(count+1));						
					}else {
						System.out.print(count+1);
					}
				}
				count++;
				System.out.println();
			}

			// 로직 성공시 전달할 리턴값 저장
			result = 1;

		} catch (NumberFormatException e) {

			System.out.println("입력을 잘못 하셨습니다");
		} catch (Exception e) {

			System.out.println("에러발생");
		}

		return result;
	}
	
	//질문1
	public void que1() {
		//변수 선언
		String que1;
		
		//초기화
		que1 = "피라미드 높이 정수 입력 : ";
		
		//로직
		System.out.print(que1);
		
	}
	
	//질문2
	public void que2() {
		//변수 선언
		String que2;
		
		//초기화
		que2 = "높이를 정수로 입력해주세요.";
		
		//동작로직
		System.out.println(que2);
	}
}
