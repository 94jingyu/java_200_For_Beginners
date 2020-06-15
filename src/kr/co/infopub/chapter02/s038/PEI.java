package kr.co.infopub.chapter02.s038;

// enum 값에 따라 신체, 감정, 지성값 출력하기
// switch는 enum 값에 따라 case문이 실행된다.

// 상수 묶음 클래스 - enum
public enum PEI {
	PHYSICAL(23), EMOTIONAL(28), INTELLECTUAL(33);
	private final int peiValue;	
	PEI(int pie) {
		this.peiValue = pie;
	}
	
	public int getPei() {
		return peiValue;
	}
}

enum FRUIT {
	APPLE, BANANA, MANGO
}

/*
 * PEI에 있는 모든 상수값을 이 enum 변수를 통해 저장할 수 있다.
 */