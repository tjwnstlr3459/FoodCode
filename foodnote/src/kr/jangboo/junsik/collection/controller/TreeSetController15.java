package kr.jangboo.junsik.collection.controller;

import java.util.TreeSet;

import kr.jangboo.junsik.collection.service.TreeSetService15;

public class TreeSetController15 {
	public static void main(String[] args) {
		
		// 15. 트리 세트의 마지막 요소를 검색하고 제거
		
		//클래스 선언
		TreeSet<Integer> treeNumList = new TreeSet<Integer>();
		TreeSetService15 service = new TreeSetService15();
			
		//트리
		treeNumList = service.getTreeSetList();

		System.out.println("treeNumList의 값들 : " + treeNumList);
		
		//treeNumList의 마지막 값 제거
		treeNumList.pollLast();
		
		System.out.println("마지막 값을 제거한 treeNumList : " + treeNumList);
	}
}
