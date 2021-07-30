package minhyeong;

import minhyeong.util.InputUtils;
import minhyeong.util.PrintUtils;

public class ConditionalStatment24 {

	public static void main(String args[]) {
		
		//조건문 문제 25 > 다이아몬드 출력  문자는 '*' 이 아닌 숫자로 표현
		//
		int line, spaceNum, number;
		String space, inputMessage, inputValue, msg;
		boolean inputCheck;
		InputUtils iO;
		//
		inputMessage = "input integer : ";
		inputValue = "";
		inputCheck = false;
		msg = "";
		iO = new InputUtils();
		space = "";
		line = 0;
		spaceNum = 0;
		number = 1;
		//
		inputValue = InputUtils.inputMessageToPrint(inputMessage);
		inputValue = InputUtils.replaceInput(inputValue);
		inputCheck = iO.inputWhoIntegerCheck(inputValue);
		if(inputCheck) {
			
			line = CastDataType.stringToInteger(inputValue);
			if(1 > line || line > 9) {
			
				msg = "value is to much integer!\nPlease input integer is 1 between 9";
				PrintUtils.messageToPrint(msg);
				return;
			}
			spaceNum = line-1;
		}else {
			
			msg = "please input is all Integer";
			PrintUtils.messageToPrint(msg);
			return;
		}
		//
		logic(number,line,spaceNum,space);
		
	}

	public static void logic(int number, int line, int spaceNum, String space) {
		
		for(int i = 1; i <= line; i++) {
			
			// 공백, 숫자 출력
			if(spaceNum == 0) {

			}else {
				
				System.out.print(String.format("%"+spaceNum+"s", space));
			}
			
			//숫자 출력
			if(number == 1) {

				System.out.print(number);
			}else {
				
				for(int j = number; j >= 1; j--) {
					
					System.out.print(j);
				}
				
				for(int j = 2; j <= number; j++) {
					
					System.out.print(j);
				}
			}
			number++;
			
			
			// 뒷 공백 출력
			if(spaceNum == 0) {
				
			}else {
				
				System.out.print(String.format("%-"+spaceNum+"s", space));
				spaceNum--;
			}
			System.out.println();
		}
		
		//상부에서 ++,--된 변수 1씩 증가, 감소
		spaceNum++;
		number--;
		
		for(int i = line - 1; i >= 1; i--) {
			
			// 공백, 숫자 출력
			if(spaceNum == 0) {

			}else {
				
				System.out.print(String.format("%"+spaceNum+"s", space));
			}
			
			//숫자 출력
			if(number == 1) {

				System.out.print(number);
			}else {
				
				for(int j = number-1; j >= 1; j--) {
					
					System.out.print(j);
				}
				
				for(int j = 2; j <= number-1; j++) {
					
					System.out.print(j);
				}				
			}
			number--;
			
			
			// 뒷 공백 출력
			if(spaceNum == 0) {
				
			}else {
				
				System.out.print(String.format("%-"+spaceNum+"s", space));
				spaceNum++;
			}
			System.out.println();

		}
		
	}
	
	
}
