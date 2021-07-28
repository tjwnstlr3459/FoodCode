package junsik;

import java.util.Scanner;

public class Test58 {
	//문장에서 각 단어 첫글자만 대문자로 변환
	public static void main(String args[]) {
		
		//변수 선언
		Scanner sc;
		String str;
		String strArr;
		
		//초기화 선언
		sc = new Scanner(System.in);
		str = null;
		strArr = null;
		
		//로직처리
		System.out.print("문장에서 각 단어 첫글자만 대문자로 변환");
		System.out.print("문장을 영어로 적어주세요 : ");
		str = sc.nextLine();
		
		//검증
		if(str.equals("")) {
			//미입력시
			System.out.println("문장을 입력해 주세요");
		}else {
			
			//입력시
			// split을 이용한 문자열 분리
			String[] txtArr = str.split("\\s") ;
			
			//첫글자 대문자 변경 후 값 넣기
			for(int i=0; i < txtArr.length; i++){
				strArr = txtArr[i].substring(0,1).toUpperCase()+txtArr[i].substring(1);
				//출력
				System.out.print(strArr+" ");
			}
			
		}
        sc.close();
	}
}





//메소드 화, 매개변수 전달식으로 역할 나누어 
//트라이 캐치 마지막은 항상 인텍스
//배열 말고도 다른 방법을 사용 
//의미 있는 캐치 쓰기
//만들어진 명령어 보다는 자신이 직접 구현하는 방식으로
//디버깅을 위해서 한줄에 많은 계산을 식을 넣지 말자
//아스키코드보다는 정규표현식으로 하자(문자열에 공백 문자)
//3중 루프 오바야~(현업에선 프로그램마다 시간초) 쿼리문도 마찬가지
//if(firset != second && second != third && third != firset)
//true and ture <> false  and false
//long으로도 할수 있을땐 롱하자