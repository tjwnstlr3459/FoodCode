package kr.jangboo.minhyeong.model.service;

import kr.jangboo.minhyeong.model.vo.Method1;

public class Method1Service {

	public int smallestNumber(Method1 mt1) {
		
		int firstNum, secondNum, thirdNum, resultNum;
		
		firstNum = mt1.getFirstNum();
		secondNum = mt1.getSecondNum();
		thirdNum = mt1.getThirdNum();
		resultNum = 0;
		
		//first > second
		if(firstNum > secondNum) {
			
			//first > third
			if(firstNum > thirdNum) {
				
				//second > third
				if(secondNum > thirdNum) {
					
					//first > second > third
					resultNum = thirdNum;
				}else {
					
					//second < third
					if(secondNum < thirdNum) {
						
						//first > third > second
						resultNum = secondNum;
					}else {
						
						//first > second == third
						resultNum = thirdNum;			//second == third
					}
				}
			}else {
				
				//first < third
				if(firstNum < thirdNum) {
					
					//third > first > second
					resultNum = thirdNum;
				}else {
					
					//first == third > second
					resultNum = secondNum;
				}
			}
		}else {
			
			//second > first
			if(secondNum > firstNum) {
				
				//second > third
				if(secondNum > thirdNum) {
					
					//first > third
					if(firstNum > thirdNum) {
						
						//second > first > third
						resultNum = thirdNum;
					}else {
						
						//first < third
						if(firstNum < thirdNum) {
							
							//second > third > first
							resultNum = firstNum;
						}else {
							
							//second > first == third
							resultNum = thirdNum;			//first == third
						}
					}
				}else {
					
					//second < third
					if(secondNum < thirdNum) {
						
						//third > second > first
						resultNum = firstNum;
					}else {
						
						//second == third > first
						resultNum = firstNum;
					}
				}
			}else {
				
				//first > third
				if(firstNum > thirdNum) {
					
					//first == second > third
					resultNum = thirdNum;
				}else {
					
					//first < third
					if(firstNum < thirdNum) {
						
						//third > first == second
						resultNum = secondNum;			//first == second
					}else {
						
						//first == second == third
						resultNum = -1;
					}
				}
			}
		}
		return resultNum;
	}

	
}
