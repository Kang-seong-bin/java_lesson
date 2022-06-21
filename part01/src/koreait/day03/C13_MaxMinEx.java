package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx {

	public static void main(String[] args) {
		//작성자 강성빈
		int n1, n2, n3;
		int max;
		Scanner sc = new Scanner(System.in);
		//n1,n2,n3키보드 입력값
		System.out.println("n1 값을 입력하세요");
		n1 = sc.nextInt();
		System.out.println("n2 값을 입력하세요");
		n2 = sc.nextInt();
		System.out.println("n3 값을 입력하세요");		
		n3 = sc.nextInt();
		
		System.out.println("n1의 값은 " + n1 + "입니다");
		System.out.println("n2의 값은 " + n2 + "입니다");
		System.out.println("n3의 값은 " + n3 + "입니다");
		
		if(n1 > n2) {
			max = n1;
			System.out.println("임시 max 값은 :" + max + "입니다");
			
				if(max > n3) {
					max = n1;
				}else {
					max = n3;
		}
		}else
			max = n2;
			System.out.println("임시 max 값은 :" + max + "입니다");
			
				if(max > n3) {
					max = n1;
				}else {
					max = n3;
			
	}
		System.out.println("최종 max값은 :" + max + "입니다." );
		
}
}
