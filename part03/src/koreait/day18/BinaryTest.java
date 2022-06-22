package koreait.day18;

public class BinaryTest {

	public static void main(String[] args) {
		
		System.out.println("10진수\t 2진수\t 16진수");
		for(int i=0; i<100;i++) {
			System.out.println(String.format("%d\t %s\t %s", i, Integer.toBinaryString(i),
									Integer.toHexString(i)));
	}
		
	
	}

}
//1번 오픈북 아님 40점
//범위 : 배열, 클래스, 상속(특히 메소드 재정의, 오버로딩), List,Map
//추상클래스, 인터페이스, 접근한정자
//주요키워드 final, static -> 필드, 메소드
//2번 20점 복붙 X 키워드 위주로 각각 2줄로 요약
//3번 40점 소스코드 확인 가능
