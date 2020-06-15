package kr.co.infopub.chapter01.s018;

// 문자열을 실수로 변환하기
// 문자열을 실수나 정수로 변활할 때는 랩퍼 클래스를 사용한다.

// 타입 변환의 필요성
public class JavaTypeConversion {
	public static void main(String[] args) {
		String slat = "37.52127220511242	";
		// String slat = "hello";
		
		// 공백 제거 후 double로 타입 변환
		double latitude = Double.parseDouble(slat.trim());
		System.out.println(latitude);
	}
	
	/*
	 * trim()은 양쪽 공백을 제거하며 Double 랩퍼 클래스를 이용하여 실수형으로 타입을 변환한다.
	 */
	
}
