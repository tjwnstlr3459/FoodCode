package kr.jangboo.junsik.collection.controller;

import java.util.LinkedList;

import kr.jangboo.junsik.collection.service.LinkedListService9;

public class LinkedListController9 {
	public static void main(String[] args) {

		// 9. 연결 리스트의 지정된 위치에 있는 일부 요소를 삽입하는 Java 프로그램
		
		// 클래스 및 변수 선언
		LinkedList<String> linkList1 = new LinkedList<String>();
		LinkedList<String> linkList2 = new LinkedList<String>();
		LinkedListService9 service = new LinkedListService9();
		boolean verificationValue;
		
		//첫번째 배열값 가져오기
		linkList1 = service.getLikedList1();

		//두번째 배열값 가져오기
		linkList2 = service.getLikedList2();

		//검증
		verificationValue = service.checkingArrayAdd(linkList1,linkList2);
		
		//검증 결과가 [참]이여야 출력
		if(verificationValue) {
			
			System.out.println(linkList1);
		}
	}
}
