package junsikService;

public class Test4Service {
	public int Check(String str) {

		// 리턴값 선언
		int result;
		int year = 0;
		int day = 0;
		int hour = 0;
		int minute = 0;

		// 초기화
		result = -1;

		// 검증
		try {

			int time = Integer.parseInt(str);

			year = time / 60 / 24 / 365;

			day = time / 60 / 24 % 365;

			hour = time / 60 % 24;

			minute = time % 60;

			System.out.println(year + "년 " + day + "일 " + hour + "시간 " + minute + "분 ");

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
		que1 = "분 입력 : ";
		
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
