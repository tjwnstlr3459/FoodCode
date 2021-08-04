package kr.jangboo.junsik.collection.service;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetService10 {
	// 첫번째 배열을 전달하는 메소드
	public HashSet<String> getHashSet1() {

		// 클래스 및 변수 선언
		HashSet<String> hashSet1 = new HashSet<String>();
		String red;
		String yellow;
		String green;
		String white;

		// 초기화
		red = "red";
		yellow = "yellow";
		green = "green";
		white = "white";

		// 대입
		hashSet1.add(red);
		hashSet1.add(yellow);
		hashSet1.add(green);
		hashSet1.add(white);

		return hashSet1;
	}

	// 두번째 배열을 전달하는 메소드
	public HashSet<String> getHashSet2() {

		// 클래스 및 변수 선언
		HashSet<String> hashSet2 = new HashSet<String>();
		String red;
		String black;
		String green;
		String pupple;

		// 초기화
		red = "red";
		black = "black";
		green = "green";
		pupple = "pupple";

		// 대입
		hashSet2.add(red);
		hashSet2.add(black);
		hashSet2.add(green);
		hashSet2.add(pupple);

		return hashSet2;
	}

	public ArrayList<String> checkingArrayAdd(HashSet<String> hashSet1, HashSet<String> hashSet2) {

		//클래스 선언
		ArrayList<String> hashSetResult = new ArrayList<String>();

		try {
			
			for (String element : hashSet1) {
				//hash2가 hash1의 값을 비교한후 그 결과를 result에 담는다
				hashSetResult.add(hashSet2.contains(element) ? "Yes " : "No ");
			}
			
		} catch (Exception e) {

			System.out.println("오류 발생" + e.getMessage());
		}
		return hashSetResult;
	}
}
