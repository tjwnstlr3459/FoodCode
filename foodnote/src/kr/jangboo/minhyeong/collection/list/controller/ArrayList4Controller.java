package kr.jangboo.minhyeong.collection.list.controller;

import java.util.ArrayList;
import java.util.List;

import kr.jangboo.minhyeong.collection.list.model.service.ArrayList4Service;
import kr.jangboo.minhyeong.collection.list.view.ArrayList4View;
import kr.jangboo.minhyeong.util.PrintUtils;

public class ArrayList4Controller {

	public static void main(String args[]) {
		
		//문제 > 주어진 배열에서 입력값(int)을 주어 검색하는 자바 프로그램으 작성
		
		//1. 변수, 클래스 정의
		List<String> cityList;
		String msg;
		int inputNum;
		ArrayList4Service srvc;
		ArrayList4View view;
		
		//2. 병수, 클래스 초기화
		cityList = new ArrayList<String>();
		msg = "";
		inputNum = 3;
		srvc = new ArrayList4Service();
		view = new ArrayList4View();
		
		//list는 일반적으로 생성 후 .add()로 값을 하나하나 저장한다.
		cityList.add("Seoul");
		cityList.add("Busan");
		cityList.add("Incheon");
		cityList.add("Daegu");
		//3. 검증, 예외 상황
		if(inputNum < 1) {
			
			msg = "1 이상 숫자를 입력해주세요.";
			PrintUtils.messageToPrintln(msg);
			return;
		}else if(cityList.size() <= inputNum) {
			
			msg = "입력한 값이 주어진 배열을 벗어났습니다.  [ IndexOutOfBoundsException ] 발생!!\n프로그램을 종료합니다.";
			PrintUtils.messageToPrintln(msg);
			return;
		}
		
		//4. 비지니스 로직
		msg = srvc.getCityName(cityList, inputNum);
		
		// 결과
		view.printToCityName(msg);
	}
}
