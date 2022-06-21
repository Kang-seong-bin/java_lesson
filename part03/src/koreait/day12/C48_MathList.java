package koreait.day12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class C48_MathList {

	//C43번 예제 리스트로 변경하기		//작성자 : 강성빈
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int size =5;		//문제 갯수(반복횟수)
		//int max_size = MathProblem.max_size;		//size 변수값이 max_size 초과하는지 검사 추가. 
		
		ArrayList<MathProblem> problems = new ArrayList<>();		
		//모든 문제 저장하는 배열
		
		
		//배열의 타입은 MathProblem 객체참조형 : n1,n2,op,isCorrect
		int ans=0;		
		int cnt=0;
		System.out.println("-----------------------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-----------------------------------------------");
		System.out.println("시작합니다.");
		for(int i =0; i<size;i++) {//여기부터
			MathProblem temp = new MathProblem('+');
			temp.makeProb();//n1,n2값이 객체의 필드로 난수 생성.
			
			//System.out.print("문제" + (i+1)+ ".  " + temp.getN1() + " + "+ temp.getN2() + " = 답 입력 -> ");
			System.out.print("문제" + (i+1)+ ".   " + temp.problem() + " 답 입력 -> "); //이방법도 가능 코드 변경에 유용하다.
										//temp.problem()의 값이 바뀌어도 코드 수정하지 않아도 됨 편리함
			ans = sc.nextInt();
			if(ans == temp.showAnswer()) {		//정답과 비교. 맞은 갯수 count 
				cnt++;	
				temp.setCorrect(true);
			}
			problems.add(temp);	// problem[i]=temp; add를 활용하여 배열 인덱스 i 에 temp 객체 참조값을 저장해라★
		}
		System.out.println("-----------------------------------------------");
		System.out.println("채점합니다. 맞은 갯수 " + (cnt) + " ( " + ((cnt)*100/size) + "점)");
		System.out.println(":::::  틀린 문제 정답 보기  ::::::");
		
		for(int i=0; i<problems.size(); i++)	//모든 문제의 배열 크기를 횟수로 지정
			if(!problems.get(i).isCorrect()) {	//문제를 맞췄을 때를 제외하고 실행
				System.out.println("문제 " +(i+1)+". " + problems.get(i).problem() + problems.get(i).showAnswer());	//get을 활용하여 식 problems.get(i).problem() / 정답인 problems.get(i).showAnswer()를 작성★
				
				
			sc.close();
		
	}//리스트의 메소드 1) add, 2)get, 3)remove, 4)size

}
}