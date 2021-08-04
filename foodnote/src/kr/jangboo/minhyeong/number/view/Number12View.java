package kr.jangboo.minhyeong.number.view;

import kr.jangboo.minhyeong.util.PrintUtils;

public class Number12View {

	public void resultToPrint(boolean resultHarshad, String inputValue) {

		String resultMsg;
		
		resultMsg = "";

		//true / false에 따라 다른 결과 메세지 출력
		if(resultHarshad) {
			
			resultMsg = "입력하신 "+inputValue+"는 하샤드 숫자가 맞습니다.";
		}else {
			
			resultMsg = "입력하신 "+inputValue+"는 하샤드 숫자가 아닙니다.";
		}
		//결과 출력
		PrintUtils.messageToPrint(resultMsg);
	}

	
}
