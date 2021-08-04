package kr.jangboo.minhyeong.method.model.service;

public class Method10Service {

	public String checkLeapYear(int inputYear) {

		String resultMsg;
		int year;
		
		resultMsg = "";
		year = inputYear;
		//윤년 공식 
		//100으로 나누어지지 않는다 
		//4로 나누어지면 윤년
		//400으로 나누어지면 윤년
		//4로 나누어지고 100으로 나누어지고 400으로 나누어지면 윤년
		
		if(year % 4 == 0 && year % 400 == 0 && year % 100 == 0) {
			
			resultMsg = "윤년입니다";
		}else if((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
			
			resultMsg = "윤년입니다";
		}else {
			
			resultMsg = "윤년이 아닙니다";
		}
		return resultMsg;
	}

}
