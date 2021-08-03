package kr.jangboo.junsik.model.util;

public class ReqularExpession {
	
	String reqExpStr;
	String reqExpNum;
	String reqExpMenu;	
	
	public int changeNum(String numStr) {
		ReqularExpession reqExp;
		reqExp = new ReqularExpession();
		int num = 0;
	
		if (numStr.matches(reqExp.onlyNum2())) {

			// 정규표현 적합시 num에 대입하여 controller에 리턴
			num = Integer.parseInt(numStr);

			// 정규표현식 부적합시 재입력
		}
		return num; 
	}
	
	public String onlyNum() {
		
		return reqExpNum = "^[0-9+.-]+$";
		
	}
	public String onlyNum2() {
		
		return reqExpNum = "^[0-9]+$";
		
	}
	
	public String onlyStr() {
		
		return reqExpStr = "^[a-zA-Z가-힣]+$";
		
	}
	
	public String onlyMenuNum() {
		
		return reqExpMenu = "^[1-3]+$";
	}
	
	
}
