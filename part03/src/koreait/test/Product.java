package koreait.test;
//c productŬ������ �߻�Ŭ������ �����ϰ� (abstract���)sell�̶�� �߻�޼ҵ带 public���� �����ϼ���
// : �޼ҵ��� ����Ÿ���� String, ���ڴ� Object 1���Դϴ�.
public abstract class Product {
//b Product Ŭ������ ���� �����ڸ� protected�� �մϴ�
	static final int BIKE = 1;
	static final int DOG = 2;
protected int price;
protected String prdName;	//a ProductŬ������
// ���ڿ� Ÿ��'��ǰ��'�ʵ带 �����ϼ���. �ʵ���� prdName�Դϴ�.

public abstract String sell(Object obj); //c	�߻�޼ҵ� sell public���� ����, ���� Object








}
//����Ʈ ������ ��밡�� ProductŬ������
//���� ���⼭ Ŀ���� �����ڸ� ���������� bike���� super�� ���� �̿밡��


//0
//1
//2
//3

//4 
//5-  0?
//6
//7
//8-	0?
//9-	0?
//10x-		����  �θ� �ڽ� ������ ��ó�� ������ �����ϰ� 
// name�� speed�� ���ڿ��� ����
//11x-10���� ���� Ex) "����� name�� �ü� speed�� Ż �� �ֽ��ϴ�" ,   "kwh �ʵ尪(�ð��� ���¼Ҹ�)���� 1�� 24�ð� ���¼Ҹ�"�� (�Ǽ� float or double)�� ����Ͽ� ���� 
//12 Electronics��
//13	0?
//14-x
//15
//16- ride�޼ҵ�x





//�ʵ�����������


//�ڽ�Ŭ������ bike���� �ϳ��� ���� ���� ���迡�� car�� ������
/*Object Ÿ�Կ� ���ԵǴ� int,long, �̷��͵���
����Ŭ����Ÿ������ ��ȯ�Ǿ� ĳ���õ˴ϴ�.
�츮�� Integer a= 1;
�̷��� ������ ��ȯ�� �Ͼ�ſ���. �ڵ����ο�
������ new Integer(1)
�̷��� �ؾ��ؿ�

 * */