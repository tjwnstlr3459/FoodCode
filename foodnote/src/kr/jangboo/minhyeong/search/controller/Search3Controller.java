package kr.jangboo.minhyeong.search.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import kr.jangboo.minhyeong.search.model.service.Search3Service;
import kr.jangboo.minhyeong.search.view.Search3View;
import kr.jangboo.minhyeong.sort.model.service.Sort1Service;

public class Search3Controller {

	public static void main(String args[]) {
		
		// 문제 > Block Search(블록 탐색) : 데이터의 집합을 일정한 블록단위로 나누어 각각의 블록에서 최대 값을 선정하여 목표 값이 큰 경우 다음 블록으로 넘어가고 목표 값이 다음 블록의 최대 값보다 낮은 경우 해당 블록에서 순차검색을 통해 목표 값을 찾아내고 없는 경우 다음 블록으로 다시 진행한다.
		
		//1. 변수, 클래스 선언
		Search3Service srvc;
		Sort1Service sortSrvc;
		Search3View view;
		List<Integer> blockList;
		Set<Integer> overlapNum;
		Random rdNum;
		int targetNum, first, last, resultNum;
		
		//2. 변수, 클래스 초기화
		srvc = new Search3Service();
		sortSrvc = new Sort1Service();
		view = new Search3View();
		overlapNum = new HashSet<>();
		rdNum = new Random();
		targetNum = 30;
		resultNum = 0;
		
		//겹치지 않는 숫자20개를 list에 저장하기 위한 작업
		while(overlapNum.size() <= 20) {
			
			overlapNum.add(rdNum.nextInt(99)+1);
		}
		blockList = new ArrayList<>(overlapNum);		//타입 축약가능
		
		//3. 검증, 예외상황
		
		
		//4. 비지니스 로직
		first = 0;
		last = blockList.size() - 1;
		//배열을 퀵정렬한 배열로 변환
		blockList = sortSrvc.quickSortToList(blockList, first, last);
		//이 후 블록 검색 로직 진행
		resultNum = srvc.blockSearchResult(blockList, targetNum);

		//5. 결과
		view.printToblockListResult(resultNum);
	}
}
