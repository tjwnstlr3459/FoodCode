package kr.jangboo.junsik.collection.service;


import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueService3 {

	
	//낮은순의 PriorityQueue의 배열값을 먼저 리턴
	public PriorityQueue<Integer> getPriorityQueList(){
		
		//클래스 및 변수 선언
		PriorityQueue<Integer> queueList = new PriorityQueue<Integer>();
		int num1;
		int num2;
		int num3;
		
		//초기화
		num1 = 9;
		num2 = 2;
		num3 = 5;
		
		queueList.add(num1);
		queueList.add(num2);
		queueList.add(num3);
		
		System.out.println("queueList : " + queueList);
		return queueList;
		
	}
	
	//높은순의 PriorityQueue의 배열값을 먼저 리턴
	public PriorityQueue<Integer> getPriorityQueReversList(){
		
		//클래스 및 변수 선언
		PriorityQueue<Integer> queueReversList;
		int num1;
		int num2;
		int num3;
		
		//초기화
		queueReversList = new PriorityQueue<Integer>(Collections.reverseOrder());
		num1 = 1;
		num2 = 7;
		num3 = 4;
		
		queueReversList.add(num1);
		queueReversList.add(num2);
		queueReversList.add(num3);
		
		System.out.println("queueReversList : " + queueReversList);
		return queueReversList;
	}
}
