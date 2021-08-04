package kr.jangboo.minhyeong.collection.set.controller;

import java.util.HashSet;
import java.util.Set;

import kr.jangboo.minhyeong.collection.set.model.service.HashSet2Service;
import kr.jangboo.minhyeong.collection.set.view.HashSet2View;
import kr.jangboo.minhyeong.util.PrintUtils;

public class HashSet2Controller {

	public static void main(String args[]) {
		
		// 문제 > HashSet에 저장된 모든 값을 출력하는 프로그램 작성
		// 배열의 매개변수로 HashSet을 담아 생성하면 배열로 객체가 변환되어 index를 가질 수 있다.
		// 또 하나의 방법은 Iterator클래스를 사용하는 것이다. Iterator란? 자바의 collection 요소들을 순차적으로 처리하기 위한  반복자(하나의 방식) 
		//Set은 key,index가 존재하지않는 value만 존재하며 중복된 값은 있을 수 없다.
		
		//1. 변수, 클래스 정의
		HashSet2View view;
		Set<String> firstNames;
		String msg;
		
		//2. 변수, 클래스 초기화
		view = new HashSet2View();
		firstNames = new HashSet<String>();
		msg = "";
		
		firstNames.add("Kim");
		firstNames.add("Kim");	//set성질은 중복값은 들어올 수 없다. 반환 타입은 true / false
		firstNames.add("Lee");
		firstNames.add("Park");
		firstNames.add("Choi");
		
		//3. 검증, 예외상황
		if(firstNames.size() < 1) {
			
			msg = "어떠한 값도 존재하지 않습니다.";
			PrintUtils.messageToPrintln(msg);
			return;
		}
		
		//4. 비지니스 로직
		//서비스는 호출하지 않는다 
		
		//결과
		view.printTofirstNames(firstNames);
	}
}
