package koreait.day09a;

/*
 * Ŭ������ ���
 * -> Ŭ���� ���� �θ�(����Ŭ����,super)-�ڽİ���(����Ŭ����)���谡 ��������ϴ�.
 * -> �θ��� Ŭ���� ������Ҹ� �ڽ��� ����� �� �ֽ��ϴ�. ��ӵǴ� ��Ҵ� �ʵ�, �޼ҵ�
 * -> extends Ű���� ����Ͽ� �θ�Ŭ������ �����մϴ�.	����Ŭ������ ���� 1���Դϴ�.
 * -> private ���������ڴ� ��� �ȵ˴ϴ�.
 * -> protected �� �ٸ� ��Ű���� �ڽ� Ŭ������ ��ӹ��� �� �ֵ��� �մϴ�.
 * -> ���Ǽ��迡�� �ݷ������� �. ������ ������ ���ؼ� Ŭ���� ����. 
 * ������ ���� ��, ������, �ܽ���, ������, �䳢, �����... -> �ϳ��� �׷����� �ܼ�ȭ (Animal) Ŭ���� �����ϰ� �������� ��Ҹ� ����
 * -> �������� ��Ұ� �ƴ� ���� �ٸ� ��ü���� Ŭ������ ����(��, Cat,Dog,Rabbit,....) �׸��� Animal Ŭ������ ��ӹ޽��ϴ�.
 */

public class ClassA {		//�θ�Ŭ����
	int ab;
	String name;
	protected String title;	//protected�� ����Ʈ �����������̳� �ڽ�Ŭ������ ���ܷ� ���.
	
	void print() {
		System.out.println("ab =" + ab);
		System.out.println("name =" + name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}