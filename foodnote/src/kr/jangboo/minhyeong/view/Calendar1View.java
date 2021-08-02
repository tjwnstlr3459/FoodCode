package kr.jangboo.minhyeong.view;

import java.util.Calendar;

import kr.jangboo.minhyeong.controller.Calendar1Controller;
import kr.jangboo.minhyeong.model.service.Calendar1Service;
import kr.jangboo.minhyeong.model.vo.Calendar1;
import kr.jangboo.minhyeong.util.PrintUtils;

public class Calendar1View {

	public static void main(String args[]) {
		
		//DateTime 문제 1 > 정수를 Calendar클래스에 대입하여 출력하는 자바프로그램 작성.
		
		//1. 변수, 클래스 정의
		int year, month, date;
		boolean nullCheck;
		Calendar1 myCld;
		Calendar1Controller cntrl;
		Calendar cld;
		String msg;
		
		//2. 변수, 클래스 초기화
		//1)view > client의 요청 -------------
		year = 2021;
		month = 7;
		date = 1;
		//----------------------
		nullCheck = false;					//검증 논리형 변수
		myCld = new Calendar1();			//입력 또는 초기값 저장 클래스(객체)
		myCld.setYear(year);
		myCld.setMonth(month);
		myCld.setDate(date);
		cntrl = new Calendar1Controller();
		msg = "";
		
		//3. 검증, 예외 처리
		nullCheck = cntrl.nullCheck(myCld);
		if(nullCheck) {
			
		}else {
			
			msg = "[RunTimeException] NullPointerException...Null Object에 접근!";
			PrintUtils.messageToPrint(msg);
			return;
		}
		
		//4. 비지니스 로직
		cld = Calendar.getInstance();			//Calendar클래스 
		cld = cntrl.insertMyCal(myCld);
		//결과 출력
		msg = "Year : " + cld.get(Calendar.YEAR) + " / Month : " + cld.get(Calendar.MONTH) + " / Date : " + cld.get(Calendar.DATE);
		PrintUtils.messageToPrint(msg);
		
	}
}
