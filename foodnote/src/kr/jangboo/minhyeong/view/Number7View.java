package kr.jangboo.minhyeong.view;

import java.util.List;

import kr.jangboo.minhyeong.util.PrintUtils;

public class Number7View {

	public void printLucasSequence(List<Integer> lucasSequence) {
		
		//문제 7 > 첫 10개의 루카스 숫자를 출력하는 자바프로그램을 작성하라.
		//		  n1+n2=n3 ... 루카스 수열 문제임 (피보나치 수열과 비슷, 첫번째 항과 두번째 항만 다르다)
		
		//(sts : mvc) client의 요청을 controller(매핑) > service > Dao(db) > service > controller > view
		PrintUtils.messageToPrint(lucasSequence.toString());
	}
}
