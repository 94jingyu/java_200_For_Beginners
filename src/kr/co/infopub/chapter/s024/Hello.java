package kr.co.infopub.chapter.s024;

// 메소드 선언하고 호출하기
// 메소드는 호출될 때 실행된다.
public class Hello {
	// 메소드 선언
	public static void showHello() {
		System.out.println("***********************************");
		System.out.println("*  이 프로그래밍은 94jingyu이 만들었습니다.  *");
		System.out.println("***********************************");
	}

	// 메소드 호출
	public static void main(String[] args) {
		showHello(); 	//'메소드 이름()' 
	}
	
	/*
	 * 메인 메소드가 static이므로 객체 생성없이 static 메소드를 바로 호출할 수 있다.
	 * 메소드는 반환 타입이 있는 메소드와 없는 메소드, static 메소드와 static이 아닌 메소드(멤버 메소드)로 
	 * 분류할 수 있다. 객체를 생성하지 않아도 static 메소드를 호출할 수 있다.
	 * 
	 */

}
