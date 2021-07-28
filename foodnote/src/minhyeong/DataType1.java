package minhyeong;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataType1 {

	public static void main(String args[]) {
		
		//문제 1 > 입력받은 화씨를 섭씨로 변환해 출력하는 자바프로그램 작성.
		// 1) 입력을 문자열로 받을 것인지, 실수로 받을 것인지 구분
		// 2) 문자열인 경우 숫자와 '.'만이 존재하는 지 처리 / 실수인 경우 숫자와 '.' 이외의 값이 존재하는지 처리
		// 3) 화씨(F) > 섭씨(C) 공식 : (inputValue - 32) * 5 / 9
		
		//1. 변수, 클래스 정의
		Scanner sc;
		double inputFahrenheit, resultCelsius;	//입력받을 화씨 변수, 변환된 섭씨 변수

		//2. 변수, 클래스 초기화
		sc = new Scanner(System.in);
		inputFahrenheit = 0;
		resultCelsius = 0;
		
		
		//3. 검증, 예외 처리 단계
		inputFahrenheit = errorTest(sc);
		
		//4. 비지니스 로직 및 결과 처리
		
		
	}
	
	//검증, 예외처리 테스트 멤소드
	public static double errorTest(Scanner sc) {
		
		double inputFarenheit;
		String errorMsg;
		
		inputFarenheit = 0;
		errorMsg = "[Warning] Program Error : ";
		
		while(true) {
			
			try {
				
				System.out.print("input farenheeit : ");
				inputFarenheit = sc.nextDouble();
				return inputFarenheit;
				
			}catch(InputMismatchException e) {
				
				System.out.println(errorMsg+e.toString());
			}catch(Exception e) {
				
				System.out.println(errorMsg + e.toString());
			}finally {
				
				sc.nextLine();
			}
		}
	}
	//전달 받은 화씨를 섭씨로 변환 후 전달 해주는 메소드
	public double fahrenheitToCelsius(double fahrenheit) {
		 
		//1. 변수, 클래스 정의
		
		//2. 변수, 클래스 초기화
		
		 
		
		return 0.1;
	}
}
