package kr.jangboo.minhyeong.collection.queue.controller;

import java.util.PriorityQueue;

import kr.jangboo.minhyeong.collection.queue.model.service.PriorityQueue4Service;
import kr.jangboo.minhyeong.collection.queue.view.PriorityQueue4View;
import kr.jangboo.minhyeong.util.PrintUtils;

public class PriorityQueue4Controller {

	public static void main(String args[]) {
		
		// 문제 > 값이 존재하는 우선순위 큐에 주어진 값을 insert하고 출력하는 프로그램을 작성하라
		
		//1. 변수, 클래스 정의
		PriorityQueue4Service srvc;
		PriorityQueue4View view;
		PriorityQueue<Integer> pQueue;
		String msg;
		int inputValue;
		
		//2. 변수, 클래스 초기화
		srvc = new PriorityQueue4Service();
		view = new PriorityQueue4View();
		pQueue = new PriorityQueue<Integer>();
		
		pQueue.add(20);
		pQueue.add(30);
		pQueue.add(40);
		pQueue.add(50);
		msg = "";
		inputValue = 10;
		
		//3. 검증, 예외상황
		if(pQueue.size() < 1) {
			
			msg = "값이 하나도 존재하지 않습니다.";
			PrintUtils.messageToPrintln(msg);
			return;
		}
		
		//4. 비지니스 로직
		//단순 추가/출력이라서 service 생략...
		//offer()는 삽입
		pQueue.offer(inputValue);

		//결과
		view.printToPriorityQueue(pQueue);
	}
}
