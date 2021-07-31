package kr.jangboo.junsik.model.vo;

import java.text.DecimalFormat;

public class ConditionService30 {

	public int check(double[] arr) {

		// 변수 선언
		int result;
		double num1, num2, num3;

		// 초기화
		result = -1;
		num1 = arr[0];
		num2 = arr[1];
		num3 = arr[2];

		// 검증
		try {

			System.out.println(formatD(num1) + " " + formatD(num2) + " " + formatD(num3) + " ");

			if (num1 != num2 && num2 != num3 && num1 != num3) {

				System.out.println("서로의 숫자가 모두 다릅니다.");
			} else if (num1 == num2 && num1 == num3) {

				System.out.println("모든 숫자가 같습니다.");
			} else {

				System.out.println("하나만 다릅니다.");
			}

			// 로직 성공시 전달할 리턴값 저장
			result = 1;

		} catch (NumberFormatException e) {

			System.out.println("입력을 잘못 하셨습니다");
		} catch (Exception e) {

			System.out.println("에러발생");
		}

		return result;
	}

	// 사용자에게 숫자열 받기
	public void que1(int i) {
		// 변수 선언
		String que1;

		// 초기화
		que1 = "번째 숫자 입력 : ";

		// 로직
		System.out.print(i + que1);
	}

	//double에 적용된 숫자 소수점이 0인경우 0제거
	public String formatD(double number) {
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(number);

	}

	// 사용자에게 숫자열 받기
	public void que2() {
		// 변수 선언
		String que1;

		// 초기화
		que1 = "숫자를 입력해 주세요";

		// 로직
		System.out.println(que1);
	}

	// 숫자열 받기 중 오류
	public void que3() {
		// 변수 선언
		String que2;

		// 초기화
		que2 = "숫자 외 다른 문자가 입력됨";

		// 동작로직
		System.out.println(que2);
	}
}
