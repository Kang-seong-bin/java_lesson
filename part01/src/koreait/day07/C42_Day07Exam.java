package koreait.day07;

import java.util.Random;
import java.util.Scanner;
public class C42_Day07Exam {

	public static void main(String[] args) {
		int anser = 0;
		Random r1= new Random();		//ù��° ���� ����
		Random r2= new Random();		//�ι�° ���� ����
		int Ex[] = new int[10];
		
		int first_num[] = new int[10];
		int last_num[] = new int[10];
		int count[] = new int[2];
		System.out.println("------------------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("------------------------------------------");
		System.out.println("�����մϴ�.");
		
		for(int i=0;i<Ex.length;i++) {	//���� �迭 ����1. ~ ����
			
			Scanner sc = new Scanner(System.in);
			Ex[i]=i+1;
			first_num[i]=r1.nextInt(90)+10;//����
			last_num[i]=r2.nextInt(90)+10;//����
			int dap = first_num[i]+last_num[i];
			
			System.out.print("����" + Ex[i] + ".");
			
			System.out.printf("%3d %s %3d %2s %9s",first_num[i],"+",last_num[i], "=","�� �Է� ->  ");
			anser= sc.nextInt();
		
		if(dap==anser) 
			count[0]++;
		
		}				
			
		
			
		
		
		

		System.out.println("-----------------------------------------");
		System.out.println("ä���մϴ�. " + " ���� ���� " + count[0] + " (" + (int)(count[0]*10) +"��" + ")");
		System.out.println("::::: Ʋ�� ���� ���� ���� :::::");
		
		for( int i=0;i<count[1];i++) {	//���� �迭 ����1. ~ ����
			Ex[i]=i+1;
			
			
			int dap = first_num[i]+last_num[i];
			System.out.print("����" + Ex[i] + ".");
			
			System.out.printf("%3d %s %3d %2s %4d",first_num[i],"+",last_num[i], "=",dap);
			System.out.println();
}
		

		}//�޼ҵ�
		}//Ŭ����
	//for(i=0;i<err.length;i++) {
		
		
	//}
/*
 * ó������

1. ���� ������
���ڸ� �����Դϴ�.

2. ������ ������ ����ϴ�.

3. �׽�Ʈ�Ҷ��� ������
5���� �ٿ��� �ϼ���.

4. Ŭ���� Ȱ��ƴϰ�
int �� �迭�θ� �ϼ���.

5. ù��° �ǿ����� �迭
   �ι�° �ǿ����� �迭
   ����� �Է� �������� �迭

��繮�� 10���� ����? or
Ʋ�������� ����?

 * 
 */

	

