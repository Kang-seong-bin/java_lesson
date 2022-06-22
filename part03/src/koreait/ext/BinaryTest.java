package koreait.ext;

public class BinaryTest {

	public static void main(String[] args) {
		
		System.out.println(String.format("%8s\t %8s\t %8s", "10����","2����","16����"));
		for(int i=0; i<100;i++) {
			System.out.println(String.format("%8d\t %8s\t %8s", i, Integer.toBinaryString(i),
									Integer.toHexString(i)));
	}
		/*
		 * 10���� �������� �ٸ� ����(����)���� ���ڿ� ��ȯ
		 * Integer.toBinaryString(i)	-> 2������ ��ȯ
		 * Integer.toOctalString(i)		-> 8������ ��ȯ
		 * Integer.toHexString(i)		-> 16������ ��ȯ
		 * 
		 * 
		 * int ������ 4����Ʈ 32��Ʈ 2������ 32�ڸ� , 16�����δ� 8�ڸ� , 10�����δ� ������ -2147483648 ~
		 */
	
	}

}
//1�� ���º� �ƴ� 40��
//���� : �迭, Ŭ����, ���(Ư�� �޼ҵ� ������, �����ε�), List,Map
//�߻�Ŭ����, �������̽�, ����������
//�ֿ�Ű���� final, static -> �ʵ�, �޼ҵ�
//2�� 20�� ���� X Ű���� ���ַ� ���� 2�ٷ� ���
//3�� 40�� �ҽ��ڵ� Ȯ�� ����
