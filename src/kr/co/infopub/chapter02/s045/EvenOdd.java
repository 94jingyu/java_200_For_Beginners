package kr.co.infopub.chapter02.s045;

// for를 이용하여 1이 될 때까지 나누고 곱하기
// for, while, do~while과 같은 반복문은 동일한 기능을 실행한다.

// while로 사용하는 for
public class EvenOdd {
	public static void showOddnEvenf(int n) {
		int temp = n;
		for( ; temp != 1; ) {
			if(temp % 2 == 1) {
				temp = temp * 3 + 1;
			} else {
				temp /= 2;
			}
			System.out.print("[" + temp + "]");
		}
		System.out.println("\n---------------------");
	}
	
	public static void main(String[] args) {
		showOddnEvenf(122);
	}
	
	/*
	 * for는 for(초기값; 조건; 스텝){ 바디 }로 구성된다. 이때 초기값, 조건, 스텝을 모두 제거하고
	 * for( ; ; ){ }로 사용할 수 있다. 조건을 명시하지 않으면 for( ; true; ){ }가 되어 while(true)이 된다.
	 */
}
