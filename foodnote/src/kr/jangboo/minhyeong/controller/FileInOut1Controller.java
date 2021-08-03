package kr.jangboo.minhyeong.controller;

import java.io.File;

import kr.jangboo.minhyeong.model.service.FileInOut1Service;
import kr.jangboo.minhyeong.util.PrintUtils;
import kr.jangboo.minhyeong.view.FileInOut1View;

public class FileInOut1Controller {

	public static void main(String args[]) {
		
		//문제 1 > 주어진 경로안에 존재하는 파일의 이름을 모두 출력하는 프로그램 작성
		
		//1. 변수, 클래스 정의
		String repository, msg;
		String[] fileList;
		File file;
		boolean fileExsits;
		FileInOut1View view;
		//2. 변수, 클래스 초기화
		msg = "";
		repository = "C:\\Users\\MInHyeong\\Desktop\\TraningFolder";	//저장경로
		file = new File(repository);									//저장경로를 인자로 받아 생성된 File클래스
		fileExsits = file.exists();										//저장경로에 파일의 존재유무를 있으면 true / 없으면 false 반환
		//3. 검증, 예외 상황
		//파일이 존재하는 경우
		if(fileExsits) {
			
		//파일이 존재하지 않는 경우	
		}else {
			
			//메세지를 출력메소드에 파라미터로 넘겨주어 결과를 출력시키고 프로그램을 종료한다.
			msg = "파일이 존재하지 않습니다.";
			PrintUtils.messageToPrint(msg);
			return;
		}
		//4. 비지니스 로직
		//로직이라 할 것도 없는...
		fileList = file.list();					//저장경로에 존재하는 파일들을 String[]배열로 리턴한다.		
		//결과
		view = new FileInOut1View();
		//결과를 view클래스 역할의 메소드로 전달
		view.printFileList(fileList);
		//프로그램 종료용 return
	}
}
