package kr.jangboo.junsik.model.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileService15 {

	//사용자에게 입력받을 문자열 받기
	public String inputStr() {
		
		//클래스 선언
		Scanner sc = new Scanner(System.in);
		System.out.print("내용 입력 : ");
		String inputStr = sc.nextLine();
		
		return inputStr;
	}

	//사용자로부터 받은 [경로]와 [입력내용]을 확인 후 저장하는 메소드
	public boolean specifyFileLocation(String filePath, String inputStr) {
		
		//리턴값 변수 선언
		boolean result = false;
		
		try {
			// 파일 작성 위치선정 및 작성내용 적용
			FileWriter fw = new FileWriter(filePath);

			// 작성내용 지정파일에 저장
			fw.write(inputStr);
			fw.close();
			
			result = true;

			// 입출력문에 관한 오류
		} catch (IOException e) {
			
			//입출력 처리의 실패, 또는 인터럽트의 발생
			System.err.println("파일의 경로를 확인하여 주십시오");
		}catch(Exception e) {
			
			System.out.println("오류 발생");
		}
		return result;
	}
	
	//해당 경로 파일(파라미터)의 내용을 꺼내서 출력하는 메소드
	public void getFileContents(String filePath) {
		
		//스레드도 쓰지 않고, 동기화도 필요없으므로 Builder사용
		StringBuilder sb = new StringBuilder();
		String strLine = "";
		
		try {
			//해당하는 파일의 내용을 가져온다
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			
			//txt에 저장되어 있는 내용 한줄씩 출력
			while (true) {
				
				//내용을 stringBuilder에 담아놓기
				sb.append(strLine);
				
				//해당 파일 내용을 라인 단위별로 가져온다
				strLine = br.readLine();
				
				//strLine에 비어있지 않으면 내용 출력
				if(strLine != null) {
					
					System.out.println(strLine);
				}else {
					
					System.out.println("전체 출력 완료");
					break;
				}
			}
			br.close();
		
		//입출력문에 관한 오류
		} catch (IOException e) {
			
			System.err.println("입출력 처리의 실패, 또는 인터럽트의 발생");
		}
	}
}














