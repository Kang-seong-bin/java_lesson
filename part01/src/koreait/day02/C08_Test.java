package koreait.day02;


	//���� : �ڹ����α׷��־����� Ŭ���� �̸��� ���ϸ��� �����ϰ� �մϴ�.
public class C08_Test {

	public static void main(String[] args) {

		//�簢�� ������ ���� ���ϱ� 
		// ���� :23cm
		// ���� :19cm
		// ���̸� ���߽��ϴ� . -> 437 ��
		System.out.println("-------�簢�� ���� ���ϱ�----------");
		
		int width = 23;		//����ڰ� �Է��� ��
		int height = 19;	//����ڰ� �Է��� ��
		int box_area = width*height;	
		System.out.println("���� : " + width + "cm");
		System.out.println("���� : " + height + "cm");
		System.out.println("���� : " + box_area + "��");
		
		// ��������  ���̿� �ѷ� ���ϱ�
		// ������ : 23.230 cm
		// �ѷ��� ���߽��ϴ�. ->  145.884cm
		// ���̸� ���߽��ϴ�. ->  1694.447��
		
		System.out.println("-------�������� ���̿� �ѷ� ���ϱ�--------");
		
		double half = 23.23; //������	//����ڰ� �Է��� ��
		double round = 2 * half * 3.14;  // �ѷ�
		double circle_area = 3.14 * half * half; //����  
		
		System.out.printf("������ : %.3f�� \n" , half);
		System.out.printf("�ѷ��� ���߽��ϴ� : %.3f�� \n" , round);
		System.out.printf("���̸� ���߽��ϴ� : %.3f�� \n" , circle_area);
	// ������
		
		
		//final �׽�Ʈ
		// 		�������� �տ� final(������) Ű���带 ���̸� ���� �������� ���մϴ�.
		
		final int test = 123;		//���� ���� ���ϴ� ����Դϴ�.
		System.out.println("test =" + test);
	}

}
