package kr.co.infopub.chapter.s025;

import java.util.Scanner;

// 키보드로 입력받아 콘솔에 출력하기
// 키보드 입력은 Scanner의 next() 메소드를 사용하고, 출력은 System.out의 println()을 사용한다.


public class InOutMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// 키보드
		
		System.out.println("정수를 입력하세요.");
		int choice = sc.nextInt();				// 키보드로 정수 입력
		System.out.println(choice);
		
		System.out.println("실수를 입력하세요.");
		double rchoice = sc.nextDouble();
		System.out.println(rchoice);
		
		System.out.println("문자열을 입력하세요.");
		String schoice = sc.next();
		System.out.println(schoice);
	}
	
	/*
	 * length() : 문자열의 길이를 반환한다.
	 * indexOf() : 해당 문자나 문자열이 있는 위치(index)를 반환한다.
	 * charAt(index) : index 위치의 문자를 반환한다.
	 */
}
