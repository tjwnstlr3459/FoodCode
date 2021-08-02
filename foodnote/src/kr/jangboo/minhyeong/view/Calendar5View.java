package kr.jangboo.minhyeong.view;

import java.util.Calendar;

import kr.jangboo.minhyeong.controller.Calendar5Controller;
import kr.jangboo.minhyeong.model.vo.Calendar5;
import kr.jangboo.minhyeong.util.PrintUtils;

public class Calendar5View {

	public static void main(String args[]) {
		
		//문제 5 > 뉴욕의 현재 시간을 출력하라 ( 타임존 아이디를 요청 값으로 )
		
		//변수, 클래스 정의
		Calendar5 cld5;					//문제5 클래스
		Calendar nowTime;
		Calendar5Controller cntrl;
		String area, msg;
		boolean nullCheck;
		
		//변수, 클래스 초기화
		cld5 = new Calendar5();
		area = "America/New_York";		//요청 지역 값
		cld5.setArea(area);
		cntrl = new Calendar5Controller();
		
		//검증, 예외 처리
		cld5 = cntrl.valueNullCheck(cld5);
		nullCheck = cld5.getNullCheck();
		if(nullCheck) {
			
			//null이 아닌 정상
		}else {
			
			//null인 경우
			msg = "[RunTimeException] NullPointerException...Null Object에 접근!";
			PrintUtils.messageToPrint(msg);
			return;
		}
		
		//비지니스 로직
		cld5 = cntrl.insertNowTime(cld5);
		//뉴욕의 현재시간을 담은 변수
		nowTime = cld5.getNowTime();
		//결과 출력
		msg = "뉴욕의 현재 시각은  " + nowTime.get(Calendar.HOUR_OF_DAY) + " : " + nowTime.get(Calendar.MINUTE) + " : " + nowTime.get(Calendar.SECOND) + " 입니다.";
		PrintUtils.messageToPrint(msg);

	}

	
}
