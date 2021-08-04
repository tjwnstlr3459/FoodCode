package kr.jangboo.minhyeong.collection.list.controller;

import java.util.ArrayList;
import java.util.List;

import kr.jangboo.minhyeong.collection.list.model.service.ArrayList15Service;
import kr.jangboo.minhyeong.collection.list.view.ArrayLIst15View;
import kr.jangboo.minhyeong.util.PrintUtils;

public class ArrayList15Controller {

	public static void main(String args[]) {
		
		//문제 > 주어진 두 개의 배열을 하나로 결합하는 자바 프로그램을 작성하라.
		
		//1. 변수, 클래스 정의
		List<String> firstList, secondList, sumList;
		ArrayList15Service srvc;
		ArrayLIst15View view;
		String msg;
		
		//2. 변수, 클래스 초기화
		firstList = new ArrayList<String>();
		secondList = new ArrayList<String>();
		sumList = new ArrayList<String>();
		srvc = new ArrayList15Service();
		view = new ArrayLIst15View();
		msg = "";
		
		//배열에 추가할 값
		
		//3. 검증, 예외상황
		//두 개의 배열 모두 아무것도 들어있지 않는 경우 
		if(firstList.size() < 1 && secondList.size() < 1) {
			
			msg = "주어진 두 배열 모두 값이 들어있지 않습니다. size = 0";
			PrintUtils.messageToPrintln(msg);
			return;
		}
		
		//4. 비지니스 로직
		sumList = srvc.addAllTwoList(firstList, secondList);
		System.out.println(sumList.toString());
		//결과
		
	}
}
