package kr.co.infopub.chapter02.s046;

// while을 이용하여 서로 다른 세 정수 만들기
// 임의의 정수는 Math.random()을 이용한다.

// break
public class BioRandom {
	public static void main(String[] args) {
		int range = 10;
		int start = 1;
		int a = 0, b = 0, c = 0;
		while(true) {
			a = (int)(range * Math.random() + start);
			b = (int)(range * Math.random() + start);
			c = (int)(range * Math.random() + start);
			if(a != b && b != c && c != a) break;
		}
		System.out.printf("%d\t%d\t%d", a, b, c);
	}
	
	/*
	 * while(true) 구문은 무한 반복(무한 루프)이므로 반드시 꽅내는 조건문을 갖춰야 한다.
	 */
}
