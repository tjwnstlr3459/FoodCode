package kr.jangboo.minhyeong.util;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputUtils {

	//멤버(전역)변수, 클래스 정의
	private String regPattern;		//정규표현식 - 
	
	//Getter, Setter space ----------------------------------------------------
	public String getRegPattern() {
		return regPattern;
	}

	public void setRegPattern(String regPattern) {
		this.regPattern = regPattern;
	}
	// ------------------------------------------------------------------------
	
	//Scanner를 통해 입력값을 받기위한 출력 메소드
	public static String inputMessageToPrint(String msg) {
		
		Scanner sc;
		String inputValue;
		
		sc = new Scanner(System.in);
		inputValue = "";
		
		System.out.print(msg);
		inputValue = sc.nextLine();
//		sc.close();
		return inputValue;
	}
	
	//입력받은 값이 문자열에서 정수만 존재하는지 아닌지 판별하는 메소드
	public boolean inputValueCheckInteger(String inputValue) {
		
		//Pattern regPattern;								//정규표현식을 이용한 대상이 되는 문자열의 패턴을 검증하는 클래스
		//Matcher patternMatcher;							//생성된 패턴을 대상 문자열과 판별하기 위한 클래스
		boolean resultMatch;
		
		resultMatch = false;
		
		//Pattern 클래스의 matches()메소드를 이용하여 정의된 정규표현식과 입력받은 갑을 판별하여 true/false로 값을 리턴한다. 매개변수를 가지고 메소드 내에서 처리하기 때문에 static으로 되어있는 것 같다.
		resultMatch = Pattern.matches(this.regPattern, inputValue);
		//정규표현식과 일치하는 입력값 인 경우
		if(resultMatch) {
			
			return resultMatch;
		//일치하지 않는 입력값 인 경우
		}else {
			
			return resultMatch;
		}
	}
	
	//입력받은 값이 문자열에서 문자들만 존재유무 판별 메소드 > 문자열에서 문자만 가능함
	public boolean inputValueCheckOnlyChar(String inputValue) {
		
		boolean resultMatch;
		
		resultMatch = false;
		
		
		
		return resultMatch;
		
	}

	
	//입력받은 값에서 공백을 제거해주는 메소드
	public static String replaceInput(String inputValue) {
		
		//입력받은 값의 공백을 제거하고 호출한 클래스의 메소드로 리턴한다.
		return inputValue.replaceAll("\s","");
	}
}
