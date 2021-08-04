package kr.jangboo.junsik.collection.service;

import java.util.HashMap;
import java.util.StringTokenizer;

public class HashMapService8 {
	public HashMap<Integer, String> getHashMapList(String str) {
		
		//클래스 및 변수 선언
		HashMap<Integer, String> hashMapList;
		StringTokenizer stringTokenizer;
		int count;
		
		//초기화
		hashMapList = new HashMap<Integer, String>();
		stringTokenizer = new StringTokenizer(str," ");
		count = 1;
		
		//문장의 조각 단위로 hashMap에 저장
		while(stringTokenizer.hasMoreTokens()) {
					
			//키값과 함께 단어별로 저장
			hashMapList.put(count, stringTokenizer.nextToken());
			
			//integer의 키값을 올려준다
			count++;
		}

		return hashMapList;
	}
	
	//사용자가 원하는 문자가 있는지 확인하는 메소드
	public void wordValidationOutput(String word, HashMap<Integer, String> hashMapList) {
		
		//문자 포함여부 조건
		if (hashMapList.containsValue(word)) {
			
			System.out.println("포함된 단어입니다.");
		} else {
			
			System.out.println("포함되지 않았습니다.");
		}
	}
	
}
