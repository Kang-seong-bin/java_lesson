package koreait.test;


public class ProductTest {

	public static void main(String[] args) {
		//h
		System.out.println();
		Product[] cart = new Product[10];
		cart[0] = new Bike(123000, "MTB", 25);
		cart[3] = new Bike(99000, "��õ��", 15);
		//���� Ŭ������ ����� cart�� �־��ٰ��� �Է�
		cart[1] = new Electronics(35000, "USB");
		cart[5] = new Electronics(117000, "ipad");
		cart[7] = new Electronics(2250000, "lg �����");
		//i
		for(Product temp : cart)//i=0; i<cart.length;i++�� ���� for�� �ۼ��ص� ��(temp�ڸ��� cart[i]�� ������)
			if(temp!=null && temp.price >= 100000) {
				System.out.println(temp);
			//	if(temp instanceof Bike)
			}
		
		//�ڽ� ��ü Ÿ�� �˻� : instanceof , �ٿ�ĳ����
		//instanceof��//�ڽ� ��ü�� �θ� ��ü true false�� �з�
		//�ٿ�ĳ����
		//ex) parent instanceof child		// false �������� �������� ����ȯ�� �Ǵ���
		//parent p = new parent;			//	  ��   ������ �θ� ��ü��
		//child child = (child)p
		//�ٸ� Ÿ���� �ڽ�Ŭ���� ��ü�� �ʵ尪
		//�ٸ� Ŭ���� product �߻�Ŭ���� ���� �߻�޼ҵ� ����
		//�޼ҵ� ���� : ���� ������, ����(�Ű�����)�� Ÿ�԰� ���� 
	}
	
}
/*
 * class Car extends Product{
	@Override
	public String sell(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
 */



