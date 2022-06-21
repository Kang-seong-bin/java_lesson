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
		return String.format("추가 할인 행사 - %d %% 인하", obj);
	}
	
	//6
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
	
	public String ride(){//10
		return "당신은 이것을 시속" + speed + "km로 탈 수 있습니다.";
	}
	@Override//12
	public String toString() {
		return "Bike [price=" + price + ", prdName=" + prdName + ", speed=" + speed + "]";
	}

}
	
	
	

