package kr.jangboo.junsik.model.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayService58 {
	
	//정규표현식 클래스를 전역변수로 지정
	ReqularExpession reqExp = new ReqularExpession();

	public ArrayList<Integer> arrayInsert(int[] arr1, int[] arr2) {

		// 선언
		Scanner sc;
		ArrayList<Integer> arrList;

		// 초기화
		sc = new Scanner(System.in);
		arrList = new ArrayList<Integer>();

		// 동작로직
		// 1번째 배열에 값 넣기
		System.out.println("길이가 5인 배열에 정수 넣기");
		for (int i = 1; i < arr1.length + 1; i++) {
			
			System.out.print(i + "번 배열 : ");
			String arrNum = sc.nextLine();

			//arrNum가 정규표현식에 적합한지에 대한 조건문
			if (arrNum.matches(reqExp.onlyNum2())) {
				
				arr1[i - 1] = Integer.parseInt(arrNum);
				arrList.add(arr1[i - 1]);
			
			//정규표현식에 맞지 않다면 다시 입력
			} else {
				System.out.println("정수만 입력해주세요!");
				i--;
			} 

		}
		System.out.println();

		// 2번째 배열에 값 넣기
		System.out.println("길이가 3인 배열에 정수 넣기");
		for (int i = 1; i < arr2.length + 1; i++) {
			System.out.print(i + "번 배열 : ");
			
			String arrNum = sc.nextLine();
			
			if (arrNum.matches(reqExp.onlyNum2())) {
				
				arr2[i - 1] = Integer.parseInt(arrNum);
				arrList.add(arr2[i - 1]);
			} else {
				System.out.println("정수를 입력해주세요!");
				i--;
			}
			
		}
		
		//클라이언트가 넣은 arr1의 배열
		System.out.println("arr1 의 배열");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		//클라이언트가 넣은 arr2의 배열
		System.out.println("arr2 의 배열");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		return arrList;
	}

	
	//병합된 배열을 정렬후 출력
	public void arrayListOutput(ArrayList<Integer> arrList, int[] arr1, int[] arr2) {

		//선언
		HashMap<String, Object> map;
		
		//초기화
		map = new HashMap<String, Object>();

		//리스트 정렬
		Collections.sort(arrList);
		
		//정렬된 리스트를 각각의 배열에 담기
		for (int i = 0; i < arrList.size(); i++) {
			
			//arr1의 길이만큼만 넣어주기
			if (i < 5) {
				arr1[i] = arrList.get(i);
				
			//arr2의 길이만큼만 넣어주기
			} else {
				arr2[i - 5] = arrList.get(i);
			}
		}

		// 두 배열을 병합한 배열 출력
		System.out.print("두 배열을 하나의 배열로 병합\n[ ");
		for (int i : arrList) {
			
			System.out.print(i + " ");
		}
		System.out.println(" ]");

		//정렬된 arr1의 배열 출력
		System.out.println("정렬된 arr1 출력");
		for (int i = 0; i < arr1.length; i++) {
			
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		//정렬된 arr1의 배열 출력
		System.out.println("정렬된 arr2 출력");
		for (int i = 0; i < arr2.length; i++) {
			
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}
}
