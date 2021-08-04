package kr.jangboo.minhyeong.collection.list.model.service;

import java.util.ArrayList;
import java.util.List;

public class ArrayList13Service {

	public List<String> overlapExclusion(List<String> nameList1, List<String> nameList2) {
		
		List<String> sumList;
		
		sumList = new ArrayList<String>();
		
		//중복 값을 제외하고 add() 시키되 조건은 삼항연산자 사용할 것이다.
		//1. 첫 배열을 합친 배열의addAll(list)한다.
		sumList.addAll(nameList1);
		//2. 첫 배열이 들어간 sumList에 .constains()를 사용해 true : 있다,중복,저장안함 / false : 없다,저장함
		for(String firstName : nameList2) {
			
			if(sumList.contains(firstName) == false) {
				
				sumList.add(firstName);
			}
		}
		//결과 반환
		return sumList;
	}

}
