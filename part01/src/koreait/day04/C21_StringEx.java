package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {
//�ۼ��� ������
	public static void main(String[] args) {
		
		
		/*  ���� �̸��� ������ üũ�ϴ� ��� ���� 
		 *  1. @ ��ȣ�� 1�� ���ԵǾ�� �մϴ�.	(�޽��� : �̸��� ������ �ƴմϴ�.)
		 *  		�� indexof �� -1�� �ƴϰ� indexof �� lastindexof �� ���� ���ΰ�?
		 *  
		 *  2. 1���� ���� �� @ �ڿ��� gmail.com �̾�� �մϴ�. (�޽��� : ������ �̸��� Ʋ���ϴ�.)
		 *  		�� '@' �� indexof �� ���ؼ� �� �ں��� ������ substring ������ ���ڿ��� equals ��
		 *  
		 *  3. 2���� ���� �� @ �ձ����� ���ڿ�(�����̸�)�� �����մϴ�.
		 *  		�� '@' �� indexof �� ���ؼ� ó�� ���� '@' ���� ������ ���ڿ� substring ����
		 *  
		 *  4. 3���� �����̸��� 6���� �̻��̾�� �մϴ�.
		 *  		�� 3���� ���ڿ��� length() �� 6���� ��
		 *  
		 *  5. 3���� �����̸����� Ư����ȣ $,%�� ���ԵǸ� �ȵ˴ϴ�. 
		 *   		�� indexof('$') , indexof('%') �� ��� -1�� �ƴϸ� �����ϴ� ��ȣ ����
		 */

		Scanner sc = new Scanner(System.in);
		String email;
		boolean isValid=true;
		String domain = "gmail.com";
		String account;
		String idx = "@";
		System.out.println("����� �̸��� �Է��ϼ���. >>>");
		email = sc.nextLine();		//Ű���� �Է��� ���ڿ��� ó���մϴ�.
		email = sc.nextLine();
		//�Է��� email�� ó������ 1,2,4,5 �� �ش����� ������ �޽��� ����ϰ� isValid ������ false�� �մϴ� -> isValid ���
		
		//public int length()
		//message.length();
		//message.substring(indexof);
		
	}
	public static String methodA(String account, String idx,String domain) {
		System.out.println("���� �̸��� �����Դϴ�");
		return account+idx+domain;	
}
}
