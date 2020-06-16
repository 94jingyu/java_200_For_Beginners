package kr.co.infopub.chapter02.s039;

// switch~case로 카드값 구하기
// switch는 정수(byte, short, int), char, String에 따라 case문이 실행된다.

// char switch
public class SwitchCondition {
	public static int toNum(char c) {
		int tot = 0;
		switch(c) {
			case 'A' : tot = 1; break;
			case 'T' : tot = 10; break;
			case 'J' : tot = 11; break;
			case 'Q' : tot = 12; break;
			case 'K' : tot = 13; break;
			default : tot = c - '0'; break;	// '9'-0'
		}
		
		return tot;
	}
	
	public static void main(String[] args) {
		char c = 'J';
		int result = toNum(c);
		System.out.printf("%c => %d\n", c, result);
	}

	/*
	 * %c는 char 타입을 대입하라는 의미이다. 
	 */
}
