package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {
public static void main(String[] args) {
		String best;		//특기과목명 참조할 변수
		String name = "국어";
		String name2 = "영어";
		String name3 = "과학";
		
		int korean;
		int English;
		int science;
	
		int total;
		double avg;
		int subject = 3;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		korean = sc.nextInt();
		System.out.println("국어 -> " +korean);
		
		English = sc.nextInt();
		System.out.println("영어 -> " +English);
		
		science = sc.nextInt();
		System.out.println("과학 -> " +science);
		
		if(korean > English) {
			best = "국어";
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
		
		
		System.out.printf("이 학생의 특기과목은 . %s . 입니다.",best);
		}
		System.out.println(">>처리되었습니다");
		
		total = (korean + English + science);
		avg = (int)(total/subject);
		
		System.out.print("총점 : " + total);
		System.out.printf("평균 :  ", "과목 수 : ", + avg  + subject);
		
}
}
