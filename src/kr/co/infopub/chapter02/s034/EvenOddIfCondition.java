package kr.co.infopub.chapter02.s034;

// if 조건문을 이용하여 짝, 홀수 판별하기
// if 조건문으로 참과 거짓을 판별할 수 있다.

// if condition
public class EvenOddIfCondition {
	public static void main(String[] args) {
		int temp = 99;
		if(temp % 2 == 1) {		// 홀수
			temp = temp * 3 + 1;
		} else {
			temp = temp / 2;
		}
		
		System.out.printf("계산 후 = %d\n", temp);
	}
	
	/*
	 * if절은 (연산) 결과의 true/false에 따라 다른 구문({})이 실행된다.
	 */
}
