package kr.jangboo.junsik.model.vo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Method15 {
	public static void main(String args[]) {
		
		//1970년 1월 1일부터 경과한 시간을 밀리세컨 타입으로 리턴 1/1000 초
		long curTime = System.currentTimeMillis();
		System.out.println(curTime); //1627809391944
		
		System.out.println("초 변환 : "+ curTime/1000);
		System.out.println("현재 초 변환 : "+ (curTime/1000)%60);
		long second = (curTime/1000)%60;
		
		System.out.println("분 변환 : "+ curTime/1000/60);
		System.out.println("현재 분 변환 : "+ (curTime/1000/60)%60);
		long minutes = (curTime/1000/60)%60;
		
		System.out.println("시 변환 : "+ curTime/1000/60/60);
		System.out.println("현재 시 변환 : "+ (curTime/1000/60/60)%24);
		long hour = (minutes%24)-1;
		
		System.out.println("년 변환 : "+ curTime/1000/60/60/24/365);
		System.out.println("년 변환 : "+ (curTime/1000/60/60/24/365+1970));
		long year = (curTime/1000/60/60/24/365+1970);
		
		//월, 일, 요일 출력을 위한 util
		Calendar cal = Calendar.getInstance();
		
		//월출력
		String month = Integer.toString((cal.get(Calendar.MONTH) + 1));
		
		//일출력
		String day = Integer.toString(cal.get(Calendar.DAY_OF_MONTH));
		
		//요일출력
		int WeekDay = cal.get(Calendar.DAY_OF_WEEK);
		//요일 한글로 변환
		String weekName = week(WeekDay);
		
		//System.out.println(year+"년 "+month+"월 "+day+"일 "+weekName+" "+hour+"시 "+minutes+"분 "+second+"초 ");
		System.out.printf("%d년 %s월 %s일 %s %d시 %d분 %d초\n",year,month,day,weekName,hour,minutes,second);
		
		
		
		//simpleDateFormat형식의 날짜 출력문
		//날짜형식 지정
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		
		//currentTimeMillis로 저장된 변수를 날짜형식에 맞게 바꾸어 변수에 저장
		String str = sdf.format(new Date(curTime));
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












