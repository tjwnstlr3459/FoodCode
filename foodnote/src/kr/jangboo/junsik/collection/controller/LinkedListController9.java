package kr.jangboo.junsik.collection.controller;

import java.util.LinkedList;

import kr.jangboo.junsik.collection.service.LinkedListService9;

public class LinkedListController9 {
	public static void main(String[] args) {

		// 9. 연결 리스트의 지정된 위치에 있는 일부 요소를 삽입하는 Java 프로그램
		
		// LinkedList :
		// ArrayList 에 비해 데이터의 추가, 삭제에 유리하며 데이터 검색 시에는 성능을 고려해야 한다.
		// [삽입,삭제]가 이루어지는 작업에는 linkedList가 메모리 낭비를 막아 더욱 좋다
		// 하지만 순차접근만이 가능하기에 검색기능에는 유용하지 않다

		// 클래스 및 변수 선언
		LinkedList<String> linkList1 = new LinkedList<String>();
		LinkedList<String> linkList2 = new LinkedList<String>();
		LinkedListService9 service = new LinkedListService9();
		boolean verificationValue;

		// 첫번째 배열값 가져오기
		linkList1 = service.getLikedList1();

		// 두번째 배열값 가져오기
		linkList2 = service.getLikedList2();

		// 검증
		verificationValue = service.checkingArrayAdd(linkList1, linkList2);

		// 검증 결과가 [참]이여야 출력
		if (verificationValue) {

			System.out.println(linkList1);
		}
	}
}
