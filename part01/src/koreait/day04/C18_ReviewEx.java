package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {
public static void main(String[] args) {
		String best;		//Ư������ ������ ����
		String name = "����";
		String name2 = "����";
		String name3 = "����";
		
		int korean;
		int English;
		int science;
	
		int total;
		double avg;
		int subject = 3;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		korean = sc.nextInt();
		System.out.println("���� -> " +korean);
		
		English = sc.nextInt();
		System.out.println("���� -> " +English);
		
		science = sc.nextInt();
		System.out.println("���� -> " +science);
		
		if(korean > English) {
			best = "����";
			if(korean > science){
				best = "name";
			}else {
				best = "name3";
			}
				
		}else{
			best = "name2";
			 if (English > science) {
				best = "name2";
			}else {
				best = "name3";
			}
		
		
		System.out.printf("�� �л��� Ư������� . %s . �Դϴ�.",best);
		}
		System.out.println(">>ó���Ǿ����ϴ�");
		
		total = (korean + English + science);
		avg = (int)(total/subject);
		
		System.out.print("���� : " + total);
		System.out.printf("��� :  ", "���� �� : ", + avg  + subject);
		
}
}
