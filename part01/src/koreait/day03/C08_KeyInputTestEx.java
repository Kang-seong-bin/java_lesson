package koreait.day03;

import java.util.Scanner;

//���� : �ڹ����α׷��־����� Ŭ���� �̸��� ���ϸ��� �����ϰ� �մϴ�.
public class C08_KeyInputTestEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		
		//�簢�� ������ ���� ���ϱ� 
		// ���� :23cm
		// ���� :19cm
		// ���̸� ���߽��ϴ� . -> 437 ��
		System.out.println("-------�簢�� ���� ���ϱ�----------");
		
		int height = 0;	
		int width = 0;	
		
		System.out.print("���� ���� �Է��ϼ���. -> ");
		width = sc.nextInt();		//����ڰ� �Է��� ��
		
		System.out.print("���� ���� �Է��ϼ���. -> ");
		height = sc.nextInt();    //����ڰ� �Է��� ��
		
		int box_area = width*height;	
		System.out.println("���� : " + width + "cm");
		System.out.println("���� : " + height + "cm");
		System.out.println("���� : " + box_area + "��");
		
		// ��������  ���̿� �ѷ� ���ϱ�
		// ������ : 23.230 cm
		// �ѷ��� ���߽��ϴ�. ->  145.884cm
		// ���̸� ���߽��ϴ�. ->  1694.447��
		
		System.out.println("-------�������� ���̿� �ѷ� ���ϱ�--------");
		
		double half = 0; //������	
		final double PI = 3.14;	//������
		
		System.out.print("������ ���� �Է��ϼ���. -> ");	
		half = sc.nextDouble();		//����ڰ� �Է��� ��
		
		double round = 2 * half * PI;  // �ѷ�
		double circle_area = PI * half * half; //����  
		System.out.printf("������ : %.3f�� \n" , half);
		System.out.printf("�ѷ��� ���߽��ϴ� : %.3f�� \n" , round);
		System.out.printf("���̸� ���߽��ϴ� : %.3f�� \n" , circle_area);
		
		
		sc.close();
	// ������
		
		
	}

}
