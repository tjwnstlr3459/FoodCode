package kr.jangboo.junsik.collection.controller;

import java.util.HashMap;

import kr.jangboo.junsik.collection.service.HashMapService8;

public class HashMapController8 {
	public static void main(String args[]) {
		
		//클래스 및 변수 선언
		HashMap<Integer, String> hashMapList;
		HashMapService8 service;
		String str;
		String word;
		
		//초기화
		hashMapList = new HashMap<Integer, String>();
		service = new HashMapService8();
		str = "안녕하세요 저의 이름은 서준식 입니다.";	//사용자가 지정한 초기 문장
		
		
		//문장을 전달해주고, 단어별로 나눠 hashMap에 담아 가져온다
		hashMapList = service.getHashMapList(str);
		
				
		// 가져온 키와 값을 출력한다
		System.out.println("hashMap의 키 와 값 : " + hashMapList);
		
		//사용자가 확인하고 싶은 단어 지정
		word = "서준식";	
		
		//초기 문장 출력(비교를 위한)
		System.out.println(str);
		
		//사용자가 원하는 문자가 있는지 확인하고 출력하는 메소드
		service.wordValidationOutput(word,hashMapList);

	}
}
