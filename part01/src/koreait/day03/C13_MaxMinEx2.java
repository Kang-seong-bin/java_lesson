package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx2 {

	public static void main(String[] args) {
		//작성자 강성빈
		int n1, n2, n3;
		int max;
		int min;
		Scanner sc = new Scanner(System.in);
		
		//n1, n2, n3의 키보드 입력
		System.out.print("n1 값을 입력하세요 : ");
		n1 = sc.nextInt();
		System.out.print("n2 값을 입력하세요 : ");
		n2 = sc.nextInt();
		System.out.print("n3 값을 입력하세요 : ");		
		n3 = sc.nextInt();
		System.out.printf("n1=%d\t n2=%d\t n3=%d\n" , n1, n2, n3);
		
		//n1, n2, n3 중에 최대값 구하기
		if(n1 > n2) {
			max = n1;	//max는 임시 값
			min = n2;	//min은 임시 값
		}
		else	{
			max = n2;	//max는 임시 값
			min = n1;	//min은 임시 값
			
	}
		if(max < n3) max = n3;	//임시 max값보다 남은 n3의 값이 더 클 떄만
		if(min > n3) min = n3;	//임시 min값보다 남은 n3의 값이 더 작을 떄만
	System.out.println("최종 max 값은 : " + max +  ", 최종 min 값은 : " + min );
		 
	sc.close();
}
		

		 
}

