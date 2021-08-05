package kr.jangboo.junsik.sorting.controller;

public class SortingController2 {
	public static void main(String args[]) {

		// 2. 버블정렬을 해보자!
		
		//변수 선언 및 초기화
		int arrNum[] = { 22, 12, 2, 32, 9 };
		
		
		System.out.print("기존 배열 순서 : ");
		for (int i : arrNum) {
			System.out.print(i + " ");	// [ 22 12 2 32 9 ]
		}
		System.out.println();
		
		
		//버블정렬 메소드로 보내 정렬된 배열을 리턴받자
		int[] bubbleSortArr = bublleSort(arrNum);

		System.out.print("버블정렬된 배열 순서 : ");
		for (int i : bubbleSortArr) {
			System.out.print(i+" ");	// [ 2 9 12 22 32 ]
		}
	}
	
	
	
	//버블 정렬시키는 메소드
	public static int[] bublleSort(int[] arrNum) {

		int temp = 0;
		// 배열길이에 -1 까지만 검사
		for (int i = 0; i < arrNum.length - 1; i++) {

			// 4번 3번 2번 1번 식으로 진행하면서
			// 뒤에서부터 크기가 정렬이 된다
			for (int j = 0; j < arrNum.length-i-1; j++) {

				// 앞뒤의 번호크기별 조건문
				if (arrNum[j] > arrNum[j + 1]) {

					temp = arrNum[j];

					arrNum[j] = arrNum[j + 1];

					arrNum[j + 1] = temp;
				}
			}
		}
		return arrNum;
	}
}
