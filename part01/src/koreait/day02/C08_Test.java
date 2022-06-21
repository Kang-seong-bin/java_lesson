package koreait.day02;


	//참고 : 자바프로그래밍언어에서는 클래스 이름과 파일명이 동일하게 합니다.
public class C08_Test {

	public static void main(String[] args) {

		//사각형 도형의 넓이 구하기 
		// 가로 :23cm
		// 세로 :19cm
		// 넓이를 구했습니다 . -> 437 ㎠
		System.out.println("-------사각형 넓이 구하기----------");
		
		int width = 23;		//사용자가 입력할 값
		int height = 19;	//사용자가 입력할 값
		int box_area = width*height;	
		System.out.println("가로 : " + width + "cm");
		System.out.println("세로 : " + height + "cm");
		System.out.println("넓이 : " + box_area + "㎠");
		
		// 원도형의  넓이와 둘레 구하기
		// 반지름 : 23.230 cm
		// 둘레를 구했습니다. ->  145.884cm
		// 넓이를 구했습니다. ->  1694.447㎠
		
		System.out.println("-------원도형의 넓이와 둘레 구하기--------");
		
		double half = 23.23; //반지름	//사용자가 입력할 값
		double round = 2 * half * 3.14;  // 둘레
		double circle_area = 3.14 * half * half; //넓이  
		
		System.out.printf("반지름 : %.3f㎝ \n" , half);
		System.out.printf("둘레를 구했습니다 : %.3f㎝ \n" , round);
		System.out.printf("넓이를 구했습니다 : %.3f㎠ \n" , circle_area);
	// 강성빈
		
		
		//final 테스트
		// 		변수선언 앞에 final(최종의) 키워드를 붙이면 값을 변경하지 못합니다.
		
		final int test = 123;		//값을 변경 못하는 상수입니다.
		System.out.println("test =" + test);
	}

}
