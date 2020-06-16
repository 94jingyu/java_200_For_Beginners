package kr.co.infopub.chapter02.s043;

// while을 이용하여 1이 될 때까지 나누고 곱하기
// 반복문에서 끝나는 조건이 명확할 때는 while을 사용한다.

// while
public class EvenOdd {
	public static void showOddnEvenw(int n) {
		int temp = n;
		while(temp != 1) {
			if(temp % 2 == 1) {		// 홀수
				temp = temp * 3 + 1;
			} else {				// 짝수
				temp /= 2;
			}
			System.out.print("[" + temp + "]");
		}
		System.out.println("\n---------------------");
	}
	
	public static void main(String[] args) {
		showOddnEvenw(122);
	}
}
