package kr.co.infopub.chapter01.s027;

// 연산자를 이용하여 바이오리듬 값 구하기
// *, /, %를 -, +보다 먼저 연산한다. 연산순위를 명확하게 결정하려면 ()를 사용한다.

// 연산 % * /
public class BioCalendar {
	public static int PHYSICAL = 23; 			// 상수(개발자 정의), 상수값은 변경 불가
	public static void main(String[] args) {
		int index = PHYSICAL;					// 상수값을 변수에 대입
		int days = 1200;
		
		// Math.PI 3.14에서 정의되어 있는 상수
		double vals = (days % index) * 2 * Math.PI / index;
		System.out.println(Math.toDegrees(vals) + "도");
	}
	
	/*
	 * 연산할 떄 double과 int 타입이 같이 있으면 결과는 자동으로 doucle이 된다.
	 * public static final 예약어를 붙여 상수를 선언한다. 상수는 대문자를 쓴다.
	 * 상수를 변수에 대입할 수 있다.
	 */
	
}
