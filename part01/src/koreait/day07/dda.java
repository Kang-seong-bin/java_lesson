package koreait.day07;

import java.util.Random;
import java.util.Scanner;

public class dda {

	public static void main(String[] args) {
		int anser = 0;
		int[] num= new int[5];
		Random r1= new Random();		//ù��° ���� ����
		Random r2= new Random();		//�ι�° ���� ����
		int first_num[] = new int[10];
		int last_num[] = new int[10];
		int err[] = new int[5];
		int cnt = 0;
		System.out.println("------------------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("------------------------------------------");
		System.out.println("�����մϴ�.");
		
for(int i=0;i<num.length;i++) {	//���� �迭 ����1. ~ ����
			
			Scanner sc = new Scanner(System.in);
			num[i]=i+1;
			first_num[i]=r1.nextInt(90)+10;//����
			last_num[i]=r2.nextInt(90)+10;//����
			int dap = first_num[i]+last_num[i];
			
			System.out.print("����" + num[i] + ".");
		
			System.out.printf("%3d %s %3d %2s %9s",first_num[i],"+",last_num[i], "=","�� �Է� ->  ");
			anser= sc.nextInt();
			if(dap!=anser){
				err[cnt]=num[i];
			}else {break;}
			System.out.println(cnt+1);
}
		//����
		//Ʋ������
		
		
	}

}
