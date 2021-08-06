package kr.jangboo.minhyeong.util;

import java.util.List;

public class Algorithms {

	//정렬되지 않는 배열과 배열의 firstIndex와 lastIndex를 매개변수로 넘겨주어 퀵 정렬하는 메소드 > 재귀함수이다.
	public List<Integer> quickSortToList(List<Integer> sortedList, int first, int last) {

		//제일 왼쪽(처음)을 pivo으로 지정하고 그 다음 자리부터 끝자리와 정렬을 진행한다.
		//재귀함수. 즉, 자신을 호출해 매개변수의 값을 가지고 함수 안에서 알고리즘을 풀이해 나가는 로직
		
		int pivot, lPin, rPin, temp;
		
		pivot = first;		//이 함수가 처음 호출될 때 > 0
		lPin = first + 1;	//이 함수가 처음 호출될 때 > pivot보다 한 자리 뒤 1
		rPin = last;		//이 함수가 처음 호출될 때 > list의 마지막 자리 9
		
		//함수가 호출되면서 매개변수의 first가 last보다 크거나 같은 경우 함수를 빠져나간다(리턴)
		if(first >= last) {
			
			//pivot 함수가 호출되며 정렬이 진행되고 last값은 -1씩되어온다.
			//
			return sortedList;
		}
		
		//lPin과 rPin이 같거나 조건문에 반대가 되면 즉 pin이 엇갈리면 종료한다.
		//lPin이 rPin보다 크거나 같아질 때까지 반복 > 즉 엇갈려 lPin이 rPin보다 커지는 경우에 종료한다.
		while(lPin <= rPin) {
			
			//pivot값 보다 큰 수를 찾는 while문
			//우선 lPin에서 last로 이동하면서(lPin이 last보다 작거나 같아야함) pivot보다 큰 값을 찾을 때까지 반복 > lPin을 ++증가 시킨다 > lPin을 오른족으로 이동시킨다 개념임
			while(lPin <= last && sortedList.get(lPin) <= sortedList.get(pivot)) {
				
				lPin++;
			}
			//pivot값보다 작은 수를 찾는 while문
			//rPin이 first까지 이동하면서 pivot보다 작은 수를 찾을 때까지 반복 > rPin을 --감소시킨다. > rPin을 왼쪽으로 이동시킨다 개념
			while(rPin > first && sortedList.get(rPin) >= sortedList.get(pivot)) {
				
				rPin--;
			}
			//pivot기준으로 lPin 과 rPin 이 엇갈리지 않은 경우 > lPin 과 rPin을 교체해준다.
			if(lPin < rPin) {
				
				temp = sortedList.get(lPin);					//temp = lPin 자리의 값
				sortedList.set(lPin, sortedList.get(rPin));		//lPin = rPin 자리의 값
				sortedList.set(rPin, temp);						//rPin = temp(lPin) 자리의 값
				
			//lPin > rPin 인 경우 : lPin과 rPin이 엇갈린 경우 > pivot을 교체해준다.
			}else {
				
				temp = sortedList.get(pivot);					//temp = pivot 자리의 값
				sortedList.set(pivot, sortedList.get(rPin));	//pivot = rPin 자리의 값
				sortedList.set(rPin, temp);						//rPin = temp(pivot 자리의 값)
			}			
		}
		//첫 호출 되었을 때 pivot을 기준으로 작은 값들로 분할된 길이 rPin = last
		quickSortToList(sortedList, first, rPin-1);				//원래 pivot보다 작은 값을 새로운 pivot으로 교체했기때문에 큰 값이므로 제외시켜 함수를 호출시켜 정렬한다.(앞 분할 정렬)
		//첫 호출 되었을 때 pivot을 기준으로 큰 값들로 분할된 길이 rPIn+1 = first
		quickSortToList(sortedList, rPin+1, last);				//새롭게 교체된 pivot을 기준으로 다시 lPin(pivot+1)을 지정해 자신을 다시 호출해 정렬한다.(뒷 분할 정렬)
		return sortedList;
	}
}
