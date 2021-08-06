package kr.jangboo.junsik.search.controller;

import java.util.Arrays;
import java.util.List;

public class SearchController1 {
	public static void main(String args[]) {

		// 1. 이진 검색을 사용하여 주어진 배열에서 지정된 요소를 찾자

		// 이진탐색이란 :
		// 이진탐색(Binary Search) 알고리즘은 원소를 반으로 분할(분류)하여 찾는 방법

		// 이진탐색을 하기 위해서는 배열이 정렬이 되어있는 상태여야한다

		// 1) 메인메소드에서 찾고자 하는 번호를 재귀함수에 넘김
		// 2) 재귀함수에는 [배열],[찾는번호]를 파라미터로 넘겨주자
		// 3) 재귀함수에 넘어온 번호를 배열내에서 검색
		// 4) 배열의 중앙 기준 일치, 중앙 기준보다 작을시, 중앙 기준보다 클때 를 기준으로
		//    반복 및 리턴

		// 배열 선언
		List<Integer> arrList;	//배열값
		int seachNum;			//찾을번호
		int presenceStatus;		//존재여부
		
		// 초기화
		arrList = Arrays.asList(3,6,9,12,15,18);
		seachNum = 2;	//6번을 찾아보자
		
		//찾는 값이 배열에 존재하는지 파악하는 메소드
		presenceStatus = binarySearch(arrList, seachNum);

		//값의 존재여부 조건문
		if (presenceStatus > -1) {
			
			//존재할 경우 인덱스 번호와 같이 출력해준다
			System.out.println(seachNum + "번은 배열 인덱스번호가 " + presenceStatus + " 입니다.");
		} else {

			//존재하지 않을 경우
			System.out.println(seachNum + "은 배열 내에 존재하지 않습니다.");
		}
	}

	public static int binarySearch(List<Integer> arrList, int seachNum) {

		//변수 선언
		int left;	//배열의 왼쪽	(시작값)
		int right;	//배열의 오른쪽	(끝 값)
		int mid;	//배열의 중앙 	(중앙값)

		//초기화
		left = 0;
		right = arrList.size() - 1;
		mid = 0;

		// 배열 시작값이 끝값보다 작으면 계속 진행
		while (left <= right) {

			//배열의 중앙 인덱스값 구하기
			mid = (left + right) / 2;

			//배열 인덱스번호가 [미만]또는[초과]일때
			//[미만][초과] 거르는 조건문이 아래 있을경우, 조건문을 못 탄다
			if (arrList.indexOf(seachNum) == -1 || arrList.get(right) < seachNum) {
				
				//찾는 번호가 없을 경우 while문 종료
				break;
			}

			// 사용자가 찾는값이 배열의 중앙에 위치할경우
			else if (arrList.get(mid) == seachNum) {

				//중앙 인덱스 값을 리턴
				return mid;

			// 찾는값이 배열의 중앙기준으로 클 경우
			} else if (arrList.get(mid) < seachNum) {

				//left시작점에 mid++한 인덱스값 지정
				left = mid++;

			// 찾는값이 배열의 중앙보다 작을경우
			} else if (arrList.get(mid) > seachNum) {

				//left시작점에 mid--한 인덱스값 지정
				right = mid--;
			}
		}
		return -1;
	}
}
