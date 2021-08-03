package kr.jangboo.junsik.model.service;

import java.util.HashSet;
import java.util.Scanner;

import kr.jangboo.junsik.model.util.PrintMessage;
import kr.jangboo.junsik.model.util.ReqularExpession;

public class NumberService10 {
	
	//사용자로부터 값 받고, 정규표현식으로 확인하는 메소드
	public int inputNumber() {
		Scanner sc;
		ReqularExpession reqExp;
		PrintMessage printMessage = new PrintMessage();
		int num;
		
		sc  = new Scanner(System.in);
		reqExp = new ReqularExpession();
		
		//사용자로부터 입력값 정규표현식 검사
		while(true) {
			
			System.out.print("정수 입력 : ");
			String numStr = sc.nextLine();
			
			//정규표현식 적합시 while문 탈출
			if(numStr.matches(reqExp.onlyNum2())) {
				
				//정규표현 적합시 num에 대입하여  controller에 리턴
				num = Integer.parseInt(numStr);
				break;
			
			//정규표현식 부적합시 재입력
			}else {
				
				String message = "정수만 입력해 주세요";
				printMessage.printMessage(message);
			}
		}
		sc.close();
		return num;
	}
	
	
	
	//사용자로부터 받은 값 happyNumber인지 확인
	public boolean isHappyNumberCheck(int num) {
		
		//클래스 및 변수 선언
		HashSet<Integer> happyNumberSet = new HashSet<Integer>();
		int squareValue;	//제곱값	
		int remainingValue;	//잔존값
		
		//동일한 값 저장 못하도록 하는 set while문
		while (happyNumberSet.add(num)) {	    //ex) num = 7 set저장후 while문 
			squareValue = 0;
						
			while (num > 0) {					//num = 7
				//10으로 나눈 나머지 값 저장
				remainingValue = num % 10;		//remain = 7
				
				//나머지값 제곱 한다음 value에 저장
				squareValue += remainingValue * remainingValue;	//square = 64
				
				//기존값에서 10으로 나누고 
				//10 이하면 while문 탈출
				num /= 10;						//num=6, 0보다 높으니 다시 while문 반복
			}
			
			//기존값의 제곱근 저장
			num = squareValue;
		}
		
		//while문을 거친 기본값이 [1이면 참],[0이면 거짓] 을 리턴
		return num == 1;
	}
	
	
	//행복한 숫자가 [참/거짓]에 따른 출력
	public void isNumberValuePrint(boolean happyNumberBoolean) {
		
		//행복한 숫자인지 출력을 위한 [출력메소드]
		PrintMessage printMessage = new PrintMessage();
			
		//행복한 숫자[참]
		if(happyNumberBoolean) {
			
			String message = "하샤드 숫자입니다.";
			printMessage.printMessage(message);
			
		//행복한 숫자[거짓]
		}else {
			
			String message = "하샤드 숫자가 아닙니다.";
			printMessage.printMessage(message);
		}
	}
}
