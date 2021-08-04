package kr.jangboo.minhyeong.collection.list.view;

import java.util.List;

import kr.jangboo.minhyeong.util.PrintUtils;

public class ArrayList1View {

	public void printToColors(List<String> colorList) {
		
		for(String color : colorList) {
			
			PrintUtils.messageToPrintln(color);
		}
		
	}

}
