package kr.co.infopub.chapter.s016;

import java.util.Calendar;
import java.util.Date;

// API에서 제공하는 참조 타입 사용하기
// 참조 타입은 자바에서 제공하는 API 참조 타입과 API 참조 타입을 이용하여 사용자가 만드는 사용자 정의 참조 타입이 있다.

// 참조 타입
public class JavaObjectType {
	public static void main(String[] args) {
		// 기본 타입의 배열은 참조 타입
		int[] m = {1, 2, 3};					// 배열
		int[] n = new int[] {1, 2, 3};			// 배열
		
		// 참조 타입 - 객체 타입
		String card = "H8";						// 문자열
		Date d = new Date();					// 오늘
		Calendar cal = Calendar.getInstance(); 	// 오늘	
		
		// 자동으로 toString()이 붙음
		System.out.println(card);				// card.toString()
		System.out.println(d);					// d.toString()
		System.out.println(cal);				// cal.toString()
	}
	
	
	/*
	 * 참조타입(Reference Type): 객체(Object) 타입이라고도 한다. 여러 개의 기본 타입을 저장하고 변환(가공),
	 * 이동(전송) 할 수 있는 행위(메소드)를 갖는다. 
	 * 
	 * 참조 타입의 종류 : 크게 이미 정의되어 있는 API(자바가 개발자를 위하여 제공 - Object, Class, String, Math, 
	 * StringBuffer, Date, Calendar, System, ...)와 개발자가 만들어서 사용하는 타입으로 나눌 수 있다. 
	 * API는 사용법을 익히는 것이고 이것을 이용하여 필요한 것을 개발한다.
	 */
}
