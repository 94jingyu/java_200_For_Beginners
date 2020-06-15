package kr.co.infopub.chapter02.s029;

// static 메소드로 신체 지수 구하기
// static 메소드는 객체 생성 없이 호출할 수 있다. 

// static  메소드
public class BioCalendar {
	// 상수, 상수값은 변경할 수 없다.
	public static final int PHYSICAL = 23;		// 상수(개발자 정의)

	// static 메소드 선언
	public static double getBioRhythm(long days, int index, int max) {
		return max * Math.sin((days % index) * 2 * Math.PI / index);
	}
	
	
	public static void main(String[] args) {
		int days = 1200;
		
		// 메소드 호출
		double phyval = getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("나의 신체 지수는 %1$.2f입니다.\n", phyval);
	}
	
	/*
	 * static 메소드는 메소드에 static 예약어가 붙은 메소드로, 객체 생성 없이 호출할 수 있다.
	 * "public static 반환타입 메소드이름(아규먼트){}" 형태로 사용한다.
	 */
}
