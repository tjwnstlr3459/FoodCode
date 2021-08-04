package kr.jangboo.minhyeong.collection.list.controller;

import java.util.LinkedList;
import java.util.List;

import kr.jangboo.minhyeong.collection.list.model.service.LinkedList6Service;
import kr.jangboo.minhyeong.collection.list.view.LinkedList6View;
import kr.jangboo.minhyeong.util.PrintUtils;

public class LinkedList6Controller {

	public static void main(String args[]) {
		
		//문제 > 주어진 배열에 주어진 값 2개를 배열 처음과 마지막에 추가하는 프로그램 작성 > ex) 요일
		
		//1. 변수, 클래스 정의
		List<String> dateList;
		String msg, firstStr, lastStr;
		LinkedList6Service srvc;
		LinkedList6View view;
		
		//2. 변수, 클래스 초기화
		dateList = new LinkedList<String>();
		msg = "";
		firstStr = "Sunday";
		lastStr = "Saturday";
		srvc = new LinkedList6Service();
		view = new LinkedList6View();
		
		dateList.add("Monday");
		dateList.add("Tuesday");
		dateList.add("Wednesday");
		dateList.add("Thursday");
		dateList.add("Friday");
		
		//3. 검증, 예외상황
		//dateList의 길이가 1 보다 낮은 경우 > 배열에 값이 없는 경우
		if(dateList.size() < 1) {
			
			msg = "배열에 값이 들어있지 않습니다.";
			PrintUtils.messageToPrintln(msg);
			return;
		}
		
		//4. 비지니스 로직
		dateList = srvc.insertFirstAndLast(dateList, firstStr, lastStr);
		//결과 전달
		view.printToDateList(dateList);
	}
}
