package koreait.test;

public class Bike extends Product{
	//e	
	private int speed;
	
	//f Bike 클래스는 public 생성자가 2개입니다. 디폴트 생성자와 price,prdName, speed필드를 초기화하는 커스텀 생성자입니다
	public Bike() {
		
	}
	public Bike(int price,String prdName ,int speed) {
		this.price=price;
		this.prdName=prdName;
		this.speed=speed;
	}
	
	//d	Bike 클래스에 sell메소드를 재정의합니다. 실행은 인자 Object를 전달 받아 문자열로 리턴,String.format()활용
	@Override
	public String sell(Object obj) {
		return String.format("추가 할인 행사 - %d %% 인하", obj);
	}
	
	//e Bike 클래스에는 int speed 필드를 접근 한정자 private으로 선언하고 getter,setter 메소드를 public으로 선언
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
	
	public String ride(){
		return "당신은 이것을 시속" + speed + "km로 탈 수 있습니다.";
	}
	@Override
	public String toString() {
		return "Bike [price=" + price + ", prdName=" + prdName + ", speed=" + speed + "]";
	}

}
	//g  Bike 클래스의 필드값을 출력하도록 toString 메소드를 재정의하세요 상속받은 필드도 포함
	
	

