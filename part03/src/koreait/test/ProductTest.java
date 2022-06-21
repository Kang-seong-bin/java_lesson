package koreait.test;


public class ProductTest {

	public static void main(String[] args) {
		//h
		System.out.println();
		Product[] cart = new Product[10];
		cart[0] = new Bike(123000, "MTB", 25);
		cart[3] = new Bike(99000, "삼천리", 15);
		//새로 클래스를 만들고 cart에 넣어줄값을 입력
		cart[1] = new Electronics(35000, "USB");
		cart[5] = new Electronics(117000, "ipad");
		cart[7] = new Electronics(2250000, "lg 냉장고");
		//i
		for(Product temp : cart)//i=0; i<cart.length;i++와 같이 for문 작성해도 됨(temp자리에 cart[i]가 들어가야함)
			if(temp!=null && temp.price >= 100000) {
				System.out.println(temp);
			//	if(temp instanceof Bike)
			}
		
		//자식 객체 타입 검사 : instanceof , 다운캐스팅
		//instanceof는//자식 객체와 부모 객체 true false로 분류
		//다운캐스팅
		//ex) parent instanceof child		// false 오른쪽이 왼쪽으로 형변환이 되느냐
		//parent p = new parent;			//	  ㄴ   왼쪽이 부모 객체냐
		//child child = (child)p
		//다른 타입의 자식클래스 객체의 필드값
		//다른 클래스 product 추상클래스 구현 추상메소드 구현
		//메소드 정의 : 리턴 값형식, 인자(매개변수)의 타입과 개수 
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



