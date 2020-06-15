package kr.co.infopub.chapter02.s036;

// 입력받은 정수값에 따라 신체, 감정, 지성값 출력하기
// switch에 입력된 정수값에 따라 case문이 실행된다.

// case
public class BioSwitch {
	// 조건에 따라 신체, 감정, 지성값을 출력
	public static String textInfor(int index, double value) {
		String result = "";
		switch(index) {
			case 23: result = "신체 지수 : "; break;
			case 28: result = "감정 지수 : "; break;
			case 33: result = "지성 지수 : "; break;
		}
		
		return result + (value * 100);
	}

	public static void main(String[] args) {
		int index = 23;							// 신체 지수
		double value = 0.86;
		String st = textInfor(index, value);	// 메소드 호출
		System.out.println(st);
	}
	
	/*
	 * switch에 입력된 정수값에 따라 case문이 실행된다.
	 * switch()는 if()와 비슷하지만 if는 true/false에 따라 다른 구문이 실행되고, 
	 * switch는 정수값에 따라 case문이 실행된다.
	 * switch는 정수(byte, short, int), char, String 값에 따라 case문이 실행된다.
	 * switch에서 case에 대한 break가 없다면 다음 case의 break를 만날 때까지 다음 case문이 실행된다.
	 */
}
