package kr.jangboo.minhyeong.method.view;

import kr.jangboo.minhyeong.method.controller.Method1Controller;
import kr.jangboo.minhyeong.method.model.vo.Method1;
import kr.jangboo.minhyeong.util.PrintUtils;

public class Method1View {

	public static void main(String args[]) {
		
		//메소드 문제 1 > 세 수중 가장 적은 수를 출력하는 자바 프로그램을 작성
		
		//변수 , 클래스 정의
		int firstNum, secondNum, thirdNum, resultNum;
		Method1 mt1;
		Method1Controller cntrl;
		String msg;
		
		//변수, 클래스 초기화
		firstNum = 12;
		secondNum = 12;
		thirdNum = 12;
		cntrl = new Method1Controller();
		mt1 = new Method1();
		mt1.setFirstNum(firstNum);
		mt1.setSecondNum(secondNum);
		mt1.setThirdNum(thirdNum);
		
		//검증, 예외 처리
		
		//비지니스 로직
		resultNum = cntrl.smallestNumber(mt1);
		//결과 처리
		msg = "The Smallest Value is : " + resultNum;
		PrintUtils.messageToPrint(msg);
	}
}
