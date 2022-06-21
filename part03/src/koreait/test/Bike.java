package koreait.test;

public class Bike extends Product{
	//e	
	private int speed;
	
	//f Bike Ŭ������ public �����ڰ� 2���Դϴ�. ����Ʈ �����ڿ� price,prdName, speed�ʵ带 �ʱ�ȭ�ϴ� Ŀ���� �������Դϴ�
	public Bike() {
		
	}
	public Bike(int price,String prdName ,int speed) {
		this.price=price;
		this.prdName=prdName;
		this.speed=speed;
	}
	
	//d	Bike Ŭ������ sell�޼ҵ带 �������մϴ�. ������ ���� Object�� ���� �޾� ���ڿ��� ����,String.format()Ȱ��
	@Override
	public String sell(Object obj) {
		return String.format("�߰� ���� ��� - %d %% ����", obj);
	}
	
	//e Bike Ŭ�������� int speed �ʵ带 ���� ������ private���� �����ϰ� getter,setter �޼ҵ带 public���� ����
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
	
	public String ride(){
		return "����� �̰��� �ü�" + speed + "km�� Ż �� �ֽ��ϴ�.";
	}
	@Override
	public String toString() {
		return "Bike [price=" + price + ", prdName=" + prdName + ", speed=" + speed + "]";
	}

}
	//g  Bike Ŭ������ �ʵ尪�� ����ϵ��� toString �޼ҵ带 �������ϼ��� ��ӹ��� �ʵ嵵 ����
	
	

