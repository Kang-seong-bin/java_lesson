package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx {

	public static void main(String[] args) {
		//�ۼ��� ������
		int n1, n2, n3;
		int max;
		Scanner sc = new Scanner(System.in);
		//n1,n2,n3Ű���� �Է°�
		System.out.println("n1 ���� �Է��ϼ���");
		n1 = sc.nextInt();
		System.out.println("n2 ���� �Է��ϼ���");
		n2 = sc.nextInt();
		System.out.println("n3 ���� �Է��ϼ���");		
		n3 = sc.nextInt();
		
		System.out.println("n1�� ���� " + n1 + "�Դϴ�");
		System.out.println("n2�� ���� " + n2 + "�Դϴ�");
		System.out.println("n3�� ���� " + n3 + "�Դϴ�");
		
		if(n1 > n2) {
			max = n1;
			System.out.println("�ӽ� max ���� :" + max + "�Դϴ�");
			
				if(max > n3) {
					max = n1;
				}else {
					max = n3;
		}
		}else
			max = n2;
			System.out.println("�ӽ� max ���� :" + max + "�Դϴ�");
			
				if(max > n3) {
					max = n1;
				}else {
					max = n3;
			
	}
		System.out.println("���� max���� :" + max + "�Դϴ�." );
		
}
}
