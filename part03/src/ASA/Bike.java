package ASA;

public class Bike extends Product{
	//6
	private int speed;
	
	//7
	public Bike() {
		
	}
	public Bike(int price,String prdName ,int speed) {
		this.price=price;
		this.prdName=prdName;
		this.speed=speed;
	}
	
	//4
	@Override
	public String sell(Object obj) {
		return String.format("�߰� ���� ��� - %d %% ����", obj);
	}
	
	//6
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
	
	public String ride(){//10
		return "����� �̰��� �ü�" + speed + "km�� Ż �� �ֽ��ϴ�.";
	}
	@Override//12
	public String toString() {
		return "Bike [price=" + price + ", prdName=" + prdName + ", speed=" + speed + "]";
	}

}
	
	
	

