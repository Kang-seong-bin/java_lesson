package koreait.day03;

import java.util.Scanner;

//참고 : 자바프로그래밍언어에서는 클래스 이름과 파일명이 동일하게 합니다.
public class C08_KeyInputTestEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		
		//사각형 도형의 넓이 구하기 
		// 가로 :23cm
		// 세로 :19cm
		// 넓이를 구했습니다 . -> 437 ㎠
		System.out.println("-------사각형 넓이 구하기----------");
		
		int height = 0;	
		int width = 0;	
		
		System.out.print("가로 값을 입력하세요. -> ");
		width = sc.nextInt();		//사용자가 입력할 값
		
		System.out.print("세로 값을 입력하세요. -> ");
		height = sc.nextInt();    //사용자가 입력할 값
		
		int box_area = width*height;	
		System.out.println("가로 : " + width + "cm");
		System.out.println("세로 : " + height + "cm");
		System.out.println("넓이 : " + box_area + "㎠");
		
		// 원도형의  넓이와 둘레 구하기
		// 반지름 : 23.230 cm
		// 둘레를 구했습니다. ->  145.884cm
		// 넓이를 구했습니다. ->  1694.447㎠
		
		System.out.println("-------원도형의 넓이와 둘레 구하기--------");
		
		double half = 0; //반지름	
		final double PI = 3.14;	//원주율
		
		System.out.print("반지름 값을 입력하세요. -> ");	
		half = sc.nextDouble();		//사용자가 입력할 값
		
		double round = 2 * half * PI;  // 둘레
		double circle_area = PI * half * half; //넓이  
		System.out.printf("반지름 : %.3f㎝ \n" , half);
		System.out.printf("둘레를 구했습니다 : %.3f㎝ \n" , round);
		System.out.printf("넓이를 구했습니다 : %.3f㎠ \n" , circle_area);
		
		
		sc.close();
	// 강성빈
		
		
	}

}
