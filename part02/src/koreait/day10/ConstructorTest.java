package koreait.day10;

public class ConstructorTest {

	public static void main(String[] args) {
		
	}

}
class product {
	int price;
	
	//����Ʈ �����ڴ� ������ ���մϴ�.
	
	
	public product(int price) {
		this.price=price;
	}
}

class Food extends product{		//Product() ����Ʈ ������ ���� ������ ����-> Food() ����Ʈ ������ ����
	//Product() ����Ʈ ������ �����ϹǷ� ������ ����
	//-> �ڽ�Ŭ������ Ŀ���� �����ڸ� �����ؼ� �θ�Ŭ����
	//			Ŀ���� �����ڸ� ȣ��
	public Food(int price) {
		super(price);
	}
}

class Electronics extends product{	//Product() ����Ʈ ������ ���� -> Food() ����Ʈ ������ ����
	public Electronics(int price) {
		super(price);		//super() ����Ʈ ������ ��ſ� Ŀ���� ������ ȣ��
	}
	
}