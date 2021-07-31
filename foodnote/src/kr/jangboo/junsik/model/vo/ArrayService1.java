package kr.jangboo.junsik.model.vo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayService1 {
	
	ReqularExpession reqExp = new ReqularExpession();
	

	//메뉴를 선택하는 메소드
	public HashMap<String, Integer> arrayChoice() {
		//전역 변수 선언
		HashMap<String, Integer> map;		//메뉴번호와 배열사이즈 를 담기위한 변수
		Scanner sc;				//메뉴번호의 정규표현식
		int size;							//배열 사이즈
		
		
		//변수선언
		map =  new HashMap<String, Integer>();
		sc = new Scanner(System.in);
		String menuNumber;
		size = 0;
		
		
		//메뉴 선택 반복문
		while (true) {
			try {
				
				//메뉴선택
				System.out.println("1.숫자     2.문자    3.종료");
				System.out.print("번호 : ");
				menuNumber = sc.nextLine();
				
				//공백 입력시
				if (menuNumber.equals("")) {
					
					System.out.println("공백입니다.입력을 해주세요");
				} else 
				
				//메뉴번호 정규표현식으로 조건문
				if (menuNumber.matches(reqExp.onlyMenuNum())) {
					
					int menuNum = Integer.parseInt(menuNumber);
					
					//메뉴에서 숫자 &&문자 배열 선택시
					if (0 < menuNum && menuNum < 3) {
						
						//배열 사이즈 선택 반복문
						while (true) {
							
							System.out.print("배열에 사이즈 입력 : ");
							String str = sc.nextLine();
							size = Integer.parseInt(str);

							//사이즈 정상입력시
							if (0 < size) {

								map.put("size", size);
								break;
							
							//잘못 입력시 배열 사이즈 입력 반복
							} else {

								System.out.println("정수로 입력해 주세요");
							}
						}

						// 메뉴넘버 Controller에 넘기기
						map.put("menuNum", menuNum);
						break;
						
					//배열 사이즈 메뉴에서 [3] 종료 선택시
					} else if (menuNum == 3) {

						map.put("menuNum", menuNum);
						map.put("size", size);
						System.out.println("종료합니다.");
						break;
						
					//배열 사이즈 메뉴에서 	잘못 입력시
					} else {
						
						System.out.println("정수를 입력해 주세요");
					}
				//초기 메뉴에서 잘못 입력시
				} else {
					
					System.out.println("1번 ~ 3번 을 선택해주세요");
				}

			} catch (NumberFormatException e) {

				System.out.println("번호를 입력해 주세요  ");
			} catch (InputMismatchException e) {

				System.out.println("잘못된 인자를 전달");
			} catch (Exception e) {

				System.out.println("에러 발생");
			}
		}
		return map;
	}
	
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	
	
	//배열에 값을 넣기 위한 메소드
	public void arrInsert(int size, int menuNum) {
		
		//변수 선언
		Scanner sc;
		ArrayList<String> arrStr;
		ArrayList<Double> arrNum;
		
		//초기화
		 sc = new Scanner(System.in);
		 arrStr = new ArrayList<>();
		 arrNum = new ArrayList<>();
		 
		//동작 로직
		for (int i = 1; i < size + 1; i++) {

			System.out.print(i + "번째 입력 : ");

			// 숫자배열 선택시 값넣기
			if (menuNum == 1) {

				String str = sc.nextLine();
				
				if(str.matches(reqExp.onlyNum())) {
					
					Double num = Double.parseDouble(str);
					
					arrNum.add(num);
					
				// 배열 추가 오류시
				} else {

					System.out.println("숫자만 입력해 주세요");
					i--;
				}
				
				
			
			// 문자배열 선택시 값넣기 
			} else {

				String str = sc.nextLine();

				// 정규표현식 문자열 검사
				if (str.matches(reqExp.reqExpStr)) {

					arrStr.add(str);
				
				// 배열 추가 오류시
				} else {

					System.out.println("문자열만 입력해 주세요");
					i--;
				}
			}
		}

		// 내가 입력한 배열 출력
		System.out.println("내가 입력한 배열");
		for (int i = 0; i < size; i++) {

			if (menuNum == 1) {

				// 1 == 숫자
				System.out.print(formatD(arrNum.get(i)) + " ");
			} else {

				// 2 == 문자
				System.out.print(arrStr.get(i) + " ");

			}
		}
		System.out.println();

		// 메뉴번호에 해당하는 배열 정렬
		if (menuNum == 1) {
			
			Collections.sort(arrNum);
		} else {
			
			Collections.sort(arrStr);
		}

		// 정렬된 배열 출력
		System.out.println("정렬된 배열순");
		for (int i = 0; i < size; i++) {
			
			//숫자 배열 출력
			if (menuNum == 1) {

				System.out.print(formatD(arrNum.get(i)) + " ");
			
			//문자배열 출력
			} else {

				System.out.print(arrStr.get(i) + " ");
			}
		}
		System.out.println();
	}


	// double에 적용된 숫자 소수점이 0인경우 0제거
	public String formatD(double number) {
		
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(number);
	}
}
