package kr.jangboo.minhyeong.controller;

import java.util.ArrayList;
import java.util.List;

import kr.jangboo.minhyeong.model.service.Number7Service;
import kr.jangboo.minhyeong.util.PrintUtils;
import kr.jangboo.minhyeong.view.Number7View;

public class Number7Controller {

	public static void main(String args[]) {
		
		//판단은 controller에서 수행 한다 !!
		//너무 세분화(메소드화) 하려다 보면 오히려 명확하지 않게 된다.
		//즉, 과하지 않게 코딩하자
		
		//1. 변수, 클래스 정의
		Number7Service srvc;
		Number7View view;
		int length, maxLength;
		String msg;
		List<Integer> lucasSequence;
		//2. 변수, 클래스 초기화
		//(요청 값 : request)
		length = 10;
		srvc = new Number7Service();
		lucasSequence = new ArrayList<Integer>();
		//3. 검증, 예외상황 처리
		maxLength = Integer.MAX_VALUE;	//int(정수) 타입의 최대 값
		//길이가 0이하(음수 포함)
		if(length < 1 && length > maxLength) {
			
			msg = "입력 오류!\n1 ~ " + maxLength + "사이의 정수만 입력해주세요.";
			PrintUtils.messageToPrint(msg);
			return;
		//list(객체)가  null이고 접근한 경우 (지금 로직에선 생성이 되었기 때문에 경고 밑줄)
		}else if(lucasSequence == null) {
			
			msg = "[RuntimeException] Program Error : NullPointerException";
			PrintUtils.messageToPrint(msg);
			return;
		}
		//4. 비지니스 로직
		//list를  length와 같이 매개변수로 넘겨 주어 로직을 수행해 값을 받아온다.
		lucasSequence = srvc.insertLucasSequenceToList(lucasSequence, length);
		//view로 결과(list) 넘겨주기(응답 : response)
		view = new Number7View();
		view.printLucasSequence(lucasSequence);
		//프로그램 종료용 return
		return;
	}
}
