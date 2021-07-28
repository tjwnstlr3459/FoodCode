package junsik;

import java.util.Scanner;

public class Test60 {
	// 문장의 단어 찾아내기
	public static void main(String args[]) {

		// 변수 선언
		Scanner sc;
		String str;
		String strArr;
		int strNum;

		// 초기화 선언
		sc = new Scanner(System.in);
		str = null;
		strArr = null;
		strNum = 0;

		System.out.println("문장의 단어 골라내기");
		while (true) {
			// 로직처리
			System.out.print("문장을 영어로 적어주세요 : ");
			str = sc.nextLine();

			// 검증
			if (str.equals("")) {
				// 미입력시
				System.out.println("문장을 입력해 주세요");
			} else {

				// 입력시
				// split을 이용한 문자열 분리
				String[] txtArr = str.split("\\s");

				try {

					// 순서번호 입력
					System.out.print("찾으실 문장 순서번호를 입력해주세요 : ");
					strNum = sc.nextInt();
					// 출력
					System.out.print(txtArr[strNum - 1]);
				} catch (ArrayIndexOutOfBoundsException e) {

					System.out.println("인덱스를 벗어났습니다");
				} catch (ClassCastException e) {

					System.out.println("변환할 수 없는 타입으로 객체를 반환");
				} catch (NullPointerException e) {

					System.out.println("널 포인트 예외가 발생했습니다.");
				} catch (IllegalArgumentException e) {

					System.out.println("잘못된 인자를 전달 ");
				}
				break;
			}
		}
		sc.close();
	}
}
