package junsik;

import java.util.Scanner;

public class Test61 {
	// 문장의 단어 순서 반전주기
	public static void main(String args[]) {

		// 변수선언
		Scanner sc;
		String str;
		String reverse;
		StringBuffer sb;

		// 초기화
		sc = new Scanner(System.in);
		str = null;
		reverse = null;
		sb = null;

		// 로직처리
		System.out.print("단어를 입력하시오 : ");
		str = sc.next();

		// 검증
		if (str.equals("")) {

			System.out.println("단어를 입력하시오");
		} else {

			// reverse
			sb = new StringBuffer(str);
			reverse = sb.reverse().toString();

			// 출력
			System.out.println(reverse);
		}

		sc.close();
	}
}
