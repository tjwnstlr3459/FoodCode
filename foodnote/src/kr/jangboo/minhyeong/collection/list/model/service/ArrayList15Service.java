package kr.jangboo.minhyeong.collection.list.model.service;

import java.util.ArrayList;
import java.util.List;

public class ArrayList15Service {

	public List<String> addAllTwoList(List<String> firstList, List<String> secondList) {
		
		List<String> sumList;
		
		sumList = new ArrayList<String>();
		
		//매개변수로 받아온 두 개의 배열을 하나로 합치는 과정
		sumList.addAll(firstList);
		sumList.addAll(secondList);
		
		//합친 하나의 배열을 반환
		return sumList;
	}

}
