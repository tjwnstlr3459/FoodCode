package kr.jangboo.minhyeong.model.vo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataType1 {

	public static void main(String args[]) {
		
		//문제 1 > 입력받은 화씨를 섭씨로 변환해 출력하는 자바프로그램 작성.
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
		sc.close();
		
		//4. 비지니스 로직 및 결과 처리
		resultCelsius = fahrenheitToCelsius(inputFahrenheit);
		
		//결과 출력
		printResult(inputFahrenheit, resultCelsius);
		
		
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
	public static double fahrenheitToCelsius(double fahrenheit) {
		 
		//1. 변수, 클래스 정의
		double celsius;
		
		//2. 변수, 클래스 초기화
		celsius = 0;
		
		//3. 검증, 예외처리 단계
		
		//4. 비지니스 로직 및 결과 처리
		fahrenheit = Math.round(fahrenheit*10)/10.0;		//3자리 이상의 소수점을 반올림하여 3자리 까지만 표현
		celsius = (fahrenheit - 32) * 5 / 9;
		return celsius;
	}
	
	//결과 출력 메소드
	public static void printResult(double inputFahrenheit, double resultCelsius) {
		System.out.printf("%.1f degree Fahrenheit equal to %.1f in Celsius", inputFahrenheit, resultCelsius);
	}
}
