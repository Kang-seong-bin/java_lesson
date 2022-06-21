package koreait.day10;

public class ConstructorTest {

	public static void main(String[] args) {
		
	}

}
class product {
	int price;
	
	//디폴트 생성자는 동작을 안합니다.
	
	
	public product(int price) {
		this.price=price;
	}
}

class Food extends product{		//Product() 디폴트 생성자 실행 없으면 오류-> Food() 디폴트 생성자 실행
	//Product() 디폴트 생성자 실행하므로 없으면 오류
	//-> 자식클래스도 커스텀 생성자를 정의해서 부모클래스
	//			커스텀 생성자를 호출
	public Food(int price) {
		super(price);
	}
}

class Electronics extends product{	//Product() 디폴트 생성자 실행 -> Food() 디폴트 생성자 실행
	public Electronics(int price) {
		super(price);		//super() 디폴트 생성자 대신에 커스텀 생성자 호출
	}
	
}