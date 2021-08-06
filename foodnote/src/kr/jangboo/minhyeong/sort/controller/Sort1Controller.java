package kr.jangboo.minhyeong.sort.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import kr.jangboo.minhyeong.sort.model.service.Sort1Service;
import kr.jangboo.minhyeong.sort.view.Sort1View;

public class Sort1Controller {

	public static void main(String args[]) {
		
		//문제 > Quick Sort 알고리즘
		//pivot이라는  리스트 안에 있는 한 요소를 선택 값을 가지고 기준이되어 작은 값 / 큰 값을 리스트로 2분할 하여 나누어진 리스트에서 정렬진행 후 결합하는 알고리즘
		
		//pivot과 리스트의 first, last
		
		//1. 변수, 클래스 선언
		List<Integer> bSortList;
		List<Integer> sortedList;
		Sort1Service srvc;
		Sort1View view;
		Set<Integer> overlapCatch;		//중복 없이 list에 들어가도록 set 사용
		int rdNumber, first, last;
		
		//2. 변수, 클래스 초기화
		srvc = new Sort1Service();
		view = new Sort1View();
		overlapCatch = new HashSet<Integer>();
		bSortList = new ArrayList<>();				// List<타입지정> 했을때 생성/초기화에서 타입을 축약해도된다.
		sortedList = new ArrayList<Integer>();
		
		//정렬 전 list에 랜덤한 값을 넣어준다.(set 사용) 중복 값 없이 10개의 수가 들어가도록 반복한다.
		while(overlapCatch.size() <= 10) {
			
			rdNumber = (int)(Math.random()*50)+1; //1 ~ 50 사이의 난수(랜덤한 수)
			overlapCatch.add(rdNumber);
			
		}
		bSortList = new ArrayList<Integer>(overlapCatch);
		
		//3. 검증, 예외 상황
		//로직 구현에 힘쓰자...
		
		//4. 비지니스 로직
//		bSortList.add(40);
//		bSortList.add(20);
//		bSortList.add(60);
//		bSortList.add(70);
//		bSortList.add(80);
//		bSortList.add(50);
//		bSortList.add(35);
//		bSortList.add(30);
//		bSortList.add(90);
//		bSortList.add(65);
		first = 0;						//시작 값이자 퀵정렬에 쓰일 최소index 변수
		last = bSortList.size() - 1;	//끝 값이자 퀵정렬에 쓰일 최대index 변수
		
		System.out.println(bSortList.toString());
		
		sortedList = srvc.quickSortToList(bSortList, first, last);
		//5. 결과
		view.printToSortedList(sortedList);
	}
}
