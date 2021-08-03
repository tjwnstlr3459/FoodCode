package kr.jangboo.junsik.controller;


import kr.jangboo.junsik.model.service.MethodService15;
import kr.jangboo.junsik.model.service.TryCatch15;

public class Method15 {
	public static void main(String args[]) {
		
		//클래스 선언
		MethodService15 service = new MethodService15();
		TryCatch15 Check = new TryCatch15();
		//1970년 1월 1일부터 경과한 시간을 밀리세컨 타입으로 리턴 1/1000 초
		long curTimeMillis = System.currentTimeMillis();
		

		//curTimeMillis 검증
		int result = Check.tryCatch(curTimeMillis);
		
		//조건에 적합하면 출력
		if(result>0) {
			
			// 방법1. 서비스에 curTime을 전달하여 현재시간 출력
			service.curTime(curTimeMillis);
			
			// 방법2. 서비스에 SimpleDateFormat을 이용한 다른 방법
			service.simpleCurTime(curTimeMillis);
		}else {
			
			//curTimeMillis값 비정상일경우 출력
			service.msg();
		}
	}
}












