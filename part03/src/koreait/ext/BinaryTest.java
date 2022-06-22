package koreait.ext;

public class BinaryTest {

	public static void main(String[] args) {
		
		System.out.println(String.format("%8s\t %8s\t %8s", "10진수","2진수","16진수"));
		for(int i=0; i<100;i++) {
			System.out.println(String.format("%8d\t %8s\t %8s", i, Integer.toBinaryString(i),
									Integer.toHexString(i)));
	}
		/*
		 * 10진수 정수값을 다른 진법(진수)으로 문자열 변환
		 * Integer.toBinaryString(i)	-> 2진수로 변환
		 * Integer.toOctalString(i)		-> 8진수로 변환
		 * Integer.toHexString(i)		-> 16진수로 변환
		 * 
		 * 
		 * int 형식은 4바이트 32비트 2진수는 32자리 , 16진수로는 8자리 , 10진수로는 값범위 -2147483648 ~
		 */
	
	}

}
//1번 오픈북 아님 40점
//범위 : 배열, 클래스, 상속(특히 메소드 재정의, 오버로딩), List,Map
//추상클래스, 인터페이스, 접근한정자
//주요키워드 final, static -> 필드, 메소드
//2번 20점 복붙 X 키워드 위주로 각각 2줄로 요약
//3번 40점 소스코드 확인 가능
