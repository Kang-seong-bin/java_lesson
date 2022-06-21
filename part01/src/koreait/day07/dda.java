package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class dda {

	public static void main(String[] args) {
		int anser = 0;
		int[] num= new int[5];
		Random r1= new Random();		//첫번째 난수 생성
		Random r2= new Random();		//두번째 난수 생성
		int first_num[] = new int[10];
		int last_num[] = new int[10];
		int err[] = new int[5];
		int cnt = 0;
		System.out.println("------------------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("------------------------------------------");
		System.out.println("시작합니다.");
		
for(int i=0;i<num.length;i++) {	//문제 배열 문제1. ~ 구현
			
			Scanner sc = new Scanner(System.in);
			num[i]=i+1;
			first_num[i]=r1.nextInt(90)+10;//저장
			last_num[i]=r2.nextInt(90)+10;//저장
			int dap = first_num[i]+last_num[i];
			
			System.out.print("문제" + num[i] + ".");
		
			System.out.printf("%3d %s %3d %2s %9s",first_num[i],"+",last_num[i], "=","답 입력 ->  ");
			anser= sc.nextInt();
			if(dap!=anser){
				err[cnt]=num[i];
			}else {break;}
			System.out.println(cnt+1);
}
		//정답
		//틀린문제
		
		
	}

}
