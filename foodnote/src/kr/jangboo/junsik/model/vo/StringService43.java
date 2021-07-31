package kr.jangboo.junsik.model.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringService43 {

	Scanner sc = new Scanner(System.in);
	ReqularExpession reqExp = new ReqularExpession();

	// 문자열 입력
	public String strInput() {

		String word = null;

		// 영어 문자열 받는 조건문
		while (true) {

			// 문자열 입력
			System.out.print("영어 문자를 입력해주세요 : ");

			String str = sc.nextLine();

			if (str.matches(reqExp.onlyStr())) {
				word = str;
				break;
			} else {
				System.out.println("영어 문자열을 입력해 주세요");
			}
		}
		return word;
	}

	public String arrayPrint(String str) {

		// 선언
		ArrayList<String> arr;
		int max;
		String maxStr = null;
		//ArrayList<String> maxStr;

		// 초기화
		//maxStr = new ArrayList<String>();
		arr = new ArrayList<String>();
		max = -1;

		// 단어 하나씩 쪼개기
		String[] word = str.split("");

		// 쪼개진 단어를 arrayList에 넣기
		for (int i = 0; i < word.length; i++) {
			arr.add(word[i]);
		}

		// arrayList 내 가장 많은 글자 카운트
		Set<String> set = new HashSet<String>(arr);
		for (String strPrint : set) {
			if (max < Collections.frequency(arr, strPrint)) {
				max = Collections.frequency(arr, strPrint);

				maxStr=strPrint;
			}
		}

		return maxStr;
	}

	public void maxStrPirnt(String maxStr) {
		System.out.println("최대 문자 ");
		System.out.print(maxStr);
		
	}

	public void beanStrPirnt() {
		System.out.println("모든 문자열이 동일합니다.");
	}
}
