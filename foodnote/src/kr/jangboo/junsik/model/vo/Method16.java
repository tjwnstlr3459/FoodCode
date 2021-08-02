package kr.jangboo.junsik.model.vo;

public class Method16 {
	public static void main(String[] args) {
		
		// 16. 100보다 작은 모든 쌍둥이 소수를 찾는 자바 메소드를 작성
		// 소수 : 1과 2를 제외하고, 자연수를 이용해 자신을 표현 못하는것
		
		// (5)1 x 5 == 소수(자신말고는 자신을 표현할수 없는것이 소수)
		// (6)1 x 6, 3 x 2 == 자연수를 포함하여 자신을 표현 가능
		
		// 1) 기본값과 기본값+2 가 소수인것만 출력하게
		// 2) 짝수 거르기
		// 3) 대입된 수의 절반값까지(자연수) 를 나눠보기
		// 4) 안나눠 진다면 값 출력
		
		//소수이기에 1 과 2 를 제외
        for (int i = 3; i < 100; i++) {

        	//짝수 거르기
        	if(i % 2 ==0) {
        		
        	// 기본값과 기본+2값인 것만 출력
        	}else {
        		
        		// 기본값과 기본+2의 자연수 대입하는 메소드 연결
        		if (prime(i) && prime(i + 2)) {
        			
        			//자연수 대입 안되는 값들만 출력
        			System.out.println("("+ i+", "+ i+2+")");
        		}
        	}
        }
    }

	//자연수를 대입하여 소수 구하는 메소드
    public static boolean prime(int num) {

    	//대입되는 값의 절반값까지 나누어 지는지 대입해보기
        for (int i = 2; i <= num / 2; i++) {	//3=1, 4=2, 5=2, 6=3,
        	
        	//자연수로 나누어 진다면 소수x
            if (num % i == 0) {
            	
            	return false;	            	
            }
        }
        return true;
    }
}
