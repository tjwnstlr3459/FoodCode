package kr.jangboo.minhyeong.number.model.service;


import java.util.ArrayList;
import java.util.List;

public class Number7Service {

	//list와 length변수를 매개변수로 이전에 검증되어 온 값이기 때문에 length이 바뀌어도 바뀐 결과로 반환된다.(본연의 기능 수행 가능)
	public List<Integer> insertLucasSequenceToList(int length) {
		
		//service는 로직을 수행하는 역할이고 매개변수가 무엇이 와도 본연의 기능을 다할 수 있는 로직을 구성해야한다.
		//1. 변수, 클래스 정의
		int ln1, ln2, resultAdd;
		List<Integer> lucasSequence;
		//2. 변수, 클래스 초기화
		ln1 = 2;
		ln2 = 1;
		lucasSequence = new ArrayList<Integer>();
		//3. 검증, 예외 상황
		
		//4. 비지니스 로직
		//입력된 길이가 1인 경우
		if(length == 1) {
			
			lucasSequence.add(ln1);
		//길이가 2인 경우
		}else if(length == 2) {
			
			lucasSequence.add(ln1);
			lucasSequence.add(ln2);
		//길이가 3 이상인 경우
		}else {
			
			lucasSequence.add(ln1);
			lucasSequence.add(ln2);
			//공식 ln1 + ln2 = ln(변수 초기화)
			resultAdd = 0;
			for(int i = 3; i <= length; i++) {
				
				resultAdd = ln1 + ln2;		//3	//4	//7	...
				ln1 = ln2;				//1	//3	//4
				ln2 = resultAdd;				//3	//4	//7
				lucasSequence.add(resultAdd);	//resultAdd을 list에 추가
			}
		}
		//결과 반환
		return lucasSequence;
	}

	
}
