package koreait.day18;

public class BinaryTest {

	public static void main(String[] args) {
		
		System.out.println("10����\t 2����\t 16����");
		for(int i=0; i<100;i++) {
			System.out.println(String.format("%d\t %s\t %s", i, Integer.toBinaryString(i),
									Integer.toHexString(i)));
	}
		
	
	}

}
//1�� ���º� �ƴ� 40��
//���� : �迭, Ŭ����, ���(Ư�� �޼ҵ� ������, �����ε�), List,Map
//�߻�Ŭ����, �������̽�, ����������
//�ֿ�Ű���� final, static -> �ʵ�, �޼ҵ�
//2�� 20�� ���� X Ű���� ���ַ� ���� 2�ٷ� ���
//3�� 40�� �ҽ��ڵ� Ȯ�� ����
