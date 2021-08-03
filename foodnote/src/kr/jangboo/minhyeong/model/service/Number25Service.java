package kr.jangboo.minhyeong.model.service;

import java.util.List;

public class Number25Service {

	public List<Integer> insertPellNumberToList(List<Integer> pellNumberList, long length) {

		//service : 비지니스 로직이 실행되는 
		//검증되어 매개변수로 받아온 값을 메소드로서의 기능을 수행하고 반환한다.
		
		//			0, 1(1*2+0), 2(2*2+1), 5(5*5+2), ...
		// 자기자신을 제곱한 뒤 이전 숫자와 더하기 한 합이 다음 숫자가 된다.
		//1. 변수, 클래스 정의
		int pn1, pn2, resultMtp;	//mtp > multiply
		
		//2. 변수, 클래스 초기화
		pn1 = 0;
		pn2 = 1;
		resultMtp = 0;
		
		//3. 검증, 예외상황
		
		//4. 비지니스 로직
		for(int i = 1; i <= length; i++) {
			
			//수열의 첫번째인 경우 > 0
			if(i == 1) {
				
				pellNumberList.add(pn1);		// 0
			//수열의 두번째인 경우 > 1
			}else if(i == 2) {
				
				pellNumberList.add(pn2);		// 1
			//수열의 세번째 이상인 경우
			}else {
				
				//자신을 곱하기 2 하고 이전 수열과 더하기한 값
				resultMtp = pn2 * 2 + pn1;	//5	//12	//29	...
				//pell공식으로 계산된 값을 pellNumberList에 저장한다.
				pellNumberList.add(resultMtp);
				//pn1변수에는 pn2변수의 값을 대입한다.
				pn1 = pn2;					//2	//5		//12
				//pn2변수에는 pell공식으로 계산된 resultMtp변수의 값을 대입한다.
				pn2 = resultMtp;			//5	//12	//29
			}
		}
		//pellNumber가 대입된 list 결과를 반환
		return pellNumberList;
	}

	
}
