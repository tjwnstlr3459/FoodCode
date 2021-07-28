package junsikService;

public class Test1Service {
	public int Check(String temperature, int f, double ondo) {
		
		//리턴값 선언
		int result;
		
		//초기화
		result = -1;
			
		//검증
		try {
			
			f = Integer.parseInt(temperature);
			ondo = (f-32)/1.8000;
			System.out.println(ondo);
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
}
