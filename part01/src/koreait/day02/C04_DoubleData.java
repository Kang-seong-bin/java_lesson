package koreait.day02;

public class C04_DoubleData {
 public static void main(String[] arg) {
	 
	 System.out.println("Float ���������� -----------------");
	 System.out.println("�޸� ũ�� : " + Float.BYTES + "����Ʈ");	//
	 System.out.println("Float ������ �ּڰ� : " + Float.MIN_VALUE);
	 System.out.println("Float ������ �ִ� : " + Float.MAX_VALUE);
	 // 1.4E-45 �� 1.4 x 10�� -45�� , 3.4028235E38�� 10�� 38��
	 System.out.println("Double ���������� -----------------");
	 System.out.println("�޸� ũ�� : " + Double.BYTES + "����Ʈ");	//
	 System.out.println("Double ������ �ּڰ� : " + Double.MIN_VALUE);
	 System.out.println("Double ������ �ִ� : " + Double.MAX_VALUE);
	 
	 
 }
}

/*	�Ǽ������ʹ� ��ǻ�� �������� �ε��Ҽ��� �������� �ٷ�ϴ�.
 * 	ex) 1.23 X 10�� 23�� ���� 1.23(����) �� 23(����) �� ���� � ũ�⸸ŭ �Ҵ��ϴ��Ŀ� ������ ǥ�������� ���е��� �����ȴ�.
 *  (float�� ������ �Ҽ����� 7�ڸ�, double�� 16�ڸ����� ��Ÿ���� ���е��� ���̸� ���δ�.)
 *  �Ǽ� ������ �⺻ ���� : float ,double (���������� �� ����� Ű����)
 * 	   Wrapper Ŭ������ Float, Double
 * 		�ڡ�1.234���ͷ���  double �����Դϴ�.�ڡ�	
 */
