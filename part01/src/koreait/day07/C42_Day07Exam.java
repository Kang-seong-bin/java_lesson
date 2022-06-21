package koreait.day07;

import java.util.Random;
import java.util.Scanner;
public class C42_Day07Exam {

	public static void main(String[] args) {
		int anser = 0;
		Random r1= new Random();		//첫번째 난수 생성
		Random r2= new Random();		//두번째 난수 생성
		int Ex[] = new int[10];
		
		int first_num[] = new int[10];
		int last_num[] = new int[10];
		int count[] = new int[2];
		System.out.println("------------------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("------------------------------------------");
		System.out.println("시작합니다.");
		
		for(int i=0;i<Ex.length;i++) {	//문제 배열 문제1. ~ 구현
			
			Scanner sc = new Scanner(System.in);
			Ex[i]=i+1;
			first_num[i]=r1.nextInt(90)+10;//저장
			last_num[i]=r2.nextInt(90)+10;//저장
			int dap = first_num[i]+last_num[i];
			
			System.out.print("문제" + Ex[i] + ".");
			
			System.out.printf("%3d %s %3d %2s %9s",first_num[i],"+",last_num[i], "=","답 입력 ->  ");
			anser= sc.nextInt();
		
		if(dap==anser) 
			count[0]++;
		
		}				
			
		
			
		
		
		

		System.out.println("-----------------------------------------");
		System.out.println("채점합니다. " + " 맞은 갯수 " + count[0] + " (" + (int)(count[0]*10) +"점" + ")");
		System.out.println("::::: 틀린 문제 정답 보기 :::::");
		
		for( int i=0;i<count[1];i++) {	//문제 배열 문제1. ~ 구현
			Ex[i]=i+1;
			
			
			int dap = first_num[i]+last_num[i];
			System.out.print("문제" + Ex[i] + ".");
			
			System.out.printf("%3d %s %3d %2s %4d",first_num[i],"+",last_num[i], "=",dap);
			System.out.println();
}
		

		}//메소드
		}//클래스
	//for(i=0;i<err.length;i++) {
		
		
	//}
/*
 * 처리조건

1. 덧셈 문제는
두자리 덧셈입니다.

2. 문제는 난수로 만듭니다.

3. 테스트할때는 문제를
5개로 줄여서 하세요.

4. 클래스 활용아니고
int 형 배열로만 하세요.

5. 첫번째 피연산자 배열
   두번째 피연산자 배열
   사용자 입력 정답저장 배열

모든문제 10개를 저장? or
틀린문제만 저장?

 * 
 */

	

