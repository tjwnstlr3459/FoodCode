package kr.jangboo.minhyeong.view;

import kr.jangboo.minhyeong.util.PrintUtils;

public class FileInOut1View {

	public void printFileList(String[] fileList) {
		
		//foreach를 사용하여 존재하는 값을 모두 출력한다.
		for(String fileName : fileList) {
			
			PrintUtils.messageToPrint("Filename in Repository : "+fileName);
		}
	}

}
