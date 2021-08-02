package kr.jangboo.junsik.model.service;

public class TryCatch15 {
	
	public int tryCatch(long curTimeMillis) {
		int result = 0;
		
		try {
			if(curTimeMillis > 0) {
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
