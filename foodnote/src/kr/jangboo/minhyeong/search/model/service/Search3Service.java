package kr.jangboo.minhyeong.search.model.service;

import java.util.List;

public class Search3Service {

	public int blockSearchResult(List<Integer> blockList, int targetNum) {
		
		System.out.println(blockList.toString() + " targetNum : " + targetNum);
		//key point : 각 블록을 균등하게 나누고 나머지는 마지막 블록에 더한다.
		//			     각 블록의 최대 값을 선정하는 것이 중요할 것 같다...
		
		int temp, lPin, rPin, resultNum, maxNumIndex, maxNum, squareRoot, listSize;
		
		listSize = blockList.size();						//배열의 길이
		squareRoot = (int)Math.floor(Math.sqrt(listSize));	//실수로 반환되는 제곱근을 내림(floor)를 사용하여 정수로 반환
		lPin = 0;				//처음 블록의 first
		rPin = squareRoot;		//처음 블록의 last
		maxNum	= 0;			
		resultNum = 0;
		//
		
		
		while(maxNum != targetNum) {
			
			maxNumIndex = rPin;		//해당 블록의 최댓 값
			maxNum = blockList.get(maxNumIndex);
			
			//이 경우 현재 블록안에 targetNum이 존재하지 않는 경우임
			if(maxNum < targetNum) {
				
				lPin = rPin;
				rPin *= 2;
			//이 경우 현재 블록에 targetNum이 존재하는 경우
			}else {
				
				//현재 블록을 순차 탐색하여 값을 찾아본다.
				for(int i = lPin; i < rPin; i++) {
					
					//현재 블록에서  목표 값과 일치하는 경우
					if(blockList.get(i) == targetNum) {
						
						//목표 값과 동일한 숫자를 반환해준다.
						return blockList.get(i);
						
					//현재 블록에 목표값이 없는 경우 다음 블록으로 진행하기 위한 핀 위치 변경
					}else {
						
						lPin = rPin;
						rPin *= 2;
					}
				}
			}
			//현재 배열에 목표 값이 없는 경우
			if(blockList.indexOf(targetNum) == -1) {
				
				return -1;
			}
		}
		return resultNum;
		
		
		//공식이 뭔가 아닌것 같은데...
		//int test = 61 * 2 % 10;
		
		
	}

}
