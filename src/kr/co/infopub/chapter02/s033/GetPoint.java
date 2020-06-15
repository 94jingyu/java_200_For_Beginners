package kr.co.infopub.chapter02.s033;

// 위도, 경도를 한 묶음으로 객체에 저장
public class GetPoint {
	public static void main(String[] args) {
		// 실수 변수
		double latitude1 = 37.52127220511242;
		double longitude1 = 127.0074462890625;		// 서울
		double latitude2 = 35.137879119634185;
		double longitude2 = 129.04541015625;		// 부산
	
		// (위도, 경도) 객체
		Geo geo1 = new Geo();
		geo1.latitude = latitude1;
		geo1.longitude = longitude1;
		System.out.println(geo1.latitude + "\t" + geo1.longitude);
	
		Geo geo2 = new Geo();
		geo2.latitude = latitude2;
		geo2.longitude = longitude2;
		
		// 객체 전달
		Geo geo = geo1;
		System.out.println(geo.latitude + "\t" + geo.longitude);
	}
	
	/*
	 * 객체의 멤버는 해당 객체에서 가장 중요한 데이터이다.
	 * 멤버를 객체의 속성(Attribute)이라고도 한다.
	 * 객체로 사용하려면 객체의 설계도인 클래스를 만들어야 한다. 
	 * "클래스이름 래퍼런스 = new 클래스이름();" 형식으로 객체를 생성한다.
	 */
	
}
