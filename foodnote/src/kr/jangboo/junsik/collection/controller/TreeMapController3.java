package kr.jangboo.junsik.collection.controller;

import java.util.TreeMap;

import kr.jangboo.junsik.collection.service.TreeMapService3;

public class TreeMapController3 {
	public static void main(String args[]) {

		// 3. 트리 맵에서 키를 검색하는 Java 프로그램
		// hashMap과는 다르게 트리구조라 키정렬이 되어있고, 오름차순 및 내림차순 또한 다양하게 가능
		
		TreeMap<Integer, String> treeMapList = new TreeMap<Integer, String>();
		TreeMapService3 service = new TreeMapService3();
		int keyNum;

		treeMapList = service.getTreeMapList();

		// 키값이 순서를 뒤죽박죽 넣어도 출력은 순서대로 출력된다
		System.out.println(treeMapList);

		// 사용자가 찾고싶은 키값 입력
		keyNum = 1;

		//사용자가 찾는 키값이 존재하는지 확인하는 메소드
		service.checkKeyValueOutput(treeMapList, keyNum);

	}
}
