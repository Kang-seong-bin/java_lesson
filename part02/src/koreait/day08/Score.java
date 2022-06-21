package koreait.day08;

public class Score {
	private int korean;
	private int english;
	private int science;
	private String grade;		//getter, setter 작성해보기
					// 값 예시 : A+,A,B+,B.......
	
	
	//기본생성자가 숨어 있습니다. 어떤 코드일까요? 접근한정자는 public
	public Score() {
	}
	
	
	
	void setScience(int Science) {
		this.science=science;
	}
	int getscience() {
		return science;
	}
	
	void setKorean(int korean) {
		this.korean=korean;
		//메소드 인자로 전달받은 값을 클래스 전역변수 korean에 저장(대입)
		//this는 setKorean 메소드 실행객체
	}
	
	int getKorean() {
		return korean;
	}
	
	void setenglish(int english) {
		this.english=english;
		//메소드 인자로 전달받은 값을 클래스 전역변수 english에 저장(대입)
		//this는 setenglish 메소드 실행객체
	}
	
	int getenglish() {
		return english;
	}
	
	void setgrade(String grade) {
		this.grade=grade;
		//메소드 인자로 전달받은 값을 클래스 전역변수 grade에 저장(대입)
		//this는 setgrade 메소드 실행객체
	}
	
	String getgrade() {
		return grade;
	}
	
	
}
