package kr.jangboo.junsik.collection.service;

import java.util.TreeSet;

public class TreeSetService15 {

	public TreeSet<Integer> getTreeSetList() {
		
		//변수 및 클래스 선언
		TreeSet<Integer> treeNumList;
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		
		treeNumList = new TreeSet<Integer>();
		num1= 1;
		num2= 20;
		num3= 30;
		num4= 15;
		num5= 5;
		
		//treeSet에 저장
		treeNumList.add(num1);
		treeNumList.add(num2);
		treeNumList.add(num3);
		treeNumList.add(num4);
		treeNumList.add(num5);
		
		return treeNumList;
	}
}
