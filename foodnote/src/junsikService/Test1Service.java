package junsikService;

public class Test1Service {
	public int Check(String temperature) {
		
		//리턴값 선언
		int result;
		double f;
		double ondo;
		
		//초기화
		result = -1;
		f = 0;
		ondo = 0;
			
		//검증
		try {
			
			f = Double.parseDouble(temperature);
			ondo = (f-32)/1.8000;
			System.out.println(ondo+"℃");
			result = 1;
		}catch(NumberFormatException e) {
			
			System.out.println("입력을 잘못 하셨습니다");
		}catch(IllegalArgumentException e) {
			
			System.out.println("잘못된 인자를 전달 ");
		}catch(NullPointerException e) {
			
			System.out.println("널 포인트 예외가 발생했습니다.");
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
		que1 = "화씨 온도 입력 : ";
		
		//로직
		System.out.print(que1);
		
	}
	
	//질문2
	public void que2() {
		//변수 선언
		String que2;
		
		//초기화
		que2 = "온도를 입력해주세요.";
		
		//동작로직
		System.out.println(que2);
	}
}
