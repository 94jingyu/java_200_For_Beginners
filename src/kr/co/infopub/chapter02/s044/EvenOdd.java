package kr.co.infopub.chapter02.s044;

// do~while을 이용하여 1이 될 때까지 나누고 곱하기
// 적어도 한 번 실행하는 반복문은 do~while을 사용한다. 

// do~while
public class EvenOdd {
	public static void showOddnEven(int n) {
		int temp = n;
		do {
			if(temp % 2 == 1) {
				temp = temp * 3 + 1;
			} else {
				temp /= 2;
			}
			System.out.print("[" + temp + "]");
		} while(temp != 1);
		System.out.println("\n----------------------");
	}
	
	public static void main(String[] args) {
		showOddnEven(122);
	}
	
	/*
	 * while은 조건이 명확할 떄 사용한다. while은 조건절이 먼저 실행되기 떄문에 한 번도 실행되지 않을 수 있다. 
	 * do~while은 먼저 실행된 다음 조건절이 실행되기 때문에 적어도 한 번은 실행된다. 
	 */
	
}
