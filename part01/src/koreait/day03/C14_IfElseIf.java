package koreait.day03;

import java.util.Scanner;

public class C14_IfElseIf {

	public static void main(String[] args) {
		// if (조건식) { .. } else if(조건식) ( ... ) ... else
		/*
		 * 나의 쇼핑몰 마켓컬리 이벤트
		 * 오늘 구입한 금액이 10만원 이상이면 적립금 구매금액의 10%  	0.1
		 * 				7만원  이상이면 				9%		0.09
		 * 				4만원						7%		0.07
		 * 				그 이하는 					3%		0.03
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int money; //적립금 : % 적용하면 결과값은 실수 -> 정수 
		int pay;	//구매금액
		double rate;	//적립율: 0.1 0.09...
		
		System.out.print("구매 금액은 >>> ");
		pay = sc.nextInt();
		
		if(pay >= 100000){
			rate = 0.1;
		}else if(pay >= 70000){
			rate = 0.09;
		}else if(pay >= 40000){
			rate = 0.07;
		}else{rate = 0.03;
		}
		money = (int)(pay * rate);
		
		
		System.out.printf("고객님 ! 오늘 구매하신 금액의 적립금은 %d 원입니다.\n",money);
		System.out.printf("이벤트 기간 적립율 %d %% 적용되었습니다. ",(int)(rate * 100));
		
		sc.close();
		}
	}


