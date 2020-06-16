package kr.co.infopub.chapter02.s041;

// 논리 연산자(&&, ||)로 윤년 판별하기
// &&와 || 논리 연산자를 사용한다.

// if && ||
public class JCalendar {
	public boolean isLeapYear(int year) {
		boolean isS = false;
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			isS = true;
		}
		return isS;
	}
	
	public static void main(String[] args) {
		JCalendar hc = new JCalendar();
		System.out.println(hc.isLeapYear(2019));
	}
	
	/*
	 * 입력된 연도가 4의 배수이지만 100의 배수는 아니며 400의 배수일 때, 윤년이다.
	 */
}
