package kr.jangboo.junsik.model.service;

public class ReqularExpession {
	
	String reqExpStr;
	String reqExpNum;
	String reqExpMenu;	
	
	
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
