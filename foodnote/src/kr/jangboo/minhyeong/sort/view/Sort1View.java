package kr.jangboo.minhyeong.sort.view;

import java.util.List;

import kr.jangboo.minhyeong.util.PrintUtils;

public class Sort1View {

	public void printToSortedList(List<Integer> sortedList) {

		for(Integer sorted : sortedList) {
			
			PrintUtils.messageToPrint(sorted+" ");
		}
	}

}
