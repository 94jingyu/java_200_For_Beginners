package kr.co.infopub.chapter01.s017;

// 사용자 정의 참조 타입 사용하기
// 참조타입은 "public class 클래스 이름{}" 형식으로 표시한다.

// 사용자 정의 클래스
class JLocation {
	public double lat;
	public double lng;
}

public class JavaUserDefinedType {
	public static void main(String[] args) {
		// 두 개의 기본 타입
		double latitude = 37.52127220511242;
		double longitude = 127.0074462890625;
		
		// 사용자 정의 객체를 생성
		JLocation jloc = new JLocation();
		jloc.lat = latitude;			// 값을 대입
		jloc.lng = longitude;			// 값을 대입
		
		JLocation newloc = jloc;		// 객체를 타입
		System.out.println(newloc.lat);	// 출력
	}

	/*
	 * 사용자 정의 참조타입 : 사용자가 선언한 클래스
	 * 선언 방법 : public class 클래스 이름{} 
	 * 기본적으로 한 클래스는 한 파일에 저장하며, 클래스와 파일의 이름이 동일해야 한다. 
	 * 만약 한 파일에 클래스를 두 개 이상 선언할 때는 파일 이름과 동일한 클래스만 public을 붙일 수 있다.
	 */
}
