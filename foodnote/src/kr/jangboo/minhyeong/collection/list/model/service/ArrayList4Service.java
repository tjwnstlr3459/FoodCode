package kr.jangboo.minhyeong.collection.list.model.service;

import java.util.List;

public class ArrayList4Service {

	//주어진 값으로 배열을 조회하여 도시이름을 반환하는 메소드
	public String getCityName(List<String> cityList, int inputNum) {
		
		//.get(index) : index(정수)에 해당하는 배열의 값을 반환한다.
		return "입력한 번호에 해당하는 도시는 "+cityList.get(inputNum)+" 입니다.";
	}

}
