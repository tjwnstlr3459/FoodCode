package kr.jangboo.minhyeong.calendar.model.service;

import java.util.Calendar;
import java.util.TimeZone;

import kr.jangboo.minhyeong.calendar.model.vo.Calendar5;

public class Calendar5Service {

	public Calendar5 valueNullCheck(Calendar5 cld5) {
		
		if(cld5.getArea() == null) {
			
			cld5.setNullCheck(false);
		}else {
			
			cld5.setNullCheck(true);
		}
		return cld5;
	}

	public Calendar5 insertAreaTime(Calendar5 cld5) {
		
		//변수, 클래스 정의
		String area;
		TimeZone tz;
		Calendar cld;
		
		//변수, 클래스 초기화
		area = cld5.getArea();				//view에서 요청한 지역
		tz = TimeZone.getTimeZone(area);	//지역의 시간을 parsing해주는 TimeZone클래스에 변수대입
		cld = Calendar.getInstance();			
		
		//특정 지역을 가리키는 타임존 아이디를 TimeZone클래스의 getTimeZone()메소드에 매개변수로 넘긴 후 Calendar5클래스의 nowTime(Calendar타입)변수에 구해온 현재시간값을 대입한다.
		cld.setTimeZone(tz);				
		cld5.setNowTime(cld);
		
		return cld5;
	}

	
}
