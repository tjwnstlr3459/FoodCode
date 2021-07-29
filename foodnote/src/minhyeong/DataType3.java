package minhyeong;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataType3 {

	public static void main(String args[]) {
		
		//문제 3 > 0 ~ 1000 사이의 정수를 입력받아 모든 숫자를 더하는 자바프로그램을 작성하라 
		//ex) 555 > 5+5+5
		//
		
		//1. 변수, 클래스 정의
		Scanner sc;							//입력받을 Scanner클래스
		String inputInteger, errorMsg;		//입력받은 값을 대입할 변수, 에러 메세지 변수
		boolean inputCheck;					//입력값이 프로그램 로직에 정상인 값인지 아닌지 판별하는 변수
		int resultInteger;					//변환 공식까지 완료된 결과를 대입할 변수
		
		//2. 변수, 클래스 초기화
		sc = new Scanner(System.in);
		inputInteger = "";
		inputCheck = false;
		errorMsg = "please 0 between 1000 integer!";
		resultInteger = 0;
		
		//3. 검증, 예외처리 단계
		System.out.print("input Integer : ");
		inputInteger = sc.nextLine();
		//입력값에서 공백을 제거
		inputInteger = replaceInput(inputInteger);
		//입력값이 숫자만 존재하는지 아닌지 판별
		inputCheck = inputWhoInteger(inputInteger);
		if(inputCheck) {
			
			//숫자만 존재하지만 0 ~ 1000의 입력되어야 한다.
			inputCheck = false;
			//매개변수가 0 ~ 1000 사이의 숫자인지 판별
			inputCheck = zeroBetweenThousand(inputInteger);
			//0~1000사이인 경우
			if(inputCheck) {
				
			//0~1000을 벗어난 경우
			}else {
				
				System.out.println(errorMsg);
				return;
			}
		}else {
			
			PrintErrorMsg.notIntegerErrorMsg();
			return;
		}
		
		//4. 비지니스 로직 및 결과 처리
		
		//입력된 정수 하나하나를 더하는 메소드 호출
		resultInteger = intPlusBetween(inputInteger);
		//결과 처리
		printMsg("The sum of all digits in "+inputInteger+" is "+resultInteger);
		//Scannse close
		sc.close();
		//return
	}
	
	//입력받은 문자열에서 정수만 존재하는지 아닌지 판별하는 메소드
	public static boolean inputWhoInteger(String inputInteger) {
		
		//Pattern regPattern;								//정규표현식을 이용한 대상이 되는 문자열의 패턴을 검증하는 클래스
		//Matcher patternMatcher;							//생성된 패턴을 대상 문자열과 판별하기 위한 클래스
		String regPattern;
		boolean resultMatch;
		
		regPattern = "^[0-9]*$";							//영문자만 존재하는지 아닌지 판별하는 정규 표현식
		resultMatch = false;
		
		resultMatch = Pattern.matches(regPattern, inputInteger);	//Pattern 클래스의 matches()메소드를 이용하여 정의된 정규표현식과 입력받은 갑을 판별하여 true/false로 값을 리턴한다.
		//정규표현식과 일치하는 입력값 인 경우
		if(resultMatch) {
			
			return resultMatch;
		//일치하지 않는 입력값 인 경우
		}else {
			
			System.out.println("");
			return resultMatch;
		}
	}
	
	//입력받은 값에서 공백을 제거해주는 메소드
	public static String replaceInput(String inputInteger) {
		
		inputInteger = inputInteger.replaceAll("\s","");
		return inputInteger;
	}
	
	//입력받은 문자열을 정수로 변환하는 메소드
	public static int stringToInteger(String inputInteger) {
		
		return Integer.parseInt(inputInteger);
	}
	
	//메세지를 출력하는 메소드
	public static void printMsg(String msg) {
		
		System.out.println(msg);
	}
	
	//공백을 제거하고 숫자만 존재하는 문자열을 판별한 뒤 0 ~ 1000사이의 숫자인지 판별하는 메소드
	public static boolean zeroBetweenThousand(String inputInteger) {
		
		int strToInteger;
		
		strToInteger = 0;
		
		strToInteger = stringToInteger(inputInteger);
		
		if(0 < strToInteger && strToInteger < 1000) {
			
			return true;
		}else {
			
			return false;
		}
	}
	
	//문자열에서 숫자로 변환하면서 더해주는 메소드
	public static int intPlusBetween(String inputInteger) {
		
		int sumInteger;
		char strOneChar;
		String charToStr;
		
		sumInteger = 0;
		
		for(int i = 0; i < inputInteger.length(); i++) {
			
			strOneChar = ' ';
			charToStr = "";
			
			strOneChar = inputInteger.charAt(i);
			charToStr = String.valueOf(strOneChar);
			sumInteger += Integer.parseInt(charToStr);
		}
		return sumInteger;
	}
}
