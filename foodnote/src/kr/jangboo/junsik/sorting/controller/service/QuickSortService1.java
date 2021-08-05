package kr.jangboo.junsik.sorting.controller.service;

import java.util.ArrayList;

public class QuickSortService1 {
	
	
	public int[] returnSort(int[] nums) {

		//변수 선언
		ArrayList<Integer> leftLowArr = new ArrayList<Integer>();
		ArrayList<Integer> rightHighArr = new ArrayList<Integer>();
		ArrayList<Integer> leftHighArr = new ArrayList<Integer>();
		ArrayList<Integer> rightLowArr = new ArrayList<Integer>();
		int pivot;
		int left;
		int right;
		int size;

		//초기화
		int QuickSortArr[] = new int[nums.length];
		pivot = 0;
		left = 1;
		right = nums.length - 1;
		size = 0;
		
		
		// 피벗 기준 큰값,작은값 나눠서 배열 넣기
		// left가 right를 지나갈때까지
		while (left <= right) {
			
			// pivot보다 left값중에 작은게 있다면
			if (nums[pivot] > nums[left]) {

				// 작은값 별도 배열에 저장
				leftLowArr.add(nums[left]);
				left++;
			} else {
				
				// 큰값 별도 배열 저장
				leftHighArr.add(nums[left]);
				left++;
			}

			// pivot보다 right값중에 큰게 있다면
			if (nums[pivot] < nums[right]) {

				// 큰값 별도 배열에 저장
				rightHighArr.add(nums[right]);
				right--;
			} else {
				
				// 작은값 별도 배열 저장
				rightLowArr.add(nums[right]);
				right--;
			}
		}

		
		//배열에 피벗 기준 작은 값들 먼저 넣기
		for (Integer i : rightLowArr) {
			QuickSortArr[size++] = i;
		}
		for (Integer i : leftLowArr) {
			QuickSortArr[size++] = i;
		}
		
		//피벗 넣기
		QuickSortArr[size++] = nums[pivot];

		//피벗 기준 큰 값들 마지막에 넣기
		for (Integer i : leftHighArr) {
			QuickSortArr[size++] = i;
		}
		for (Integer i : rightHighArr) {
			QuickSortArr[size++] = i;
		}

		return QuickSortArr;
	}
}
