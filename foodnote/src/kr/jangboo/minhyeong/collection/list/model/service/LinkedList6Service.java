package kr.jangboo.minhyeong.collection.list.model.service;

import java.util.LinkedList;
import java.util.List;

public class LinkedList6Service {

	public List<String> insertFirstAndLast(List<String> dateList, String firstStr, String lastStr) {

		String exceptionMsg;
		
		exceptionMsg = "";
		//List를 상속하는  LinkedList에서 선언된? 기능을 사용하기 위해서는 자식클래스로 다운캐스팅하여 사용해야한다.
		//무분별한 다운캐스팅은 컴파일 시점에서 오류가 발생하지 않아도 런타임오류를 발생시킬 수 있다. > ClassCastException
		try {
			
			//배열 첫 자리에 값 추가하기
			((LinkedList<String>)dateList).addFirst(firstStr);
			//배열 마지막 자리에 값 추가하기
			((LinkedList<String>)dateList).addLast(lastStr);
		}catch(ClassCastException e) {
			
			//이 부분은 부장님에게 여쭤볼까... 검증이 끝난 값이  service에서 로직을 수행 중 나는 예외처리(RuntimeException)는 그 자리에서 return으로 프로그램을 종료시킬 수 없는데...
			exceptionMsg = "[RuntimeException] Exception Error : " + e.getMessage();	//getMessage()는 오류내용을 반환한다.
		}catch(Exception e) {
			
			exceptionMsg = "[UnknownException] Exception Error : " + e.getMessage();
		}
		
		return dateList;
	}

}
