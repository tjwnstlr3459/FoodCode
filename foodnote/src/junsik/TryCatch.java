package junsik;

import java.util.Scanner;


public class TryCatch {

	public String tryCatch(Object str) {
		
		try {
			
		}catch(NumberFormatException e) {
			
			System.out.println("문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환시 발생  ");
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("인덱스를 벗어났습니다");
		}catch (ClassCastException e) {
			
			System.out.println("변환할 수 없는 타입으로 객체를 반환");
		}catch(NullPointerException e) {
			
			System.out.println("널 포인트 예외가 발생했습니다.");
		}catch(IllegalArgumentException e) {
			
			System.out.println("잘못된 인자를 전달 ");
		}catch(Exception e) {
			
			System.out.println("오류 발생");
		}
		
		return null;
	}

	public boolean tryCatch() {
		boolean bool = true;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("준식 트라이캣치 번호 입력해 : ");
			String str = sc.next();
			
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("인덱스를 벗어났습니다");
			bool= false;
		}catch (ClassCastException e) {
			
			System.out.println("변환할 수 없는 타입으로 객체를 반환");
			bool= false;
		}catch(NullPointerException e) {
			
			System.out.println("널 포인트 예외가 발생했습니다.");
			bool= false;
		}catch(IllegalArgumentException e) {
			
			System.out.println("잘못된 인자를 전달 ");
			bool= false;
		}
		
		return bool;
	}
}
