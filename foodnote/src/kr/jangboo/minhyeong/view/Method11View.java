package kr.jangboo.minhyeong.view;

import kr.jangboo.minhyeong.controller.Method11Controller;
import kr.jangboo.minhyeong.util.PrintUtils;

public class Method11View {

	public static void main(String args[]) {
		
		//문제 11 > 문자열이 유효한 암호인지 확인하는 자바 프로그램 작성
		//변수, 클래스 정의
		String inputValue, inputMsg, msg;
		boolean verification;
		Method11Controller cntrl;
		//변수, 클래스 초기화
		inputMsg = "1. 비밀번호는 8자 이상이어야합니다.\n2. 비밀번호는 문자와 숫자로만 구성됩니다.\n3.비밀번호는 2자리 이상 숫자를 포함해야합니다.\n비밀번호를 입력하세요.";
		inputValue = "qwerqwer";
		verification = false;
		cntrl = new Method11Controller();
		
		PrintUtils.messageToPrint(inputMsg);			//입력문구
		PrintUtils.messageToPrint(inputValue);			//입력된 비밀번호
		//검증
		verification = cntrl.verification(inputValue);	//null 체크
		if(verification) {
			
		}else {
			
			msg = "[RunTimeException] NullPointerException...Null Object에 접근!";
			PrintUtils.messageToPrint(msg);
			return;
		}
		//비지니스 로직
		msg = cntrl.validatePassword(inputValue);
		//결과 출력
		PrintUtils.messageToPrint(msg);
	}
}
