package kr.jangboo.junsik.controller;

import kr.jangboo.junsik.model.service.MethodService14;

public class Method14 {

	public static void main(String[] args) {
		
		//14. 오각형의 면적 구하기
		
		//클라이언트에게 면의 수와 측면 받기
		MethodService14 service = new MethodService14();
		double side = service.side();
		double apothem = service.apothem();
		
		
		//검증이 끝난 side와 apothem의 참인지
		if(0 < side && 0 <apothem) {
			
			//int로 변경
			int sideNum = (int)side;
			
			//오각형의 면적 공식 적용
			double pentagonArea = service.pentagonArea(sideNum, apothem);
			
			//오각형의 면적 출력
			System.out.println("오각형의 면적 :  " + pentagonArea);
		}else {
			
			service.msg();
		}
        
    }

    
}
