package junsik;

import java.util.Scanner;

public class Test67 {
	public static void main(String args[]) {

		// 변수 선언
		String str;
		Scanner sc;
		StringBuffer sb;
		TryCatch tc = new TryCatch();

		// 초기화
		str = null;
		sc = new Scanner(System.in);
		sb = new StringBuffer();

		while (true) {
			
			// 동작로직
			System.out.print("문장 입력 : ");
			str = sc.nextLine();

			if (str.equals("")) {
				System.out.println("문장을 입력해주세요");
			} else {

				// 검증
				try {
					// 단어 추가하기
					System.out.print("문장 중앙에 추가할 단어를 입력해주세요 : ");
					str = sc.next();

					// 문장 변수에 넣기
					sb.append(str);
					System.out.println(sb);

					// 문장 중간에 단어 추가 후 출력
					sb.insert(sb.length() / 2, " " + str + " ");
					System.out.println(sb);

				} catch (ArrayIndexOutOfBoundsException e) {

					System.out.println("인덱스를 벗어났습니다");
				} catch (ClassCastException e) {

					System.out.println("변환할 수 없는 타입으로 객체를 반환");
				} catch (NullPointerException e) {

					System.out.println("널 포인트 예외가 발생했습니다.");
				} catch (IllegalArgumentException e) {

					System.out.println("잘못된 인자를 전달 ");
				}
			}
			sc.close();
		}
	}
}
