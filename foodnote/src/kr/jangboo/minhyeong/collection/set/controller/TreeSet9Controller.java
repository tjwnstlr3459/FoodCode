package kr.jangboo.minhyeong.collection.set.controller;

import java.util.Set;
import java.util.TreeSet;

import kr.jangboo.minhyeong.collection.set.model.service.TreeSet9Service;
import kr.jangboo.minhyeong.collection.set.view.TreeSet9View;

public class TreeSet9Controller {

	public static void main(String args[]) {
		
		//문제 > HashSet을 이용한 7보다 작은 숫자를 출력하는 자바 프로그램 작성
		
		//1. 변수, 클래스 정의
		TreeSet9Service srvc;
		TreeSet9View view;
		Set<Integer> numList;
		int numSeven;
		
		//2. 변수, 클래스 초기화
		srvc = new TreeSet9Service();
		view = new TreeSet9View();
		numList = new TreeSet<Integer>();
		numSeven = 7;
		
		//1 ~ 10이 존재하는 TreeSet값 초기화
		for(int i = 1; i <= 10; i++) {
			
			numList.add(i);
		}
		
		//3. 검증, 예외상황
		
		//4. 비지니스 로직
		//단순 로직은 서비스 생략...
		
		//업캐스팅으로 생성된 treeSet을 다시 다운캐스팅하여 TreeSet의 기능을 사용
		numList = ((TreeSet<Integer>)(TreeSet)numList).headSet(numSeven);
		
		//결과 반환
		view.printToLessThanNumber(numList);
		
	}
}
