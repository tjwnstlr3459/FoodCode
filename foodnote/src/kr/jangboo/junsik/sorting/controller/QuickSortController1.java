package kr.jangboo.junsik.sorting.controller;

import java.util.ArrayList;

import kr.jangboo.junsik.sorting.controller.service.QuickSortService1;

public class QuickSortController1 {
	public static void main(String args[]) {

		// 1. 퀵정렬을 이용한 배열 정렬

		// 퀵정렬이란 :
		//

		// 퀵정렬 방식
		// 하나의 pivot(기준)을 지정하여,
		// pivot 기준으로 배열의 높거나 낮은 값들을 각각의 부분리스트로 나눈다
		// 각각의 리스트에 대해 재귀적으로 수행하여 정렬
		
		//클래스선언
		QuickSortService1 service = new QuickSortService1();

		// 사용자가 지정한 초반 배열 순서
		int nums[] = { 7, 3, 10, 1, 4, 5, 25 };

		
		while (true) {

			int count = 0;		//인덱스값 비교시 정렬이 맞으면 카운트
			
			nums = service.returnSort(nums);
			
			for (int j = 0; j < nums.length - 1; j++) {

				if (nums[j] < nums[j + 1]) {

					count++;
					if (count == nums.length - 1) {

						for (int h : nums) {

							System.out.print(h + " ");
						}
						return;
					}

				}
			}
		}
	}
}
