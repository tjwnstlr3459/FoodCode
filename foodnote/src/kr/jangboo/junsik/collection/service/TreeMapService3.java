package kr.jangboo.junsik.collection.service;

import java.util.TreeMap;

public class TreeMapService3 {

	public TreeMap<Integer, String> getTreeMapList() {
		TreeMap<Integer, String> treeMapList = new TreeMap<Integer, String>();

		// 키값이 순서를 뒤죽박죽 넣어도 출력은 순서대로 출력된다
		treeMapList.put(3, "Red");
		treeMapList.put(2, "Green");
		treeMapList.put(4, "Black");
		treeMapList.put(1, "White");

		return treeMapList;
	}

	
	//사용자가 찾는 키값이 존재하는지 확인하는 메소드
	public void checkKeyValueOutput(TreeMap<Integer, String> treeMapList, int keyNum) {
		
		//사용자가 넘겨준 키값 확인 조건문
		if (treeMapList.containsKey(keyNum)) {
			
			//존재하는 키값이면 value값까지 같이 출력
			System.out.println(keyNum+"의 키값이 존재합니다.["+treeMapList.ceilingEntry(keyNum)+"]");
		} else {
			
			System.out.println(keyNum+"의 키값은 존재하지 않습니다.");
		}
	}
}
