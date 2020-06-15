package kr.co.infopub.chapter02.s037;

// 상수값에 따라 신체, 감정, 지성값 출력하기
// switch는 정수 타입 상수값에 따라 case문이 실행된다.

// 상수, switch case
public class BioSwitch {
	// 상수
	public static final int PHYSICAL = 23;
	public static final int EMOTIONAL = 28;
	public static final int INTELECTUAL = 33;
	
	// 메소드 선언
	public static String textInfor(int index, double value) {
		String result = "";
		
		switch(index) {
			case PHYSICAL : result = "신체 지수 : "; break;
			case EMOTIONAL : result = "감정 지수 : "; break;
			case INTELECTUAL : result = "지성 지수 : "; break;
			default : result = "미결정 : "; break;
		}
		
		return result + (value * 100);
	}
	
	public static void main(String[] args) {
		int index = PHYSICAL;
		double value = 0.86;
		String st = textInfor(index, value);
		System.out.println(st);
	}
}
