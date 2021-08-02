package kr.jangboo.junsik.model.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import kr.jangboo.junsik.model.vo.CurTime;

public class MethodService15 {

	//millis를 이용한 날짜 및 시간 출력 방법1
	public void curTime(long curTimeMillis) {
		
		//변수 및 클래스 선언
		CurTime curTimeToday = new CurTime();
		String month;//월출력
		String day;//일출력
		String weekName;//요일 한글로 변환
		int WeekDay;//요일출력
		
		//현재 초 변환
		long curSecond = (curTimeMillis/1000)%60;
		curTimeToday.setCurSecond(curSecond);
		
		//현재 분 변환
		long curMinutes = (curTimeMillis/1000/60)%60;
		curTimeToday.setCurMinutes(curMinutes);
		
		//현재 시 변환
		long curHour = (curMinutes%24)-1;
		curTimeToday.setCurHour(curHour);
		
		//현재 년 변환
		long curYear = (curTimeMillis/1000/60/60/24/365+1970);
		curTimeToday.setCurYear(curYear);
		
		//월, 일, 요일 출력을 위한 util
		Calendar cal = Calendar.getInstance();
		month = Integer.toString((cal.get(Calendar.MONTH) + 1));
		day = Integer.toString(cal.get(Calendar.DAY_OF_MONTH));
		WeekDay = cal.get(Calendar.DAY_OF_WEEK);
		weekName = week(WeekDay);
		
		//현재 날짜 및 시간 출력
		System.out.printf("%d년 %s월 %s일 %s %d시 %d분 %d초\n",curYear,month,day,weekName,curHour,curMinutes,curSecond);	
	}
	
	//simpleDateFormat을 이용한 출력 방법2
	public void simpleCurTime(long curTimeMillis) {
		//simpleDateFormat형식의 날짜 출력문
		//날짜형식 지정
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		
		//currentTimeMillis로 저장된 변수를 날짜형식에 맞게 바꾸어 변수에 저장
		String str = sdf.format(new Date(curTimeMillis));
		System.out.println(str);
	}
	
	//숫자로 된 Calendar 요일 출력을 한글로 변환
		public static String week(int week) {
			String weekName = null;
			
			switch (week) {
			case 1: 
				weekName = "일요일";
				break;
			case 2: 
				weekName = "월요일";
				break;
			case 3: 
				weekName = "화요일";
				break;
			case 4: 
				weekName = "수요일";
				break;
			case 5: 
				weekName = "목요일";
				break;
			case 6: 
				weekName = "금요일";
				break;
			case 7: 
				weekName = "토요일";
				break;
			default:
				break;
			}
			return weekName;
		}
}
