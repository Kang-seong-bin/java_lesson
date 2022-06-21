package koreait.day08;

public class Member {//작성자 강성빈
private String name;		
private String email;		
private int age;
private int level;

//커스텀 생성자 : name, email 필드 초기화
public Member(String name,String email){	//() 안에는 실행할 때 전달받은 인자
	this.name=name; 	//setter메소드 처럼 전역변수(필드)값을 초기화.
	this.email=email; 	//setter메소드 처럼 전역변수(필드)값을 초기화.
}// 생성자 메소드 : 타입과 인자갯수를 가지고 구별이 되어야 메소드 오버로딩
//		ㄴ	따라서 위의 String name과 email은 동시에 작성해야한다.
//					ㄴ 따로 작성할 경우 타입과 인자갯수가 구별이 되지 않아 오류가 발생

//기본(default) 생성자 : 출력문 추가
public Member(){
	System.out.println("name,email,age,level 필드는 기본값입니다");
	System.out.println("name = " + this.name);	//this 는 메소드를 실행하는 객체
	System.out.println("age = " + this.age);
}

//setter
public void setName(String name) {//필드 초기화하는 커스텀 생성자 퍼블릭으로
	this.name = name;
}
//getter
public String getName() {
	return name;
} 

public void setEmail(String email) {//필드 초기화하는 커스텀 생성자 퍼블릭으로
	this.email = email;
}
public String getEmail() {
	return email;
}
public void setAge(int age) {//필드 초기화하는 커스텀 생성자 퍼블릭으로
	this.age = age;
}
public int getAge() {
	return age;
} 
public void setlevel(int level) {//필드 초기화하는 커스텀 생성자 퍼블릭으로
	this.level = level;
}
public int getlevel() {
	return level;
} 

}