package kr.jangboo.junsik.collection.controller;

import java.util.TreeSet;

import kr.jangboo.junsik.collection.service.TreeSetService15;

public class TreeSetController15 {
	public static void main(String[] args) {
		
		// 15. 트리 세트의 마지막 요소를 검색하고 제거
		
		//클래스 선언
		TreeSet<Integer> treeNumList = new TreeSet<Integer>();
		TreeSetService15 service = new TreeSetService15();
			
		//treeNumList의 값을 가져오기
		treeNumList = service.getTreeSetList();

		//treeNumList의 기본값 출력
		System.out.println("treeNumList의 값들 : " + treeNumList);
		
		//treeNumList의 마지막 값 제거
		treeNumList.pollLast();
		
		//treeNumList의 pollLast 적용된 값 출력
		System.out.println("마지막 값을 제거한 treeNumList : " + treeNumList);
	}
}
