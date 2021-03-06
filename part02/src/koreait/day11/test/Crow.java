package koreait.day11.test;

public class Crow extends Animal{//까마귀

	protected int wings; //디폴트 한정자 + 다른 패키지 자식
	
	public Crow() {
		System.out.println("새로운 동물가족은 crow");
		type=Animal.CROW;
	}
	
	public void fly() {
	
		setName("까마귀");
		setColor("검정색");
System.out.println("특징 : 날기");
//추상메소드 재정의(구현)

	}

	@Override
	public void act() {
		System.out.println("Crow 행동 : 하루종일 날아다니기");		
	}

	@Override
	public String eat(Object object) {	//문자열 리턴
		return "먹이는 개구리 " + object + " 마리입니다";	}
}