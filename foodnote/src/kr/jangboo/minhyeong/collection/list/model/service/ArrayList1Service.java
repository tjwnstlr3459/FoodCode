package kr.jangboo.minhyeong.collection.list.model.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1Service {

	public List<String> addColorToList(String[] inputColor) {

		List<String> colorList;
		
		colorList = new ArrayList<String>();
		
		//방식 1 > Arrays.asList() 를 사용하는 것 배열을 리스트로 변환 > 배열이 매개변수인 경우 사용가능
		
		colorList = Arrays.asList(inputColor);
		//방식 2 > 배열의 길이만클 for문을 반복 실행해 .add()를 사용할 수 있다 > 배열, 단일 값 모두 사용 가능
		/*
		for(int i = 0; i < inputColor.length; i++) {
			
			colorList.add(inputColor[i]);
		}
		*/
		return colorList;
	}

}
