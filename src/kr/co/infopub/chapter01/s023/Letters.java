package kr.co.infopub.chapter01.s023;

// 문자와 문자열의 관계 살펴보기
// 문자열의 위치를 찾는 메서드를 사용한다.

// char, escape
public class Letters {
	public static void main(String[] args) {
		char a = '닳';
		String letter = "동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		int letterNumber = letter.length();
		int loc = letter.indexOf(a);
		System.out.printf("\"%s\"=> %d자이며, '%c'은 %d번째 있다.\n", 
			letter, letterNumber, a, loc);

		char b = letter.charAt(loc);
		System.out.printf("\"%s\"의 %d번째 문자는 '%c'이다.", letter, loc, b);
	}
	
	// %s는 문자열, %c는 문자, %d는 정수를 의미한다.
}
