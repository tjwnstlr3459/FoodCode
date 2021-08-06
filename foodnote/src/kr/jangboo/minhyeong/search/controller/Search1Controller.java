package kr.jangboo.minhyeong.search.controller;

import java.util.ArrayList;
import java.util.List;

import kr.jangboo.minhyeong.search.model.service.Search1Service;
import kr.jangboo.minhyeong.search.view.Search1View;
import kr.jangboo.minhyeong.util.Algorithms;

public class Search1Controller {

	public static void main(String args[]) {
		
		//문제 1 > 이진 탐색(BinarySearch) : 정렬되어있는 배열에서 중간의 값을 선택해 찾는 값과 비교하여 크거나 적은 경우 다시 중간의 값을 선택하고 이를 반복해 특정 값을 찾는 검색 알고리즘이다.
		
		//1. 변수, 클래스 선언
		Algorithms agrtm;
		Search1Service srvc;
		Search1View view;
		List<Integer> sortedList;
		int first, last, targetNum, resultNum;
		
		//2. 변수, 클래스 초기화
		agrtm = new Algorithms();
		srvc = new Search1Service();
		view = new Search1View();
		sortedList = new ArrayList<>();
		sortedList.add(43);
		sortedList.add(34);
		sortedList.add(42);
		sortedList.add(78);		//targetNum
		sortedList.add(12);
		sortedList.add(99);
		sortedList.add(58);
		sortedList.add(61);
		sortedList.add(28);
		sortedList.add(85);
		targetNum = 78;
		
		//3. 검증, 예외처리
		// 알고리즘 구현에 힘쓰자!
		
		
		//4. 비지니스 로직
		//일단 정렬된 배열이 필요하기 때문에 퀵정렬을 재사용해보았다.
		first = 0;
		last = sortedList.size() - 1;
		sortedList = agrtm.quickSortToList(sortedList, first, last);
		
		//이진 탐색 호출
		resultNum = srvc.binarySearchResult(sortedList, targetNum);
		System.out.println(resultNum);
		
		//결과
		view.printToBinarySearchResult(resultNum, targetNum);
		
	}
}
