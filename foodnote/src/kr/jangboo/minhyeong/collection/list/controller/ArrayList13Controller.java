package kr.jangboo.minhyeong.collection.list.controller;

import java.util.ArrayList;
import java.util.List;

import kr.jangboo.minhyeong.collection.list.model.service.ArrayList13Service;
import kr.jangboo.minhyeong.collection.list.view.ArrayList13View;
import kr.jangboo.minhyeong.util.PrintUtils;

public class ArrayList13Controller {

	public static void main(String args[]) {
		
		//문제  > 두 개의 배열을 비교하여 중복 값을 제외한 값만 새로운 배열에 저장하는 프로그램을 작성
		
		//1. 변수, 클래스 정의
		List<String> nameList1, nameList2, sumList;
		ArrayList13Service srvc;
		ArrayList13View view;
		String msg;
		
		//2. 변수, 클래스 초기화
		nameList1 = new ArrayList<String>();
		nameList2 = new ArrayList<String>();
		sumList = new ArrayList<String>();
		srvc = new ArrayList13Service();
		view = new ArrayList13View();
		msg = "";
		
		//nameList1 값 추가
		nameList1.add("Kim");
		nameList1.add("Seo");
		nameList1.add("Park");
		//nameList2 값 추가
		nameList2.add("Seo");
		nameList2.add("Park");
		nameList2.add("Lee");
		
		//3. 검증, 예외 상황
		//두 개의 배열 모두 아무것도 들어있지 않는 경우 
		if(nameList1.size() < 1 && nameList2.size() < 1) {
			
			msg = "주어진 두 배열 모두 값이 들어있지 않습니다.";
			PrintUtils.messageToPrintln(msg);
			return;
		}
		//4. 비지니스 로직
		sumList = srvc.overlapExclusion(nameList1, nameList2);
		// 결과
		view.printToSumList(sumList);
	}
}
