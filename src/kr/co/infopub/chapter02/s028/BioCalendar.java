package kr.co.infopub.chapter02.s028;

// Math 클래스를 사용하여 신체 지수 구하기
// Math 클래스의 메소드는 대부분 static으로 객체를 생성하지 않고 Math.메소드() 형식으로 사용한다.

// s027의 Math.sin(), Math.toDegrees()
public class BioCalendar {
	// 상수, 상수값은 변경할 수 없다.
	public static final int PHYSICAL = 23;		// 상수(개발자 정의)
	public static void main(String[] args) {
		int index = PHYSICAL;					// 상수값을 변수에 대입
		int days = 1200;
		double phyval = 100 * Math.sin((days % index) * 2 * Math.PI / index);
		System.out.printf("나의 신체 지수는 %1$.2f입니다.\n", phyval);
	}
	
	/*
	 * Math 클래스는 java.util 패키지에 있고, 이 클래스의 메서드는 대부분 static으로 객체 생성 없이 Math.메서드() 형식으로 사용한다.
	 * 대표적인 상수로 Math.PI(파이, 3.14), Math.E(지연지수, 2.718)가 있다.
	 */
}
