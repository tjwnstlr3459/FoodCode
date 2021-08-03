package kr.jangboo.junsik.controller;

import kr.jangboo.junsik.model.service.FileService15;

public class FileController15 {
	public static void main(String a[]) {
		
		// 15. 일반 텍스트 파일을 쓰고 읽는 Java 프로그램을 작성
		
		//클래스 선언 및 변수 선언
		FileService15 service = new FileService15();
		String inputStr;
		String filePath;
		
		//초기화
		filePath = "C:/Users/SeoJunsik/Desktop/test.txt";
		
		
		//파일에 저장될 내용 사용자로부터 입력받기
		inputStr = service.inputStr();
		
		
		//[파일 위치 확인] 및 [내용 전달]
		boolean fileResultValue = service.specifyFileLocation(filePath, inputStr);
		
		//파일에 저장이 잘 되었다면
		if(fileResultValue) {
			
			//파일에 대한 내용 라인 단위로 출력
			service.getFileContents(filePath);
		}
	}
}
