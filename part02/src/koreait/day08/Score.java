package koreait.day08;

public class Score {
	private int korean;
	private int english;
	private int science;
	private String grade;		//getter, setter �ۼ��غ���
					// �� ���� : A+,A,B+,B.......
	
	
	//�⺻�����ڰ� ���� �ֽ��ϴ�. � �ڵ��ϱ��? ���������ڴ� public
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
		//�޼ҵ� ���ڷ� ���޹��� ���� Ŭ���� �������� korean�� ����(����)
		//this�� setKorean �޼ҵ� ���ఴü
	}
	
	int getKorean() {
		return korean;
	}
	
	void setenglish(int english) {
		this.english=english;
		//�޼ҵ� ���ڷ� ���޹��� ���� Ŭ���� �������� english�� ����(����)
		//this�� setenglish �޼ҵ� ���ఴü
	}
	
	int getenglish() {
		return english;
	}
	
	void setgrade(String grade) {
		this.grade=grade;
		//�޼ҵ� ���ڷ� ���޹��� ���� Ŭ���� �������� grade�� ����(����)
		//this�� setgrade �޼ҵ� ���ఴü
	}
	
	String getgrade() {
		return grade;
	}
	
	
}
