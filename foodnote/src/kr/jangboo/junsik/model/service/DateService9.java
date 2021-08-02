package kr.jangboo.junsik.model.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import kr.jangboo.junsik.model.vo.Date;

public class DateService9 {

	public void calDate(Calendar cal) {
		// 캘린더 및 클래스 선언
		String firstDate;
		String finalDate;
		SimpleDateFormat sdf;

		// 초기화
		sdf = new SimpleDateFormat("yyyy MM dd E");

		// 첫 월요일 날짜 출력
		firstDate = sdf.format(cal.getTime());
		System.out.println(firstDate);

		// 시작일 끝나는일의 차이를 두기 위한 for문
		for (int i = 0; i < 6; i++) {

			cal.add(Calendar.DATE, 1);
		}

		// 마지막 요일 날짜 출력
		finalDate = sdf.format(cal.getTime());
		System.out.println(finalDate);

	}

	public void msg() {

		System.out.println("적한한 값이 들어있지 않습니다.");
	}

	// week와 weekNum의 값 확인
	public int check(int week, int weekNum) {

		// 클래스 및 변수 선언
		int result;
		ReqularExpession reqExp = new ReqularExpession();

		// 초기화
		result = 0;

		// 정규표현식 검사를 위한 String 변환
		String weekStr = Integer.toString(week);
		String weekNumStr = Integer.toString(weekNum);

		// 정규표현식에 적합한 값이면 리턴값 1을 리턴
		if (weekStr.matches(reqExp.onlyNum2()) && weekNumStr.matches(reqExp.onlyNum2())) {

			result = 1;
		}

		return result;
	}
}
