package junsikCon;

import java.util.Scanner;

import junsikService.Condition30Service;

public class Condition30 {
	public static void main(String args[]) {

		// 30. 3개의 숫자열을 받고 각각의 숫자열을 비교후
		// i번째 같거나 틀리면 그에 맞게 표현

		// 변수 선언
		double[] arr; // 숫자열 담기
		int count; // 3번 담았을때의 상태 변수
		Scanner sc;
		String reqExp; // 정규표현식을 위한 변수
		Condition30Service service;

		// 초기화
		arr = new double[3];
		sc = new Scanner(System.in);
		count = 0;
		reqExp = "^[0-9+.-]+$";
		service = new Condition30Service();

		// 클라에게 숫자열 받기
		while (true) {
			for (int i = 1; i < 4; i++) {

				// i 번째 숫자 입력
				service.que1(i);
				String str = sc.nextLine();

				// 정규표현식으로 숫자문구만 받는 조건
				if(str.equals("")) {
					
					//미 입력시
					service.que2();
					i--;
				}else if (str.matches(reqExp)) {

					// 정규표현식에 적합하면 숫자문자열->숫자 변경
					arr[i - 1] = Double.parseDouble(str);
					// 총 3번까지 숫자열을 받기 위한 카운트
					count++;
				} else {

					// 숫자 외 다른 문자열 입력될 경우
					service.que3();
					i--;
				}
			}

			// 총 3번의 숫자열을 받으면 while문 종료
			if (count == 3) {
				break;
			}
		}

		// 3개의 숫자열 검증 및 실행
		service.check(arr);
		sc.close();
	}
}
