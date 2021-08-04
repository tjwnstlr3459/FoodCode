package kr.jangboo.junsik.collection.controller;

import java.util.Collections;
import java.util.PriorityQueue;

import kr.jangboo.junsik.collection.service.PriorityQueueService3;

public class PriorityQueueController3 {
	public static void main(String[] args) {
		
		//3. 우선순위 대기열인 배열에 ​​다른 배열을 합침으로서 우선순위 재정렬하기 
		PriorityQueueService3 service = new PriorityQueueService3();
		PriorityQueue<Integer> queueLowFirstList = new PriorityQueue<Integer>();
		PriorityQueue<Integer> queueHighFirstList;
		
		//초기화(높은값 먼저 출력 후, 나머지값 출력)
		queueHighFirstList = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		
		
		
		//낮은순의 PriorityQueue의 배열을 리턴   [9, 2, 5] -> [2, 9, 5]
		queueLowFirstList = service.getPriorityQueList();
		
		//높은순의 PriorityQueue의 배열을 리턴   [1, 7, 4] -> [7, 1, 4]
		queueHighFirstList = service.getPriorityQueReversList();
		
		//[1, 2, 4, 9, 7, 5]
		//두배열의 낮은 값 먼저 출력한 다음에 나머지 값들은 순서대로 출력
		queueLowFirstList.addAll(queueHighFirstList);
		System.out.println("두 배열이 합쳐진 순위출력: " + queueLowFirstList);
	}
}
