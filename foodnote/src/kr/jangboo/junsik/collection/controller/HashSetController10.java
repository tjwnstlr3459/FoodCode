package kr.jangboo.junsik.collection.controller;

import java.util.ArrayList;
import java.util.HashSet;

import kr.jangboo.junsik.collection.service.HashSetService10;

public class HashSetController10 {
	public static void main(String[] args) {
		
		//두 해시 집합을 비교하는 Java 프로그램을 작성
		HashSet<String> hashSet1 = new HashSet<String>();
		HashSet<String> hashSet2 = new HashSet<String>();
		ArrayList<String> hashSetResult = new ArrayList<String>();
		HashSetService10 service = new HashSetService10();
		
		//hashSet1에 저장된 값 가져오기
		hashSet1 = service.getHashSet1();
		
		//hashSet2에 저장된 값 가져오기
		hashSet2 = service.getHashSet2();
		
		//검증
		hashSetResult = service.checkingArrayAdd(hashSet1,hashSet2);
		
		//검증 적합시 출력
		System.out.println(hashSetResult);
	}
}
