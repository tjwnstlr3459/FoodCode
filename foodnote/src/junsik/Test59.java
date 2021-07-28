package junsik;

import java.util.Scanner;

public class Test59 {
	// 문장에서 소문자로 변환
	public static void main(String args[]) {

		// 변수 선언
		Scanner sc;
		String str;
		String strArr;

		// 초기화 선언
		sc = new Scanner(System.in);
		str = null;
		strArr = null;
		
		System.out.print("문장에서 소문자로 변환");
		// 로직처리
		while (true) {
			
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

				// 소문자로 변경 후 값 넣기
				for (int i = 0; i < txtArr.length; i++) {
					strArr = txtArr[i].toLowerCase();
					// 출력
					System.out.print(strArr + " ");
				}
				break;
			}
		}
		sc.close();
	}
}
