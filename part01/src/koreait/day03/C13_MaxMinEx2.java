package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx2 {

	public static void main(String[] args) {
		//�ۼ��� ������
		int n1, n2, n3;
		int max;
		int min;
		Scanner sc = new Scanner(System.in);
		
		//n1, n2, n3�� Ű���� �Է�
		System.out.print("n1 ���� �Է��ϼ��� : ");
		n1 = sc.nextInt();
		System.out.print("n2 ���� �Է��ϼ��� : ");
		n2 = sc.nextInt();
		System.out.print("n3 ���� �Է��ϼ��� : ");		
		n3 = sc.nextInt();
		System.out.printf("n1=%d\t n2=%d\t n3=%d\n" , n1, n2, n3);
		
		//n1, n2, n3 �߿� �ִ밪 ���ϱ�
		if(n1 > n2) {
			max = n1;	//max�� �ӽ� ��
			min = n2;	//min�� �ӽ� ��
		}
		else	{
			max = n2;	//max�� �ӽ� ��
			min = n1;	//min�� �ӽ� ��
			
	}
		if(max < n3) max = n3;	//�ӽ� max������ ���� n3�� ���� �� Ŭ ����
		if(min > n3) min = n3;	//�ӽ� min������ ���� n3�� ���� �� ���� ����
	System.out.println("���� max ���� : " + max +  ", ���� min ���� : " + min );
		 
	sc.close();
}
		

		 
}

