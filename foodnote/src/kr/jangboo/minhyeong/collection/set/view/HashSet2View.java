package kr.jangboo.minhyeong.collection.set.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import kr.jangboo.minhyeong.util.PrintUtils;

public class HashSet2View {

	public void printTofirstNames(Set<String> firstNames) {
		
		//1. 변수, 클래스 정의
		Iterator<String> iteratorNames;
		List<String> listNames;
		//2. 변수, 클래스 초기화 
		iteratorNames = firstNames.iterator();
		listNames = new ArrayList<String>(firstNames);
		
		//방식 1 > iterator 사용
		//.hasNext()는 다음 값이 존재하면 true / 존재하지 않는다면 false를 반환한다.
		//.next()는 값을 불러오는 메소드  collection의 .get()과 유사
		while(iteratorNames.hasNext()) {
			
			PrintUtils.messageToPrintln(iteratorNames.next());
		}
		
		//방식 2 > list를 사용해 순차탐색 진행(출력)
		for(String names : listNames) {
			
			PrintUtils.messageToPrintln(names);
		}
	}

}
