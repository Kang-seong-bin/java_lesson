package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class C48_MathList {

	//C43�� ���� ����Ʈ�� �����ϱ�		//�ۼ��� : ������
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int size =5;		//���� ����(�ݺ�Ƚ��)
		//int max_size = MathProblem.max_size;		//size �������� max_size �ʰ��ϴ��� �˻� �߰�. 
		
		ArrayList<MathProblem> problems = new ArrayList<>();		
		//��� ���� �����ϴ� �迭
		
		
		//�迭�� Ÿ���� MathProblem ��ü������ : n1,n2,op,isCorrect
		int ans=0;		
		int cnt=0;
		System.out.println("-----------------------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("-----------------------------------------------");
		System.out.println("�����մϴ�.");
		for(int i =0; i<size;i++) {//�������
			MathProblem temp = new MathProblem('+');
			temp.makeProb();//n1,n2���� ��ü�� �ʵ�� ���� ����.
			
			//System.out.print("����" + (i+1)+ ".  " + temp.getN1() + " + "+ temp.getN2() + " = �� �Է� -> ");
			System.out.print("����" + (i+1)+ ".   " + temp.problem() + " �� �Է� -> "); //�̹���� ���� �ڵ� ���濡 �����ϴ�.
										//temp.problem()�� ���� �ٲ� �ڵ� �������� �ʾƵ� �� ����
			ans = sc.nextInt();
			if(ans == temp.showAnswer()) {		//����� ��. ���� ���� count 
				cnt++;	
				temp.setCorrect(true);
			}
			problems.add(temp);	// problem[i]=temp; add�� Ȱ���Ͽ� �迭 �ε��� i �� temp ��ü �������� �����ض��
		}
		System.out.println("-----------------------------------------------");
		System.out.println("ä���մϴ�. ���� ���� " + (cnt) + " ( " + ((cnt)*100/size) + "��)");
		System.out.println(":::::  Ʋ�� ���� ���� ����  ::::::");
		
		for(int i=0; i<problems.size(); i++)	//��� ������ �迭 ũ�⸦ Ƚ���� ����
			if(!problems.get(i).isCorrect()) {	//������ ������ ���� �����ϰ� ����
				System.out.println("���� " +(i+1)+". " + problems.get(i).problem() + problems.get(i).showAnswer());	//get�� Ȱ���Ͽ� �� problems.get(i).problem() / ������ problems.get(i).showAnswer()�� �ۼ���
				
				
			sc.close();
		
	}//����Ʈ�� �޼ҵ� 1) add, 2)get, 3)remove, 4)size

}
}