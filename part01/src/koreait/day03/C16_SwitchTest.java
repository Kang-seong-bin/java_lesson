package koreait.day03;

import java.util.Scanner;

public class C16_SwitchTest {

	public static void main(String[] args) {
		// switch ���� if ~ else if �� ����ϴ� ��ɹ��Դϴ�.
		Scanner sc = new Scanner(System.in);
		int item_no;
		int pay = 0;
		int item_yes;
		System.out.println("?��ǰ��� : 1.2200��  2. 1900�� 3. 3600�� 4. 2870��");
		System.out.print("��ǰ�� �����ؼ� ��ٱ��Ͽ� ��������. >>>>");
		item_no = sc.nextInt();
		
		switch (item_no) { // if������ ���ǽ� �ۼ� ���� ���� ���� ���� ����
		case 1:		//�˻��� ��
			pay = 2200;
			break;	//�Ʒ� ��ɹ����� �������� �ʰ� switch���� ������
		case 2:
			pay = 1900;
			break;
			
		case 3:
			pay = 3600;
			break;
			
		case 4:
			pay = 2870;
			break;
		default:	//case ���� �ش���� ���� ���� ���� ����
			System.out.println("��ǰ ������ �߸��Ǿ����ϴ�.");
			pay = 99999;
			break;
		}
		
		System.out.println("�����ݾ� : " + pay + "�Դϴ�. ");
		
		//���� switch ���� if~ else if �� �ٲ㼭 �����ϱ�
		
		System.out.println("?��ǰ��� : 1.2200��  2. 1900�� 3. 3600�� 4. 2870��");
		System.out.print("��ǰ�� �����ؼ� ��ٱ��Ͽ� ��������. >>>>");
		item_yes = sc.nextInt();
		
		if(item_yes == 1){
			pay = 2200;
		}else if(item_yes == 2){
			pay = 1900;
		}else if(item_yes == 3) {
			pay = 3600;
		}else if(item_yes == 4){
			pay = 2870;
		}else{
			System.out.println("��ǰ ������ �߸��Ǿ����ϴ�.");	
			pay = 900000;
		}
		System.out.println("�����ݾ�2 : " + pay + "�Դϴ�. ");
		}
		
		
		
		
	}


