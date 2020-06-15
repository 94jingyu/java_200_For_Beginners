package kr.co.infopub.chapter02.s035;

// 삼항연산자를 이용하여 짝, 홀수 판별하기
// 간단한 if연산자는 삼항연사자를 사용한다.

// 삼항(?:) 연산자
public class EvenOddTriCondition {
	public static void main(String[] args) {
		int temp = 99;
		temp = (temp % 2 == 1)? temp * 3 + 1 : temp / 2;
		System.out.printf("계산 후 = %d\n", temp);
	}
}
