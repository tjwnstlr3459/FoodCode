package kr.jangboo.minhyeong.model.vo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import kr.jangboo.minhyeong.util.InputUtils;
import kr.jangboo.minhyeong.util.PrintUtils;

public class Array1 {

	//멤버(전역)변수, 클래스 정의
	
	
	public static void main(String args[]) {
		
		//배열 문제 1 > 정수 배열과 문자열 배열을 정렬 전/후 출력시키는 프로그램을 작성하라.
		// 1) 입력받은 값을 배열에 추가한다.
		// 2) 입력은 10개 받자.
		// 3) 받을 때 배열로 받는 것도 좋지만 자바API의 ArrayList를 이용하자 
		// 4) 정렬은 .sort()하면 정말 편하지만 그 기능은 내가 직접 구현하자.
		// 5) 메소드로 넘겨줄 때 HashMap을 사용해 하나의 매개변수로 넘겨준다.
		
		ArrayList<Integer> intList;
		ArrayList<String> strList;
		HashMap<String, Object> objMap;
		InputUtils iU;
		String msg;
		Object objTemp;
		boolean verifyCheck;
		
		intList = new ArrayList<Integer>();
		strList = new ArrayList<String>();
		objMap = new HashMap<String, Object>();
		iU = new InputUtils();
		msg = "";
		objTemp = new Object();
		verifyCheck = false;
		
		//검증 결과에 따라 map에 true/false저장되어 리턴됨 > 정상적인 경우 list도 같이 리턴된다.
		objMap = verifyValue();				//HashMap 리턴(반환)
		objTemp = objMap.get("result");		//Object타입 get
		verifyCheck = (boolean) objTemp;	//Boolean타입으로 형변환
		
		if(verifyCheck) {
			
			objTemp = objMap.get("intList");
			intList = (ArrayList<Integer>)objTemp;
			
			objTemp = objMap.get("strList");
			strList = (ArrayList<String>)objTemp;
		}else {
			
			msg = "[Warning] Program Error : Unknown. Please Administrator call!!!";
			PrintUtils.messageToPrint(msg);
			return;
		}
		//정렬 전
		System.out.println("before : " + intList.toString());
		System.out.println("before : " + strList.toString());
		
		//비지니스 로직 및 결과 처리
		intList = new ArrayList<Integer>(sortIntList(intList));
		strList = new ArrayList<String>(sortStrList(strList));
		
		//정렬 후
		System.out.println("after : " + intList.toString());
		System.out.println("after : " + strList.toString());
	}
	
	public static ArrayList<Integer> sortIntList(ArrayList<Integer> intList){
		
		ArrayList<Integer> sortList;
		int[] sortArray;
		int tempNum;
		
		sortList = new ArrayList<Integer>();
		sortArray = new int[intList.size()];
		tempNum = 0;
		//list에서 배열로 변환
		for(int i = 0; i < intList.size(); i++){
			
			sortArray[i] = intList.get(i);
		}
		//배열로 버블정렬을  진행
		for(int j = 0; j < sortArray.length; j++) {
			
			for(int k = 0; k < sortArray.length - 1; k++) {
				
				if(sortArray[k] > sortArray[k + 1]) {
					
					tempNum = sortArray[k];
					sortArray[k] = sortArray[k + 1];
					sortArray[k + 1] = tempNum;
				}
			}
		}
		//정렬된 배열에서 리스트로 변환
		for(int l = 0; l < sortArray.length; l ++) {
			
			sortList.add(sortArray[l]);
		}
		return sortList;
	}
	
	public static ArrayList<String> sortStrList(ArrayList<String> strList){
		
		Collections.sort(strList);
		return strList;
	}
	public static HashMap<String, Object> verifyValue() {
		
		//변수, 클래스 정의
		ArrayList<Integer> intList;
		ArrayList<String> strList;
		HashMap<String, Object> objMap;
		InputUtils iU;
		String inputMessage, inputValue, regPattern, msg;
		boolean inputCheck;
		int inputCount, strToInt;
		boolean result;
		
		//변수,클래스 초기화
		intList = new ArrayList<Integer>();
		strList = new ArrayList<String>();
		objMap = new HashMap<String, Object>();
		iU = new InputUtils();
		inputMessage = "";
		inputValue = "";
		regPattern = "";
		inputCheck = false;
		inputCount = 0;
		strToInt = 0;
		msg = "";
		result = false;
		
		// 검증, 예외 처리 > 정수 먼저 받고 나서 문자 받기
		while(inputCount != 20) {
			
			inputMessage = "input integer(count : "+inputCount+"/10) : ";
			inputValue = InputUtils.inputMessageToPrint(inputMessage);
			inputValue = InputUtils.replaceInput(inputValue);
			
			regPattern = "^[0-9]*$";
			iU.setRegPattern(regPattern);
			inputCheck = iU.inputValueCheckInteger(inputValue);
			if(inputCheck) {
				
				strToInt = CastDataType.stringToInteger(inputValue);
				if(strToInt == -1) {
					
					continue;
				}
				intList.add(strToInt);
				objMap.put("intList", intList);
				inputCount++;
				if(inputCount == 10) {
					
					while(inputCount != 20) {
						
						inputMessage = "input String(count : "+(inputCount-10)+"/10) : ";
						inputValue = InputUtils.inputMessageToPrint(inputMessage);
						strList.add(inputValue);
						objMap.put("strList", strList);
						inputCount++;
						result = true;
					}							
				}
			}else {
				
				msg = "Please input integer...";
				PrintUtils.messageToPrint(msg);
			}
		}
		//리턴
		objMap.put("result", result);
		return objMap;
	}
}
