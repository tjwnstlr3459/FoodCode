package kr.jangboo.junsik.collection.service;

import java.util.LinkedList;

public class LinkedListService9 {

	// 첫번째 배열을 전달하는 메소드
	public LinkedList<String> getLikedList1() {

		// 클래스 및 변수 선언
		LinkedList<String> linkList1 = new LinkedList<String>();
		String red;
		String yellow;
		String green;

		// 초기화
		red = "red";
		yellow = "yellow";
		green = "green";

		// 대입
		linkList1.add(red);
		linkList1.add(yellow);
		linkList1.add(green);

		// 첫번째 값 출력
		System.out.println("첫번째 배열 :" + linkList1);

		return linkList1;
	}

	// 두번째 배열을 전달하는 메소드
	public LinkedList<String> getLikedList2() {

		// 클래스 및 변수 선언
		LinkedList<String> linkList2 = new LinkedList<String>();
		String black = "black";
		String pupple = "pupple";

		// 초기화
		black = "black";
		pupple = "pupple";

		linkList2.add(black);
		linkList2.add(pupple);

		// 두번째 값 출력
		System.out.println("두번째 배열 :" + linkList2);

		return linkList2;
	}

	public boolean checkingArrayAdd(LinkedList<String> linkList1, LinkedList<String> linkList2) {

		try {
			
			// 인덱스 1번위치에 arr2배열 추가
			// 기존 배열은 arr2가 삽입되었으므로 뒤로 밀려남
			linkList1.addAll(1, linkList2);
			return true;
			
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("인덱스를 벗어났습니다" + e.getMessage());
		} catch (Exception e) {

			System.out.println("오류 발생 " + e.getMessage());
		}
		return false;
	}	
}





