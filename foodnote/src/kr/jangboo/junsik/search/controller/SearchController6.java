package kr.jangboo.junsik.search.controller;

import java.util.Arrays;
import java.util.List;

public class SearchController6 {

	// 6. 삼항 검색을 사용하여 주어진 요소 배열에서 지정된 요소를 찾아보자

	// 삼항 검색이란 (ternary search):
	// 삼항 검색은 [분할 정복 알고리즘]의 예 이다
	// [분할 정복 알고리즘] = 문제를 작은 문제로 분할하여 찾아가는 과정의 알고리즘

	//-----------------------------------------------------------------
	// [삼항 검색] 진행 원리
	// 1. 배열을 3단계로 분리

	// left 				right
	// [ 1 ](기준1)[ 2 ](기준2)[ 3 ]

	// 2. (기준점)들 기준으로 찾는 값을 찾는것
	// 3. 찾는값이 (기준1)보다 큰경우
	// 4. [ 1 ] 배열값들은 찾는값보다 작은거라 버리고
	// 5. left에 (기준1)의 값을 넣어,

	//left 	   				right
	// (기준1)[ 2 ](기준2)[ 3 ]

	// 6. left(기준1) ~ right까지 다시 한번 검색
	// 7. 반복

	public static void main(String args[]) {

		// 변수 서언
		List<Integer> arrList;
		int presenceStatus; // search값 존재유무
		int searchNum; // 사용자가 찾고자 하는 값
		int left; // 배열의 왼쪽 (시작값)
		int right; // 배열의 오른쪽 (끝 값)

		// 초기화
		arrList = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24); // 12개
		searchNum = 10; // 찾을값 10번 지정
		left = 0;
		right = arrList.size() - 1; // 12개

		// 삼항검색을 이용한 배열 내 번호 찾기
		presenceStatus = ternarySearch(arrList, searchNum, left, right);

		// 리턴값이 -1이상인지에 대한 조건문
		if (presenceStatus > -1) {

			// 적합시
			System.out.println(searchNum + "번의 배열 인덱스 번호는 " + presenceStatus + "번 입니다.");
		} else {

			// 리턴값이 -1 인경우(부적합)
			System.out.println(searchNum + "번은 배열 내에 존재하지 않습니다.");
		}
	}

	public static int ternarySearch(List<Integer> arrList, int searchNum, int left, int right) {

		// 변수 선언
		int mid1;
		int mid2;

		// 초기화
		mid1 = left + (right - left) / 3; 		// 0 + (12 - 0) /3 = 4
		mid2 = left + 2 * (right - left) / 3; 	// 0 + 2*(12 - 0) /3 = 8
												// 기준점 [4][8] 기준으로 값 찾기
												// 0, 1, 2, 3, [4], 5, 6, 7, [8], 9, 10, 11
		// 배열 [첫인덱스 값]이 [길이 값]보다 작으면 진행
		if (left > right) {

			// 찾는 숫자가 앞을 경우 리턴
			return -1;
		} else

		// 1번째 기준점에 적합할시
		if (arrList.get(mid1) == searchNum) {

			return mid1;
		} else

		// 2번째 기준점에 적합할시
		if (arrList.get(mid2) == searchNum) {

			return mid2;
		} else

		// 1번째 기준점보다 [찾는 값]이 큰경우
		if (arrList.get(mid1) < searchNum) {

			// 기존의 left값을 버리고
			// 앞으로 mid1+1 로 초기화
			left = mid1 + 1;
		} else

		// 2번째 기준점보다 [찾는 값]이 작은경우
		if (arrList.get(mid2) > searchNum) {

			// 기존의 right값을 버리고
			// 앞으로 mid2-1 로 초기화
			right = mid2 - 1;
		}

		// 재귀함수를 이용하여 다시 재검색
		return ternarySearch(arrList, searchNum, left, right);
	}
}
