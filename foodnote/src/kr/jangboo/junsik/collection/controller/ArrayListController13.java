package kr.jangboo.junsik.collection.controller;

import java.util.ArrayList;

import kr.jangboo.junsik.collection.service.ArrayListService13;

public class ArrayListController13 {
	public static void main(String[] args) {
		
		// 13. 두 개의 배열 목록을 비교하는 Java 프로그램
		
		ArrayList<String> arrColorList1 = new ArrayList<String>();
		ArrayList<String> arrColorList2 = new ArrayList<String>();
		ArrayList<String> arrayComparison = new ArrayList<String>();
		
		ArrayListService13 service = new ArrayListService13();
			
		//ArrayList1의 값을 가져온다
		arrColorList1 = service.getArrayList1();
		
		//ArrayList2의 값을 가져온다
		arrColorList2 = service.getArrayList2();

		
		//arrList1의 반복문
		for (String arr1 : arrColorList1) {
			
			//arr3에 arr2를 넣으면서 arr1을 비교한다
			//contatins으로 비교 대입시 [참/거짓] 으로 나온다
			arrayComparison.add(arrColorList2.contains(arr1) ? "O" : "X");
		}
		
		//arr3에는 arr1과 arr2의 비교값이 출력된다
		System.out.println(arrayComparison);
	}
}
