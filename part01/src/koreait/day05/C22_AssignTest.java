package koreait.day05;

public class C22_AssignTest {

	public static void main(String[] args) {

		//���� : ����(����)������, ��࿬����(+=,-=,*=,/=,....)
		int i = 10, sum = 0;
		i=i+1;		// i=11
		i+=1;		//i=12
		i++;		//���������� - ��ġ:postfix i=13;
		++i;		//���������� - ��ġ:prefix i=14;
		// ��ġ, ��ġ�� �ٸ� ��ɾ�(�Ǵ� ������)��� ���� ���� ���� ���̰� �ֽ��ϴ�.
		
		System.out.println("i++ ? " + i++);  //����� 14, i���� 15
		System.out.println("++i ? " + (++i));	//����� 16, i���� 16
		
		sum = sum+i;		//sum=16;
		sum+=i;				//sum=32;
		System.out.println("sum ?" + sum);  //sum=32;
		
		
		//
		i--;
		--i;
		sum = sum-10;
		sum -= 10;
	}

}
