package kr.co.infopub.chapter02.s031;

// 상수의 묶음 클래스 enum 사용하기
// class 키워드 대신 enum 키워드를 사용한다.

// 상수의 묶음
public class FruitMain {
	public static void main(String[] args) {
		FRUIT pear = FRUIT.APPLE;
		FRUIT pear2 = FRUIT.MANGO;
		System.out.println(pear);
		System.out.println(pear.name());
		System.out.println(pear.ordinal());		//선언될 때 순서 0
		System.out.println(pear2.ordinal());	// 선언될 때 순서 2
		FRUIT[] fruits = FRUIT.values();
		System.out.println(fruits[0]);
	}
	
	/*
	 * class 클래스 대신 enum 키워드를 사용한다. 
	 * enum 상수는 static final을 사용하지 않고 대문잘 선언한다.
	 * 선언한 순서(ordinal)대로 0, 1, 2처럼 값이 자동으로 대입한다.
	 */
}
