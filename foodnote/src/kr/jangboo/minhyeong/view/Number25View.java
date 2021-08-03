package kr.jangboo.minhyeong.view;

import java.util.List;

import kr.jangboo.minhyeong.util.PrintUtils;

public class Number25View {

	public void printPellNumber(List<Integer> pellNumberList) {

		//결과를 view로 전달(응답) PrintUrils클래스의 출력메소드로 화면역할.
		PrintUtils.messageToPrint(pellNumberList.toString());
	}

}
