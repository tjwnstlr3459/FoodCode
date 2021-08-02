package kr.jangboo.junsik.model.service;

import java.util.Scanner;

public class MethodService14 {

	public double side() {
		
		//클래스 선언 및 변수 선언
		TryCatch14 check = new TryCatch14();
		Scanner sc;
		String side = null;
		double sideNum;
		
		//초기화
		int result = 0;
		sideNum = 0;
		sc = new Scanner(System.in);
		
		//동작 로직
		System.out.print("면적의 수 :");
		
		//입력값 검증
		side = sc.nextLine();
		result = check.tryCatch(side);	
		
		//검증에 적합하면 컨트롤에 넘겨주기
		if(result>0) {
			sideNum = Integer.parseInt(side);
		}
		
		return sideNum;
	}
	
	public double apothem() {
		//클래스 및 변수 선언
		TryCatch14 check = new TryCatch14();
		Scanner sc;
		String apothem = null;
		double apothemNum;
		
		//초기화
		int result = 0;
		apothemNum = 0;
		sc = new Scanner(System.in);
		
		//동작로직
		System.out.print("측면의 수 :");
		apothem = sc.nextLine();
		
		//검증
		result = check.tryCatch(apothem);	
		
		//검증에 적합하면 컨트롤에 넘겨주기
		if(result>0) {
			
			apothemNum = Integer.parseInt(apothem);
		}
		return apothemNum;
	}
	
	
	//오각형의 면적 공식
	public double pentagonArea(int sideNum, double apothem) {
		
        return  (sideNum * apothem * apothem) / (4 * Math.tan(Math.PI/sideNum));
    }
	
	
	// side와 apothem이 적합하지 않을때 메세지
	public void msg() {
		
		System.out.println("숫자가 정확하지 않습니다.");
	}
}
