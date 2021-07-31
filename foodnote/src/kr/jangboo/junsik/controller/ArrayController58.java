package kr.jangboo.junsik.controller;

import java.util.ArrayList;
import java.util.HashMap;

import kr.jangboo.junsik.model.vo.ArrayService58;

public class ArrayController58 {

	public static void main(String args[]) {
		
		//58.크기가 p와 q인 두 개의 정렬된 배열 A와 B가 주어지면 
		//정렬된 순서를 유지하여 A의 요소를 B와 병합하는 Java 프로그램을 작성
		
		// 1) 배열길이가 정해진 2배열
		// 2) 2배열을 병합
		// 3) 병합된 내용을 정렬
		// 4) 정렬된 내용을 다시 길이가 정해진 배열에 넣기
		// 5) 화면단 출력
		
		//메소드화
		//배열을 넣는 메소드
		//배열을 합쳐 정렬하는 메소드
		//합친 배열을 다시 순서대로 2배열에 넣기
		
		//변수 및 클래스 선언
		ArrayService58 service;
		ArrayList<Integer> arrList;
		HashMap<String, Object> map;
		int arr1[];
		int arr2[];
		
		//초기화
		service = new ArrayService58();
		arrList = new ArrayList<Integer>();
		map = new HashMap<String, Object>();
		arr1 = new int[5];
		arr2 = new int[3];
		//동작 로직
		
		//각각의 배열에 임의 값 넣는 메소드
		arrList = service.arrayInsert(arr1,arr2);
		
		//리스트를 정렬하고 다시 배열에 넣는 작업
		service.arrayListOutput(arrList,arr1,arr2);
	}
}



















