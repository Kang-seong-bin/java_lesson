package koreait.day11.test;

public class Crow extends Animal{//���

	protected int wings; //����Ʈ ������ + �ٸ� ��Ű�� �ڽ�
	
	public Crow() {
		System.out.println("���ο� ���������� crow");
		type=Animal.CROW;
	}
	
	public void fly() {
	
		setName("���");
		setColor("������");
System.out.println("Ư¡ : ����");
//�߻�޼ҵ� ������(����)

	}

	@Override
	public void act() {
		System.out.println("Crow �ൿ : �Ϸ����� ���ƴٴϱ�");		
	}

	@Override
	public String eat(Object object) {	//���ڿ� ����
		return "���̴� ������ " + object + " �����Դϴ�";	}
}