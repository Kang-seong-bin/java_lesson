package koreait.day08;

public class Member {//�ۼ��� ������
private String name;		
private String email;		
private int age;
private int level;

//Ŀ���� ������ : name, email �ʵ� �ʱ�ȭ
public Member(String name,String email){	//() �ȿ��� ������ �� ���޹��� ����
	this.name=name; 	//setter�޼ҵ� ó�� ��������(�ʵ�)���� �ʱ�ȭ.
	this.email=email; 	//setter�޼ҵ� ó�� ��������(�ʵ�)���� �ʱ�ȭ.
}// ������ �޼ҵ� : Ÿ�԰� ���ڰ����� ������ ������ �Ǿ�� �޼ҵ� �����ε�
//		��	���� ���� String name�� email�� ���ÿ� �ۼ��ؾ��Ѵ�.
//					�� ���� �ۼ��� ��� Ÿ�԰� ���ڰ����� ������ ���� �ʾ� ������ �߻�

//�⺻(default) ������ : ��¹� �߰�
public Member(){
	System.out.println("name,email,age,level �ʵ�� �⺻���Դϴ�");
	System.out.println("name = " + this.name);	//this �� �޼ҵ带 �����ϴ� ��ü
	System.out.println("age = " + this.age);
}

//setter
public void setName(String name) {//�ʵ� �ʱ�ȭ�ϴ� Ŀ���� ������ �ۺ�����
	this.name = name;
}
//getter
public String getName() {
	return name;
} 

public void setEmail(String email) {//�ʵ� �ʱ�ȭ�ϴ� Ŀ���� ������ �ۺ�����
	this.email = email;
}
public String getEmail() {
	return email;
}
public void setAge(int age) {//�ʵ� �ʱ�ȭ�ϴ� Ŀ���� ������ �ۺ�����
	this.age = age;
}
public int getAge() {
	return age;
} 
public void setlevel(int level) {//�ʵ� �ʱ�ȭ�ϴ� Ŀ���� ������ �ۺ�����
	this.level = level;
}
public int getlevel() {
	return level;
} 

}