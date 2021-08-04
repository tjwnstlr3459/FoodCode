package kr.jangboo.junsik.collection.controller;

import java.util.TreeSet;

import kr.jangboo.junsik.collection.service.TreeSetService15;

public class TreeSetController15 {
	public static void main(String[] args) {
		// creating TreeSet
		
		TreeSet<Integer> treeheadset = new TreeSet<Integer>();
		TreeSet<Integer> treeNumList = new TreeSet<Integer>();
		TreeSetService15 service = new TreeSetService15();
		
		treeNumList = service.getTreeSetList();

		System.out.println("treeNumList의 값들 : " + treeNumList);
		
		//treeNumList의 마지막 값 제거
		treeNumList.pollLast();
		
		System.out.println("마지막 값을 제거한 treeNumList : " + treeNumList);
	}
}
