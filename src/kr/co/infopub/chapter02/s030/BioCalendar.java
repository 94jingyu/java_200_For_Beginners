package kr.co.infopub.chapter02.s030;

// 멤버 메소드를 이용하여 신체 지수 구하기
// 멤버 메소드는 new 예약어를 이용하여 객체를 생성해야 사용할 수 있다.

// non static 메소드(멤버)
public class BioCalendar {
	// 상수, 상수값은 변경할 수 없다.
	public static final int PHYSICAL = 23;			// static 변수 생성 없이 사용
	
	// 멤버 메소드(non static) 선언
	public double getBioRhythm(long days, int index, int max) {
		return max * Math.sin((days % index) * 2 * Math.PI / index);
	}
	
	public static void main(String[] args) {
		int days = 1200;
		BioCalendar bio = new BioCalendar();		// 객체를 생성
		
		// 멤버 메소드 호출
		double phyval = bio.getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("나의 신체 지수 %1$.2f입니다.\n", phyval);
	}
	
	/*
	 * 메소드 앞에 static이 붙으면 static 메소드(또는 클래스 메소드)라고 하고, static이 붙지 않으면
	 * 멤버 메소드(non-static)라고 한다. 
	 * 멤버 메소드는 new 예약어를 이용해 객체를 생성해야 한다.
	 */
}
