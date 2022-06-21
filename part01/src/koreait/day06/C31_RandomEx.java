package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
		/*
		 * 학생 성적(국어) 분포 보고서
		 * 학생 인원은 100명 - 점수는 랜덤(0<= 난수 <100)
		 * 
		 * 90~100 : o 명 (0.0%) 소수점 1자리	 카운트 변수가 5개 필요합니다.
		 * 80~89 : o 명 (0.0%) 소수점 1자리		ㄴ	counts[5]: counts[0],....
		 * 70~79 : o 명 (0.0%) 소수점 1자리
		 * 60~69 : o 명 (0.0%) 소수점 1자리
		 * 60점 미만 : o 명 (0.0%) 소수점 1자리
		 */
		int[] koreans = new int[100];
		int[] counts = new int[5];
		Random r = new Random();
		
		System.out.println("1. 정수형 랜덤 값 10개 출력");
		for(int i = 0; i<koreans.length; i++) {
			koreans[i] =r.nextInt(101);	
		// 국어 점수 저장
		}
		System.out.println(Arrays.toString(koreans));
		//점수 분포 count하기
		for(int i =0; i<koreans.length;i++) {
			
			if(89<koreans[i]) {	//if문 90이상의 점수 획득한 학생
				counts[0]++;	//90점 이상 점수자 분포도에 해당하는 학생 수 추가
		}else if(79<koreans[i]) {
			counts[1]++;
		}else if(69<koreans[i]) {
			counts[2]++;
		}else if(59<koreans[i]) {
			counts[3]++;
		}else {
			counts[4]++;
			}
		}
		//점수 분포 결과 출력하기
			System.out.println("90~100\t 80~89\t 70~79\t 60~69\t 60미만");	//분류된 분포도 목록
			System.out.printf("%8s %8s %8s %8s %8s\n", "90~100", "80~89", "70~79", "60~69", "60미만" );
			System.out.println("---------------------------------------------");
			for(int i = 0; i<counts.length; i++) {
				//counts배열 값 출력
			System.out.printf("%8d", counts[i]);	// 배열의 값으로 소숫점 제외로 나열
			}
			System.out.println("");
			for(int i=0; i < counts.length;i++) {
				// counts배열 값으로 백분율 구하고 출력하기
				System.out.printf("%8.1f%% ", (double)counts[i]);	//배열의 값의 백분율로 소숫점 1자리로 반올림 및 %로 표현
			}
	}

}
//배열에서 기능이 향상(데이터 삭제/삽입,크기도 동적으로 변경) 된 것이 자바ArrayList
//배열에서는 직접 데이터 삽입/삭제를 구현합니다. -> 메소드 정의
