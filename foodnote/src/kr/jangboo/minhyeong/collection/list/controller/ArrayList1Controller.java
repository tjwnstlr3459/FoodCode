package kr.jangboo.minhyeong.collection.list.controller;

import java.util.ArrayList;
import java.util.List;

import kr.jangboo.minhyeong.collection.list.model.service.ArrayList1Service;
import kr.jangboo.minhyeong.collection.list.view.ArrayList1View;
import kr.jangboo.minhyeong.util.PrintUtils;

public class ArrayList1Controller {

	public static void main(String args[]) {
		
		//문제 1 > arrayList에 색상(문자열)을 추가하고 전부 출력시키는 자바프로그램을 작성하라
		//배열 > list : Arrays.adList(배열);
		
		//1. 변수, 클래스 정의
		List<String> colorList;
		String[] inputColor = {"red", "blue", "green", "yellow"};
		String msg;
		ArrayList1Service srvc;
		ArrayList1View view;
		
		//2. 변수, 클래스 초기화
		colorList = new ArrayList<String>();
		msg = "";
		srvc = new ArrayList1Service();
		view = new ArrayList1View();
		
		//3. 검증, 예외 상황
		if(inputColor.length < 1) {
			
			msg = "아무것도 입력되지 않았습니다. [ IndexOutOfBoundsException ] 발생될 것이기에 프로그램을 종료합니다.";
			PrintUtils.messageToPrint(msg);
			return;
		}
		
		//4. 비지니스 로직
		colorList = srvc.addColorToList(inputColor);
				
		//결과
		view.printToColors(colorList);
	}
}
