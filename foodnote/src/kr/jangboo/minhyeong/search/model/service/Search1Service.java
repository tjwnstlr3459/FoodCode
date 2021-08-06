package kr.jangboo.minhyeong.search.model.service;

import java.util.List;

public class Search1Service {

	public int binarySearchResult(List<Integer> sortedList, int targetNum) {
		
		//탐색이 진행될수록 배열은 /2 된다.
		
		int pickNum, index, lPin, rPin, count;	//이진 탐색이 쓰이는 /2 되는 index
		
		//targetNum = 78
		
		lPin = 0;
		rPin = sortedList.size() - 1;
		index = 0;
		pickNum = 0;
		count = 0;
		
		//목표 숫자와 탐색을 진행하며 지정되는 숫자가 같지 않을 때 반복
		while( pickNum != targetNum ) {
			
			//반복이 진행 될수록 pickNum지정 > 이진 탐색으로 배열을 나누고 난 뒤에 값을 계속 초기화
			//기준에서 크고 작은 방향의 중간 값은 (lPin+rPin) / 2 : lPin(index)과 rPin(index)은 기준값에 따라 동적
			//초기화
			index = (lPin + rPin) / 2;
			pickNum = sortedList.get(index);
			
			//기준 값이 목표 값보다 작은 수 인지 큰 수 인지에 따른 이진 탐색 진행
			//목표 값이 기준 값보다 큰 경우
			if(pickNum < targetNum) {
				
				lPin = sortedList.indexOf(pickNum);
				
			//목표 값이 기준 값보다 작은 경우
			}else {
				
				rPin = sortedList.indexOf(pickNum);
			}
			//목표 값이 배열에 존재하지 않는 경우
			if(sortedList.indexOf(targetNum) == -1) {
				
				return -1;
			}
			count++;
		}
		System.out.println("실행 수 : " + count);
		return pickNum;
	}

}
