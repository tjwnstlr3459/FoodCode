package kr.jangboo.minhyeong.collection.queue.controller;

import java.util.PriorityQueue;
import java.util.Queue;

import kr.jangboo.minhyeong.collection.queue.model.service.PriorityQueue9Service;
import kr.jangboo.minhyeong.collection.queue.view.PriorityQueue9View;
import kr.jangboo.minhyeong.util.PrintUtils;

public class PriorityQueue9Controller {

	public static void main(String args[]) {
		
		//문제 > 주어진 값이 들어간 우선순위 큐에서 첫 번째 요소를 제거하고 출력하는 프로그램 작성
		
		//PriorityQueue(우선순위 큐)는 우선순위가 정해져 작은 값인 경우 큐에서 제일 작은 값 하나를 먼저 출력(out)시키고 나머지 값은 순차적으로 출력(out) > 우선순위 반대 정의 시 큰값 하나만 먼저 출력(out)
		//우선순위 default는 작은 값
		
		//1. 변수, 클래스 정의
		PriorityQueue9Service srvc;
		PriorityQueue9View view;
		Queue<Integer> pQueue;
		String msg;
		
		//2. 변수, 클래스 초기화
		srvc = new PriorityQueue9Service();
		view = new PriorityQueue9View();
		pQueue = new PriorityQueue<Integer>();
		msg = "";
		pQueue.add(54);
		pQueue.add(77);
		pQueue.add(41);
		pQueue.add(99);
		pQueue.add(81);
		pQueue.add(22);
		pQueue.add(101);
		//3. 검증, 예외 상황
		if(pQueue.size() < 1) {
					
			msg = "값이 존재하지 않습니다.";
			PrintUtils.messageToPrintln(msg);
			return;
		}
		
		//4. 비지니스 로직
		//단순 값 제거 후 출력이기 때문에 서비스 생략
		pQueue.poll();					//poll() 은 큐에 존재하는 우선순위가 작은 값을 삭제 시킨다.(처음 요소를 삭제시키는것이 아님)
		
		//결과
		view.printToPriorityQueue(pQueue);
		
	}
}
