package koreait.day13a;

public class User implements Comparable<User> {
	
	private String name;
	private int age;

	public User(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	//Comparable 인터페이스 추상메소드 구현
	@Override
	public int compareTo(User o) {	//현재객체의 age와 인자값 age 비교
		Integer o1 = this.age;
		Integer o2 = o.getAge();
		return o1.compareTo(o2);	//오름차순
	}//user와 member의 차이점은 이 코드

	//Object 클래스 toString() 재정의
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
	
	
}