package kr.jangboo.junsik.model.service;

public class TryCatch14 {
	public int tryCatch(String side) {
		ReqularExpession reqExp = new ReqularExpession();
		int result = 0;
		
		try {
			if(side.matches(reqExp.onlyNum())) {
				result = 1;
			}
		}catch(NullPointerException e) {
			
			System.out.println("널 포인트 예외가 발생했습니다.");
		}catch(Exception e) {
			
			System.out.println("오류 발생");
		}
		return result;
	}
}
